
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Location;


/**
 * <p>Java class for ItineraryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompassDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hints" type="{http://dev.virtualearth.net/webservices/v1/route}ArrayOfItineraryItemHint" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="ManeuverType" type="{http://dev.virtualearth.net/webservices/v1/route}ManeuverType" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://dev.virtualearth.net/webservices/v1/route}RouteSummary" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{http://dev.virtualearth.net/webservices/v1/route}ArrayOfItineraryItemWarning" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItem", propOrder = {
    "compassDirection",
    "hints",
    "location",
    "maneuverType",
    "summary",
    "text",
    "warnings"
})
public class ItineraryItem {

    @XmlElementRef(name = "CompassDirection", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<String> compassDirection;
    @XmlElementRef(name = "Hints", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<ArrayOfItineraryItemHint> hints;
    @XmlElementRef(name = "Location", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<Location> location;
    @XmlElement(name = "ManeuverType")
    protected ManeuverType maneuverType;
    @XmlElementRef(name = "Summary", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<RouteSummary> summary;
    @XmlElementRef(name = "Text", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "Warnings", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<ArrayOfItineraryItemWarning> warnings;

    /**
     * Gets the value of the compassDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompassDirection() {
        return compassDirection;
    }

    /**
     * Sets the value of the compassDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompassDirection(JAXBElement<String> value) {
        this.compassDirection = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemHint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItineraryItemHint> getHints() {
        return hints;
    }

    /**
     * Sets the value of the hints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemHint }{@code >}
     *     
     */
    public void setHints(JAXBElement<ArrayOfItineraryItemHint> value) {
        this.hints = ((JAXBElement<ArrayOfItineraryItemHint> ) value);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setLocation(JAXBElement<Location> value) {
        this.location = ((JAXBElement<Location> ) value);
    }

    /**
     * Gets the value of the maneuverType property.
     * 
     * @return
     *     possible object is
     *     {@link ManeuverType }
     *     
     */
    public ManeuverType getManeuverType() {
        return maneuverType;
    }

    /**
     * Sets the value of the maneuverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManeuverType }
     *     
     */
    public void setManeuverType(ManeuverType value) {
        this.maneuverType = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteSummary }{@code >}
     *     
     */
    public JAXBElement<RouteSummary> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteSummary }{@code >}
     *     
     */
    public void setSummary(JAXBElement<RouteSummary> value) {
        this.summary = ((JAXBElement<RouteSummary> ) value);
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemWarning }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItineraryItemWarning> getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemWarning }{@code >}
     *     
     */
    public void setWarnings(JAXBElement<ArrayOfItineraryItemWarning> value) {
        this.warnings = ((JAXBElement<ArrayOfItineraryItemWarning> ) value);
    }

}
