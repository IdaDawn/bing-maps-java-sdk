
package com.microsoft.schemas.search.local.ws.rest.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoundingBox" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}ArrayOfDouble" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shape", propOrder = {
    "boundingBox"
})
public abstract class Shape {

    @XmlElement(name = "BoundingBox")
    protected ArrayOfDouble boundingBox;

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDouble }
     *     
     */
    public ArrayOfDouble getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDouble }
     *     
     */
    public void setBoundingBox(ArrayOfDouble value) {
        this.boundingBox = value;
    }

}
