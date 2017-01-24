
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoertuigsoortEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VoertuigsoortEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personenauto"/&gt;
 *     &lt;enumeration value="Truck"/&gt;
 *     &lt;enumeration value="Motorfiets"/&gt;
 *     &lt;enumeration value="Bus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoertuigsoortEnum")
@XmlEnum
public enum VoertuigsoortEnum {

    @XmlEnumValue("Personenauto")
    PERSONENAUTO("Personenauto"),
    @XmlEnumValue("Truck")
    TRUCK("Truck"),
    @XmlEnumValue("Motorfiets")
    MOTORFIETS("Motorfiets"),
    @XmlEnumValue("Bus")
    BUS("Bus");
    private final String value;

    VoertuigsoortEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoertuigsoortEnum fromValue(String v) {
        for (VoertuigsoortEnum c: VoertuigsoortEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
