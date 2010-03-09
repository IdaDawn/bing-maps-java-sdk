
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rectangle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rectangle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ShapeBase">
 *       &lt;sequence>
 *         &lt;element name="Northeast" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="Southwest" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectangle", propOrder = {
    "northeast",
    "southwest"
})
public class Rectangle
    extends ShapeBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Northeast", nillable = true)
    protected Location northeast;
    @XmlElement(name = "Southwest", nillable = true)
    protected Location southwest;

    /**
     * Gets the value of the northeast property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getNortheast() {
        return northeast;
    }

    /**
     * Sets the value of the northeast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setNortheast(Location value) {
        this.northeast = value;
    }

    /**
     * Gets the value of the southwest property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getSouthwest() {
        return southwest;
    }

    /**
     * Sets the value of the southwest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setSouthwest(Location value) {
        this.southwest = value;
    }

}
