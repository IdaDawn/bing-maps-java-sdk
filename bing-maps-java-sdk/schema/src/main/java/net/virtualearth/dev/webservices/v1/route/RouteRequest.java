
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.RequestBase;


/**
 * <p>Java class for RouteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Options" type="{http://dev.virtualearth.net/webservices/v1/route}RouteOptions" minOccurs="0"/>
 *         &lt;element name="Waypoints" type="{http://dev.virtualearth.net/webservices/v1/route}ArrayOfWaypoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteRequest", propOrder = {
    "options",
    "waypoints"
})
public class RouteRequest
    extends RequestBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Options", nillable = true)
    protected RouteOptions options;
    @XmlElement(name = "Waypoints", nillable = true)
    protected ArrayOfWaypoint waypoints;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link RouteOptions }
     *     
     */
    public RouteOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteOptions }
     *     
     */
    public void setOptions(RouteOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the waypoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaypoint }
     *     
     */
    public ArrayOfWaypoint getWaypoints() {
        return waypoints;
    }

    /**
     * Sets the value of the waypoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaypoint }
     *     
     */
    public void setWaypoints(ArrayOfWaypoint value) {
        this.waypoints = value;
    }

}
