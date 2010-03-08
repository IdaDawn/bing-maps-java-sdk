
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
public class CoverageArea {

    @XmlElementRef(name = "BoundingRectangle", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Rectangle> boundingRectangle;
    @XmlElementRef(name = "ZoomRange", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<RangeOfint> zoomRange;

    /**
     * Gets the value of the boundingRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Rectangle }{@code >}
     *     
     */
    public JAXBElement<Rectangle> getBoundingRectangle() {
        return boundingRectangle;
    }

    /**
     * Sets the value of the boundingRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Rectangle }{@code >}
     *     
     */
    public void setBoundingRectangle(JAXBElement<Rectangle> value) {
        this.boundingRectangle = ((JAXBElement<Rectangle> ) value);
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
