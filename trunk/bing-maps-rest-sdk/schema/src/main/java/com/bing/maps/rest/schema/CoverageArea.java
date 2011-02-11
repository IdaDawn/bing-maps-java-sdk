
package com.bing.maps.rest.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ZoomMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ZoomMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BoundingBox" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}BoundingBox" minOccurs="0"/>
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
    "zoomMin",
    "zoomMax",
    "boundingBox"
})
public class CoverageArea
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ZoomMin")
    protected int zoomMin;
    @XmlElement(name = "ZoomMax")
    protected int zoomMax;
    @XmlElement(name = "BoundingBox")
    protected BoundingBox boundingBox;

    /**
     * Gets the value of the zoomMin property.
     * 
     */
    public int getZoomMin() {
        return zoomMin;
    }

    /**
     * Sets the value of the zoomMin property.
     * 
     */
    public void setZoomMin(int value) {
        this.zoomMin = value;
    }

    /**
     * Gets the value of the zoomMax property.
     * 
     */
    public int getZoomMax() {
        return zoomMax;
    }

    /**
     * Sets the value of the zoomMax property.
     * 
     */
    public void setZoomMax(int value) {
        this.zoomMax = value;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link BoundingBox }
     *     
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingBox }
     *     
     */
    public void setBoundingBox(BoundingBox value) {
        this.boundingBox = value;
    }

}
