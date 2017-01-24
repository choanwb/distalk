package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.disinc.AanmeldenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AfmeldenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AntwoordenOpdrachtinfoMessage
import org.anwb.hv.ict.oxi.disinc.AntwoordenPlanningsinfoMessage
import org.anwb.hv.ict.oxi.disinc.OpvragenOpdrachtinfoMessage
import org.anwb.hv.ict.oxi.disinc.OpvragenPlanningsinfoMessage
import org.anwb.hv.ict.oxi.disinc.WijzigenIncidentMessage
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint
class DisIncidentService {
    def disJmsService
    def grailsApplication


    @WebMethod
    @WebResult
    void aanmeldenIncident(AanmeldenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.sendQueue"))
    }

    @WebMethod
    @WebResult
    AntwoordenPlanningsinfoMessage opvragenPlanningsInfo(OpvragenPlanningsinfoMessage message){}

    @WebMethod
    @WebResult
    AntwoordenOpdrachtinfoMessage opvragenOpdrachtInfo(OpvragenOpdrachtinfoMessage message){}

    @WebMethod
    @WebResult
    void wijzigenIncident(WijzigenIncidentMessage message){}

    @WebMethod
    @WebResult
    void afmeldenIncident(AfmeldenIncidentMessage message){}
}
