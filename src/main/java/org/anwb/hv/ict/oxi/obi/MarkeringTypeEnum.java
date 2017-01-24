
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkeringTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkeringTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AfEnToeritten"/&gt;
 *     &lt;enumeration value="Benzinestation"/&gt;
 *     &lt;enumeration value="Firma"/&gt;
 *     &lt;enumeration value="Gebouwen"/&gt;
 *     &lt;enumeration value="Haven"/&gt;
 *     &lt;enumeration value="Horeca"/&gt;
 *     &lt;enumeration value="Parkeerplaatsen"/&gt;
 *     &lt;enumeration value="Recreatie"/&gt;
 *     &lt;enumeration value="Sportgelegenheden"/&gt;
 *     &lt;enumeration value="Telefooncellen"/&gt;
 *     &lt;enumeration value="Vliegvelden"/&gt;
 *     &lt;enumeration value="VanNaar"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarkeringTypeEnum")
@XmlEnum
public enum MarkeringTypeEnum {

    @XmlEnumValue("AfEnToeritten")
    AF_EN_TOERITTEN("AfEnToeritten"),
    @XmlEnumValue("Benzinestation")
    BENZINESTATION("Benzinestation"),
    @XmlEnumValue("Firma")
    FIRMA("Firma"),
    @XmlEnumValue("Gebouwen")
    GEBOUWEN("Gebouwen"),
    @XmlEnumValue("Haven")
    HAVEN("Haven"),
    @XmlEnumValue("Horeca")
    HORECA("Horeca"),
    @XmlEnumValue("Parkeerplaatsen")
    PARKEERPLAATSEN("Parkeerplaatsen"),
    @XmlEnumValue("Recreatie")
    RECREATIE("Recreatie"),
    @XmlEnumValue("Sportgelegenheden")
    SPORTGELEGENHEDEN("Sportgelegenheden"),
    @XmlEnumValue("Telefooncellen")
    TELEFOONCELLEN("Telefooncellen"),
    @XmlEnumValue("Vliegvelden")
    VLIEGVELDEN("Vliegvelden"),
    @XmlEnumValue("VanNaar")
    VAN_NAAR("VanNaar");
    private final String value;

    MarkeringTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkeringTypeEnum fromValue(String v) {
        for (MarkeringTypeEnum c: MarkeringTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
