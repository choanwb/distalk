
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetalingWijzeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BetalingWijzeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Contant"/&gt;
 *     &lt;enumeration value="Creditcard"/&gt;
 *     &lt;enumeration value="Krediet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BetalingWijzeEnum")
@XmlEnum
public enum BetalingWijzeEnum {

    @XmlEnumValue("Contant")
    CONTANT("Contant"),
    @XmlEnumValue("Creditcard")
    CREDITCARD("Creditcard"),
    @XmlEnumValue("Krediet")
    KREDIET("Krediet");
    private final String value;

    BetalingWijzeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BetalingWijzeEnum fromValue(String v) {
        for (BetalingWijzeEnum c: BetalingWijzeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
