
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoutcodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FoutcodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="OngeldigBericht"/&gt;
 *     &lt;enumeration value="OnbruikbaarBericht"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FoutcodeEnum")
@XmlEnum
public enum FoutcodeEnum {

    OK("OK"),
    @XmlEnumValue("OngeldigBericht")
    ONGELDIG_BERICHT("OngeldigBericht"),
    @XmlEnumValue("OnbruikbaarBericht")
    ONBRUIKBAAR_BERICHT("OnbruikbaarBericht"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    FoutcodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FoutcodeEnum fromValue(String v) {
        for (FoutcodeEnum c: FoutcodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
