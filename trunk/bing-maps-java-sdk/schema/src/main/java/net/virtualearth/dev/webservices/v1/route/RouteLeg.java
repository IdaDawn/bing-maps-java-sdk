
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
public class RouteLeg {

    @XmlElementRef(name = "ActualEnd", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<Location> actualEnd;
    @XmlElementRef(name = "ActualStart", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<Location> actualStart;
    @XmlElementRef(name = "Itinerary", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<ArrayOfItineraryItem> itinerary;
    @XmlElementRef(name = "Summary", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<RouteSummary> summary;

    /**
     * Gets the value of the actualEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getActualEnd() {
        return actualEnd;
    }

    /**
     * Sets the value of the actualEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setActualEnd(JAXBElement<Location> value) {
        this.actualEnd = ((JAXBElement<Location> ) value);
    }

    /**
     * Gets the value of the actualStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public JAXBElement<Location> getActualStart() {
        return actualStart;
    }

    /**
     * Sets the value of the actualStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Location }{@code >}
     *     
     */
    public void setActualStart(JAXBElement<Location> value) {
        this.actualStart = ((JAXBElement<Location> ) value);
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItineraryItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfItineraryItem> getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfItineraryItem }{@code >}
     *     
     */
    public void setItinerary(JAXBElement<ArrayOfItineraryItem> value) {
        this.itinerary = ((JAXBElement<ArrayOfItineraryItem> ) value);
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

}
