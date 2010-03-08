
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ItineraryWarningSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItineraryWarningSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="LowImpact"/>
 *     &lt;enumeration value="Minor"/>
 *     &lt;enumeration value="Moderate"/>
 *     &lt;enumeration value="Serious"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ItineraryWarningSeverity {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LowImpact")
    LOW_IMPACT("LowImpact"),
    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("Moderate")
    MODERATE("Moderate"),
    @XmlEnumValue("Serious")
    SERIOUS("Serious");
    private final String value;

    ItineraryWarningSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItineraryWarningSeverity fromValue(String v) {
        for (ItineraryWarningSeverity c: ItineraryWarningSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
