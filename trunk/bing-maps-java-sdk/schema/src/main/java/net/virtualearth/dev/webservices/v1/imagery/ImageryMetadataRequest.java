
package net.virtualearth.dev.webservices.v1.imagery;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.MapStyle;
import net.virtualearth.dev.webservices.v1.common.RequestBase;


/**
 * <p>Java class for ImageryMetadataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryMetadataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Options" type="{http://dev.virtualearth.net/webservices/v1/imagery}ImageryMetadataOptions" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://dev.virtualearth.net/webservices/v1/common}MapStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryMetadataRequest", propOrder = {
    "options",
    "style"
})
public class ImageryMetadataRequest
    extends RequestBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Options", nillable = true)
    protected ImageryMetadataOptions options;
    @XmlElement(name = "Style")
    protected MapStyle style;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ImageryMetadataOptions }
     *     
     */
    public ImageryMetadataOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageryMetadataOptions }
     *     
     */
    public void setOptions(ImageryMetadataOptions value) {
        this.options = value;
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

}
