
package net.virtualearth.dev.webservices.v1.search;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.ShapeBase;


/**
 * <p>Java class for SearchPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ShapeBase">
 *       &lt;sequence>
 *         &lt;element name="Point" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPoint", propOrder = {
    "point"
})
public class SearchPoint
    extends ShapeBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Point", nillable = true)
    protected Location point;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setPoint(Location value) {
        this.point = value;
    }

}
