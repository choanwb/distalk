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
    def alcIncidentService
    def grailsApplication
    static exposes = ["jms"]
    static isTopic = Boolean.FALSE
    static destination = "anwb.hv.binnenland.dispatch.disToLogicxQueue.Chi"
    Boolean validation = Boolean.FALSE

    def sendJmsMessage(def message, String sendQueue) {
        log.debug("Sending ${message} to ${sendQueue}")
        validation = grailsApplication.config.getProperty("jms.validation", Boolean)
        def process = grailsApplication.config.getProperty("disel.proces")
        def jmsMessage = Oxi3JaxbContext.marshall(message, validation)
        jmsService.send(queue:(sendQueue), jmsMessage) { Message msg ->
            msg.setStringProperty("PROCES", process)
        }
        log.info("Message sent to ${sendQueue}")
    }

    //TODO selectors? target = LOGICX

    def receiveJmsMessage(String receiveQueue) {
        def reply = jmsService.receiveSelected(receiveQueue, null)
        println("reply: ${reply}")
        reply
    }

    def onMessage(msg) {
        log.info(msg)
        alcIncidentService.process(msg)
    }
}
