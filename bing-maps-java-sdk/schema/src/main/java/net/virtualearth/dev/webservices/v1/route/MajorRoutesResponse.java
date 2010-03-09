
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Routes", nillable = true)
    protected ArrayOfRouteResult routes;
    @XmlElement(name = "StartingPoints", nillable = true)
    protected ArrayOfWaypoint startingPoints;

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteResult }
     *     
     */
    public ArrayOfRouteResult getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteResult }
     *     
     */
    public void setRoutes(ArrayOfRouteResult value) {
        this.routes = value;
    }

    /**
     * Gets the value of the startingPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWaypoint }
     *     
     */
    public ArrayOfWaypoint getStartingPoints() {
        return startingPoints;
    }

    /**
     * Sets the value of the startingPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWaypoint }
     *     
     */
    public void setStartingPoints(ArrayOfWaypoint value) {
        this.startingPoints = value;
    }

}
