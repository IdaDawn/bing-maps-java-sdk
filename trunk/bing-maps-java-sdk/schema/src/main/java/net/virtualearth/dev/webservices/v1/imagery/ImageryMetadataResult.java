
package net.virtualearth.dev.webservices.v1.imagery;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
@XmlSeeAlso({
    ImageryMetadataBirdseyeResult.class
})
public class ImageryMetadataResult
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ImageSize", nillable = true)
    protected SizeOfint imageSize;
    @XmlElement(name = "ImageUri", nillable = true)
    protected String imageUri;
    @XmlElement(name = "ImageUriSubdomains", nillable = true)
    protected ArrayOfstring imageUriSubdomains;
    @XmlElement(name = "ImageryProviders", nillable = true)
    protected ArrayOfImageryProvider imageryProviders;
    @XmlElement(name = "Vintage", nillable = true)
    protected RangeOfdateTime vintage;
    @XmlElement(name = "ZoomRange", nillable = true)
    protected RangeOfint zoomRange;

    /**
     * Gets the value of the imageSize property.
     * 
     * @return
     *     possible object is
     *     {@link SizeOfint }
     *     
     */
    public SizeOfint getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeOfint }
     *     
     */
    public void setImageSize(SizeOfint value) {
        this.imageSize = value;
    }

    /**
     * Gets the value of the imageUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUri() {
        return imageUri;
    }

    /**
     * Sets the value of the imageUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUri(String value) {
        this.imageUri = value;
    }

    /**
     * Gets the value of the imageUriSubdomains property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getImageUriSubdomains() {
        return imageUriSubdomains;
    }

    /**
     * Sets the value of the imageUriSubdomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setImageUriSubdomains(ArrayOfstring value) {
        this.imageUriSubdomains = value;
    }

    /**
     * Gets the value of the imageryProviders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImageryProvider }
     *     
     */
    public ArrayOfImageryProvider getImageryProviders() {
        return imageryProviders;
    }

    /**
     * Sets the value of the imageryProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImageryProvider }
     *     
     */
    public void setImageryProviders(ArrayOfImageryProvider value) {
        this.imageryProviders = value;
    }

    /**
     * Gets the value of the vintage property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfdateTime }
     *     
     */
    public RangeOfdateTime getVintage() {
        return vintage;
    }

    /**
     * Sets the value of the vintage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfdateTime }
     *     
     */
    public void setVintage(RangeOfdateTime value) {
        this.vintage = value;
    }

    /**
     * Gets the value of the zoomRange property.
     * 
     * @return
     *     possible object is
     *     {@link RangeOfint }
     *     
     */
    public RangeOfint getZoomRange() {
        return zoomRange;
    }

    /**
     * Sets the value of the zoomRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeOfint }
     *     
     */
    public void setZoomRange(RangeOfint value) {
        this.zoomRange = value;
    }

}
