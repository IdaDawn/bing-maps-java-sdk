
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ItineraryItemHintType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItineraryItemHintType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PreviousIntersection"/>
 *     &lt;enumeration value="NextIntersection"/>
 *     &lt;enumeration value="Landmark"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ItineraryItemHintType {

    @XmlEnumValue("PreviousIntersection")
    PREVIOUS_INTERSECTION("PreviousIntersection"),
    @XmlEnumValue("NextIntersection")
    NEXT_INTERSECTION("NextIntersection"),
    @XmlEnumValue("Landmark")
    LANDMARK("Landmark");
    private final String value;

    ItineraryItemHintType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItineraryItemHintType fromValue(String v) {
        for (ItineraryItemHintType c: ItineraryItemHintType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
