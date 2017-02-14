package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.callinc.EindemeldenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.MeldenStatusMessage
import org.anwb.hv.ict.oxi.callinc.TeruggevenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AfmeldenIncidentMessage
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint(name ='LavaSimulatorService')
class LavaSimulatorService {

    @WebMethod(operationName = "eindemeldenIncidentMessage", action="http://distalk.hv.anwb.nl/eindemeldenIncidentMessage")
    @WebResult(name = "EindemeldenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")
    void eindemeldenIncidentMessage(@WebParam(name = "eindemeldenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")EindemeldenIncidentMessage message) {
        writeLog(message)
    }

    @WebMethod(operationName = "meldenStatus", action="http://distalk.hv.anwb.nl/meldenStatus")
    @WebResult(name = "MeldenStatusMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")
    void meldenStatus(@WebParam(name="meldenStatusMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")MeldenStatusMessage message) {
        writeLog(message)
    }

    @WebMethod(operationName = "afmeldingIncident", action="http://distalk.hv.anwb.nl/afmeldingIncident")
    @WebResult(name = "AfmeldenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")
    public void afmeldingIncident(@WebParam(name = "afmeldenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")AfmeldenIncidentMessage message){
        writeLog(message)
    }

    @WebMethod(operationName = "teruggevenIncident", action="http://distalk.hv.anwb.nl/teruggevenIncident")
    @WebResult(name = "TeruggevenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")
    public void teruggevenIncident(@WebParam(name = "teruggevenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")TeruggevenIncidentMessage message) {
        writeLog(message)
    }



    private writeLog(def message) {
        log.info("Het volgende SOAP bericht is ontvangen: ${message}")
    }
}
