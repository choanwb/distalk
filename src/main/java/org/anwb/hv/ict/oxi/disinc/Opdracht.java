
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.anwb.hv.ict.oxi.obi.AfloopcodeEnum;
import org.anwb.hv.ict.oxi.obi.TaakTypeEnum;


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
 *         &lt;element name="opdrachtvolgnummer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mannummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tijdstipStatus" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="status" type="{http://anwb.org/hv/ict/oxi/disinc}OpdrachtStatusEnum"/&gt;
 *         &lt;element name="hulpverlenernaam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="afloopcode" type="{http://anwb.org/hv/ict/oxi/obi}AfloopcodeEnum" minOccurs="0"/&gt;
 *         &lt;element name="pechcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taak" type="{http://anwb.org/hv/ict/oxi/obi}TaakTypeEnum"/&gt;
 *       &lt;/all&gt;
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

    protected int opdrachtvolgnummer;
    @XmlElement(required = true)
    protected String mannummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpdrachtStatusEnum status;
    @XmlElement(required = true)
    protected String hulpverlenernaam;
    @XmlSchemaType(name = "string")
    protected AfloopcodeEnum afloopcode;
    protected int pechcode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaakTypeEnum taak;

    /**
     * Gets the value of the opdrachtvolgnummer property.
     * 
     */
    public int getOpdrachtvolgnummer() {
        return opdrachtvolgnummer;
    }

    /**
     * Sets the value of the opdrachtvolgnummer property.
     * 
     */
    public void setOpdrachtvolgnummer(int value) {
        this.opdrachtvolgnummer = value;
    }

    /**
     * Gets the value of the mannummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMannummer() {
        return mannummer;
    }

    /**
     * Sets the value of the mannummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMannummer(String value) {
        this.mannummer = value;
    }

    /**
     * Gets the value of the tijdstipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipStatus() {
        return tijdstipStatus;
    }

    /**
     * Sets the value of the tijdstipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipStatus(XMLGregorianCalendar value) {
        this.tijdstipStatus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OpdrachtStatusEnum }
     *     
     */
    public OpdrachtStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpdrachtStatusEnum }
     *     
     */
    public void setStatus(OpdrachtStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the hulpverlenernaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHulpverlenernaam() {
        return hulpverlenernaam;
    }

    /**
     * Sets the value of the hulpverlenernaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHulpverlenernaam(String value) {
        this.hulpverlenernaam = value;
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

}
