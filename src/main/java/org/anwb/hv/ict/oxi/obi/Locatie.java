
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Locatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Locatie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="bijzonderheid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locatieMelding" type="{http://anwb.org/hv/ict/oxi/obi}Locatiemelding" minOccurs="0"/&gt;
 *         &lt;element name="wegtype" type="{http://anwb.org/hv/ict/oxi/obi}WegtypeEnum" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locatie", propOrder = {

})
public class Locatie {

    protected String bijzonderheid;
    protected Locatiemelding locatieMelding;
    @XmlSchemaType(name = "string")
    protected WegtypeEnum wegtype;
    @XmlAttribute(name = "x", required = true)
    protected long x;
    @XmlAttribute(name = "y", required = true)
    protected long y;

    /**
     * Gets the value of the bijzonderheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBijzonderheid() {
        return bijzonderheid;
    }

    /**
     * Sets the value of the bijzonderheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBijzonderheid(String value) {
        this.bijzonderheid = value;
    }

    /**
     * Gets the value of the locatieMelding property.
     * 
     * @return
     *     possible object is
     *     {@link Locatiemelding }
     *     
     */
    public Locatiemelding getLocatieMelding() {
        return locatieMelding;
    }

    /**
     * Sets the value of the locatieMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locatiemelding }
     *     
     */
    public void setLocatieMelding(Locatiemelding value) {
        this.locatieMelding = value;
    }

    /**
     * Gets the value of the wegtype property.
     * 
     * @return
     *     possible object is
     *     {@link WegtypeEnum }
     *     
     */
    public WegtypeEnum getWegtype() {
        return wegtype;
    }

    /**
     * Sets the value of the wegtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link WegtypeEnum }
     *     
     */
    public void setWegtype(WegtypeEnum value) {
        this.wegtype = value;
    }

    /**
     * Gets the value of the x property.
     * 
     */
    public long getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(long value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public long getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(long value) {
        this.y = value;
    }

}
