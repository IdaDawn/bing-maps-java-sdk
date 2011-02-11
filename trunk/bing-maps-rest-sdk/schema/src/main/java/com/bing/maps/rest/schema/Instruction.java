
package com.bing.maps.rest.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Instruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instruction">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="maneuverType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instruction", propOrder = {
    "value"
})
public class Instruction
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlValue
    protected String value;
    @XmlAttribute
    protected String maneuverType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the maneuverType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManeuverType() {
        return maneuverType;
    }

    /**
     * Sets the value of the maneuverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManeuverType(String value) {
        this.maneuverType = value;
    }

}
