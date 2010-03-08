
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.ArrayOfPushpin;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.RequestBase;


/**
 * <p>Java class for MapUriRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapUriRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Center" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="MajorRoutesDestination" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://dev.virtualearth.net/webservices/v1/imagery}MapUriOptions" minOccurs="0"/>
 *         &lt;element name="Pushpins" type="{http://dev.virtualearth.net/webservices/v1/common}ArrayOfPushpin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapUriRequest", propOrder = {
    "center",
    "majorRoutesDestination",
    "options",
    "pushpins"
})
public class MapUriRequest
    extends RequestBase
{

    @XmlElementRef(name = "Center", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Location> center;
    @XmlElementRef(name = "MajorRoutesDestination", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Location> majorRoutesDestination;
    @XmlElementRef(name = "Options", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<MapUriOptions> options;
    @XmlElementRef(name = "Pushpins", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPushpin> pushpins;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setCenter(JAXBElement<Location> value) {
        this.center = ((JAXBElement<Location> ) value);
    }

    /**
     * Gets the value of the majorRoutesDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getMajorRoutesDestination() {
        return majorRoutesDestination;
    }

    /**
     * Sets the value of the majorRoutesDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setMajorRoutesDestination(JAXBElement<Location> value) {
        this.majorRoutesDestination = ((JAXBElement<Location> ) value);
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MapUriOptions }{@code >}
     *     
     */
    public JAXBElement<MapUriOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MapUriOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<MapUriOptions> value) {
        this.options = ((JAXBElement<MapUriOptions> ) value);
    }

    /**
     * Gets the value of the pushpins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPushpin }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPushpin> getPushpins() {
        return pushpins;
    }

    /**
     * Sets the value of the pushpins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPushpin }{@code >}
     *     
     */
    public void setPushpins(JAXBElement<ArrayOfPushpin> value) {
        this.pushpins = ((JAXBElement<ArrayOfPushpin> ) value);
    }

}
