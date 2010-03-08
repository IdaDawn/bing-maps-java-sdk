
package com.google.code.bing.webservices.schema.imageryservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapUriOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapUriOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayLayers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ImageSize" type="{http://dev.virtualearth.net/webservices/v1/common}SizeOfint" minOccurs="0"/>
 *         &lt;element name="ImageType" type="{http://dev.virtualearth.net/webservices/v1/common}ImageType" minOccurs="0"/>
 *         &lt;element name="PreventIconCollision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://dev.virtualearth.net/webservices/v1/common}MapStyle" minOccurs="0"/>
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
@XmlType(name = "MapUriOptions", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", propOrder = {
    "displayLayers",
    "imageSize",
    "imageType",
    "preventIconCollision",
    "style",
    "uriScheme",
    "zoomLevel"
})
public class MapUriOptions {

    @XmlElementRef(name = "DisplayLayers", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> displayLayers;
    @XmlElementRef(name = "ImageSize", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<SizeOfint> imageSize;
    @XmlElement(name = "ImageType", namespace = "http://dev.virtualearth.net/webservices/v1/imagery")
    protected ImageType imageType;
    @XmlElement(name = "PreventIconCollision", namespace = "http://dev.virtualearth.net/webservices/v1/imagery")
    protected Boolean preventIconCollision;
    @XmlElement(name = "Style", namespace = "http://dev.virtualearth.net/webservices/v1/imagery")
    protected MapStyle style;
    @XmlElement(name = "UriScheme", namespace = "http://dev.virtualearth.net/webservices/v1/imagery")
    protected UriScheme uriScheme;
    @XmlElementRef(name = "ZoomLevel", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Integer> zoomLevel;

    /**
     * Gets the value of the displayLayers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDisplayLayers() {
        return displayLayers;
    }

    /**
     * Sets the value of the displayLayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDisplayLayers(JAXBElement<ArrayOfstring> value) {
        this.displayLayers = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the imageSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}
     *     
     */
    public JAXBElement<SizeOfint> getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}
     *     
     */
    public void setImageSize(JAXBElement<SizeOfint> value) {
        this.imageSize = ((JAXBElement<SizeOfint> ) value);
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImageType(ImageType value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the preventIconCollision property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreventIconCollision() {
        return preventIconCollision;
    }

    /**
     * Sets the value of the preventIconCollision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreventIconCollision(Boolean value) {
        this.preventIconCollision = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link MapStyle }
     *     
     */
    public MapStyle getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStyle }
     *     
     */
    public void setStyle(MapStyle value) {
        this.style = value;
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
