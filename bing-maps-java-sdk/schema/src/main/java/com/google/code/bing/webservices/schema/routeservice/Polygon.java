
package com.google.code.bing.webservices.schema.routeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Polygon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Polygon">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ShapeBase">
 *       &lt;sequence>
 *         &lt;element name="Vertices" type="{http://dev.virtualearth.net/webservices/v1/common}ArrayOfLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polygon", namespace = "http://dev.virtualearth.net/webservices/v1/common", propOrder = {
    "vertices"
})
public class Polygon
    extends ShapeBase
{

    @XmlElementRef(name = "Vertices", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLocation> vertices;

    /**
     * Gets the value of the vertices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLocation> getVertices() {
        return vertices;
    }

    /**
     * Sets the value of the vertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLocation }{@code >}
     *     
     */
    public void setVertices(JAXBElement<ArrayOfLocation> value) {
        this.vertices = ((JAXBElement<ArrayOfLocation> ) value);
    }

}
