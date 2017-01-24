
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WegtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WegtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Snelweg"/&gt;
 *     &lt;enumeration value="PPL aan Snelweg"/&gt;
 *     &lt;enumeration value="Autoweg"/&gt;
 *     &lt;enumeration value="Overig"/&gt;
 *     &lt;enumeration value="Locale Weg"/&gt;
 *     &lt;enumeration value="PPL aan Locale Weg"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WegtypeEnum")
@XmlEnum
public enum WegtypeEnum {

    @XmlEnumValue("Snelweg")
    SNELWEG("Snelweg"),
    @XmlEnumValue("PPL aan Snelweg")
    PPL_AAN_SNELWEG("PPL aan Snelweg"),
    @XmlEnumValue("Autoweg")
    AUTOWEG("Autoweg"),
    @XmlEnumValue("Overig")
    OVERIG("Overig"),
    @XmlEnumValue("Locale Weg")
    LOCALE_WEG("Locale Weg"),
    @XmlEnumValue("PPL aan Locale Weg")
    PPL_AAN_LOCALE_WEG("PPL aan Locale Weg");
    private final String value;

    WegtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WegtypeEnum fromValue(String v) {
        for (WegtypeEnum c: WegtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
