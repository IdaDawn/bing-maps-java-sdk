
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlType(name = "Polygon", propOrder = {
    "vertices"
})
public class Polygon
    extends ShapeBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Vertices", nillable = true)
    protected ArrayOfLocation vertices;

    /**
     * Gets the value of the vertices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocation }
     *     
     */
    public ArrayOfLocation getVertices() {
        return vertices;
    }

    /**
     * Sets the value of the vertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocation }
     *     
     */
    public void setVertices(ArrayOfLocation value) {
        this.vertices = value;
    }

}
