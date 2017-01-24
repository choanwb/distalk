
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.anwb.hv.ict.oxi.obi.JournaalAantekeningTypeEnum;


/**
 * <p>Java class for JournaalAantekening complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournaalAantekening"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="inhoud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lidnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="kenteken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://anwb.org/hv/ict/oxi/obi}JournaalAantekeningTypeEnum"/&gt;
 *         &lt;element name="begindatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="einddatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournaalAantekening", propOrder = {

})
public class JournaalAantekening {

    @XmlElement(required = true)
    protected String inhoud;
    protected Integer lidnummer;
    protected String kenteken;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected JournaalAantekeningTypeEnum type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar begindatum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar einddatum;

    /**
     * Gets the value of the inhoud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhoud() {
        return inhoud;
    }

    /**
     * Sets the value of the inhoud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhoud(String value) {
        this.inhoud = value;
    }

    /**
     * Gets the value of the lidnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLidnummer() {
        return lidnummer;
    }

    /**
     * Sets the value of the lidnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLidnummer(Integer value) {
        this.lidnummer = value;
    }

    /**
     * Gets the value of the kenteken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKenteken() {
        return kenteken;
    }

    /**
     * Sets the value of the kenteken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKenteken(String value) {
        this.kenteken = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JournaalAantekeningTypeEnum }
     *     
     */
    public JournaalAantekeningTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournaalAantekeningTypeEnum }
     *     
     */
    public void setType(JournaalAantekeningTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the begindatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegindatum() {
        return begindatum;
    }

    /**
     * Sets the value of the begindatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegindatum(XMLGregorianCalendar value) {
        this.begindatum = value;
    }

    /**
     * Gets the value of the einddatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEinddatum() {
        return einddatum;
    }

    /**
     * Sets the value of the einddatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEinddatum(XMLGregorianCalendar value) {
        this.einddatum = value;
    }

}
