
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
{

    @XmlElementRef(name = "Destination", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<Waypoint> destination;
    @XmlElementRef(name = "Options", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<MajorRoutesOptions> options;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Waypoint }{@code >}
     *     
     */
    public JAXBElement<Waypoint> getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Waypoint }{@code >}
     *     
     */
    public void setDestination(JAXBElement<Waypoint> value) {
        this.destination = ((JAXBElement<Waypoint> ) value);
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MajorRoutesOptions }{@code >}
     *     
     */
    public JAXBElement<MajorRoutesOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MajorRoutesOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<MajorRoutesOptions> value) {
        this.options = ((JAXBElement<MajorRoutesOptions> ) value);
    }

}
