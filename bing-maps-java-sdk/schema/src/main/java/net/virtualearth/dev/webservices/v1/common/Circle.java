
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Circle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Circle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ShapeBase">
 *       &lt;sequence>
 *         &lt;element name="Center" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="DistanceUnit" type="{http://dev.virtualearth.net/webservices/v1/common}DistanceUnit" minOccurs="0"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Circle", propOrder = {
    "center",
    "distanceUnit",
    "radius"
})
public class Circle
    extends ShapeBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Center", nillable = true)
    protected Location center;
    @XmlElement(name = "DistanceUnit")
    protected DistanceUnit distanceUnit;
    @XmlElement(name = "Radius")
    protected Double radius;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setCenter(Location value) {
        this.center = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnit }
     *     
     */
    public DistanceUnit getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnit }
     *     
     */
    public void setDistanceUnit(DistanceUnit value) {
        this.distanceUnit = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadius(Double value) {
        this.radius = value;
    }

}
