
package org.anwb.hv.ict.oxi.disinc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.anwb.hv.ict.oxi.obi.Klant;
import org.anwb.hv.ict.oxi.obi.Melder;
import org.anwb.hv.ict.oxi.obi.Voertuig;


/**
 * <p>Java class for Incident complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Incident"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="volgnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LBIClassificatie" type="{http://anwb.org/hv/ict/oxi/disinc}LbiClassificatieType" minOccurs="0"/&gt;
 *         &lt;element name="tijdstipMelding" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Ongeval"/&gt;
 *               &lt;enumeration value="Pechgeval"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tijdstipAfspraakVan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tijdstipAfspraakTot" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tijdstipStelcontact" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="voorrangsregel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incidentbijzonderheid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storingscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="storingsbijzonderheid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="evenement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="locatie" type="{http://anwb.org/hv/ict/oxi/disinc}Locatie" minOccurs="0"/&gt;
 *         &lt;element name="sleutelOpdracht" type="{http://anwb.org/hv/ict/oxi/disinc}SleutelOpdracht" minOccurs="0"/&gt;
 *         &lt;element name="veiligstelOpdracht" type="{http://anwb.org/hv/ict/oxi/disinc}VeiligstelOpdracht" minOccurs="0"/&gt;
 *         &lt;element name="transportOpdracht" type="{http://anwb.org/hv/ict/oxi/disinc}TransportOpdracht" minOccurs="0"/&gt;
 *         &lt;element name="voertuig" type="{http://anwb.org/hv/ict/oxi/obi}Voertuig" minOccurs="0"/&gt;
 *         &lt;element name="journaalAantekening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="kritischeJournaalaantekening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pechhistorie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gevondenDoorHulpverlener" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aantalGewonden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="parkeergarage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="verkeersgevaarlijk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gevaarlijkeStoffen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="betaaldeHulpverlening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="voorrangsclassificatie2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hulpverlenersGebeld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rijbaanGeblokkeerd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="melder" type="{http://anwb.org/hv/ict/oxi/obi}Melder" minOccurs="0"/&gt;
 *         &lt;element name="klanten" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="klant" type="{http://anwb.org/hv/ict/oxi/obi}Klant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="geschattewachttijd" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="planningsmethode" type="{http://anwb.org/hv/ict/oxi/disinc}PlanningsmethodeEnum" minOccurs="0"/&gt;
 *         &lt;element name="wps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="nummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incident", propOrder = {

})
public class Incident {

    protected int volgnummer;
    @XmlElement(name = "LBIClassificatie")
    protected Integer lbiClassificatie;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipMelding;
    protected String type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipAfspraakVan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipAfspraakTot;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipStelcontact;
    protected String voorrangsregel;
    protected String incidentbijzonderheid;
    protected String storingscode;
    protected String storingsbijzonderheid;
    protected Boolean evenement;
    protected Locatie locatie;
    protected SleutelOpdracht sleutelOpdracht;
    protected VeiligstelOpdracht veiligstelOpdracht;
    protected TransportOpdracht transportOpdracht;
    protected Voertuig voertuig;
    protected Boolean journaalAantekening;
    protected Boolean kritischeJournaalaantekening;
    protected Boolean pechhistorie;
    protected Integer gevondenDoorHulpverlener;
    protected Integer aantalGewonden;
    protected Boolean parkeergarage;
    protected Boolean verkeersgevaarlijk;
    protected Boolean gevaarlijkeStoffen;
    protected Boolean betaaldeHulpverlening;
    protected Boolean voorrangsclassificatie2;
    protected Boolean hulpverlenersGebeld;
    protected Boolean rijbaanGeblokkeerd;
    protected Melder melder;
    protected Incident.Klanten klanten;
    protected Duration geschattewachttijd;
    @XmlSchemaType(name = "string")
    protected PlanningsmethodeEnum planningsmethode;
    protected Boolean wps;
    @XmlAttribute(name = "nummer", required = true)
    protected int nummer;

    /**
     * Gets the value of the volgnummer property.
     * 
     */
    public int getVolgnummer() {
        return volgnummer;
    }

    /**
     * Sets the value of the volgnummer property.
     * 
     */
    public void setVolgnummer(int value) {
        this.volgnummer = value;
    }

    /**
     * Gets the value of the lbiClassificatie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLBIClassificatie() {
        return lbiClassificatie;
    }

    /**
     * Sets the value of the lbiClassificatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLBIClassificatie(Integer value) {
        this.lbiClassificatie = value;
    }

    /**
     * Gets the value of the tijdstipMelding property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipMelding() {
        return tijdstipMelding;
    }

    /**
     * Sets the value of the tijdstipMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipMelding(XMLGregorianCalendar value) {
        this.tijdstipMelding = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the tijdstipAfspraakVan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipAfspraakVan() {
        return tijdstipAfspraakVan;
    }

    /**
     * Sets the value of the tijdstipAfspraakVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipAfspraakVan(XMLGregorianCalendar value) {
        this.tijdstipAfspraakVan = value;
    }

    /**
     * Gets the value of the tijdstipAfspraakTot property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipAfspraakTot() {
        return tijdstipAfspraakTot;
    }

    /**
     * Sets the value of the tijdstipAfspraakTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipAfspraakTot(XMLGregorianCalendar value) {
        this.tijdstipAfspraakTot = value;
    }

    /**
     * Gets the value of the tijdstipStelcontact property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipStelcontact() {
        return tijdstipStelcontact;
    }

    /**
     * Sets the value of the tijdstipStelcontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipStelcontact(XMLGregorianCalendar value) {
        this.tijdstipStelcontact = value;
    }

    /**
     * Gets the value of the voorrangsregel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorrangsregel() {
        return voorrangsregel;
    }

    /**
     * Sets the value of the voorrangsregel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorrangsregel(String value) {
        this.voorrangsregel = value;
    }

    /**
     * Gets the value of the incidentbijzonderheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentbijzonderheid() {
        return incidentbijzonderheid;
    }

    /**
     * Sets the value of the incidentbijzonderheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentbijzonderheid(String value) {
        this.incidentbijzonderheid = value;
    }

    /**
     * Gets the value of the storingscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoringscode() {
        return storingscode;
    }

    /**
     * Sets the value of the storingscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoringscode(String value) {
        this.storingscode = value;
    }

    /**
     * Gets the value of the storingsbijzonderheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoringsbijzonderheid() {
        return storingsbijzonderheid;
    }

    /**
     * Sets the value of the storingsbijzonderheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoringsbijzonderheid(String value) {
        this.storingsbijzonderheid = value;
    }

    /**
     * Gets the value of the evenement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvenement() {
        return evenement;
    }

    /**
     * Sets the value of the evenement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvenement(Boolean value) {
        this.evenement = value;
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
     * Gets the value of the sleutelOpdracht property.
     * 
     * @return
     *     possible object is
     *     {@link SleutelOpdracht }
     *     
     */
    public SleutelOpdracht getSleutelOpdracht() {
        return sleutelOpdracht;
    }

    /**
     * Sets the value of the sleutelOpdracht property.
     * 
     * @param value
     *     allowed object is
     *     {@link SleutelOpdracht }
     *     
     */
    public void setSleutelOpdracht(SleutelOpdracht value) {
        this.sleutelOpdracht = value;
    }

    /**
     * Gets the value of the veiligstelOpdracht property.
     * 
     * @return
     *     possible object is
     *     {@link VeiligstelOpdracht }
     *     
     */
    public VeiligstelOpdracht getVeiligstelOpdracht() {
        return veiligstelOpdracht;
    }

    /**
     * Sets the value of the veiligstelOpdracht property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeiligstelOpdracht }
     *     
     */
    public void setVeiligstelOpdracht(VeiligstelOpdracht value) {
        this.veiligstelOpdracht = value;
    }

    /**
     * Gets the value of the transportOpdracht property.
     * 
     * @return
     *     possible object is
     *     {@link TransportOpdracht }
     *     
     */
    public TransportOpdracht getTransportOpdracht() {
        return transportOpdracht;
    }

    /**
     * Sets the value of the transportOpdracht property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportOpdracht }
     *     
     */
    public void setTransportOpdracht(TransportOpdracht value) {
        this.transportOpdracht = value;
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
     * Gets the value of the journaalAantekening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJournaalAantekening() {
        return journaalAantekening;
    }

    /**
     * Sets the value of the journaalAantekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJournaalAantekening(Boolean value) {
        this.journaalAantekening = value;
    }

    /**
     * Gets the value of the kritischeJournaalaantekening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKritischeJournaalaantekening() {
        return kritischeJournaalaantekening;
    }

    /**
     * Sets the value of the kritischeJournaalaantekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKritischeJournaalaantekening(Boolean value) {
        this.kritischeJournaalaantekening = value;
    }

    /**
     * Gets the value of the pechhistorie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPechhistorie() {
        return pechhistorie;
    }

    /**
     * Sets the value of the pechhistorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPechhistorie(Boolean value) {
        this.pechhistorie = value;
    }

    /**
     * Gets the value of the gevondenDoorHulpverlener property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGevondenDoorHulpverlener() {
        return gevondenDoorHulpverlener;
    }

    /**
     * Sets the value of the gevondenDoorHulpverlener property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGevondenDoorHulpverlener(Integer value) {
        this.gevondenDoorHulpverlener = value;
    }

    /**
     * Gets the value of the aantalGewonden property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAantalGewonden() {
        return aantalGewonden;
    }

    /**
     * Sets the value of the aantalGewonden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAantalGewonden(Integer value) {
        this.aantalGewonden = value;
    }

    /**
     * Gets the value of the parkeergarage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParkeergarage() {
        return parkeergarage;
    }

    /**
     * Sets the value of the parkeergarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParkeergarage(Boolean value) {
        this.parkeergarage = value;
    }

    /**
     * Gets the value of the verkeersgevaarlijk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerkeersgevaarlijk() {
        return verkeersgevaarlijk;
    }

    /**
     * Sets the value of the verkeersgevaarlijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerkeersgevaarlijk(Boolean value) {
        this.verkeersgevaarlijk = value;
    }

    /**
     * Gets the value of the gevaarlijkeStoffen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGevaarlijkeStoffen() {
        return gevaarlijkeStoffen;
    }

    /**
     * Sets the value of the gevaarlijkeStoffen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGevaarlijkeStoffen(Boolean value) {
        this.gevaarlijkeStoffen = value;
    }

    /**
     * Gets the value of the betaaldeHulpverlening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBetaaldeHulpverlening() {
        return betaaldeHulpverlening;
    }

    /**
     * Sets the value of the betaaldeHulpverlening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBetaaldeHulpverlening(Boolean value) {
        this.betaaldeHulpverlening = value;
    }

    /**
     * Gets the value of the voorrangsclassificatie2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoorrangsclassificatie2() {
        return voorrangsclassificatie2;
    }

    /**
     * Sets the value of the voorrangsclassificatie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoorrangsclassificatie2(Boolean value) {
        this.voorrangsclassificatie2 = value;
    }

    /**
     * Gets the value of the hulpverlenersGebeld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHulpverlenersGebeld() {
        return hulpverlenersGebeld;
    }

    /**
     * Sets the value of the hulpverlenersGebeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHulpverlenersGebeld(Boolean value) {
        this.hulpverlenersGebeld = value;
    }

    /**
     * Gets the value of the rijbaanGeblokkeerd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRijbaanGeblokkeerd() {
        return rijbaanGeblokkeerd;
    }

    /**
     * Sets the value of the rijbaanGeblokkeerd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRijbaanGeblokkeerd(Boolean value) {
        this.rijbaanGeblokkeerd = value;
    }

    /**
     * Gets the value of the melder property.
     * 
     * @return
     *     possible object is
     *     {@link Melder }
     *     
     */
    public Melder getMelder() {
        return melder;
    }

    /**
     * Sets the value of the melder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Melder }
     *     
     */
    public void setMelder(Melder value) {
        this.melder = value;
    }

    /**
     * Gets the value of the klanten property.
     * 
     * @return
     *     possible object is
     *     {@link Incident.Klanten }
     *     
     */
    public Incident.Klanten getKlanten() {
        return klanten;
    }

    /**
     * Sets the value of the klanten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incident.Klanten }
     *     
     */
    public void setKlanten(Incident.Klanten value) {
        this.klanten = value;
    }

    /**
     * Gets the value of the geschattewachttijd property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getGeschattewachttijd() {
        return geschattewachttijd;
    }

    /**
     * Sets the value of the geschattewachttijd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setGeschattewachttijd(Duration value) {
        this.geschattewachttijd = value;
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
     * Gets the value of the wps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWps() {
        return wps;
    }

    /**
     * Sets the value of the wps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWps(Boolean value) {
        this.wps = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     */
    public int getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     */
    public void setNummer(int value) {
        this.nummer = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="klant" type="{http://anwb.org/hv/ict/oxi/obi}Klant" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "klant"
    })
    public static class Klanten {

        protected List<Klant> klant;

        /**
         * Gets the value of the klant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the klant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKlant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Klant }
         * 
         * 
         */
        public List<Klant> getKlant() {
            if (klant == null) {
                klant = new ArrayList<Klant>();
            }
            return this.klant;
        }

    }

}
