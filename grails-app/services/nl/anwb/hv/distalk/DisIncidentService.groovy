package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.disinc.AanmeldenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AfmeldenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AntwoordenOpdrachtinfoMessage
import org.anwb.hv.ict.oxi.disinc.AntwoordenPlanningsinfoMessage
import org.anwb.hv.ict.oxi.disinc.OpvragenOpdrachtinfoMessage
import org.anwb.hv.ict.oxi.disinc.OpvragenPlanningsinfoMessage
import org.anwb.hv.ict.oxi.disinc.WijzigenIncidentMessage
import org.grails.cxf.utils.EndpointType
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint//(name ='DisIncidentService')
class DisIncidentService {
    def disJmsService
    def grailsApplication

    @WebMethod
    @WebResult(name = "AanmeldenIncidentMessage", targetNamespace = "")
    void aanmeldenIncident(AanmeldenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
                grailsApplication.config.getProperty("disel.responseQueue"))
    }


//    @WebMethod
//    @WebResult(name = "OpvragenPlanningsinfoMessage", targetNamespace = "")
//    AntwoordenPlanningsinfoMessage opvragenPlanningsInfo(OpvragenPlanningsinfoMessage message){
//        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
//                grailsApplication.config.getProperty("disel.responseQueue"))
//    }
//
//    @WebMethod
//    @WebResult(name = "OpvragenOpdrachtinfoMessage", targetNamespace = "")
//    AntwoordenOpdrachtinfoMessage opvragenOpdrachtInfo(OpvragenOpdrachtinfoMessage message){
//        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
//                grailsApplication.config.getProperty("disel.responseQueue"))
//    }

    @WebMethod
    @WebResult(name = "WijzigenIncidentMessage", targetNamespace = "")
    void wijzigenIncident(WijzigenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
                grailsApplication.config.getProperty("disel.responseQueue"))
    }

    @WebMethod
    @WebResult(name = "AfmeldenIncidentMessage", targetNamespace = "")
    void afmeldenIncident(AfmeldenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
                grailsApplication.config.getProperty("disel.responseQueue"))
    }
}
