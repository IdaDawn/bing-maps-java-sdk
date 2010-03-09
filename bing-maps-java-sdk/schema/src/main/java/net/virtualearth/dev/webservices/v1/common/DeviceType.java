
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Desktop"/>
 *     &lt;enumeration value="Mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceType")
@XmlEnum
public enum DeviceType {

    @XmlEnumValue("Desktop")
    DESKTOP("Desktop"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile");
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c: DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
