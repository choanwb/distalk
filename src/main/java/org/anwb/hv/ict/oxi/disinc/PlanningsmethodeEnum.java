
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanningsmethodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanningsmethodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Handmatig"/&gt;
 *     &lt;enumeration value="Automatisch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlanningsmethodeEnum")
@XmlEnum
public enum PlanningsmethodeEnum {

    @XmlEnumValue("Handmatig")
    HANDMATIG("Handmatig"),
    @XmlEnumValue("Automatisch")
    AUTOMATISCH("Automatisch");
    private final String value;

    PlanningsmethodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlanningsmethodeEnum fromValue(String v) {
        for (PlanningsmethodeEnum c: PlanningsmethodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
