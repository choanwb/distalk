package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.oxi3.util.Oxi3JaxbContext

import javax.jms.Message

@Transactional

class DisJmsService {
    def jmsService
    def alcIncidentService
    def grailsApplication
    private static final String HERKOMST = "LOGICX"
    static exposes = ["jms"]
    static isTopic = Boolean.FALSE
    static destination = "anwb.hv.binnenland.dispatch.disToLogicxQueue.Chi"
    Boolean validation = Boolean.FALSE


    //TODO herkomst is voor disel van belang
    //TODO is impliciete return nodig?
    def sendJmsMessage(def message, String requestQueue, String receiveQueue) {
        log.debug("Sending ${message} to ${requestQueue}")
        validation = grailsApplication.config.getProperty("jms.validation", Boolean)
        def process = grailsApplication.config.getProperty("disel.proces")
        def jmsMessage = Oxi3JaxbContext.marshall(message, validation)
        jmsService.send(queue:(requestQueue), jmsMessage) { Message msg ->
            msg.setStringProperty("PROCES", process)
            msg.setStringProperty("HERKOMST", HERKOMST)
            msg.setJMSReplyTo(createDestination(queue: receiveQueue))
        }

        //TODO voor nu even destination, straks een receiveQueue
        def reply = receiveJmsMessage(receiveQueue)
        if(reply) {
            log.debug("Received reply: ${reply}")
        }
        log.info("Message sent to ${requestQueue}")
    }

    //TODO selectors? target = LOGICX

    def receiveJmsMessage(String receiveQueue) {
        def reply = jmsService.receiveSelected(receiveQueue, null)
        log.debug("reply: ${reply}")
        reply
    }

    def onMessage(msg) {
        log.info("Received message from broker: ${msg}")
        alcIncidentService.process(msg)
        return null//voor nu, maar misschien voor later ook
    }
}
