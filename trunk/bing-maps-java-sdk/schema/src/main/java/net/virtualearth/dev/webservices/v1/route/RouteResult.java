
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Legs" type="{http://dev.virtualearth.net/webservices/v1/route}ArrayOfRouteLeg" minOccurs="0"/>
 *         &lt;element name="RoutePath" type="{http://dev.virtualearth.net/webservices/v1/route}RoutePath" minOccurs="0"/>
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
@XmlType(name = "RouteResult", propOrder = {
    "legs",
    "routePath",
    "summary"
})
public class RouteResult {

    @XmlElementRef(name = "Legs", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRouteLeg> legs;
    @XmlElementRef(name = "RoutePath", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<RoutePath> routePath;
    @XmlElementRef(name = "Summary", namespace = "http://dev.virtualearth.net/webservices/v1/route", type = JAXBElement.class)
    protected JAXBElement<RouteSummary> summary;

    /**
     * Gets the value of the legs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteLeg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteLeg> getLegs() {
        return legs;
    }

    /**
     * Sets the value of the legs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteLeg }{@code >}
     *     
     */
    public void setLegs(JAXBElement<ArrayOfRouteLeg> value) {
        this.legs = ((JAXBElement<ArrayOfRouteLeg> ) value);
    }

    /**
     * Gets the value of the routePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePath }{@code >}
     *     
     */
    public JAXBElement<RoutePath> getRoutePath() {
        return routePath;
    }

    /**
     * Sets the value of the routePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePath }{@code >}
     *     
     */
    public void setRoutePath(JAXBElement<RoutePath> value) {
        this.routePath = ((JAXBElement<RoutePath> ) value);
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
