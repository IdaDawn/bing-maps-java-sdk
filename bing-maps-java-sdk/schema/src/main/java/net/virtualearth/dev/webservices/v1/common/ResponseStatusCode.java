
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="BadRequest"/>
 *     &lt;enumeration value="ServerError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseStatusCode")
@XmlEnum
public enum ResponseStatusCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("BadRequest")
    BAD_REQUEST("BadRequest"),
    @XmlEnumValue("ServerError")
    SERVER_ERROR("ServerError");
    private final String value;

    ResponseStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseStatusCode fromValue(String v) {
        for (ResponseStatusCode c: ResponseStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
