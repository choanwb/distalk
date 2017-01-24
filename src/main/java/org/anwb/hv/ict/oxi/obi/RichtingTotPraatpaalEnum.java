
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichtingTotPraatpaalEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichtingTotPraatpaalEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Verder"/&gt;
 *     &lt;enumeration value="Terug"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RichtingTotPraatpaalEnum")
@XmlEnum
public enum RichtingTotPraatpaalEnum {

    @XmlEnumValue("Verder")
    VERDER("Verder"),
    @XmlEnumValue("Terug")
    TERUG("Terug");
    private final String value;

    RichtingTotPraatpaalEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RichtingTotPraatpaalEnum fromValue(String v) {
        for (RichtingTotPraatpaalEnum c: RichtingTotPraatpaalEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
