
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rechten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rechten"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="inschrijfcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inschrijftarief" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="betaald" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="wps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sleep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="vas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="vasduur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="krediet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hulpverlening" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kenteken" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="asmToegestaan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="haalEnBreng" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hotel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rechten", propOrder = {

})
public class Rechten {

    protected String inschrijfcode;
    protected Float inschrijftarief;
    protected Boolean betaald;
    protected Integer wps;
    protected Integer sleep;
    protected Integer vas;
    protected String vasduur;
    protected Boolean krediet;
    protected Integer hulpverlening;
    protected Integer kenteken;
    protected Boolean asmToegestaan;
    protected Boolean haalEnBreng;
    protected Boolean hotel;

    /**
     * Gets the value of the inschrijfcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInschrijfcode() {
        return inschrijfcode;
    }

    /**
     * Sets the value of the inschrijfcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInschrijfcode(String value) {
        this.inschrijfcode = value;
    }

    /**
     * Gets the value of the inschrijftarief property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInschrijftarief() {
        return inschrijftarief;
    }

    /**
     * Sets the value of the inschrijftarief property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInschrijftarief(Float value) {
        this.inschrijftarief = value;
    }

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
     * Gets the value of the wps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWps() {
        return wps;
    }

    /**
     * Sets the value of the wps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWps(Integer value) {
        this.wps = value;
    }

    /**
     * Gets the value of the sleep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSleep() {
        return sleep;
    }

    /**
     * Sets the value of the sleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSleep(Integer value) {
        this.sleep = value;
    }

    /**
     * Gets the value of the vas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVas() {
        return vas;
    }

    /**
     * Sets the value of the vas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVas(Integer value) {
        this.vas = value;
    }

    /**
     * Gets the value of the vasduur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVasduur() {
        return vasduur;
    }

    /**
     * Sets the value of the vasduur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVasduur(String value) {
        this.vasduur = value;
    }

    /**
     * Gets the value of the krediet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKrediet() {
        return krediet;
    }

    /**
     * Sets the value of the krediet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKrediet(Boolean value) {
        this.krediet = value;
    }

    /**
     * Gets the value of the hulpverlening property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHulpverlening() {
        return hulpverlening;
    }

    /**
     * Sets the value of the hulpverlening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHulpverlening(Integer value) {
        this.hulpverlening = value;
    }

    /**
     * Gets the value of the kenteken property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKenteken() {
        return kenteken;
    }

    /**
     * Sets the value of the kenteken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKenteken(Integer value) {
        this.kenteken = value;
    }

    /**
     * Gets the value of the asmToegestaan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsmToegestaan() {
        return asmToegestaan;
    }

    /**
     * Sets the value of the asmToegestaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsmToegestaan(Boolean value) {
        this.asmToegestaan = value;
    }

    /**
     * Gets the value of the haalEnBreng property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaalEnBreng() {
        return haalEnBreng;
    }

    /**
     * Sets the value of the haalEnBreng property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaalEnBreng(Boolean value) {
        this.haalEnBreng = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotel(Boolean value) {
        this.hotel = value;
    }

}
