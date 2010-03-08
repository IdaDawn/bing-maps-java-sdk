
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import net.virtualearth.dev.webservices.v1.common.RangeOfdateTime;
import net.virtualearth.dev.webservices.v1.common.RangeOfint;
import net.virtualearth.dev.webservices.v1.common.SizeOfint;


/**
 * <p>Java class for ImageryMetadataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryMetadataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageSize" type="{http://dev.virtualearth.net/webservices/v1/common}SizeOfint" minOccurs="0"/>
 *         &lt;element name="ImageUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageUriSubdomains" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ImageryProviders" type="{http://dev.virtualearth.net/webservices/v1/imagery}ArrayOfImageryProvider" minOccurs="0"/>
 *         &lt;element name="Vintage" type="{http://dev.virtualearth.net/webservices/v1/common}RangeOfdateTime" minOccurs="0"/>
 *         &lt;element name="ZoomRange" type="{http://dev.virtualearth.net/webservices/v1/common}RangeOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryMetadataResult", propOrder = {
    "imageSize",
    "imageUri",
    "imageUriSubdomains",
    "imageryProviders",
    "vintage",
    "zoomRange"
})
public class ImageryMetadataResult {

    @XmlElementRef(name = "ImageSize", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<SizeOfint> imageSize;
    @XmlElementRef(name = "ImageUri", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<String> imageUri;
    @XmlElementRef(name = "ImageUriSubdomains", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> imageUriSubdomains;
    @XmlElementRef(name = "ImageryProviders", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<ArrayOfImageryProvider> imageryProviders;
    @XmlElementRef(name = "Vintage", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<RangeOfdateTime> vintage;
    @XmlElementRef(name = "ZoomRange", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<RangeOfint> zoomRange;

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
     * Gets the value of the imageUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageUri() {
        return imageUri;
    }

    /**
     * Sets the value of the imageUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageUri(JAXBElement<String> value) {
        this.imageUri = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the imageUriSubdomains property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getImageUriSubdomains() {
        return imageUriSubdomains;
    }

    /**
     * Sets the value of the imageUriSubdomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setImageUriSubdomains(JAXBElement<ArrayOfstring> value) {
        this.imageUriSubdomains = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the imageryProviders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImageryProvider }{@code >}
     *     
     */
    public JAXBElement<ArrayOfImageryProvider> getImageryProviders() {
        return imageryProviders;
    }

    /**
     * Sets the value of the imageryProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImageryProvider }{@code >}
     *     
     */
    public void setImageryProviders(JAXBElement<ArrayOfImageryProvider> value) {
        this.imageryProviders = ((JAXBElement<ArrayOfImageryProvider> ) value);
    }

    /**
     * Gets the value of the vintage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RangeOfdateTime }{@code >}
     *     
     */
    public JAXBElement<RangeOfdateTime> getVintage() {
        return vintage;
    }

    /**
     * Sets the value of the vintage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RangeOfdateTime }{@code >}
     *     
     */
    public void setVintage(JAXBElement<RangeOfdateTime> value) {
        this.vintage = ((JAXBElement<RangeOfdateTime> ) value);
    }

    /**
     * Gets the value of the zoomRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RangeOfint }{@code >}
     *     
     */
    public JAXBElement<RangeOfint> getZoomRange() {
        return zoomRange;
    }

    /**
     * Sets the value of the zoomRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RangeOfint }{@code >}
     *     
     */
    public void setZoomRange(JAXBElement<RangeOfint> value) {
        this.zoomRange = ((JAXBElement<RangeOfint> ) value);
    }

}
