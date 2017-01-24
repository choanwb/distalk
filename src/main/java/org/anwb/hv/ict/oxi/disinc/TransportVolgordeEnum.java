
package org.anwb.hv.ict.oxi.disinc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportVolgordeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportVolgordeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VOERTUIG_INZITTENDEN"/&gt;
 *     &lt;enumeration value="INZITTENDEN_VOERTUIG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransportVolgordeEnum")
@XmlEnum
public enum TransportVolgordeEnum {

    VOERTUIG_INZITTENDEN,
    INZITTENDEN_VOERTUIG;

    public String value() {
        return name();
    }

    public static TransportVolgordeEnum fromValue(String v) {
        return valueOf(v);
    }

}
