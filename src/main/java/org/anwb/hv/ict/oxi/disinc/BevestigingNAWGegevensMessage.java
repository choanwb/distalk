
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="straat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="telefoonnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datumaankomst" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "bevestigingNAWGegevensMessage")
public class BevestigingNAWGegevensMessage {

    protected int incidentnummer;
    @XmlElement(required = true)
    protected String naam;
    @XmlElement(required = true)
    protected String plaats;
    @XmlElement(required = true)
    protected String straat;
    protected int huisnummer;
    @XmlElement(required = true)
    protected String telefoonnummer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumaankomst;

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
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the plaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaats() {
        return plaats;
    }

    /**
     * Sets the value of the plaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaats(String value) {
        this.plaats = value;
    }

    /**
     * Gets the value of the straat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraat() {
        return straat;
    }

    /**
     * Sets the value of the straat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraat(String value) {
        this.straat = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     */
    public int getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     */
    public void setHuisnummer(int value) {
        this.huisnummer = value;
    }

    /**
     * Gets the value of the telefoonnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    /**
     * Sets the value of the telefoonnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoonnummer(String value) {
        this.telefoonnummer = value;
    }

    /**
     * Gets the value of the datumaankomst property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumaankomst() {
        return datumaankomst;
    }

    /**
     * Sets the value of the datumaankomst property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumaankomst(XMLGregorianCalendar value) {
        this.datumaankomst = value;
    }

}
