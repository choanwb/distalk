
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Markering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Markering"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="type" type="{http://anwb.org/hv/ict/oxi/obi}MarkeringTypeEnum"/&gt;
 *         &lt;element name="locatieIndicatie" type="{http://anwb.org/hv/ict/oxi/obi}LocatieIndicatie"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Markering", propOrder = {

})
public class Markering {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MarkeringTypeEnum type;
    @XmlElement(required = true)
    protected LocatieIndicatie locatieIndicatie;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MarkeringTypeEnum }
     *     
     */
    public MarkeringTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkeringTypeEnum }
     *     
     */
    public void setType(MarkeringTypeEnum value) {
        this.type = value;
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

}
