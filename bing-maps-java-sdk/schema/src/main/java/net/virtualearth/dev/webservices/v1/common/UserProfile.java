
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentHeading" type="{http://dev.virtualearth.net/webservices/v1/common}Heading" minOccurs="0"/>
 *         &lt;element name="CurrentLocation" type="{http://dev.virtualearth.net/webservices/v1/common}UserLocation" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{http://dev.virtualearth.net/webservices/v1/common}DeviceType" minOccurs="0"/>
 *         &lt;element name="DistanceUnit" type="{http://dev.virtualearth.net/webservices/v1/common}DistanceUnit" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapView" type="{http://dev.virtualearth.net/webservices/v1/common}ShapeBase" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{http://dev.virtualearth.net/webservices/v1/common}SizeOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfile", propOrder = {
    "currentHeading",
    "currentLocation",
    "deviceType",
    "distanceUnit",
    "ipAddress",
    "mapView",
    "screenSize"
})
public class UserProfile {

    @XmlElementRef(name = "CurrentHeading", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<Heading> currentHeading;
    @XmlElementRef(name = "CurrentLocation", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<UserLocation> currentLocation;
    @XmlElement(name = "DeviceType")
    protected DeviceType deviceType;
    @XmlElement(name = "DistanceUnit")
    protected DistanceUnit distanceUnit;
    @XmlElementRef(name = "IPAddress", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> ipAddress;
    @XmlElementRef(name = "MapView", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<ShapeBase> mapView;
    @XmlElementRef(name = "ScreenSize", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<SizeOfint> screenSize;

    /**
     * Gets the value of the currentHeading property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Heading }{@code >}
     *     
     */
    public JAXBElement<Heading> getCurrentHeading() {
        return currentHeading;
    }

    /**
     * Sets the value of the currentHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Heading }{@code >}
     *     
     */
    public void setCurrentHeading(JAXBElement<Heading> value) {
        this.currentHeading = ((JAXBElement<Heading> ) value);
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserLocation }{@code >}
     *     
     */
    public JAXBElement<UserLocation> getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserLocation }{@code >}
     *     
     */
    public void setCurrentLocation(JAXBElement<UserLocation> value) {
        this.currentLocation = ((JAXBElement<UserLocation> ) value);
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDeviceType(DeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnit }
     *     
     */
    public DistanceUnit getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnit }
     *     
     */
    public void setDistanceUnit(DistanceUnit value) {
        this.distanceUnit = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIPAddress(JAXBElement<String> value) {
        this.ipAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mapView property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShapeBase }{@code >}
     *     
     */
    public JAXBElement<ShapeBase> getMapView() {
        return mapView;
    }

    /**
     * Sets the value of the mapView property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShapeBase }{@code >}
     *     
     */
    public void setMapView(JAXBElement<ShapeBase> value) {
        this.mapView = ((JAXBElement<ShapeBase> ) value);
    }

    /**
     * Gets the value of the screenSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}
     *     
     */
    public JAXBElement<SizeOfint> getScreenSize() {
        return screenSize;
    }

    /**
     * Sets the value of the screenSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}
     *     
     */
    public void setScreenSize(JAXBElement<SizeOfint> value) {
        this.screenSize = ((JAXBElement<SizeOfint> ) value);
    }

}
