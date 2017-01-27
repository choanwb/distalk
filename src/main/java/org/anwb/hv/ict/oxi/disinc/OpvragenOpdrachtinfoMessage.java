
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for opvragenOpdrachtinfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="opvragenOpdrachtinfoMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="incidentnummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="actienummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opvragenOpdrachtinfoMessage")
@XmlRootElement(name = "opvragenOpdrachtinfoMessage")
public class OpvragenOpdrachtinfoMessage {

    @XmlAttribute(name = "incidentnummer", required = true)
    protected int incidentnummer;
    @XmlAttribute(name = "actienummer", required = true)
    protected int actienummer;

    /**
     * Gets the value of the incidentnummer property.
     * 
     */
    public int getIncidentnummer() {
        return incidentnummer;
    }

    /**
     * Sets the value of the incidentnummer property.
     * 
     */
    public void setIncidentnummer(int value) {
        this.incidentnummer = value;
    }

    /**
     * Gets the value of the actienummer property.
     * 
     */
    public int getActienummer() {
        return actienummer;
    }

    /**
     * Sets the value of the actienummer property.
     * 
     */
    public void setActienummer(int value) {
        this.actienummer = value;
    }

}
