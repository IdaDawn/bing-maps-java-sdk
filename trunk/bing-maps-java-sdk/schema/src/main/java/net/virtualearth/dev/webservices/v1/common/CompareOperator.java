
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for CompareOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompareOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="GreaterThanOrEquals"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="LessThanOrEquals"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum CompareOperator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("GreaterThanOrEquals")
    GREATER_THAN_OR_EQUALS("GreaterThanOrEquals"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("LessThanOrEquals")
    LESS_THAN_OR_EQUALS("LessThanOrEquals");
    private final String value;

    CompareOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompareOperator fromValue(String v) {
        for (CompareOperator c: CompareOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
