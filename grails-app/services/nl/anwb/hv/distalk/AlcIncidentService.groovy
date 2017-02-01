package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.callinc.CompleterenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.EindemeldenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.MeldenStatusMessage
import org.anwb.hv.ict.oxi.callinc.TeruggevenIncidentMessage
import org.anwb.hv.oxi3.util.Oxi3JaxbContext

@Transactional
class AlcIncidentService {
    def grailsApplication
    def bizzTalkService
    Boolean validation = Boolean.FALSE

    def process(def message) {
        validation = grailsApplication.config.getProperty("jms.validation", Boolean)
        def unmarshalled = Oxi3JaxbContext.unmarshall(message, validation)
        log.debug("bericht: ${unmarshalled}")
        bizzTalkService.send2BizzTalk(unmarshalled)
        return null//voor nu gaan we er even vanuit dat er niks terugkomt
    }

//    private void eindemeldenIncident(EindemeldenIncidentMessage message) {
//        println("bericht: ${message}")
//        //doe iets in bizztalkservice
//    }

//    private void completerenIncident(CompleterenIncidentMessage message) {
//        println("bericht: ${message}")
//        //doe iets in bizztalkservice
//    }
//
//    private void meldenStatus(MeldenStatusMessage message) {
//        println("bericht: ${message}")
//        //doe iets in bizztalkservice
//    }
//
//    private void teruggevenIncident(TeruggevenIncidentMessage message) {
//        println("bericht: ${message}")
//        //doe iets in bizztalkservice
//    }

//    private void lepelLocatie(LepelLocatie message) {
//        //doe iets in bizztalkservice
//    }
//
//    private void lepelBeschikbaar(LepelBeschikbaar message) {
//        //doe iets in bizztalkservice
//    }
//
//    private void lepelNietBeschikbaar(LepelNietBeschikbaar message) {
//        //doe iets in bizztalkservice
//    }
//
//    private void alleLepelsNietBeschikbaar(AlleLepelsNietBeschikbaar message) {
//
//    }


}
