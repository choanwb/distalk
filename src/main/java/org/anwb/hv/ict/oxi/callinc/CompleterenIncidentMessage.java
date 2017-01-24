
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.anwb.hv.ict.oxi.obi.Locatie;
import org.anwb.hv.ict.oxi.obi.TaakTypeEnum;
import org.anwb.hv.ict.oxi.obi.Wegenwacht;


/**
 * <p>Java class for completerenIncidentMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="completerenIncidentMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="incidentnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hulpverlenernummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taak" type="{http://anwb.org/hv/ict/oxi/obi}TaakTypeEnum"/&gt;
 *         &lt;element name="hulpverlener" type="{http://anwb.org/hv/ict/oxi/obi}Wegenwacht" minOccurs="0"/&gt;
 *         &lt;element name="klantLidnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="locatie" type="{http://anwb.org/hv/ict/oxi/obi}Locatie" minOccurs="0"/&gt;
 *         &lt;element name="voertuig" type="{http://anwb.org/hv/ict/oxi/callinc}Voertuig" minOccurs="0"/&gt;
 *         &lt;element name="betaling" type="{http://anwb.org/hv/ict/oxi/callinc}Betaling" minOccurs="0"/&gt;
 *         &lt;element name="arc-ait-gegevens" type="{http://anwb.org/hv/ict/oxi/callinc}ARC-AIT-Gegevens" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "completerenIncidentMessage", propOrder = {

})
public class CompleterenIncidentMessage {

    protected int incidentnummer;
    protected int hulpverlenernummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaakTypeEnum taak;
    protected Wegenwacht hulpverlener;
    protected Integer klantLidnummer;
    protected Locatie locatie;
    protected Voertuig voertuig;
    protected Betaling betaling;
    @XmlElement(name = "arc-ait-gegevens")
    protected ARCAITGegevens arcAitGegevens;

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
     * Gets the value of the voertuig property.
     * 
     * @return
     *     possible object is
     *     {@link Voertuig }
     *     
     */
    public Voertuig getVoertuig() {
        return voertuig;
    }

    /**
     * Sets the value of the voertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voertuig }
     *     
     */
    public void setVoertuig(Voertuig value) {
        this.voertuig = value;
    }

    /**
     * Gets the value of the betaling property.
     * 
     * @return
     *     possible object is
     *     {@link Betaling }
     *     
     */
    public Betaling getBetaling() {
        return betaling;
    }

    /**
     * Sets the value of the betaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Betaling }
     *     
     */
    public void setBetaling(Betaling value) {
        this.betaling = value;
    }

    /**
     * Gets the value of the arcAitGegevens property.
     * 
     * @return
     *     possible object is
     *     {@link ARCAITGegevens }
     *     
     */
    public ARCAITGegevens getArcAitGegevens() {
        return arcAitGegevens;
    }

    /**
     * Sets the value of the arcAitGegevens property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARCAITGegevens }
     *     
     */
    public void setArcAitGegevens(ARCAITGegevens value) {
        this.arcAitGegevens = value;
    }

}
