
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Huisnummer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Huisnummer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="appendix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Huisnummer", propOrder = {

})
public class Huisnummer {

    protected int nummer;
    protected String appendix;

    /**
     * Gets the value of the nummer property.
     * 
     */
    public int getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     */
    public void setNummer(int value) {
        this.nummer = value;
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

}
