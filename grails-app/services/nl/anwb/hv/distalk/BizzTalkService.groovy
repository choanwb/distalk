package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.oxi.dis_logicx.LepelLocatie
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
    public static final int EINDEMELDEN_INCIDENT = 1
    public static final int COMPLETEREN_INCIDENT = 2
    public static final int MELDEN_STATUS = 3
    public static final int TERUGGEVEN_INCIDENT = 4
    public static final int LEPEL_LOCATIE = 5
    public static final int LEPEL_BESCHIKBAAR = 6
    public static final int LEPEL_NIET_BESHIKBAAR = 7

    //TODO TNS = ???????
    private static final TNS = ""

    public boolean send2BizzTalk(def message, final int msgType) {
        url = grailsApplication.config.getProperty("bizztalk.url")

        if (grailsApplication.config.getProperty("lavasimulator", Boolean)) {
            send2Lavasimulator(message, msgType)
            return
        }

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
                //authorization = new HTTPBasicAuthorization(user, password)
                response = send(SOAPAction: url) {
//                    version SOAPVersion.V1_2
                    envelopeAttributes "xmlns":TNS
                    body {
                        switch (msgType) {
                        case EINDEMELDEN_INCIDENT:
                            eindemeldenIncidentMessage(message)
                            break
                        case COMPLETEREN_INCIDENT:
                            completerenIncidentMessage(message)
                            break
                        case MELDEN_STATUS:
                            meldenStatusMessage(message)
                            break
                        case TERUGGEVEN_INCIDENT:
                            teruggevenIncidentMessage(message)
                            break
                        case LEPEL_LOCATIE:
                            lepelLocatie(message)
                            break
                        case LEPEL_BESCHIKBAAR:
                            lepelBeschikbaar(message)
                            break
                        case LEPEL_NIET_BESHIKBAAR:
                            lepelNietBeschikbaar(message)
                            break
                        default:
                            log.warn("Onbekend verzoek verstuurd, geen bericht verzonden")
                            return
                        }
                    }
                }
                httpResponse = response?.httpResponse

                if (response?.httpRequest?.data) {
                    log.debug(new String(response.httpRequest.data))
                }

                def status = response//
                switch (status?.StatusCode) {

                    case '0':
                        log.info("send2BizzTalk: Sent ${message} successfully")
                        break

                    case '1':
                        log.error("send2BizzTalk: Technical Fault: ${status?.StatusMelding}")
                        httpResponse.statusCode = SC_INTERNAL_SERVER_ERROR
                        httpResponse.statusMessage = status?.StatusMelding
                        break

                    case '2':
                        log.error("send2BizzTalk: DISTALK fault: ${status?.StatusMelding}")
                        httpResponse.statusCode = SC_INTERNAL_SERVER_ERROR
                        httpResponse.statusMessage = status?.StatusMelding
                        break

                    default:
                        log.error("send2BizzTalk: Unexcepted StatusCode: ${status?.StatusCode}")
                        if (httpResponse) {
                            httpResponse.statusCode = SC_INTERNAL_SERVER_ERROR
                            httpResponse.statusMessage = status?.StatusMelding
                        }
                        else {
                            log.error("send2BizzTalk: No httpResponse.")
                        }
                }
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

    public void send2Lavasimulator(def message, final int msgType) {
        url = grailsApplication.config.getProperty("lava.url")
        def tns = grailsApplication.config.getProperty("lava.tns")
        def params = [serviceURL: url]
        withSoap(params) {
            def response = send(){
                envelopeAttributes xmlns: tns
                body {
                    switch (msgType) {
                        case EINDEMELDEN_INCIDENT:
                            eindemeldenIncidentMessage(xmlns: tns) {
                                message
                            }
                            break
                        case COMPLETEREN_INCIDENT:
                            completerenIncidentMessage(xmlns: tns) {
                                message
                            }
                            break
                        case MELDEN_STATUS:
                            meldenStatusMessage(xmlns: tns) {
                                message
                            }
                            break
                        case TERUGGEVEN_INCIDENT:
                            teruggevenIncidentMessage(xmlns: tns) {
                                message
                            }
                            break
                        case LEPEL_LOCATIE:
                            lepelLocatie(message)
                            break
                        case LEPEL_BESCHIKBAAR:
                            lepelBeschikbaar(xmlns: tns) {
                                message
                            }
                            break
                        case LEPEL_NIET_BESHIKBAAR:
                            lepelNietBeschikbaar(xmlns: tns) {
                                message
                            }
                            break
                        default:
                            log.warn("Onbekend verzoek verstuurd, geen bericht verzonden")
                            return
                    }
                }
            }
            println response.LepelLocatieResponse.text()
        }
//        withSoap(params) {
//            try {
//                def response = send("""<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:dis='http://distalk.hv.anwb.nl/'>
//                   <soapenv:Header/>
//                   <soapenv:Body>
//                      <dis:test>
//                         <!--Optional:-->
//                         <name>hallo</name>
//                      </dis:test>
//                   </soapenv:Body>
//                </soapenv:Envelope>
//                """)
//            }
//            catch(e){
//                log.error("Caught:", e)
//            }
//        }
    }
}
