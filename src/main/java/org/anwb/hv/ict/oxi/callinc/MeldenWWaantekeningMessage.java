
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meldenWWaantekeningMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meldenWWaantekeningMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="personeelsnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="kenteken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="klantLidnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aantekening" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meldenWWaantekeningMessage", propOrder = {
    "incidentnummer",
    "personeelsnummer",
    "kenteken",
    "klantLidnummer",
    "aantekening"
})
public class MeldenWWaantekeningMessage {

    protected int incidentnummer;
    protected int personeelsnummer;
    protected String kenteken;
    protected Integer klantLidnummer;
    @XmlElement(required = true)
    protected String aantekening;

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
     * Gets the value of the personeelsnummer property.
     * 
     */
    public int getPersoneelsnummer() {
        return personeelsnummer;
    }

    /**
     * Sets the value of the personeelsnummer property.
     * 
     */
    public void setPersoneelsnummer(int value) {
        this.personeelsnummer = value;
    }

    /**
     * Gets the value of the kenteken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKenteken() {
        return kenteken;
    }

    /**
     * Sets the value of the kenteken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKenteken(String value) {
        this.kenteken = value;
    }

    /**
     * Gets the value of the klantLidnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlantLidnummer() {
        return klantLidnummer;
    }

    /**
     * Sets the value of the klantLidnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlantLidnummer(Integer value) {
        this.klantLidnummer = value;
    }

    /**
     * Gets the value of the aantekening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAantekening() {
        return aantekening;
    }

    /**
     * Sets the value of the aantekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAantekening(String value) {
        this.aantekening = value;
    }

}
