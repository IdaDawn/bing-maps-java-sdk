
package com.bing.maps.rest.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BoundingBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundingBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SouthLatitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="WestLongitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NorthLatitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EastLongitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBox", propOrder = {
    "southLatitude",
    "westLongitude",
    "northLatitude",
    "eastLongitude"
})
public class BoundingBox
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SouthLatitude", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double southLatitude;
    @XmlElement(name = "WestLongitude", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double westLongitude;
    @XmlElement(name = "NorthLatitude", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double northLatitude;
    @XmlElement(name = "EastLongitude", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double eastLongitude;

    /**
     * Gets the value of the southLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getSouthLatitude() {
        return southLatitude;
    }

    /**
     * Sets the value of the southLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSouthLatitude(Double value) {
        this.southLatitude = value;
    }

    /**
     * Gets the value of the westLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getWestLongitude() {
        return westLongitude;
    }

    /**
     * Sets the value of the westLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWestLongitude(Double value) {
        this.westLongitude = value;
    }

    /**
     * Gets the value of the northLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNorthLatitude() {
        return northLatitude;
    }

    /**
     * Sets the value of the northLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorthLatitude(Double value) {
        this.northLatitude = value;
    }

    /**
     * Gets the value of the eastLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getEastLongitude() {
        return eastLongitude;
    }

    /**
     * Sets the value of the eastLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEastLongitude(Double value) {
        this.eastLongitude = value;
    }

}
