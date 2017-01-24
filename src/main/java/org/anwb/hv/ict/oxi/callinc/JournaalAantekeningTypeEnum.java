
package org.anwb.hv.ict.oxi.callinc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JournaalAantekeningTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JournaalAantekeningTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JournaalAantekeningTypeEnum")
@XmlEnum
public enum JournaalAantekeningTypeEnum {

    J,
    K,
    W;

    public String value() {
        return name();
    }

    public static JournaalAantekeningTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
