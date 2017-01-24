
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Melder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Melder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="benErBijna" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="telefoonnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="naamBerijder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geslacht" type="{http://anwb.org/hv/ict/oxi/obi}GeslachtTypeEnum" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Melder", propOrder = {

})
public class Melder {

    @XmlElement(required = true)
    protected String naam;
    protected Boolean benErBijna;
    protected String telefoonnummer;
    protected String naamBerijder;
    @XmlSchemaType(name = "string")
    protected GeslachtTypeEnum geslacht;

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
     * Gets the value of the benErBijna property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBenErBijna() {
        return benErBijna;
    }

    /**
     * Sets the value of the benErBijna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBenErBijna(Boolean value) {
        this.benErBijna = value;
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
     * Gets the value of the naamBerijder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamBerijder() {
        return naamBerijder;
    }

    /**
     * Sets the value of the naamBerijder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamBerijder(String value) {
        this.naamBerijder = value;
    }

    /**
     * Gets the value of the geslacht property.
     * 
     * @return
     *     possible object is
     *     {@link GeslachtTypeEnum }
     *     
     */
    public GeslachtTypeEnum getGeslacht() {
        return geslacht;
    }

    /**
     * Sets the value of the geslacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeslachtTypeEnum }
     *     
     */
    public void setGeslacht(GeslachtTypeEnum value) {
        this.geslacht = value;
    }

}
