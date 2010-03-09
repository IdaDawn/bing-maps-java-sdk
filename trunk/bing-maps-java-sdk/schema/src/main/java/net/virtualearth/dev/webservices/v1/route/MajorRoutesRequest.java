
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.RequestBase;


/**
 * <p>Java class for MajorRoutesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MajorRoutesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Destination" type="{http://dev.virtualearth.net/webservices/v1/route}Waypoint" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://dev.virtualearth.net/webservices/v1/route}MajorRoutesOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MajorRoutesRequest", propOrder = {
    "destination",
    "options"
})
public class MajorRoutesRequest
    extends RequestBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Destination", nillable = true)
    protected Waypoint destination;
    @XmlElement(name = "Options", nillable = true)
    protected MajorRoutesOptions options;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Waypoint }
     *     
     */
    public Waypoint getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Waypoint }
     *     
     */
    public void setDestination(Waypoint value) {
        this.destination = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link MajorRoutesOptions }
     *     
     */
    public MajorRoutesOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link MajorRoutesOptions }
     *     
     */
    public void setOptions(MajorRoutesOptions value) {
        this.options = value;
    }

}
