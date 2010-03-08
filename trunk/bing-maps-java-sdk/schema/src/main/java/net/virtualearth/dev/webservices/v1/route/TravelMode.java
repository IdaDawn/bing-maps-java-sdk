
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for TravelMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Driving"/>
 *     &lt;enumeration value="Walking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TravelMode {

    @XmlEnumValue("Driving")
    DRIVING("Driving"),
    @XmlEnumValue("Walking")
    WALKING("Walking");
    private final String value;

    TravelMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelMode fromValue(String v) {
        for (TravelMode c: TravelMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
