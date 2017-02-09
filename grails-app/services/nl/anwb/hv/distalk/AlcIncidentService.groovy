package nl.anwb.hv.distalk

import ch.qos.logback.core.joran.spi.XMLUtil
import groovy.util.XmlParser
import grails.transaction.Transactional
import groovy.xml.QName
import org.anwb.hv.ict.oxi.callinc.EindemeldenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.MeldenStatusMessage
import org.anwb.hv.oxi3.util.Oxi3JaxbContext
import org.xml.sax.InputSource

/**
 * Uitgecommentarieerde berichten zullen in de eerste versies nog niet gebruikt worden
 */
@Transactional
class AlcIncidentService {
    def grailsApplication
    def bizzTalkService
    Boolean validation = Boolean.FALSE
    def parser = new XmlParser()
    Boolean oxiCheck = Boolean.FALSE

    def process(def msg) {
        validation = grailsApplication.config.getProperty("jms.validation", Boolean)
        try {
            def message
            if (oxiCheck){
                message = Oxi3JaxbContext.unmarshall(msg, validation)
                message = Oxi3JaxbContext.marshall(message, validation)
            }
            message = stripXmlVersion(msg)
//            def message = Oxi3JaxbContext.unmarshall(msg, validation)
            log.info("bericht: ${message}")
            send2BizzTalkService(message)
        }
        catch(MissingMethodException mme) {
            log.error("Could not find a method to process oxi object in this service. " +
                    "A method probably needs to be added :(", mme)
            throw new Exception()
        }
        catch(Throwable e) {
            log.error("Unable to process oxi message", e)
            return null
        }
        return null//voor nu gaan we er even vanuit dat er niks terugkomt
    }

    private void send2BizzTalkService(EindemeldenIncidentMessage message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.EINDEMELDEN_INCIDENT)
    }

    private void send2BizzTalkService(MeldenStatusMessage message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.MELDEN_STATUS)
    }

    private void send2BizzTalkService(String message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.EINDEMELDEN_INCIDENT)
    }

//    private void send2BizzTalkService(CompleterenIncidentMessage message) {
//        log.debug("bericht: ${message}")
//        bizzTalkService.send2BizzTalk(message, bizzTalkService.COMPLETEREN_INCIDENT)
//    }

//    private void send2BizzTalkService(TeruggevenIncidentMessage message) {
//        log.debug("bericht: ${message}")
//        bizzTalkService.send2BizzTalk(message, bizzTalkService.TERUGGEVEN_INCIDENT)
//    }
//
//    private void send2BizzTalkService(LepelLocatie message) {
//        log.debug("bericht: ${message}")
//        bizzTalkService.send2BizzTalk(message, bizzTalkService.LEPEL_LOCATIE)
//    }
//
//    private void send2BizzTalkService(LepelBeschikbaar message) {
//        log.debug("bericht: ${message}")
//        bizzTalkService.send2BizzTalk(message, bizzTalkService.LEPEL_BESCHIKBAAR)
//    }

//    private void send2BizzTalkService(LepelNietBeschikbaar message) {
//        log.debug("bericht: ${message}")
//        bizzTalkService.send2BizzTalk(message, bizzTalkService.LEPEL_NIET_BESHIKBAAR)
//    }

    /*
    removes the version from the xml (<?xml version="1.0" encoding="UTF-8" standalone="yes"?>)
     */
    private String stripXmlVersion(String message) {
        Node node = parser.parseText(message)
        node.attributes().clear()
        QName name = node.name()
        name.namespaceURI = ''
        String localPart = name.localPart
        if (localPart) {
            if (name.prefix) {
                return "<${name.prefix}:${message.substring(message.indexOf(localPart))}"
            }
            return message.substring(message.indexOf(localPart) - 1)
        }
        message
    }


}
