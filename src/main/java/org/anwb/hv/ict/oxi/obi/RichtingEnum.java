
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichtingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichtingEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Li"/&gt;
 *     &lt;enumeration value="Re"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RichtingEnum")
@XmlEnum
public enum RichtingEnum {

    @XmlEnumValue("Li")
    LI("Li"),
    @XmlEnumValue("Re")
    RE("Re");
    private final String value;

    RichtingEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RichtingEnum fromValue(String v) {
        for (RichtingEnum c: RichtingEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
