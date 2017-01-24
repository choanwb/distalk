
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AfloopcodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AfloopcodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NietGeholpen"/&gt;
 *     &lt;enumeration value="Geslaagd"/&gt;
 *     &lt;enumeration value="MetBerekendRisico"/&gt;
 *     &lt;enumeration value="OnderVoorwaarden"/&gt;
 *     &lt;enumeration value="RijdenAfgeraden"/&gt;
 *     &lt;enumeration value="Afgewezen"/&gt;
 *     &lt;enumeration value="WegenwachtSleep"/&gt;
 *     &lt;enumeration value="TransportOpVerzoekMeldkamer"/&gt;
 *     &lt;enumeration value="Veiliggesteld en Geslaagd"/&gt;
 *     &lt;enumeration value="Hulpverlenen sleep"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AfloopcodeEnum")
@XmlEnum
public enum AfloopcodeEnum {

    @XmlEnumValue("NietGeholpen")
    NIET_GEHOLPEN("NietGeholpen"),
    @XmlEnumValue("Geslaagd")
    GESLAAGD("Geslaagd"),
    @XmlEnumValue("MetBerekendRisico")
    MET_BEREKEND_RISICO("MetBerekendRisico"),
    @XmlEnumValue("OnderVoorwaarden")
    ONDER_VOORWAARDEN("OnderVoorwaarden"),
    @XmlEnumValue("RijdenAfgeraden")
    RIJDEN_AFGERADEN("RijdenAfgeraden"),
    @XmlEnumValue("Afgewezen")
    AFGEWEZEN("Afgewezen"),
    @XmlEnumValue("WegenwachtSleep")
    WEGENWACHT_SLEEP("WegenwachtSleep"),
    @XmlEnumValue("TransportOpVerzoekMeldkamer")
    TRANSPORT_OP_VERZOEK_MELDKAMER("TransportOpVerzoekMeldkamer"),
    @XmlEnumValue("Veiliggesteld en Geslaagd")
    VEILIGGESTELD_EN_GESLAAGD("Veiliggesteld en Geslaagd"),
    @XmlEnumValue("Hulpverlenen sleep")
    HULPVERLENEN_SLEEP("Hulpverlenen sleep");
    private final String value;

    AfloopcodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AfloopcodeEnum fromValue(String v) {
        for (AfloopcodeEnum c: AfloopcodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
