
package net.virtualearth.dev.webservices.v1.imagery.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;


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
 *         &lt;element name="request" type="{http://dev.virtualearth.net/webservices/v1/imagery}MapUriRequest" minOccurs="0"/>
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
@XmlRootElement(name = "GetMapUri")
public class GetMapUri {

    @XmlElementRef(name = "request", namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", type = JAXBElement.class)
    protected JAXBElement<MapUriRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MapUriRequest }{@code >}
     *     
     */
    public JAXBElement<MapUriRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MapUriRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<MapUriRequest> value) {
        this.request = ((JAXBElement<MapUriRequest> ) value);
    }

}
