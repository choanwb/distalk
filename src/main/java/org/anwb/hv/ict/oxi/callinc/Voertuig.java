
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Voertuig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Voertuig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="kenteken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chassisnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meldcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kilometerstand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "Voertuig", propOrder = {

})
public class Voertuig {

    protected String kenteken;
    protected String merk;
    protected String type;
    protected String chassisnummer;
    protected String meldcode;
    protected Integer kilometerstand;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar afgiftedatumKenteken;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the chassisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisnummer() {
        return chassisnummer;
    }

    /**
     * Sets the value of the chassisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisnummer(String value) {
        this.chassisnummer = value;
    }

    /**
     * Gets the value of the meldcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldcode() {
        return meldcode;
    }

    /**
     * Sets the value of the meldcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldcode(String value) {
        this.meldcode = value;
    }

    /**
     * Gets the value of the kilometerstand property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKilometerstand() {
        return kilometerstand;
    }

    /**
     * Sets the value of the kilometerstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKilometerstand(Integer value) {
        this.kilometerstand = value;
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
