
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stelMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stelMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actienummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nieuweWachttijd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stelMessage", propOrder = {

})
public class StelMessage {

    protected int incidentnummer;
    protected int actienummer;
    protected int nieuweWachttijd;

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

    /**
     * Gets the value of the nieuweWachttijd property.
     * 
     */
    public int getNieuweWachttijd() {
        return nieuweWachttijd;
    }

    /**
     * Sets the value of the nieuweWachttijd property.
     * 
     */
    public void setNieuweWachttijd(int value) {
        this.nieuweWachttijd = value;
    }

}
