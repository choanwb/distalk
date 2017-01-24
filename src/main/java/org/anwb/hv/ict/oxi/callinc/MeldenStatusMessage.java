
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.anwb.hv.ict.oxi.obi.TaakTypeEnum;


/**
 * <p>Java class for meldenStatusMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meldenStatusMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actienummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="incidentstatus" type="{http://anwb.org/hv/ict/oxi/callinc}StatusEnum"/&gt;
 *         &lt;element name="taak" type="{http://anwb.org/hv/ict/oxi/obi}TaakTypeEnum"/&gt;
 *         &lt;element name="taakstatus" type="{http://anwb.org/hv/ict/oxi/callinc}StatusEnum"/&gt;
 *         &lt;element name="gecommuniceerdeWachttijd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meldenStatusMessage", propOrder = {

})
public class MeldenStatusMessage {

    protected int incidentnummer;
    protected int actienummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusEnum incidentstatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaakTypeEnum taak;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusEnum taakstatus;
    protected Integer gecommuniceerdeWachttijd;

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

    /**
     * Gets the value of the incidentstatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnum }
     *     
     */
    public StatusEnum getIncidentstatus() {
        return incidentstatus;
    }

    /**
     * Sets the value of the incidentstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnum }
     *     
     */
    public void setIncidentstatus(StatusEnum value) {
        this.incidentstatus = value;
    }

    /**
     * Gets the value of the taak property.
     * 
     * @return
     *     possible object is
     *     {@link TaakTypeEnum }
     *     
     */
    public TaakTypeEnum getTaak() {
        return taak;
    }

    /**
     * Sets the value of the taak property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaakTypeEnum }
     *     
     */
    public void setTaak(TaakTypeEnum value) {
        this.taak = value;
    }

    /**
     * Gets the value of the taakstatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnum }
     *     
     */
    public StatusEnum getTaakstatus() {
        return taakstatus;
    }

    /**
     * Sets the value of the taakstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnum }
     *     
     */
    public void setTaakstatus(StatusEnum value) {
        this.taakstatus = value;
    }

    /**
     * Gets the value of the gecommuniceerdeWachttijd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGecommuniceerdeWachttijd() {
        return gecommuniceerdeWachttijd;
    }

    /**
     * Sets the value of the gecommuniceerdeWachttijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGecommuniceerdeWachttijd(Integer value) {
        this.gecommuniceerdeWachttijd = value;
    }

}
