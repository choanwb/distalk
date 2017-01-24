
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="straat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="appendix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kruisendeStraat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adres", propOrder = {

})
public class Adres {

    @XmlElement(required = true)
    protected String plaats;
    @XmlElement(required = true)
    protected String straat;
    protected Integer huisnummer;
    protected String appendix;
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
     * Gets the value of the huisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHuisnummer(Integer value) {
        this.huisnummer = value;
    }

    /**
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppendix(String value) {
        this.appendix = value;
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
