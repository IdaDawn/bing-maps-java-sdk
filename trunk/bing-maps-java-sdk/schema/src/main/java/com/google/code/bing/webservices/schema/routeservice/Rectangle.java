
package com.google.code.bing.webservices.schema.routeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rectangle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rectangle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ShapeBase">
 *       &lt;sequence>
 *         &lt;element name="Northeast" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="Southwest" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectangle", namespace = "http://dev.virtualearth.net/webservices/v1/common", propOrder = {
    "northeast",
    "southwest"
})
public class Rectangle
    extends ShapeBase
{

    @XmlElementRef(name = "Northeast", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<Location> northeast;
    @XmlElementRef(name = "Southwest", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<Location> southwest;

    /**
     * Gets the value of the northeast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getNortheast() {
        return northeast;
    }

    /**
     * Sets the value of the northeast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setNortheast(JAXBElement<Location> value) {
        this.northeast = ((JAXBElement<Location> ) value);
    }

    /**
     * Gets the value of the southwest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getSouthwest() {
        return southwest;
    }

    /**
     * Sets the value of the southwest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setSouthwest(JAXBElement<Location> value) {
        this.southwest = ((JAXBElement<Location> ) value);
    }

}
