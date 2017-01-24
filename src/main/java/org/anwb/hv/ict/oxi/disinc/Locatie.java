
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.anwb.hv.ict.oxi.obi.Hectometerpaal;
import org.anwb.hv.ict.oxi.obi.WegtypeEnum;


/**
 * <p>Java class for Locatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Locatie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="wegtype" type="{http://anwb.org/hv/ict/oxi/obi}WegtypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="bijzonderheid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="praatpaal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="afstandPraatpaal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="hectometerpaal" type="{http://anwb.org/hv/ict/oxi/obi}Hectometerpaal" minOccurs="0"/&gt;
 *         &lt;element name="adres" type="{http://anwb.org/hv/ict/oxi/disinc}Adres" minOccurs="0"/&gt;
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rijstrook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gevaarlijkeLocatie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bebouwd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ster" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="lat" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="long" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locatie", propOrder = {

})
public class Locatie {

    @XmlSchemaType(name = "string")
    protected WegtypeEnum wegtype;
    protected String bijzonderheid;
    protected String praatpaal;
    protected Integer afstandPraatpaal;
    protected Hectometerpaal hectometerpaal;
    protected Adres adres;
    protected String omschrijving;
    protected String rijstrook;
    protected Boolean gevaarlijkeLocatie;
    protected Boolean bebouwd;
    protected Boolean ster;
    @XmlAttribute(name = "x")
    protected Long x;
    @XmlAttribute(name = "y")
    protected Long y;
    @XmlAttribute(name = "lat")
    protected Double lat;
    @XmlAttribute(name = "long")
    protected Double _long;

    /**
     * Gets the value of the wegtype property.
     * 
     * @return
     *     possible object is
     *     {@link WegtypeEnum }
     *     
     */
    public WegtypeEnum getWegtype() {
        return wegtype;
    }

    /**
     * Sets the value of the wegtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link WegtypeEnum }
     *     
     */
    public void setWegtype(WegtypeEnum value) {
        this.wegtype = value;
    }

    /**
     * Gets the value of the bijzonderheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBijzonderheid() {
        return bijzonderheid;
    }

    /**
     * Sets the value of the bijzonderheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBijzonderheid(String value) {
        this.bijzonderheid = value;
    }

    /**
     * Gets the value of the praatpaal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPraatpaal() {
        return praatpaal;
    }

    /**
     * Sets the value of the praatpaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPraatpaal(String value) {
        this.praatpaal = value;
    }

    /**
     * Gets the value of the afstandPraatpaal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAfstandPraatpaal() {
        return afstandPraatpaal;
    }

    /**
     * Sets the value of the afstandPraatpaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAfstandPraatpaal(Integer value) {
        this.afstandPraatpaal = value;
    }

    /**
     * Gets the value of the hectometerpaal property.
     * 
     * @return
     *     possible object is
     *     {@link Hectometerpaal }
     *     
     */
    public Hectometerpaal getHectometerpaal() {
        return hectometerpaal;
    }

    /**
     * Sets the value of the hectometerpaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hectometerpaal }
     *     
     */
    public void setHectometerpaal(Hectometerpaal value) {
        this.hectometerpaal = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link Adres }
     *     
     */
    public Adres getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adres }
     *     
     */
    public void setAdres(Adres value) {
        this.adres = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

    /**
     * Gets the value of the rijstrook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRijstrook() {
        return rijstrook;
    }

    /**
     * Sets the value of the rijstrook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRijstrook(String value) {
        this.rijstrook = value;
    }

    /**
     * Gets the value of the gevaarlijkeLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGevaarlijkeLocatie() {
        return gevaarlijkeLocatie;
    }

    /**
     * Sets the value of the gevaarlijkeLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGevaarlijkeLocatie(Boolean value) {
        this.gevaarlijkeLocatie = value;
    }

    /**
     * Gets the value of the bebouwd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBebouwd() {
        return bebouwd;
    }

    /**
     * Sets the value of the bebouwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBebouwd(Boolean value) {
        this.bebouwd = value;
    }

    /**
     * Gets the value of the ster property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSter() {
        return ster;
    }

    /**
     * Sets the value of the ster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSter(Boolean value) {
        this.ster = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setX(Long value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setY(Long value) {
        this.y = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLat(Double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the long property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLong() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLong(Double value) {
        this._long = value;
    }

}
