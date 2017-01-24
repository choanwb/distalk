
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for antwoordenOpdrachtinfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="antwoordenOpdrachtinfoMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="opdrachten" type="{http://anwb.org/hv/ict/oxi/disinc}OpdrachtenType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="incidentnummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="actienummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antwoordenOpdrachtinfoMessage", propOrder = {

})
public class AntwoordenOpdrachtinfoMessage {

    protected OpdrachtenType opdrachten;
    @XmlAttribute(name = "incidentnummer", required = true)
    protected int incidentnummer;
    @XmlAttribute(name = "actienummer", required = true)
    protected int actienummer;

    /**
     * Gets the value of the opdrachten property.
     * 
     * @return
     *     possible object is
     *     {@link OpdrachtenType }
     *     
     */
    public OpdrachtenType getOpdrachten() {
        return opdrachten;
    }

    /**
     * Sets the value of the opdrachten property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpdrachtenType }
     *     
     */
    public void setOpdrachten(OpdrachtenType value) {
        this.opdrachten = value;
    }

    /**
     * Gets the value of the incidentnummer property.
     * 
     */
    public int getIncidentnummer() {
        return incidentnummer;
    }

    /**
     * Sets the value of the incidentnummer property.
     * 
     */
    public void setIncidentnummer(int value) {
        this.incidentnummer = value;
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
