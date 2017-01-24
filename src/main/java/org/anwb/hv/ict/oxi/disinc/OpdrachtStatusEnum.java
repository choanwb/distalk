
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpdrachtStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpdrachtStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aanrijden"/&gt;
 *     &lt;enumeration value="Uitvoeren"/&gt;
 *     &lt;enumeration value="Verzonden"/&gt;
 *     &lt;enumeration value="Onderbroken"/&gt;
 *     &lt;enumeration value="Einde"/&gt;
 *     &lt;enumeration value="Teruggenomen"/&gt;
 *     &lt;enumeration value="Gereserveerd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpdrachtStatusEnum")
@XmlEnum
public enum OpdrachtStatusEnum {

    @XmlEnumValue("Aanrijden")
    AANRIJDEN("Aanrijden"),
    @XmlEnumValue("Uitvoeren")
    UITVOEREN("Uitvoeren"),
    @XmlEnumValue("Verzonden")
    VERZONDEN("Verzonden"),
    @XmlEnumValue("Onderbroken")
    ONDERBROKEN("Onderbroken"),
    @XmlEnumValue("Einde")
    EINDE("Einde"),
    @XmlEnumValue("Teruggenomen")
    TERUGGENOMEN("Teruggenomen"),
    @XmlEnumValue("Gereserveerd")
    GERESERVEERD("Gereserveerd");
    private final String value;

    OpdrachtStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpdrachtStatusEnum fromValue(String v) {
        for (OpdrachtStatusEnum c: OpdrachtStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
