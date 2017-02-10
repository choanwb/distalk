package nl.anwb.hv.distalk

import grails.converters.XML
import grails.transaction.Transactional
import wslite.http.auth.HTTPBasicAuthorization
import wslite.soap.SOAPClient
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
    public static final String PLAIN_XML = ""
    public static final String EINDEMELDEN_INCIDENT = "EINDEMELDENINCIDENTMESSAGE"
    public static final String COMPLETEREN_INCIDENT = "COMPLETERENINCIDENTMESSAGE"
    public static final String MELDEN_STATUS = "MELDENSTATUSMESSAGE"
    public static final String TERUGGEVEN_INCIDENT = "TERUGGEVENINCIDENTMESSAGE"
    public static final String LEPEL_LOCATIE = "LEPELLOCATIE"
    public static final String LEPEL_BESCHIKBAAR = "LEPELBESCHIKBAAR"
    public static final String LEPEL_NIET_BESHIKBAAR = "LEPELNIETBESHIKBAAR"

    //TODO TNS = ???????
    private static final TNS = ""

    public boolean send2BizzTalk(def message, String msgType) {

        if (grailsApplication.config.getProperty("lavasimulator", Boolean)) {
            send2Lavasimulator(message, msgType)
            return
        }

        if (grailsApplication.config.getProperty("bizztalk.nosend", Boolean)) {
            log.info("No send flag = true, nothing sent")
            return
        }
        url = grailsApplication.config.getProperty("bizztalk.url")
        def params = [serviceURL: url,
                      connectTimeout: connectTimeout,
                      readTimeout: readTimeout]
        sendMessage(params, msgType, message, TNS)
    }

    private void send2Lavasimulator(def msg, String msgType) {
        url = grailsApplication.config.getProperty("lavasim.url")
        def tns = grailsApplication.config.getProperty("lavasim.tns")
        def params = [serviceURL: url]
        sendMessage(params, msgType, msg, tns)
    }

    private sendMessage(def params, String msgType, def msg, String tns) {
        def response
        def httpResponse
        withSoap(params) {
            try {
                if (!grailsApplication.config.getProperty("lavasimulator", Boolean)) {
                    authorization = new HTTPBasicAuthorization(user, password)
                }
                response = send() {
                    envelopeAttributes 'xmlns:dis': tns
                    body {
                        switch (msgType) {
                            case EINDEMELDEN_INCIDENT:
                                "dis:eindemeldenIncidentMessage"(xmlns: tns) {
                                    mkp.yieldUnescaped("${msg}")
                                }
                                break
                            case COMPLETEREN_INCIDENT:
                                "dis:completerenIncidentMessage"(xmlns: tns) {
                                    mkp.yieldUnescaped("${msg}")
                                }
                                break
                            case MELDEN_STATUS:
                                "dis:meldenStatus"(xmlns: tns) {
                                    mkp.yieldUnescaped("${msg}")
                                }
                                break
                            case TERUGGEVEN_INCIDENT:
                                "dis:teruggevenIncidentMessage"(xmlns: tns) {
                                    mkp.yieldUnescaped("${msg}")
                                }
                                break
                            case LEPEL_LOCATIE:
                                "dis:lepelLocatie"(xmlns: tns) {
                                    mkp.yieldUnescaped("${msg}")
                                }
                                break
                            case LEPEL_BESCHIKBAAR:
                                "dis:lepelBeschikbaar"(xmlns: tns) {
                                    mkp.yieldUnescaped("${msg}")
                                }
                                break
                            case LEPEL_NIET_BESHIKBAAR:
                                "dis:lepelNietBeschikbaar"(xmlns: tns) {
                                    mkp.yieldUnescaped("${msg}")
                                }
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

}
