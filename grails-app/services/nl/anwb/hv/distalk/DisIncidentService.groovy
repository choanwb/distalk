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
import javax.jws.WebParam
import javax.jws.WebResult

/**
 * Uitgecommentarieerde berichten zullen in de eerste versies nog niet gebruikt worden
 */
@Transactional
@GrailsCxfEndpoint(name ='DisIncidentService')
class DisIncidentService {
    def disJmsService
    def grailsApplication

    //targetnamespace in de methods is van belang om het automatisch gegenereerde WSDL inherent consistent
    //te maken

    @WebMethod
    @WebResult(name = "AanmeldenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")
    void aanmeldenIncident(@WebParam(name = "aanmeldenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")AanmeldenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
                grailsApplication.config.getProperty("disel.responseQueue"))
    }

    @WebMethod
    @WebResult(name = "WijzigenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")
    void wijzigenIncident(@WebParam(name = "wijzigenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")WijzigenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
                grailsApplication.config.getProperty("disel.responseQueue"))
    }

    @WebMethod
    @WebResult(name = "AfmeldenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")
    void afmeldenIncident(@WebParam(name = "afmeldenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")AfmeldenIncidentMessage message){
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
}
