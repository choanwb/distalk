
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostcodeHuisnummer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostcodeHuisnummer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="huisnummer" type="{http://anwb.org/hv/ict/oxi/obi}Huisnummer"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostcodeHuisnummer", propOrder = {

})
public class PostcodeHuisnummer {

    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(required = true)
    protected Huisnummer huisnummer;

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Huisnummer }
     *     
     */
    public Huisnummer getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Huisnummer }
     *     
     */
    public void setHuisnummer(Huisnummer value) {
        this.huisnummer = value;
    }

}
