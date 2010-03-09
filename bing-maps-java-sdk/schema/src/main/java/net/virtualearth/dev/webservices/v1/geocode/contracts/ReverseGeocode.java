
package net.virtualearth.dev.webservices.v1.geocode.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.geocode.ReverseGeocodeRequest;


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
 *         &lt;element name="request" type="{http://dev.virtualearth.net/webservices/v1/geocode}ReverseGeocodeRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "ReverseGeocode")
public class ReverseGeocode
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(nillable = true)
    protected ReverseGeocodeRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ReverseGeocodeRequest }
     *     
     */
    public ReverseGeocodeRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseGeocodeRequest }
     *     
     */
    public void setRequest(ReverseGeocodeRequest value) {
        this.request = value;
    }

}
