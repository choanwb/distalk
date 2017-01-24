
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.anwb.hv.ict.oxi.obi.TypeKlant;


/**
 * <p>Java class for klantLidnummerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="klantLidnummerType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *       &lt;attribute name="typeKlant" type="{http://anwb.org/hv/ict/oxi/obi}TypeKlant" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "klantLidnummerType", propOrder = {
    "value"
})
public class KlantLidnummerType {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "typeKlant")
    protected TypeKlant typeKlant;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the typeKlant property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKlant }
     *     
     */
    public TypeKlant getTypeKlant() {
        return typeKlant;
    }

    /**
     * Sets the value of the typeKlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKlant }
     *     
     */
    public void setTypeKlant(TypeKlant value) {
        this.typeKlant = value;
    }

}
