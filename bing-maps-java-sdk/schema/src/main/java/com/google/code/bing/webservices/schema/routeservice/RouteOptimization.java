
package com.google.code.bing.webservices.schema.routeservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for RouteOptimization.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteOptimization">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MinimizeTime"/>
 *     &lt;enumeration value="MinimizeDistance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum RouteOptimization {

    @XmlEnumValue("MinimizeTime")
    MINIMIZE_TIME("MinimizeTime"),
    @XmlEnumValue("MinimizeDistance")
    MINIMIZE_DISTANCE("MinimizeDistance");
    private final String value;

    RouteOptimization(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RouteOptimization fromValue(String v) {
        for (RouteOptimization c: RouteOptimization.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
