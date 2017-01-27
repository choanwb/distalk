package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.disinc.AanmeldenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.Incident
import org.anwb.hv.ict.oxi.disinc.OpvragenOpdrachtinfoMessage
import org.anwb.hv.oxi3.util.Oxi3JaxbContext

import javax.jms.Message

@Transactional
class DisJmsService {
    def jmsService
    def grailsApplication
    Boolean validation = Boolean.FALSE


//    def sendAanmeldenInc(def disInc) {
//        String sendQueue = grailsApplication.config.getProperty("disel.sendQueue")
//
//        Incident inc = new Incident()
//        inc.aantalGewonden
//        inc.actienummer
//        inc.betaaldeHulpverlening
//        inc.evenement
//        inc.geschattewachttijd
//        inc.gevaarlijkeStoffen
//        inc.gevondenDoorHulpverlener
//        inc.hulpverlenersGebeld
//        inc.incidentbijzonderheid
//        inc.journaalAantekening
//        inc.klanten
//        inc.kritischeJournaalaantekening
//        inc.LBIClassificatie
//        inc.locatie
//        inc.melder
//        inc.nummer
//        inc.parkeergarage
//        inc.pechhistorie
//        inc.planningsmethode
//        inc.rijbaanGeblokkeerd
//        inc.sleutelOpdracht
//        inc.storingsbijzonderheid
//        inc.storingscode
//        inc.tijdstipAfspraakTot
//        inc.tijdstipAfspraakVan
//        inc.tijdstipMelding
//        inc.tijdstipStelcontact
//        inc.transportOpdracht
//        inc.type
//        inc.veiligstellocatie
//        inc.veiligstelOpdracht
//        inc.verkeersgevaarlijk
//        inc.voertuig
//        inc.volgnummer
//        inc.voorrangsclassificatie2
//        inc.voorrangsregel
//        inc.wps
//
//        AanmeldenIncidentMessage aim = new AanmeldenIncidentMessage()
//        aim.incident = inc
//        sendJmsMessage(aim, sendQueue)
//    }

    def sendJmsMessage(def message, String sendQueue) {
        log.debug("Sending ${message} to ${sendQueue}")
        validation = grailsApplication.config.getProperty("validation", Boolean)
        def process = grailsApplication.config.getProperty("disel.proces")
        def jmsMessage = Oxi3JaxbContext.marshall(message, validation)
        jmsService.send(queue:(sendQueue), jmsMessage) { Message msg ->
            msg.setStringProperty("PROCES", process)
        }
        log.info("Message sent to ${sendQueue}")
    }

    def receiveJmsMessage(String receiveQueue) {
        def reply = jmsService.receiveSelected(receiveQueue, null)
        reply
    }
}
