
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kruising complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kruising"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="straat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kruisendeStraat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kruising", propOrder = {

})
public class Kruising {

    @XmlElement(required = true)
    protected String plaats;
    @XmlElement(required = true)
    protected String straat;
    @XmlElement(required = true)
    protected String kruisendeStraat;

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
     * Gets the value of the kruisendeStraat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKruisendeStraat() {
        return kruisendeStraat;
    }

    /**
     * Sets the value of the kruisendeStraat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKruisendeStraat(String value) {
        this.kruisendeStraat = value;
    }

}
