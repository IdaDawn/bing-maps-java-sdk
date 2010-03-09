
package net.virtualearth.dev.webservices.v1.geocode.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GeocodeResult" type="{http://dev.virtualearth.net/webservices/v1/geocode}GeocodeResponse" minOccurs="0"/>
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
    "geocodeResult"
})
@XmlRootElement(name = "GeocodeResponse")
public class GeocodeResponse
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "GeocodeResult", nillable = true)
    protected net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse geocodeResult;

    /**
     * Gets the value of the geocodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse }
     *     
     */
    public net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse getGeocodeResult() {
        return geocodeResult;
    }

    /**
     * Sets the value of the geocodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse }
     *     
     */
    public void setGeocodeResult(net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse value) {
        this.geocodeResult = value;
    }

}
