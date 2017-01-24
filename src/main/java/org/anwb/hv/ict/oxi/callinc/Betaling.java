
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Betaling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Betaling"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="betaald" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bedrag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inschrijfgeld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="voorrijkosten" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="arbeidsloon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="materiaal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BetalingWijzeEnum" type="{http://anwb.org/hv/ict/oxi/callinc}BetalingWijzeEnum" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Betaling", propOrder = {

})
public class Betaling {

    protected Boolean betaald;
    protected String bedrag;
    protected Boolean inschrijfgeld;
    protected Boolean voorrijkosten;
    protected Boolean arbeidsloon;
    protected Boolean materiaal;
    @XmlElement(name = "BetalingWijzeEnum")
    @XmlSchemaType(name = "string")
    protected BetalingWijzeEnum betalingWijzeEnum;

    /**
     * Gets the value of the betaald property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBetaald() {
        return betaald;
    }

    /**
     * Sets the value of the betaald property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBetaald(Boolean value) {
        this.betaald = value;
    }

    /**
     * Gets the value of the bedrag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedrag() {
        return bedrag;
    }

    /**
     * Sets the value of the bedrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedrag(String value) {
        this.bedrag = value;
    }

    /**
     * Gets the value of the inschrijfgeld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInschrijfgeld() {
        return inschrijfgeld;
    }

    /**
     * Sets the value of the inschrijfgeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInschrijfgeld(Boolean value) {
        this.inschrijfgeld = value;
    }

    /**
     * Gets the value of the voorrijkosten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoorrijkosten() {
        return voorrijkosten;
    }

    /**
     * Sets the value of the voorrijkosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoorrijkosten(Boolean value) {
        this.voorrijkosten = value;
    }

    /**
     * Gets the value of the arbeidsloon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArbeidsloon() {
        return arbeidsloon;
    }

    /**
     * Sets the value of the arbeidsloon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArbeidsloon(Boolean value) {
        this.arbeidsloon = value;
    }

    /**
     * Gets the value of the materiaal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMateriaal() {
        return materiaal;
    }

    /**
     * Sets the value of the materiaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMateriaal(Boolean value) {
        this.materiaal = value;
    }

    /**
     * Gets the value of the betalingWijzeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link BetalingWijzeEnum }
     *     
     */
    public BetalingWijzeEnum getBetalingWijzeEnum() {
        return betalingWijzeEnum;
    }

    /**
     * Sets the value of the betalingWijzeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetalingWijzeEnum }
     *     
     */
    public void setBetalingWijzeEnum(BetalingWijzeEnum value) {
        this.betalingWijzeEnum = value;
    }

}
