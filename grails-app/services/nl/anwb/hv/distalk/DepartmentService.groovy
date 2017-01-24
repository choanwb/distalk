package nl.anwb.hv.distalk

import grails.transaction.Transactional
import org.anwb.hv.disincident.DisIncident
import org.anwb.hv.ict.oxi.disinc.AanmeldenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AfmeldenIncidentMessage
import org.anwb.hv.ict.oxi.disinc.AntwoordenOpdrachtinfoMessage
import org.anwb.hv.ict.oxi.disinc.OpvragenOpdrachtinfoMessage
import org.anwb.hv.ict.oxi.disinc.OpvragenPlanningsinfoMessage
import org.anwb.hv.ict.oxi.disinc.WijzigenIncidentMessage
import org.grails.cxf.utils.EndpointType
import org.grails.cxf.utils.GrailsCxfEndpointProperty

import javax.jws.WebService

@Transactional
@WebService(targetNamespace = "http://distalk.hv.anwb.nl/", name = "DisIncident", serviceName = 'DisIncidentService',
        portName = 'DisIncident')
class DepartmentService implements DisIncident {

    static address = 'DisIncidentService'

    @Override
    public void wijzigenIncident(WijzigenIncidentMessage message) {

    }

    @Override
    public void afmeldenIncident(AfmeldenIncidentMessage message) {

    }

    @Override
    public void aanmeldenIncident(AanmeldenIncidentMessage message) {

    }

    @Override
    public org.anwb.hv.ict.oxi.disinc.AntwoordenPlanningsinfoMessage opvragenPlanningsInfo(
            OpvragenPlanningsinfoMessage message) {

    }

    @Override
    public AntwoordenOpdrachtinfoMessage opvragenOpdrachtInfo(
            OpvragenOpdrachtinfoMessage message) {

    }
}
