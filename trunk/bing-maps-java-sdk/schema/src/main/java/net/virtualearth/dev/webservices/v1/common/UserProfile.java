
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class UserProfile
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CurrentHeading", nillable = true)
    protected Heading currentHeading;
    @XmlElement(name = "CurrentLocation", nillable = true)
    protected UserLocation currentLocation;
    @XmlElement(name = "DeviceType")
    protected DeviceType deviceType;
    @XmlElement(name = "DistanceUnit")
    protected DistanceUnit distanceUnit;
    @XmlElement(name = "IPAddress", nillable = true)
    protected String ipAddress;
    @XmlElement(name = "MapView", nillable = true)
    protected ShapeBase mapView;
    @XmlElement(name = "ScreenSize", nillable = true)
    protected SizeOfint screenSize;

    /**
     * Gets the value of the currentHeading property.
     * 
     * @return
     *     possible object is
     *     {@link Heading }
     *     
     */
    public Heading getCurrentHeading() {
        return currentHeading;
    }

    /**
     * Sets the value of the currentHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heading }
     *     
     */
    public void setCurrentHeading(Heading value) {
        this.currentHeading = value;
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link UserLocation }
     *     
     */
    public UserLocation getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLocation }
     *     
     */
    public void setCurrentLocation(UserLocation value) {
        this.currentLocation = value;
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
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the mapView property.
     * 
     * @return
     *     possible object is
     *     {@link ShapeBase }
     *     
     */
    public ShapeBase getMapView() {
        return mapView;
    }

    /**
     * Sets the value of the mapView property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeBase }
     *     
     */
    public void setMapView(ShapeBase value) {
        this.mapView = value;
    }

    /**
     * Gets the value of the screenSize property.
     * 
     * @return
     *     possible object is
     *     {@link SizeOfint }
     *     
     */
    public SizeOfint getScreenSize() {
        return screenSize;
    }

    /**
     * Sets the value of the screenSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeOfint }
     *     
     */
    public void setScreenSize(SizeOfint value) {
        this.screenSize = value;
    }

}
