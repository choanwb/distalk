package nl.anwb.hv.distalk

import grails.transaction.Transactional
import wslite.http.auth.HTTPBasicAuthorization
import wslite.soap.SOAPClientException
import wslite.soap.SOAPFaultException
import wslite.soap.SOAPResponse

import static javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR
import static javax.servlet.http.HttpServletResponse.SC_OK

@Transactional
class BizzTalkService {
    def grailsApplication
    def url
    def connectTimeout
    def readTimeout
    def user
    def password

    static final TNS = ""

    public boolean send2BizzTalk(def message) {
        url = grailsApplication.config.getProperty("bizztalk.url")
        if (grailsApplication.config.getProperty("bizztalk.nosend", Boolean)) {
            log.info("No send flag = true")
            return
        }
        def params = [serviceURL: url,
                      connectTimeout: connectTimeout,
                      readTimeout: readTimeout]
        def response
        def httpResponse

        withSoap(params) {
            try{
                authorization = new HTTPBasicAuthorization(user, password)
                response = send(SOAPAction: url) {
                    envelopeAttributes "xmlns":TNS
                    body {
                        LepelBeschikbaar(message)
                    }
                }
                httpResponse = response?.httpResponse

                if (response?.httpRequest?.data) {
                    log.debug(new String(response.httpRequest.data))
                }

                def status = response//
//                switch (status?.StatusCode) {
//
//                    case '0':
//                        log.info("sendFormulierToHvva: Sent ${form} successfully")
//                        break
//
//                    case '1':
//                        log.error("sendFormulierToHvva: Technical Fault: ${status?.StatusMelding}")
//                        httpResponse.statusCode = SC_INTERNAL_SERVER_ERROR
//                        httpResponse.statusMessage = status?.StatusMelding
//                        break
//
//                    case '2':
//                        log.error("sendFormuliertoHvva: HVVA fault: ${status?.StatusMelding}")
//                        httpResponse.statusCode = SC_INTERNAL_SERVER_ERROR
//                        httpResponse.statusMessage = status?.StatusMelding
//                        break
//
//                    default:
//                        log.error("sendFormuliertoHvva: Unexcepted StatusCode: ${status?.StatusCode}")
//                        if (httpResponse) {
//                            httpResponse.statusCode = SC_INTERNAL_SERVER_ERROR
//                            httpResponse.statusMessage = status?.StatusMelding
//                        }
//                        else {
//                            log.error("sendFormuliertoHvva: No httpResponse.")
//                        }
//                }
            }
            catch (SOAPFaultException sfe) {
                log.error("CAUGHT: $sfe.message")

                // Need to use sfe.getResponse(), sfe.response gives HTTP response
                SOAPResponse soapResponse = sfe.getResponse()
                httpResponse = sfe.httpResponse
                // Oracle webservice gives SC_OK (200) even when a SOAP Fault has occurred
                if (httpResponse?.statusCode == SC_OK) {
                    httpResponse.statusCode = SC_INTERNAL_SERVER_ERROR
                    httpResponse.statusMessage = "Internal Server Error: ${sfe.message}"
                }

                response = soapResponse
            }
            catch (SOAPClientException sce) {
                // This indicates an error with underlying HTTP Client (i.e., 404 Not Found)
                log.error("CAUGHT: $sce.message", sce)
                httpResponse = sce.response
            }
            catch (Throwable x) {
                log.error("CAUGHT: $x.message", x)
            }
        }
    }
}
