
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Locatiemelding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Locatiemelding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="viaPraatpaal" type="{http://anwb.org/hv/ict/oxi/obi}LocatieMeldingViaPraatpaal" minOccurs="0"/&gt;
 *         &lt;element name="locatieIndicatie" type="{http://anwb.org/hv/ict/oxi/obi}LocatieIndicatie"/&gt;
 *         &lt;element name="viaMarkering" type="{http://anwb.org/hv/ict/oxi/obi}Markering" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locatiemelding", propOrder = {

})
public class Locatiemelding {

    protected LocatieMeldingViaPraatpaal viaPraatpaal;
    @XmlElement(required = true)
    protected LocatieIndicatie locatieIndicatie;
    protected Markering viaMarkering;

    /**
     * Gets the value of the viaPraatpaal property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieMeldingViaPraatpaal }
     *     
     */
    public LocatieMeldingViaPraatpaal getViaPraatpaal() {
        return viaPraatpaal;
    }

    /**
     * Sets the value of the viaPraatpaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieMeldingViaPraatpaal }
     *     
     */
    public void setViaPraatpaal(LocatieMeldingViaPraatpaal value) {
        this.viaPraatpaal = value;
    }

    /**
     * Gets the value of the locatieIndicatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieIndicatie }
     *     
     */
    public LocatieIndicatie getLocatieIndicatie() {
        return locatieIndicatie;
    }

    /**
     * Sets the value of the locatieIndicatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieIndicatie }
     *     
     */
    public void setLocatieIndicatie(LocatieIndicatie value) {
        this.locatieIndicatie = value;
    }

    /**
     * Gets the value of the viaMarkering property.
     * 
     * @return
     *     possible object is
     *     {@link Markering }
     *     
     */
    public Markering getViaMarkering() {
        return viaMarkering;
    }

    /**
     * Sets the value of the viaMarkering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markering }
     *     
     */
    public void setViaMarkering(Markering value) {
        this.viaMarkering = value;
    }

}
