
package com.google.code.bing.webservices.schema.imageryservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for DistanceUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Kilometer"/>
 *     &lt;enumeration value="Mile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum DistanceUnit {

    @XmlEnumValue("Kilometer")
    KILOMETER("Kilometer"),
    @XmlEnumValue("Mile")
    MILE("Mile");
    private final String value;

    DistanceUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnit fromValue(String v) {
        for (DistanceUnit c: DistanceUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
