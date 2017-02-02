package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.callinc.CompleterenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.EindemeldenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.MeldenStatusMessage
import org.anwb.hv.ict.oxi.callinc.TeruggevenIncidentMessage
import org.anwb.hv.oxi.dis_logicx.LepelBeschikbaar
import org.anwb.hv.oxi.dis_logicx.LepelLocatie
import org.anwb.hv.oxi.dis_logicx.LepelNietBeschikbaar
import org.anwb.hv.oxi3.util.Oxi3JaxbContext

@Transactional
class AlcIncidentService {
    def grailsApplication
    def bizzTalkService
    Boolean validation = Boolean.FALSE

    def process(def message) {
        validation = grailsApplication.config.getProperty("jms.validation", Boolean)
        try {
        def unmarshalled = Oxi3JaxbContext.unmarshall(message, validation)
        log.info("bericht: ${unmarshalled}")
            send2BizzTalkService(unmarshalled)
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

    private void send2BizzTalkService(CompleterenIncidentMessage message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.COMPLETEREN_INCIDENT)
    }

    private void send2BizzTalkService(MeldenStatusMessage message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.MELDEN_STATUS)
    }

    private void send2BizzTalkService(TeruggevenIncidentMessage message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.TERUGGEVEN_INCIDENT)
    }

    private void send2BizzTalkService(LepelLocatie message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.LEPEL_LOCATIE)
    }

    private void send2BizzTalkService(LepelBeschikbaar message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.LEPEL_BESCHIKBAAR)
    }

    private void send2BizzTalkService(LepelNietBeschikbaar message) {
        log.debug("bericht: ${message}")
        bizzTalkService.send2BizzTalk(message, bizzTalkService.LEPEL_NIET_BESHIKBAAR)
    }


}
