
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VeiligstelOpdracht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeiligstelOpdracht"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="locatie" type="{http://anwb.org/hv/ict/oxi/disinc}Locatie"/&gt;
 *         &lt;element name="servicestation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="actienummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeiligstelOpdracht", propOrder = {

})
public class VeiligstelOpdracht {

    @XmlElement(required = true)
    protected Locatie locatie;
    protected boolean servicestation;
    @XmlAttribute(name = "actienummer", required = true)
    protected int actienummer;

    /**
     * Gets the value of the locatie property.
     * 
     * @return
     *     possible object is
     *     {@link Locatie }
     *     
     */
    public Locatie getLocatie() {
        return locatie;
    }

    /**
     * Sets the value of the locatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locatie }
     *     
     */
    public void setLocatie(Locatie value) {
        this.locatie = value;
    }

    /**
     * Gets the value of the servicestation property.
     * 
     */
    public boolean isServicestation() {
        return servicestation;
    }

    /**
     * Sets the value of the servicestation property.
     * 
     */
    public void setServicestation(boolean value) {
        this.servicestation = value;
    }

    /**
     * Gets the value of the actienummer property.
     * 
     */
    public int getActienummer() {
        return actienummer;
    }

    /**
     * Sets the value of the actienummer property.
     * 
     */
    public void setActienummer(int value) {
        this.actienummer = value;
    }

}
