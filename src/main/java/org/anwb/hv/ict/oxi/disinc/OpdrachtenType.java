
package org.anwb.hv.ict.oxi.disinc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpdrachtenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpdrachtenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="opdracht" type="{http://anwb.org/hv/ict/oxi/disinc}Opdracht" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpdrachtenType", propOrder = {
    "opdracht"
})
public class OpdrachtenType {

    protected List<Opdracht> opdracht;

    /**
     * Gets the value of the opdracht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opdracht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpdracht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Opdracht }
     * 
     * 
     */
    public List<Opdracht> getOpdracht() {
        if (opdracht == null) {
            opdracht = new ArrayList<Opdracht>();
        }
        return this.opdracht;
    }

}
