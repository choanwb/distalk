
package org.anwb.hv.ict.oxi.callinc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for antwoordenPechhistorieMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="antwoordenPechhistorieMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="pechhistorieLijst" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pechhistorie" type="{http://anwb.org/hv/ict/oxi/callinc}Pechhistorie" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antwoordenPechhistorieMessage", propOrder = {

})
public class AntwoordenPechhistorieMessage {

    protected AntwoordenPechhistorieMessage.PechhistorieLijst pechhistorieLijst;

    /**
     * Gets the value of the pechhistorieLijst property.
     * 
     * @return
     *     possible object is
     *     {@link AntwoordenPechhistorieMessage.PechhistorieLijst }
     *     
     */
    public AntwoordenPechhistorieMessage.PechhistorieLijst getPechhistorieLijst() {
        return pechhistorieLijst;
    }

    /**
     * Sets the value of the pechhistorieLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntwoordenPechhistorieMessage.PechhistorieLijst }
     *     
     */
    public void setPechhistorieLijst(AntwoordenPechhistorieMessage.PechhistorieLijst value) {
        this.pechhistorieLijst = value;
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
     *         &lt;element name="pechhistorie" type="{http://anwb.org/hv/ict/oxi/callinc}Pechhistorie" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "pechhistorie"
    })
    public static class PechhistorieLijst {

        protected List<Pechhistorie> pechhistorie;

        /**
         * Gets the value of the pechhistorie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pechhistorie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPechhistorie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pechhistorie }
         * 
         * 
         */
        public List<Pechhistorie> getPechhistorie() {
            if (pechhistorie == null) {
                pechhistorie = new ArrayList<Pechhistorie>();
            }
            return this.pechhistorie;
        }

    }

}
