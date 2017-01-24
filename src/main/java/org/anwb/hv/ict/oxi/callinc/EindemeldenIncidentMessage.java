
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.anwb.hv.ict.oxi.obi.AfloopcodeEnum;
import org.anwb.hv.ict.oxi.obi.Wegenwacht;


/**
 * <p>Java class for eindemeldenIncidentMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eindemeldenIncidentMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actienummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="transportActienummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="afloopcode" type="{http://anwb.org/hv/ict/oxi/obi}AfloopcodeEnum"/&gt;
 *         &lt;element name="pechcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="omschrijvingpechcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hulpverlener" type="{http://anwb.org/hv/ict/oxi/obi}Wegenwacht"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eindemeldenIncidentMessage", propOrder = {

})
public class EindemeldenIncidentMessage {

    protected int incidentnummer;
    protected Integer actienummer;
    protected Integer transportActienummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AfloopcodeEnum afloopcode;
    protected int pechcode;
    @XmlElement(required = true)
    protected String omschrijvingpechcode;
    @XmlElement(required = true)
    protected Wegenwacht hulpverlener;

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActienummer() {
        return actienummer;
    }

    /**
     * Sets the value of the actienummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActienummer(Integer value) {
        this.actienummer = value;
    }

    /**
     * Gets the value of the transportActienummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportActienummer() {
        return transportActienummer;
    }

    /**
     * Sets the value of the transportActienummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportActienummer(Integer value) {
        this.transportActienummer = value;
    }

    /**
     * Gets the value of the afloopcode property.
     * 
     * @return
     *     possible object is
     *     {@link AfloopcodeEnum }
     *     
     */
    public AfloopcodeEnum getAfloopcode() {
        return afloopcode;
    }

    /**
     * Sets the value of the afloopcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfloopcodeEnum }
     *     
     */
    public void setAfloopcode(AfloopcodeEnum value) {
        this.afloopcode = value;
    }

    /**
     * Gets the value of the pechcode property.
     * 
     */
    public int getPechcode() {
        return pechcode;
    }

    /**
     * Sets the value of the pechcode property.
     * 
     */
    public void setPechcode(int value) {
        this.pechcode = value;
    }

    /**
     * Gets the value of the omschrijvingpechcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijvingpechcode() {
        return omschrijvingpechcode;
    }

    /**
     * Sets the value of the omschrijvingpechcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijvingpechcode(String value) {
        this.omschrijvingpechcode = value;
    }

    /**
     * Gets the value of the hulpverlener property.
     * 
     * @return
     *     possible object is
     *     {@link Wegenwacht }
     *     
     */
    public Wegenwacht getHulpverlener() {
        return hulpverlener;
    }

    /**
     * Sets the value of the hulpverlener property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wegenwacht }
     *     
     */
    public void setHulpverlener(Wegenwacht value) {
        this.hulpverlener = value;
    }

}
