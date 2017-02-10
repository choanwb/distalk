package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.oxi3.util.Oxi3JaxbContext

import javax.jms.Message

@Transactional
class DisJmsService {
    def jmsService
    def alcIncidentService
    def grailsApplication
//    private static final String HERKOMST = "LOGICX"
    static exposes = ["jms"]
    static isTopic = Boolean.FALSE
    static destination = "anwb.hv.binnenland.dispatch.disToLogicxQueue.Chi"
    Boolean validation = Boolean.FALSE

    //TODO is impliciete return nodig?
    def sendJmsMessage(def message, String requestQueue, String receiveQueue) {
        log.debug("Sending ${message} to ${requestQueue}")
        validation = grailsApplication.config.getProperty("jms.validation", Boolean)
        def process = grailsApplication.config.getProperty("disel.proces")

        try {
            def jmsMessage = Oxi3JaxbContext.marshall(message, validation, true)
            jmsService.send(queue: (requestQueue), jmsMessage) { Message msg ->
                msg.setStringProperty("PROCES", process)
//            msg.setStringProperty("HERKOMST", HERKOMST)//niet van belang want de queue naam is doorslaggevend voor disel
                msg.setJMSReplyTo(createDestination(queue: receiveQueue))
            }
        }
        catch(e) {
            log.error("Caught:", e)
        }

        def reply = receiveJmsMessage(receiveQueue)
        if(reply) {
            log.debug("Received reply: ${reply}")
        }
        log.info("Message sent to ${requestQueue}")
        return null
    }

    def receiveJmsMessage(String receiveQueue) {
        def reply = jmsService.receiveSelected(receiveQueue, null)
        log.debug("reply: ${reply}")
        reply
    }

    def onMessage(msg) {
        log.info(msg)
        alcIncidentService.process(msg)
    }
}
