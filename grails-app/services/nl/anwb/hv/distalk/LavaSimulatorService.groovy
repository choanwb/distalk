package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.callinc.EindemeldenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.MeldenStatusMessage
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint(name ='LavaSimulatorService')
class LavaSimulatorService {

    @WebMethod
    @WebResult(name = "EindemeldenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")
    public void eindemeldenIncidentMessage(@WebParam(name = "eindemeldenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")EindemeldenIncidentMessage message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "MeldenStatusMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")
    public void meldenStatusMessage(@WebParam(name="meldenStatusMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")MeldenStatusMessage message) {
        writeLog(message)
    }

//    @WebMethod
//    @WebResult(name = "CompleterenIncidentMessage", targetNamespace = "")
//    public void completerenIncident(@WebParam(name = "",
//    targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")CompleterenIncidentMessage message) {
//        writeLog(message)
//    }

//    @WebMethod
//    @WebResult(name = "TeruggevenIncidentMessage", targetNamespace = "")
//    public void teruggevenIncident(@WebParam(name = "",
//    targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")@WebParam(name = "",
//    targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")TeruggevenIncidentMessage message) {
//        writeLog(message)
//    }
//
//    @WebMethod
//    @WebResult(name = "LepelLocatie", targetNamespace = "")
//    public void lepelLocatie(@WebParam(name = "",
//    targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")LepelLocatie message) {
//        writeLog(message)
//    }
//
//    @WebMethod
//    @WebResult(name = "LepelBeschikbaar", targetNamespace = "")
//    public void lepelBeschikbaar(@WebParam(name = "",
//    targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")@WebParam(name = "",
//    targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")LepelBeschikbaar message) {
//        writeLog(message)
//    }
//
//    @WebMethod
//    @WebResult(name = "LepelNietBeschikbaar", targetNamespace = "")
//    public void lepelNietBeschikbaar(@WebParam(name = "",
//    targetNamespace = "http://anwb.org/hv/ict/oxi/callinc")LepelNietBeschikbaar message) {
//        writeLog(message)
//    }

//    @WebMethod
//    @WebResult(name = "AfmeldenIncidentMessage", targetNamespace = "")
//    public void afmeldenIncidentMessage(AfmeldenIncidentMessage message){
//        writeLog(message)
//    }

//    @WebMethod
//    @WebResult
//    public void test(@WebParam(name = 'name') String name) {
//        writeLog(name)
//    }

    private writeLog(def message) {
        log.info("Het volgende SOAP bericht is ontvangen: ${message}")
    }
}
