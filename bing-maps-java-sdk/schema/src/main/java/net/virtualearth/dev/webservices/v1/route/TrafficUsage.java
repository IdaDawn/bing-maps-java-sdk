
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficUsage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficUsage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="TrafficBasedTime"/>
 *     &lt;enumeration value="TrafficBasedRouteAndTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficUsage")
@XmlEnum
public enum TrafficUsage {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("TrafficBasedTime")
    TRAFFIC_BASED_TIME("TrafficBasedTime"),
    @XmlEnumValue("TrafficBasedRouteAndTime")
    TRAFFIC_BASED_ROUTE_AND_TIME("TrafficBasedRouteAndTime");
    private final String value;

    TrafficUsage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficUsage fromValue(String v) {
        for (TrafficUsage c: TrafficUsage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
