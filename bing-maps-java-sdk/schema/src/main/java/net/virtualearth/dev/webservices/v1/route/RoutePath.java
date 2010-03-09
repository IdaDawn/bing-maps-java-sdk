
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.ArrayOfLocation;


/**
 * <p>Java class for RoutePath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Points" type="{http://dev.virtualearth.net/webservices/v1/common}ArrayOfLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePath", propOrder = {
    "points"
})
public class RoutePath
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Points", nillable = true)
    protected ArrayOfLocation points;

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocation }
     *     
     */
    public ArrayOfLocation getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocation }
     *     
     */
    public void setPoints(ArrayOfLocation value) {
        this.points = value;
    }

}
