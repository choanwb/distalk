
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pechhistorie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pechhistorie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="volgnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="kenteken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pechcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hulpverlenernummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mannummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="afloopcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lidnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pechhistorie", propOrder = {

})
public class Pechhistorie {

    protected int incidentnummer;
    protected int volgnummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    protected String kenteken;
    protected String merk;
    @XmlElement(required = true)
    protected String pechcode;
    protected int hulpverlenernummer;
    protected int mannummer;
    protected boolean transport;
    protected int afloopcode;
    protected Integer lidnummer;

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
     * Gets the value of the volgnummer property.
     * 
     */
    public int getVolgnummer() {
        return volgnummer;
    }

    /**
     * Sets the value of the volgnummer property.
     * 
     */
    public void setVolgnummer(int value) {
        this.volgnummer = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
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
     * Gets the value of the merk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerk() {
        return merk;
    }

    /**
     * Sets the value of the merk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerk(String value) {
        this.merk = value;
    }

    /**
     * Gets the value of the pechcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPechcode() {
        return pechcode;
    }

    /**
     * Sets the value of the pechcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPechcode(String value) {
        this.pechcode = value;
    }

    /**
     * Gets the value of the hulpverlenernummer property.
     * 
     */
    public int getHulpverlenernummer() {
        return hulpverlenernummer;
    }

    /**
     * Sets the value of the hulpverlenernummer property.
     * 
     */
    public void setHulpverlenernummer(int value) {
        this.hulpverlenernummer = value;
    }

    /**
     * Gets the value of the mannummer property.
     * 
     */
    public int getMannummer() {
        return mannummer;
    }

    /**
     * Sets the value of the mannummer property.
     * 
     */
    public void setMannummer(int value) {
        this.mannummer = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     */
    public boolean isTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     */
    public void setTransport(boolean value) {
        this.transport = value;
    }

    /**
     * Gets the value of the afloopcode property.
     * 
     */
    public int getAfloopcode() {
        return afloopcode;
    }

    /**
     * Sets the value of the afloopcode property.
     * 
     */
    public void setAfloopcode(int value) {
        this.afloopcode = value;
    }

    /**
     * Gets the value of the lidnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLidnummer() {
        return lidnummer;
    }

    /**
     * Sets the value of the lidnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLidnummer(Integer value) {
        this.lidnummer = value;
    }

}
