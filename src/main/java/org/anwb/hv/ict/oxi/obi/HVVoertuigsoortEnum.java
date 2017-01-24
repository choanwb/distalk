
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HVVoertuigsoortEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HVVoertuigsoortEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Lepel"/&gt;
 *     &lt;enumeration value="Motorfiets"/&gt;
 *     &lt;enumeration value="Personenauto"/&gt;
 *     &lt;enumeration value="Truckservice"/&gt;
 *     &lt;enumeration value="Bus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HVVoertuigsoortEnum")
@XmlEnum
public enum HVVoertuigsoortEnum {

    @XmlEnumValue("Lepel")
    LEPEL("Lepel"),
    @XmlEnumValue("Motorfiets")
    MOTORFIETS("Motorfiets"),
    @XmlEnumValue("Personenauto")
    PERSONENAUTO("Personenauto"),
    @XmlEnumValue("Truckservice")
    TRUCKSERVICE("Truckservice"),
    @XmlEnumValue("Bus")
    BUS("Bus");
    private final String value;

    HVVoertuigsoortEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HVVoertuigsoortEnum fromValue(String v) {
        for (HVVoertuigsoortEnum c: HVVoertuigsoortEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
