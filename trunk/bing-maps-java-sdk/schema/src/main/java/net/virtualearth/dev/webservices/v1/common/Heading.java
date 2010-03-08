
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Heading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Heading">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Orientation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Heading", propOrder = {
    "orientation"
})
public class Heading {

    @XmlElement(name = "Orientation")
    protected Double orientation;

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrientation(Double value) {
        this.orientation = value;
    }

}
