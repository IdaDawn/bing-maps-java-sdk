
package net.virtualearth.dev.webservices.v1.imagery.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.imagery.MapUriResponse;


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
 *         &lt;element name="GetMapUriResult" type="{http://dev.virtualearth.net/webservices/v1/imagery}MapUriResponse" minOccurs="0"/>
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
    "getMapUriResult"
})
@XmlRootElement(name = "GetMapUriResponse")
public class GetMapUriResponse {

    @XmlElementRef(name = "GetMapUriResult", namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", type = JAXBElement.class)
    protected JAXBElement<MapUriResponse> getMapUriResult;

    /**
     * Gets the value of the getMapUriResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MapUriResponse }{@code >}
     *     
     */
    public JAXBElement<MapUriResponse> getGetMapUriResult() {
        return getMapUriResult;
    }

    /**
     * Sets the value of the getMapUriResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MapUriResponse }{@code >}
     *     
     */
    public void setGetMapUriResult(JAXBElement<MapUriResponse> value) {
        this.getMapUriResult = ((JAXBElement<MapUriResponse> ) value);
    }

}
