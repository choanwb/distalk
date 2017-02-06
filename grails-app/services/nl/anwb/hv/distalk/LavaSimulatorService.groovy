package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.callinc.CompleterenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.EindemeldenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.MeldenStatusMessage
import org.anwb.hv.ict.oxi.callinc.TeruggevenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AfmeldenIncidentMessage
import org.anwb.hv.oxi.dis_logicx.LepelBeschikbaar
import org.anwb.hv.oxi.dis_logicx.LepelLocatie
import org.anwb.hv.oxi.dis_logicx.LepelNietBeschikbaar
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint//(name ='LavaSimulatorService')
class LavaSimulatorService {
    @WebMethod
    @WebResult(name = "EindemeldenIncidentMessage", targetNamespace = "")
    public void eindemeldenIncident(EindemeldenIncidentMessage message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "CompleterenIncidentMessage", targetNamespace = "")
    public void completerenIncident(CompleterenIncidentMessage message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "MeldenStatusMessage", targetNamespace = "")
    public void meldenStatus(MeldenStatusMessage message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "TeruggevenIncidentMessage", targetNamespace = "")
    public void teruggevenIncident(TeruggevenIncidentMessage message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "LepelLocatie", targetNamespace = "")
    public void lepelLocatie(LepelLocatie message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "LepelBeschikbaar", targetNamespace = "")
    public void lepelBeschikbaar(LepelBeschikbaar message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "LepelNietBeschikbaar", targetNamespace = "")
    public void lepelNietBeschikbaar(LepelNietBeschikbaar message) {
        writeLog(message)
    }

    @WebMethod
    @WebResult(name = "AfmeldenIncidentMessage", targetNamespace = "")
    public void afmeldenIncident(AfmeldenIncidentMessage message){
        writeLog(message)
    }

    @WebMethod
    @WebResult
    public void test(@WebParam(name = 'name') String name) {
        writeLog(name)
    }

    private writeLog(def message) {
        log.info("Het volgende SOAP bericht is ontvangen: ${message}")
    }
}
