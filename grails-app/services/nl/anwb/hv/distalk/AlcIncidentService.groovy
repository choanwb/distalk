package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.ict.oxi.callinc.CompleterenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.EindemeldenIncidentMessage
import org.anwb.hv.ict.oxi.callinc.MeldenStatusMessage
import org.anwb.hv.ict.oxi.callinc.TeruggevenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AanmeldenIncidentMessage
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint(name ='AlcIncidentService')
class AlcIncidentService {

    @WebMethod
    @WebResult
    public void eindemeldenIncident(EindemeldenIncidentMessage message) {

    }

    @WebMethod
    @WebResult
    public void completerenIncident(CompleterenIncidentMessage message) {

    }

    @WebMethod
    @WebResult
    public void meldenStatus(MeldenStatusMessage message) {

    }

    @WebMethod
    @WebResult
    public void teruggevenIncident(TeruggevenIncidentMessage message) {

    }
}
