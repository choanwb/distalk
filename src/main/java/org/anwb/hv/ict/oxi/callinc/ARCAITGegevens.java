
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ARC-AIT-Gegevens complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARC-AIT-Gegevens"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="lidnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="woonplaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="afgiftedatumKenteken" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARC-AIT-Gegevens", propOrder = {

})
public class ARCAITGegevens {

    protected String lidnummer;
    protected String naam;
    protected String postcode;
    protected String woonplaats;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar afgiftedatumKenteken;

    /**
     * Gets the value of the lidnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLidnummer() {
        return lidnummer;
    }

    /**
     * Sets the value of the lidnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLidnummer(String value) {
        this.lidnummer = value;
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
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the woonplaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoonplaats() {
        return woonplaats;
    }

    /**
     * Sets the value of the woonplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoonplaats(String value) {
        this.woonplaats = value;
    }

    /**
     * Gets the value of the afgiftedatumKenteken property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAfgiftedatumKenteken() {
        return afgiftedatumKenteken;
    }

    /**
     * Sets the value of the afgiftedatumKenteken property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAfgiftedatumKenteken(XMLGregorianCalendar value) {
        this.afgiftedatumKenteken = value;
    }

}
