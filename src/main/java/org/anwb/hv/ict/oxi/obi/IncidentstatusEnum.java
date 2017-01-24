
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncidentstatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncidentstatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="InPlanning"/&gt;
 *     &lt;enumeration value="InBehandeling"/&gt;
 *     &lt;enumeration value="Afgehandeld"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncidentstatusEnum")
@XmlEnum
public enum IncidentstatusEnum {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("InPlanning")
    IN_PLANNING("InPlanning"),
    @XmlEnumValue("InBehandeling")
    IN_BEHANDELING("InBehandeling"),
    @XmlEnumValue("Afgehandeld")
    AFGEHANDELD("Afgehandeld");
    private final String value;

    IncidentstatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncidentstatusEnum fromValue(String v) {
        for (IncidentstatusEnum c: IncidentstatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
