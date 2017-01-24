
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Opdracht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opdracht"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="hulpverlenernummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="opdrachtvolgnummer" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *       &lt;attribute name="incidentnummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opdracht", propOrder = {

})
public class Opdracht {

    protected Integer hulpverlenernummer;
    @XmlAttribute(name = "opdrachtvolgnummer", required = true)
    protected byte opdrachtvolgnummer;
    @XmlAttribute(name = "incidentnummer", required = true)
    protected int incidentnummer;

    /**
     * Gets the value of the hulpverlenernummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHulpverlenernummer() {
        return hulpverlenernummer;
    }

    /**
     * Sets the value of the hulpverlenernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHulpverlenernummer(Integer value) {
        this.hulpverlenernummer = value;
    }

    /**
     * Gets the value of the opdrachtvolgnummer property.
     * 
     */
    public byte getOpdrachtvolgnummer() {
        return opdrachtvolgnummer;
    }

    /**
     * Sets the value of the opdrachtvolgnummer property.
     * 
     */
    public void setOpdrachtvolgnummer(byte value) {
        this.opdrachtvolgnummer = value;
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

}
