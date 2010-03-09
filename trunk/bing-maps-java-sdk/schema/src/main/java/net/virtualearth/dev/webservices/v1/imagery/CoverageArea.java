
package net.virtualearth.dev.webservices.v1.imagery;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.RangeOfint;
import net.virtualearth.dev.webservices.v1.common.Rectangle;


/**
 * <p>Java class for CoverageArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundingRectangle" type="{http://dev.virtualearth.net/webservices/v1/common}Rectangle" minOccurs="0"/>
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
@XmlType(name = "CoverageArea", propOrder = {
    "boundingRectangle",
    "zoomRange"
})
public class CoverageArea
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BoundingRectangle", nillable = true)
    protected Rectangle boundingRectangle;
    @XmlElement(name = "ZoomRange", nillable = true)
    protected RangeOfint zoomRange;

    /**
     * Gets the value of the boundingRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getBoundingRectangle() {
        return boundingRectangle;
    }

    /**
     * Sets the value of the boundingRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setBoundingRectangle(Rectangle value) {
        this.boundingRectangle = value;
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
