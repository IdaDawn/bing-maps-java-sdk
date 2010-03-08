
package net.virtualearth.dev.webservices.v1.geocode.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse;


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
 *         &lt;element name="ReverseGeocodeResult" type="{http://dev.virtualearth.net/webservices/v1/geocode}GeocodeResponse" minOccurs="0"/>
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
    "reverseGeocodeResult"
})
@XmlRootElement(name = "ReverseGeocodeResponse")
public class ReverseGeocodeResponse {

    @XmlElementRef(name = "ReverseGeocodeResult", namespace = "http://dev.virtualearth.net/webservices/v1/geocode/contracts", type = JAXBElement.class)
    protected JAXBElement<GeocodeResponse> reverseGeocodeResult;

    /**
     * Gets the value of the reverseGeocodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeocodeResponse }{@code >}
     *     
     */
    public JAXBElement<GeocodeResponse> getReverseGeocodeResult() {
        return reverseGeocodeResult;
    }

    /**
     * Sets the value of the reverseGeocodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeocodeResponse }{@code >}
     *     
     */
    public void setReverseGeocodeResult(JAXBElement<GeocodeResponse> value) {
        this.reverseGeocodeResult = ((JAXBElement<GeocodeResponse> ) value);
    }

}
