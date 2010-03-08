
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.GeocodeResult;
import net.virtualearth.dev.webservices.v1.common.ShapeBase;


/**
 * <p>Java class for SearchRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRegion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundingArea" type="{http://dev.virtualearth.net/webservices/v1/common}ShapeBase" minOccurs="0"/>
 *         &lt;element name="GeocodeLocation" type="{http://dev.virtualearth.net/webservices/v1/common}GeocodeResult" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRegion", propOrder = {
    "boundingArea",
    "geocodeLocation",
    "source"
})
public class SearchRegion {

    @XmlElementRef(name = "BoundingArea", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ShapeBase> boundingArea;
    @XmlElementRef(name = "GeocodeLocation", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<GeocodeResult> geocodeLocation;
    @XmlElementRef(name = "Source", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> source;

    /**
     * Gets the value of the boundingArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShapeBase }{@code >}
     *     
     */
    public JAXBElement<ShapeBase> getBoundingArea() {
        return boundingArea;
    }

    /**
     * Sets the value of the boundingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShapeBase }{@code >}
     *     
     */
    public void setBoundingArea(JAXBElement<ShapeBase> value) {
        this.boundingArea = ((JAXBElement<ShapeBase> ) value);
    }

    /**
     * Gets the value of the geocodeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeocodeResult }{@code >}
     *     
     */
    public JAXBElement<GeocodeResult> getGeocodeLocation() {
        return geocodeLocation;
    }

    /**
     * Sets the value of the geocodeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeocodeResult }{@code >}
     *     
     */
    public void setGeocodeLocation(JAXBElement<GeocodeResult> value) {
        this.geocodeLocation = ((JAXBElement<GeocodeResult> ) value);
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = ((JAXBElement<String> ) value);
    }

}
