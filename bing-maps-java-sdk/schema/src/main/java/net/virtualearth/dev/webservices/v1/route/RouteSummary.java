
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Rectangle;


/**
 * <p>Java class for RouteSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundingRectangle" type="{http://dev.virtualearth.net/webservices/v1/common}Rectangle" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TimeInSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteSummary", propOrder = {
    "boundingRectangle",
    "distance",
    "timeInSeconds"
})
public class RouteSummary {

    @XmlElementRef(name = "BoundingRectangle", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<Rectangle> boundingRectangle;
    @XmlElement(name = "Distance")
    protected Double distance;
    @XmlElement(name = "TimeInSeconds")
    protected Long timeInSeconds;

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
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistance(Double value) {
        this.distance = value;
    }

    /**
     * Gets the value of the timeInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeInSeconds() {
        return timeInSeconds;
    }

    /**
     * Sets the value of the timeInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeInSeconds(Long value) {
        this.timeInSeconds = value;
    }

}
