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
 * Verwerkt binnenkomende berichten
 */
@Transactional
@GrailsCxfEndpoint(name ='DisIncidentService')
class DisIncidentService {
    def disJmsService
    def grailsApplication

    @WebMethod(operationName = "aanmeldenIncident", action="http://distalk.hv.anwb.nl/aanmeldenIncident")
    @WebResult(name = "AanmeldenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")
    void aanmeldenIncident(@WebParam(name = "aanmeldenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")AanmeldenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
                grailsApplication.config.getProperty("disel.responseQueue"))
    }

    @WebMethod(operationName = "wijzigenIncident", action="http://distalk.hv.anwb.nl/wijzigenIncident")
    @WebResult(name = "WijzigenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")
    void wijzigenIncident(@WebParam(name = "wijzigenIncidentMessage",
            targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")WijzigenIncidentMessage message){
        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
                grailsApplication.config.getProperty("disel.responseQueue"))
    }

//    @WebMethod(operationName = "afmeldenIncident", action="http://distalk.hv.anwb.nl/afmeldenIncident")
//    @WebResult(name = "AfmeldenIncidentMessage", targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")
//    void afmeldenIncident(@WebParam(name = "afmeldenIncidentMessage",
//            targetNamespace = "http://anwb.org/hv/ict/oxi/disinc")AfmeldenIncidentMessage message){
//        disJmsService.sendJmsMessage(message, grailsApplication.config.getProperty("disel.requestQueue"),
//                grailsApplication.config.getProperty("disel.responseQueue"))
//    }

}
