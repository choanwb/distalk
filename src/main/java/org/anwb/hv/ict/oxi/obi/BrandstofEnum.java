
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandstofEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BrandstofEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LPG"/&gt;
 *     &lt;enumeration value="Diesel"/&gt;
 *     &lt;enumeration value="Benzine"/&gt;
 *     &lt;enumeration value="Elektrisch"/&gt;
 *     &lt;enumeration value="Anders"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BrandstofEnum")
@XmlEnum
public enum BrandstofEnum {

    LPG("LPG"),
    @XmlEnumValue("Diesel")
    DIESEL("Diesel"),
    @XmlEnumValue("Benzine")
    BENZINE("Benzine"),
    @XmlEnumValue("Elektrisch")
    ELEKTRISCH("Elektrisch"),
    @XmlEnumValue("Anders")
    ANDERS("Anders");
    private final String value;

    BrandstofEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrandstofEnum fromValue(String v) {
        for (BrandstofEnum c: BrandstofEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
