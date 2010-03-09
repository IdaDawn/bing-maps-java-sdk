
package net.virtualearth.dev.webservices.v1.search;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class SearchRegion
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BoundingArea", nillable = true)
    protected ShapeBase boundingArea;
    @XmlElement(name = "GeocodeLocation", nillable = true)
    protected GeocodeResult geocodeLocation;
    @XmlElement(name = "Source", nillable = true)
    protected String source;

    /**
     * Gets the value of the boundingArea property.
     * 
     * @return
     *     possible object is
     *     {@link ShapeBase }
     *     
     */
    public ShapeBase getBoundingArea() {
        return boundingArea;
    }

    /**
     * Sets the value of the boundingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeBase }
     *     
     */
    public void setBoundingArea(ShapeBase value) {
        this.boundingArea = value;
    }

    /**
     * Gets the value of the geocodeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeocodeResult }
     *     
     */
    public GeocodeResult getGeocodeLocation() {
        return geocodeLocation;
    }

    /**
     * Sets the value of the geocodeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeocodeResult }
     *     
     */
    public void setGeocodeLocation(GeocodeResult value) {
        this.geocodeLocation = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
