
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeslachtTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeslachtTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeslachtTypeEnum")
@XmlEnum
public enum GeslachtTypeEnum {

    M,
    V;

    public String value() {
        return name();
    }

    public static GeslachtTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
