
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wegenwacht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wegenwacht"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="hulpverlenernummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="gripnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefoonnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mannummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="voornaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="achternaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wegenwacht", propOrder = {

})
public class Wegenwacht {

    protected int hulpverlenernummer;
    protected String gripnummer;
    protected String telefoonnummer;
    protected Integer mannummer;
    protected String voornaam;
    protected String achternaam;

    /**
     * Gets the value of the hulpverlenernummer property.
     * 
     */
    public int getHulpverlenernummer() {
        return hulpverlenernummer;
    }

    /**
     * Sets the value of the hulpverlenernummer property.
     * 
     */
    public void setHulpverlenernummer(int value) {
        this.hulpverlenernummer = value;
    }

    /**
     * Gets the value of the gripnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGripnummer() {
        return gripnummer;
    }

    /**
     * Sets the value of the gripnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGripnummer(String value) {
        this.gripnummer = value;
    }

    /**
     * Gets the value of the telefoonnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    /**
     * Sets the value of the telefoonnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoonnummer(String value) {
        this.telefoonnummer = value;
    }

    /**
     * Gets the value of the mannummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMannummer() {
        return mannummer;
    }

    /**
     * Sets the value of the mannummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMannummer(Integer value) {
        this.mannummer = value;
    }

    /**
     * Gets the value of the voornaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Sets the value of the voornaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoornaam(String value) {
        this.voornaam = value;
    }

    /**
     * Gets the value of the achternaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     * Sets the value of the achternaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchternaam(String value) {
        this.achternaam = value;
    }

}
