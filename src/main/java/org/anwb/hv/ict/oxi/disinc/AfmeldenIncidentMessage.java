
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afmeldenIncidentMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afmeldenIncidentMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actienummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afmeldenIncidentMessage", propOrder = {

})
public class AfmeldenIncidentMessage {

    protected int incidentnummer;
    protected Integer actienummer;

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActienummer() {
        return actienummer;
    }

    /**
     * Sets the value of the actienummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActienummer(Integer value) {
        this.actienummer = value;
    }

}
