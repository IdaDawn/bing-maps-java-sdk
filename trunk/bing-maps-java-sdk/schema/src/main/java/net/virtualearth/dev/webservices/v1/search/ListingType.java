
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ListingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="CommunityContent"/>
 *     &lt;enumeration value="Person"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ListingType {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("CommunityContent")
    COMMUNITY_CONTENT("CommunityContent"),
    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ListingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingType fromValue(String v) {
        for (ListingType c: ListingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
