
package org.anwb.hv.ict.oxi.callinc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for antwoordenJournaalaantekeningMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="antwoordenJournaalaantekeningMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="journaalAantekeningLijst" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="journaalAantekening" type="{http://anwb.org/hv/ict/oxi/callinc}JournaalAantekening" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "antwoordenJournaalaantekeningMessage", propOrder = {

})
public class AntwoordenJournaalaantekeningMessage {

    protected AntwoordenJournaalaantekeningMessage.JournaalAantekeningLijst journaalAantekeningLijst;

    /**
     * Gets the value of the journaalAantekeningLijst property.
     * 
     * @return
     *     possible object is
     *     {@link AntwoordenJournaalaantekeningMessage.JournaalAantekeningLijst }
     *     
     */
    public AntwoordenJournaalaantekeningMessage.JournaalAantekeningLijst getJournaalAantekeningLijst() {
        return journaalAantekeningLijst;
    }

    /**
     * Sets the value of the journaalAantekeningLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntwoordenJournaalaantekeningMessage.JournaalAantekeningLijst }
     *     
     */
    public void setJournaalAantekeningLijst(AntwoordenJournaalaantekeningMessage.JournaalAantekeningLijst value) {
        this.journaalAantekeningLijst = value;
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
     *         &lt;element name="journaalAantekening" type="{http://anwb.org/hv/ict/oxi/callinc}JournaalAantekening" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "journaalAantekening"
    })
    public static class JournaalAantekeningLijst {

        protected List<JournaalAantekening> journaalAantekening;

        /**
         * Gets the value of the journaalAantekening property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journaalAantekening property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJournaalAantekening().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JournaalAantekening }
         * 
         * 
         */
        public List<JournaalAantekening> getJournaalAantekening() {
            if (journaalAantekening == null) {
                journaalAantekening = new ArrayList<JournaalAantekening>();
            }
            return this.journaalAantekening;
        }

    }

}
