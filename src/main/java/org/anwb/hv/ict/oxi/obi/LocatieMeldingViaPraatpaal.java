
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocatieMeldingViaPraatpaal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocatieMeldingViaPraatpaal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="richtingTotPraatpaal" type="{http://anwb.org/hv/ict/oxi/obi}RichtingTotPraatpaalEnum"/&gt;
 *         &lt;element name="afstandTotPraatpaal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="praatpaal" type="{http://anwb.org/hv/ict/oxi/obi}Praatpaal"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocatieMeldingViaPraatpaal", propOrder = {

})
public class LocatieMeldingViaPraatpaal {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RichtingTotPraatpaalEnum richtingTotPraatpaal;
    protected int afstandTotPraatpaal;
    @XmlElement(required = true)
    protected Praatpaal praatpaal;

    /**
     * Gets the value of the richtingTotPraatpaal property.
     * 
     * @return
     *     possible object is
     *     {@link RichtingTotPraatpaalEnum }
     *     
     */
    public RichtingTotPraatpaalEnum getRichtingTotPraatpaal() {
        return richtingTotPraatpaal;
    }

    /**
     * Sets the value of the richtingTotPraatpaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichtingTotPraatpaalEnum }
     *     
     */
    public void setRichtingTotPraatpaal(RichtingTotPraatpaalEnum value) {
        this.richtingTotPraatpaal = value;
    }

    /**
     * Gets the value of the afstandTotPraatpaal property.
     * 
     */
    public int getAfstandTotPraatpaal() {
        return afstandTotPraatpaal;
    }

    /**
     * Sets the value of the afstandTotPraatpaal property.
     * 
     */
    public void setAfstandTotPraatpaal(int value) {
        this.afstandTotPraatpaal = value;
    }

    /**
     * Gets the value of the praatpaal property.
     * 
     * @return
     *     possible object is
     *     {@link Praatpaal }
     *     
     */
    public Praatpaal getPraatpaal() {
        return praatpaal;
    }

    /**
     * Sets the value of the praatpaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Praatpaal }
     *     
     */
    public void setPraatpaal(Praatpaal value) {
        this.praatpaal = value;
    }

}
