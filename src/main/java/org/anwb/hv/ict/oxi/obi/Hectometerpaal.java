
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hectometerpaal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hectometerpaal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="wegnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="richting" type="{http://anwb.org/hv/ict/oxi/obi}RichtingEnum" minOccurs="0"/&gt;
 *         &lt;element name="plaatsVan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="plaatsNaar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hectometerpaal", propOrder = {

})
public class Hectometerpaal {

    @XmlElement(required = true)
    protected String wegnummer;
    @XmlElement(required = true)
    protected String nummer;
    @XmlSchemaType(name = "string")
    protected RichtingEnum richting;
    @XmlElement(required = true)
    protected String plaatsVan;
    @XmlElement(required = true)
    protected String plaatsNaar;

    /**
     * Gets the value of the wegnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWegnummer() {
        return wegnummer;
    }

    /**
     * Sets the value of the wegnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWegnummer(String value) {
        this.wegnummer = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the richting property.
     * 
     * @return
     *     possible object is
     *     {@link RichtingEnum }
     *     
     */
    public RichtingEnum getRichting() {
        return richting;
    }

    /**
     * Sets the value of the richting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichtingEnum }
     *     
     */
    public void setRichting(RichtingEnum value) {
        this.richting = value;
    }

    /**
     * Gets the value of the plaatsVan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsVan() {
        return plaatsVan;
    }

    /**
     * Sets the value of the plaatsVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsVan(String value) {
        this.plaatsVan = value;
    }

    /**
     * Gets the value of the plaatsNaar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsNaar() {
        return plaatsNaar;
    }

    /**
     * Sets the value of the plaatsNaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsNaar(String value) {
        this.plaatsNaar = value;
    }

}
