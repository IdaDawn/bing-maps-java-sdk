
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
{

    @XmlElementRef(name = "Options", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<RouteOptions> options;
    @XmlElementRef(name = "Waypoints", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<ArrayOfWaypoint> waypoints;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteOptions }{@code >}
     *     
     */
    public JAXBElement<RouteOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<RouteOptions> value) {
        this.options = ((JAXBElement<RouteOptions> ) value);
    }

    /**
     * Gets the value of the waypoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWaypoint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWaypoint> getWaypoints() {
        return waypoints;
    }

    /**
     * Sets the value of the waypoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWaypoint }{@code >}
     *     
     */
    public void setWaypoints(JAXBElement<ArrayOfWaypoint> value) {
        this.waypoints = ((JAXBElement<ArrayOfWaypoint> ) value);
    }

}
