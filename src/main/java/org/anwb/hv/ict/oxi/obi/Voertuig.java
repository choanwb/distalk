
package org.anwb.hv.ict.oxi.obi;

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
 *         &lt;element name="merk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="truck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="soort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brandstof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kenteken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kleur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationaliteit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chassisnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlerechten" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="afgiftekenteken" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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

    protected String merk;
    protected String type;
    protected Boolean truck;
    protected String soort;
    protected String brandstof;
    protected String kenteken;
    protected String kleur;
    protected String nationaliteit;
    protected String chassisnummer;
    protected Boolean controlerechten;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar afgiftekenteken;

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
     * Gets the value of the truck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTruck() {
        return truck;
    }

    /**
     * Sets the value of the truck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTruck(Boolean value) {
        this.truck = value;
    }

    /**
     * Gets the value of the soort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoort() {
        return soort;
    }

    /**
     * Sets the value of the soort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoort(String value) {
        this.soort = value;
    }

    /**
     * Gets the value of the brandstof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandstof() {
        return brandstof;
    }

    /**
     * Sets the value of the brandstof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandstof(String value) {
        this.brandstof = value;
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
     * Gets the value of the kleur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKleur() {
        return kleur;
    }

    /**
     * Sets the value of the kleur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKleur(String value) {
        this.kleur = value;
    }

    /**
     * Gets the value of the nationaliteit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationaliteit() {
        return nationaliteit;
    }

    /**
     * Sets the value of the nationaliteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationaliteit(String value) {
        this.nationaliteit = value;
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
     * Gets the value of the controlerechten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControlerechten() {
        return controlerechten;
    }

    /**
     * Sets the value of the controlerechten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControlerechten(Boolean value) {
        this.controlerechten = value;
    }

    /**
     * Gets the value of the afgiftekenteken property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAfgiftekenteken() {
        return afgiftekenteken;
    }

    /**
     * Sets the value of the afgiftekenteken property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAfgiftekenteken(XMLGregorianCalendar value) {
        this.afgiftekenteken = value;
    }

}
