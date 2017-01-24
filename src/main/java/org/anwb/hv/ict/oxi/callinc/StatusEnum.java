
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="verzonden"/&gt;
 *     &lt;enumeration value="aanrijden"/&gt;
 *     &lt;enumeration value="uitvoeren"/&gt;
 *     &lt;enumeration value="einde"/&gt;
 *     &lt;enumeration value="geannuleerd"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusEnum")
@XmlEnum
public enum StatusEnum {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("verzonden")
    VERZONDEN("verzonden"),
    @XmlEnumValue("aanrijden")
    AANRIJDEN("aanrijden"),
    @XmlEnumValue("uitvoeren")
    UITVOEREN("uitvoeren"),
    @XmlEnumValue("einde")
    EINDE("einde"),
    @XmlEnumValue("geannuleerd")
    GEANNULEERD("geannuleerd");
    private final String value;

    StatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum c: StatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
