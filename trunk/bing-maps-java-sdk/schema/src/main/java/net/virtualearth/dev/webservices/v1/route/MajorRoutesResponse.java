
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.ResponseBase;


/**
 * <p>Java class for MajorRoutesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MajorRoutesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="Routes" type="{http://dev.virtualearth.net/webservices/v1/route}ArrayOfRouteResult" minOccurs="0"/>
 *         &lt;element name="StartingPoints" type="{http://dev.virtualearth.net/webservices/v1/route}ArrayOfWaypoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MajorRoutesResponse", propOrder = {
    "routes",
    "startingPoints"
})
public class MajorRoutesResponse
    extends ResponseBase
{

    @XmlElementRef(name = "Routes", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRouteResult> routes;
    @XmlElementRef(name = "StartingPoints", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<ArrayOfWaypoint> startingPoints;

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteResult> getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}
     *     
     */
    public void setRoutes(JAXBElement<ArrayOfRouteResult> value) {
        this.routes = ((JAXBElement<ArrayOfRouteResult> ) value);
    }

    /**
     * Gets the value of the startingPoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWaypoint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWaypoint> getStartingPoints() {
        return startingPoints;
    }

    /**
     * Sets the value of the startingPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWaypoint }{@code >}
     *     
     */
    public void setStartingPoints(JAXBElement<ArrayOfWaypoint> value) {
        this.startingPoints = ((JAXBElement<ArrayOfWaypoint> ) value);
    }

}
