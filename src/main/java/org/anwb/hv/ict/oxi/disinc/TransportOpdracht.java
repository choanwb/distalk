
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportOpdracht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportOpdracht"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="bestemmingLocatieVoertuig" type="{http://anwb.org/hv/ict/oxi/disinc}Locatie"/&gt;
 *         &lt;element name="bestemmingLocatieInzittenden" type="{http://anwb.org/hv/ict/oxi/disinc}Locatie"/&gt;
 *         &lt;element name="volgorde" type="{http://anwb.org/hv/ict/oxi/disinc}TransportVolgordeEnum"/&gt;
 *         &lt;element name="mannummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="combi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="meereizendBerger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="aantalPersonen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bijzonderhedenTransport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aanhanger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="veiligStellen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "TransportOpdracht", propOrder = {

})
public class TransportOpdracht {

    @XmlElement(required = true)
    protected Locatie bestemmingLocatieVoertuig;
    @XmlElement(required = true)
    protected Locatie bestemmingLocatieInzittenden;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransportVolgordeEnum volgorde;
    protected Integer mannummer;
    protected Boolean combi;
    protected Boolean meereizendBerger;
    protected Integer aantalPersonen;
    protected String bijzonderhedenTransport;
    protected Boolean aanhanger;
    protected Boolean veiligStellen;
    @XmlAttribute(name = "actienummer", required = true)
    protected int actienummer;

    /**
     * Gets the value of the bestemmingLocatieVoertuig property.
     * 
     * @return
     *     possible object is
     *     {@link Locatie }
     *     
     */
    public Locatie getBestemmingLocatieVoertuig() {
        return bestemmingLocatieVoertuig;
    }

    /**
     * Sets the value of the bestemmingLocatieVoertuig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locatie }
     *     
     */
    public void setBestemmingLocatieVoertuig(Locatie value) {
        this.bestemmingLocatieVoertuig = value;
    }

    /**
     * Gets the value of the bestemmingLocatieInzittenden property.
     * 
     * @return
     *     possible object is
     *     {@link Locatie }
     *     
     */
    public Locatie getBestemmingLocatieInzittenden() {
        return bestemmingLocatieInzittenden;
    }

    /**
     * Sets the value of the bestemmingLocatieInzittenden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locatie }
     *     
     */
    public void setBestemmingLocatieInzittenden(Locatie value) {
        this.bestemmingLocatieInzittenden = value;
    }

    /**
     * Gets the value of the volgorde property.
     * 
     * @return
     *     possible object is
     *     {@link TransportVolgordeEnum }
     *     
     */
    public TransportVolgordeEnum getVolgorde() {
        return volgorde;
    }

    /**
     * Sets the value of the volgorde property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportVolgordeEnum }
     *     
     */
    public void setVolgorde(TransportVolgordeEnum value) {
        this.volgorde = value;
    }

    /**
     * Gets the value of the mannummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMannummer() {
        return mannummer;
    }

    /**
     * Sets the value of the mannummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMannummer(Integer value) {
        this.mannummer = value;
    }

    /**
     * Gets the value of the combi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombi() {
        return combi;
    }

    /**
     * Sets the value of the combi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombi(Boolean value) {
        this.combi = value;
    }

    /**
     * Gets the value of the meereizendBerger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeereizendBerger() {
        return meereizendBerger;
    }

    /**
     * Sets the value of the meereizendBerger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeereizendBerger(Boolean value) {
        this.meereizendBerger = value;
    }

    /**
     * Gets the value of the aantalPersonen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAantalPersonen() {
        return aantalPersonen;
    }

    /**
     * Sets the value of the aantalPersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAantalPersonen(Integer value) {
        this.aantalPersonen = value;
    }

    /**
     * Gets the value of the bijzonderhedenTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBijzonderhedenTransport() {
        return bijzonderhedenTransport;
    }

    /**
     * Sets the value of the bijzonderhedenTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBijzonderhedenTransport(String value) {
        this.bijzonderhedenTransport = value;
    }

    /**
     * Gets the value of the aanhanger property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAanhanger() {
        return aanhanger;
    }

    /**
     * Sets the value of the aanhanger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAanhanger(Boolean value) {
        this.aanhanger = value;
    }

    /**
     * Gets the value of the veiligStellen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVeiligStellen() {
        return veiligStellen;
    }

    /**
     * Sets the value of the veiligStellen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVeiligStellen(Boolean value) {
        this.veiligStellen = value;
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
