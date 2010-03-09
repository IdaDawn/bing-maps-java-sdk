
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UriScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UriScheme">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Http"/>
 *     &lt;enumeration value="Https"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UriScheme")
@XmlEnum
public enum UriScheme {

    @XmlEnumValue("Http")
    HTTP("Http"),
    @XmlEnumValue("Https")
    HTTPS("Https");
    private final String value;

    UriScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UriScheme fromValue(String v) {
        for (UriScheme c: UriScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
