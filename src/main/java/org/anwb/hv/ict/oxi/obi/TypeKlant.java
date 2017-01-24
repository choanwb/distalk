
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeKlant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeKlant"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECHTGEVEND"/&gt;
 *     &lt;enumeration value="GEZINSLID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeKlant")
@XmlEnum
public enum TypeKlant {

    RECHTGEVEND,
    GEZINSLID;

    public String value() {
        return name();
    }

    public static TypeKlant fromValue(String v) {
        return valueOf(v);
    }

}
