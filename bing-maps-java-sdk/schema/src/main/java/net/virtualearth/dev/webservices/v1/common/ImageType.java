
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Png"/>
 *     &lt;enumeration value="Jpeg"/>
 *     &lt;enumeration value="Gif"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageType")
@XmlEnum
public enum ImageType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Png")
    PNG("Png"),
    @XmlEnumValue("Jpeg")
    JPEG("Jpeg"),
    @XmlEnumValue("Gif")
    GIF("Gif");
    private final String value;

    ImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageType fromValue(String v) {
        for (ImageType c: ImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
