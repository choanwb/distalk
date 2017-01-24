
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opvragenPechhistorieMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="opvragenPechhistorieMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="kenteken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="klantLidnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="klantLidnummers" type="{http://anwb.org/hv/ict/oxi/callinc}KlantLidnummersType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opvragenPechhistorieMessage", propOrder = {

})
public class OpvragenPechhistorieMessage {

    protected String kenteken;
    protected Integer klantLidnummer;
    protected KlantLidnummersType klantLidnummers;

    /**
     * Gets the value of the kenteken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKenteken() {
        return kenteken;
    }

    /**
     * Sets the value of the kenteken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKenteken(String value) {
        this.kenteken = value;
    }

    /**
     * Gets the value of the klantLidnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlantLidnummer() {
        return klantLidnummer;
    }

    /**
     * Sets the value of the klantLidnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlantLidnummer(Integer value) {
        this.klantLidnummer = value;
    }

    /**
     * Gets the value of the klantLidnummers property.
     * 
     * @return
     *     possible object is
     *     {@link KlantLidnummersType }
     *     
     */
    public KlantLidnummersType getKlantLidnummers() {
        return klantLidnummers;
    }

    /**
     * Sets the value of the klantLidnummers property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlantLidnummersType }
     *     
     */
    public void setKlantLidnummers(KlantLidnummersType value) {
        this.klantLidnummers = value;
    }

}
