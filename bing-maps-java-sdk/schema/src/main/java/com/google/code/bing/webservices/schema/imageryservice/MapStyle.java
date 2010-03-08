
package com.google.code.bing.webservices.schema.imageryservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for MapStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MapStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Road"/>
 *     &lt;enumeration value="Aerial"/>
 *     &lt;enumeration value="AerialWithLabels"/>
 *     &lt;enumeration value="Birdseye"/>
 *     &lt;enumeration value="BirdseyeWithLabels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum MapStyle {

    @XmlEnumValue("Road")
    ROAD("Road"),
    @XmlEnumValue("Aerial")
    AERIAL("Aerial"),
    @XmlEnumValue("AerialWithLabels")
    AERIAL_WITH_LABELS("AerialWithLabels"),
    @XmlEnumValue("Birdseye")
    BIRDSEYE("Birdseye"),
    @XmlEnumValue("BirdseyeWithLabels")
    BIRDSEYE_WITH_LABELS("BirdseyeWithLabels");
    private final String value;

    MapStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapStyle fromValue(String v) {
        for (MapStyle c: MapStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
