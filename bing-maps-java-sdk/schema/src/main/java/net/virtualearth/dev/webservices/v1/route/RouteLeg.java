
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Location;


/**
 * <p>Java class for RouteLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteLeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualEnd" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="ActualStart" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="Itinerary" type="{http://dev.virtualearth.net/webservices/v1/route}ArrayOfItineraryItem" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://dev.virtualearth.net/webservices/v1/route}RouteSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLeg", propOrder = {
    "actualEnd",
    "actualStart",
    "itinerary",
    "summary"
})
public class RouteLeg
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ActualEnd", nillable = true)
    protected Location actualEnd;
    @XmlElement(name = "ActualStart", nillable = true)
    protected Location actualStart;
    @XmlElement(name = "Itinerary", nillable = true)
    protected ArrayOfItineraryItem itinerary;
    @XmlElement(name = "Summary", nillable = true)
    protected RouteSummary summary;

    /**
     * Gets the value of the actualEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getActualEnd() {
        return actualEnd;
    }

    /**
     * Sets the value of the actualEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setActualEnd(Location value) {
        this.actualEnd = value;
    }

    /**
     * Gets the value of the actualStart property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getActualStart() {
        return actualStart;
    }

    /**
     * Sets the value of the actualStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setActualStart(Location value) {
        this.actualStart = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItineraryItem }
     *     
     */
    public ArrayOfItineraryItem getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItineraryItem }
     *     
     */
    public void setItinerary(ArrayOfItineraryItem value) {
        this.itinerary = value;
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

}
