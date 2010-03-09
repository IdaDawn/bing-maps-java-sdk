
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class ItineraryItem
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CompassDirection", nillable = true)
    protected String compassDirection;
    @XmlElement(name = "Hints", nillable = true)
    protected ArrayOfItineraryItemHint hints;
    @XmlElement(name = "Location", nillable = true)
    protected Location location;
    @XmlElement(name = "ManeuverType")
    protected ManeuverType maneuverType;
    @XmlElement(name = "Summary", nillable = true)
    protected RouteSummary summary;
    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "Warnings", nillable = true)
    protected ArrayOfItineraryItemWarning warnings;

    /**
     * Gets the value of the compassDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompassDirection() {
        return compassDirection;
    }

    /**
     * Sets the value of the compassDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompassDirection(String value) {
        this.compassDirection = value;
    }

    /**
     * Gets the value of the hints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItineraryItemHint }
     *     
     */
    public ArrayOfItineraryItemHint getHints() {
        return hints;
    }

    /**
     * Sets the value of the hints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItineraryItemHint }
     *     
     */
    public void setHints(ArrayOfItineraryItemHint value) {
        this.hints = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
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
     *     {@link RouteSummary }
     *     
     */
    public RouteSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteSummary }
     *     
     */
    public void setSummary(RouteSummary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItineraryItemWarning }
     *     
     */
    public ArrayOfItineraryItemWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItineraryItemWarning }
     *     
     */
    public void setWarnings(ArrayOfItineraryItemWarning value) {
        this.warnings = value;
    }

}
