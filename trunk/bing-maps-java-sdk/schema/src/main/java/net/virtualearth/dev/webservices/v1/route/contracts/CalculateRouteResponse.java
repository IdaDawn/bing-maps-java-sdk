
package net.virtualearth.dev.webservices.v1.route.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.route.RouteResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculateRouteResult" type="{http://dev.virtualearth.net/webservices/v1/route}RouteResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calculateRouteResult"
})
@XmlRootElement(name = "CalculateRouteResponse")
public class CalculateRouteResponse
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CalculateRouteResult", nillable = true)
    protected RouteResponse calculateRouteResult;

    /**
     * Gets the value of the calculateRouteResult property.
     * 
     * @return
     *     possible object is
     *     {@link RouteResponse }
     *     
     */
    public RouteResponse getCalculateRouteResult() {
        return calculateRouteResult;
    }

    /**
     * Sets the value of the calculateRouteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteResponse }
     *     
     */
    public void setCalculateRouteResult(RouteResponse value) {
        this.calculateRouteResult = value;
    }

}
