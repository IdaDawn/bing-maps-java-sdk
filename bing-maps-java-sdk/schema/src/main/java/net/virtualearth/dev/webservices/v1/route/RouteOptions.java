
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://dev.virtualearth.net/webservices/v1/route}TravelMode" minOccurs="0"/>
 *         &lt;element name="Optimization" type="{http://dev.virtualearth.net/webservices/v1/route}RouteOptimization" minOccurs="0"/>
 *         &lt;element name="RoutePathType" type="{http://dev.virtualearth.net/webservices/v1/route}RoutePathType" minOccurs="0"/>
 *         &lt;element name="TrafficUsage" type="{http://dev.virtualearth.net/webservices/v1/route}TrafficUsage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteOptions", propOrder = {
    "mode",
    "optimization",
    "routePathType",
    "trafficUsage"
})
@XmlSeeAlso({
    MajorRoutesOptions.class
})
public class RouteOptions
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Mode")
    protected TravelMode mode;
    @XmlElement(name = "Optimization")
    protected RouteOptimization optimization;
    @XmlElement(name = "RoutePathType")
    protected RoutePathType routePathType;
    @XmlElement(name = "TrafficUsage")
    protected TrafficUsage trafficUsage;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelMode }
     *     
     */
    public TravelMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelMode }
     *     
     */
    public void setMode(TravelMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the optimization property.
     * 
     * @return
     *     possible object is
     *     {@link RouteOptimization }
     *     
     */
    public RouteOptimization getOptimization() {
        return optimization;
    }

    /**
     * Sets the value of the optimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteOptimization }
     *     
     */
    public void setOptimization(RouteOptimization value) {
        this.optimization = value;
    }

    /**
     * Gets the value of the routePathType property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePathType }
     *     
     */
    public RoutePathType getRoutePathType() {
        return routePathType;
    }

    /**
     * Sets the value of the routePathType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePathType }
     *     
     */
    public void setRoutePathType(RoutePathType value) {
        this.routePathType = value;
    }

    /**
     * Gets the value of the trafficUsage property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficUsage }
     *     
     */
    public TrafficUsage getTrafficUsage() {
        return trafficUsage;
    }

    /**
     * Sets the value of the trafficUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficUsage }
     *     
     */
    public void setTrafficUsage(TrafficUsage value) {
        this.trafficUsage = value;
    }

}
