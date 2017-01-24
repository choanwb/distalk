
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.anwb.hv.ict.oxi.obi.TaakTypeEnum;


/**
 * <p>Java class for antwoordenPlanningsinfoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="antwoordenPlanningsinfoMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actienummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taak" type="{http://anwb.org/hv/ict/oxi/obi}TaakTypeEnum"/&gt;
 *         &lt;element name="geschatteWachttijd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="planningsmethode" type="{http://anwb.org/hv/ict/oxi/disinc}PlanningsmethodeEnum"/&gt;
 *         &lt;element name="faserood" type="{http://anwb.org/hv/ict/oxi/disinc}FaseroodEnum"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antwoordenPlanningsinfoMessage", propOrder = {

})
public class AntwoordenPlanningsinfoMessage {

    protected int incidentnummer;
    protected int actienummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaakTypeEnum taak;
    protected int geschatteWachttijd;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlanningsmethodeEnum planningsmethode;
    protected int faserood;

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
     * Gets the value of the geschatteWachttijd property.
     * 
     */
    public int getGeschatteWachttijd() {
        return geschatteWachttijd;
    }

    /**
     * Sets the value of the geschatteWachttijd property.
     * 
     */
    public void setGeschatteWachttijd(int value) {
        this.geschatteWachttijd = value;
    }

    /**
     * Gets the value of the planningsmethode property.
     * 
     * @return
     *     possible object is
     *     {@link PlanningsmethodeEnum }
     *     
     */
    public PlanningsmethodeEnum getPlanningsmethode() {
        return planningsmethode;
    }

    /**
     * Sets the value of the planningsmethode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningsmethodeEnum }
     *     
     */
    public void setPlanningsmethode(PlanningsmethodeEnum value) {
        this.planningsmethode = value;
    }

    /**
     * Gets the value of the faserood property.
     * 
     */
    public int getFaserood() {
        return faserood;
    }

    /**
     * Sets the value of the faserood property.
     * 
     */
    public void setFaserood(int value) {
        this.faserood = value;
    }

}
