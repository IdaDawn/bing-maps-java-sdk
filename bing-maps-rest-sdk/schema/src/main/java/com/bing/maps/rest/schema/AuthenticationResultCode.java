
package com.bing.maps.rest.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for AuthenticationResultCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationResultCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NoCredentials"/>
 *     &lt;enumeration value="ValidCredentials"/>
 *     &lt;enumeration value="InvalidCredentials"/>
 *     &lt;enumeration value="CredentialsExpired"/>
 *     &lt;enumeration value="NotAuthorized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum AuthenticationResultCode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NoCredentials")
    NO_CREDENTIALS("NoCredentials"),
    @XmlEnumValue("ValidCredentials")
    VALID_CREDENTIALS("ValidCredentials"),
    @XmlEnumValue("InvalidCredentials")
    INVALID_CREDENTIALS("InvalidCredentials"),
    @XmlEnumValue("CredentialsExpired")
    CREDENTIALS_EXPIRED("CredentialsExpired"),
    @XmlEnumValue("NotAuthorized")
    NOT_AUTHORIZED("NotAuthorized");
    private final String value;

    AuthenticationResultCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationResultCode fromValue(String v) {
        for (AuthenticationResultCode c: AuthenticationResultCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
