
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import net.virtualearth.dev.webservices.v1.common.ArrayOfGeocodeLocation;
import net.virtualearth.dev.webservices.v1.common.Confidence;


/**
 * <p>Java class for LocationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Confidence" type="{http://dev.virtualearth.net/webservices/v1/common}Confidence" minOccurs="0"/>
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
@XmlType(name = "LocationData", propOrder = {
    "confidence",
    "locations",
    "matchCodes"
})
public class LocationData {

    @XmlElement(name = "Confidence")
    protected Confidence confidence;
    @XmlElementRef(name = "Locations", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGeocodeLocation> locations;
    @XmlElementRef(name = "MatchCodes", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> matchCodes;

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
