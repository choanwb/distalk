
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaakTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaakTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Lepel"/&gt;
 *     &lt;enumeration value="Sleutel"/&gt;
 *     &lt;enumeration value="Transport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaakTypeEnum")
@XmlEnum
public enum TaakTypeEnum {

    @XmlEnumValue("Lepel")
    LEPEL("Lepel"),
    @XmlEnumValue("Sleutel")
    SLEUTEL("Sleutel"),
    @XmlEnumValue("Transport")
    TRANSPORT("Transport");
    private final String value;

    TaakTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaakTypeEnum fromValue(String v) {
        for (TaakTypeEnum c: TaakTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
