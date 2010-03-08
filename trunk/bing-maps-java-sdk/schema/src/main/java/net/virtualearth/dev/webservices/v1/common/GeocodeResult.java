
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for GeocodeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeocodeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://dev.virtualearth.net/webservices/v1/common}Address" minOccurs="0"/>
 *         &lt;element name="BestView" type="{http://dev.virtualearth.net/webservices/v1/common}Rectangle" minOccurs="0"/>
 *         &lt;element name="Confidence" type="{http://dev.virtualearth.net/webservices/v1/common}Confidence" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Locations" type="{http://dev.virtualearth.net/webservices/v1/common}ArrayOfGeocodeLocation" minOccurs="0"/>
 *         &lt;element name="MatchCodes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeResult", propOrder = {
    "address",
    "bestView",
    "confidence",
    "displayName",
    "entityType",
    "locations",
    "matchCodes"
})
public class GeocodeResult {

    @XmlElementRef(name = "Address", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "BestView", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<Rectangle> bestView;
    @XmlElement(name = "Confidence")
    protected Confidence confidence;
    @XmlElementRef(name = "DisplayName", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "EntityType", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> entityType;
    @XmlElementRef(name = "Locations", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGeocodeLocation> locations;
    @XmlElementRef(name = "MatchCodes", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> matchCodes;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = ((JAXBElement<Address> ) value);
    }

    /**
     * Gets the value of the bestView property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Rectangle }{@code >}
     *     
     */
    public JAXBElement<Rectangle> getBestView() {
        return bestView;
    }

    /**
     * Sets the value of the bestView property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Rectangle }{@code >}
     *     
     */
    public void setBestView(JAXBElement<Rectangle> value) {
        this.bestView = ((JAXBElement<Rectangle> ) value);
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Confidence }
     *     
     */
    public Confidence getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confidence }
     *     
     */
    public void setConfidence(Confidence value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityType(JAXBElement<String> value) {
        this.entityType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeocodeLocation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGeocodeLocation> getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGeocodeLocation }{@code >}
     *     
     */
    public void setLocations(JAXBElement<ArrayOfGeocodeLocation> value) {
        this.locations = ((JAXBElement<ArrayOfGeocodeLocation> ) value);
    }

    /**
     * Gets the value of the matchCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMatchCodes() {
        return matchCodes;
    }

    /**
     * Sets the value of the matchCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMatchCodes(JAXBElement<ArrayOfstring> value) {
        this.matchCodes = ((JAXBElement<ArrayOfstring> ) value);
    }

}
