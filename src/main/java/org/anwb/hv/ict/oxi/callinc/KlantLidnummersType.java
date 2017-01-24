
package org.anwb.hv.ict.oxi.callinc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KlantLidnummersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KlantLidnummersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="klantLidnummer" type="{http://anwb.org/hv/ict/oxi/callinc}klantLidnummerType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KlantLidnummersType", propOrder = {
    "klantLidnummer"
})
public class KlantLidnummersType {

    @XmlElement(required = true)
    protected List<KlantLidnummerType> klantLidnummer;

    /**
     * Gets the value of the klantLidnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the klantLidnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKlantLidnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KlantLidnummerType }
     * 
     * 
     */
    public List<KlantLidnummerType> getKlantLidnummer() {
        if (klantLidnummer == null) {
            klantLidnummer = new ArrayList<KlantLidnummerType>();
        }
        return this.klantLidnummer;
    }

}
