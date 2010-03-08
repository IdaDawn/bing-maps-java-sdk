
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Heading;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.UriScheme;


/**
 * <p>Java class for ImageryMetadataOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryMetadataOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Heading" type="{http://dev.virtualearth.net/webservices/v1/common}Heading" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="ReturnImageryProviders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UriScheme" type="{http://dev.virtualearth.net/webservices/v1/common}UriScheme" minOccurs="0"/>
 *         &lt;element name="ZoomLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryMetadataOptions", propOrder = {
    "heading",
    "location",
    "returnImageryProviders",
    "uriScheme",
    "zoomLevel"
})
public class ImageryMetadataOptions {

    @XmlElementRef(name = "Heading", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Heading> heading;
    @XmlElementRef(name = "Location", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Location> location;
    @XmlElement(name = "ReturnImageryProviders")
    protected Boolean returnImageryProviders;
    @XmlElement(name = "UriScheme")
    protected UriScheme uriScheme;
    @XmlElementRef(name = "ZoomLevel", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Integer> zoomLevel;

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Heading }{@code >}
     *     
     */
    public JAXBElement<Heading> getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Heading }{@code >}
     *     
     */
    public void setHeading(JAXBElement<Heading> value) {
        this.heading = ((JAXBElement<Heading> ) value);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setLocation(JAXBElement<Location> value) {
        this.location = ((JAXBElement<Location> ) value);
    }

    /**
     * Gets the value of the returnImageryProviders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnImageryProviders() {
        return returnImageryProviders;
    }

    /**
     * Sets the value of the returnImageryProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnImageryProviders(Boolean value) {
        this.returnImageryProviders = value;
    }

    /**
     * Gets the value of the uriScheme property.
     * 
     * @return
     *     possible object is
     *     {@link UriScheme }
     *     
     */
    public UriScheme getUriScheme() {
        return uriScheme;
    }

    /**
     * Sets the value of the uriScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link UriScheme }
     *     
     */
    public void setUriScheme(UriScheme value) {
        this.uriScheme = value;
    }

    /**
     * Gets the value of the zoomLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoomLevel() {
        return zoomLevel;
    }

    /**
     * Sets the value of the zoomLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoomLevel(JAXBElement<Integer> value) {
        this.zoomLevel = ((JAXBElement<Integer> ) value);
    }

}
