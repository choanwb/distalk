
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocatieIndicatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocatieIndicatie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="adres" type="{http://anwb.org/hv/ict/oxi/obi}Adres" minOccurs="0"/&gt;
 *         &lt;element name="kruising" type="{http://anwb.org/hv/ict/oxi/obi}Kruising" minOccurs="0"/&gt;
 *         &lt;element name="hectometerpaal" type="{http://anwb.org/hv/ict/oxi/obi}Hectometerpaal" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://anwb.org/hv/ict/oxi/obi}PostcodeHuisnummer" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocatieIndicatie", propOrder = {
    "adres",
    "kruising",
    "hectometerpaal",
    "postcode"
})
public class LocatieIndicatie {

    protected Adres adres;
    protected Kruising kruising;
    protected Hectometerpaal hectometerpaal;
    protected PostcodeHuisnummer postcode;

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link Adres }
     *     
     */
    public Adres getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adres }
     *     
     */
    public void setAdres(Adres value) {
        this.adres = value;
    }

    /**
     * Gets the value of the kruising property.
     * 
     * @return
     *     possible object is
     *     {@link Kruising }
     *     
     */
    public Kruising getKruising() {
        return kruising;
    }

    /**
     * Sets the value of the kruising property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kruising }
     *     
     */
    public void setKruising(Kruising value) {
        this.kruising = value;
    }

    /**
     * Gets the value of the hectometerpaal property.
     * 
     * @return
     *     possible object is
     *     {@link Hectometerpaal }
     *     
     */
    public Hectometerpaal getHectometerpaal() {
        return hectometerpaal;
    }

    /**
     * Sets the value of the hectometerpaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hectometerpaal }
     *     
     */
    public void setHectometerpaal(Hectometerpaal value) {
        this.hectometerpaal = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link PostcodeHuisnummer }
     *     
     */
    public PostcodeHuisnummer getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostcodeHuisnummer }
     *     
     */
    public void setPostcode(PostcodeHuisnummer value) {
        this.postcode = value;
    }

}
