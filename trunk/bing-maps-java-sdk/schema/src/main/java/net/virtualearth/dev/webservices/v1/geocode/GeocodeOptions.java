
package net.virtualearth.dev.webservices.v1.geocode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeocodeOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeocodeOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Filters" type="{http://dev.virtualearth.net/webservices/v1/geocode}ArrayOfFilterBase" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeOptions", propOrder = {
    "count",
    "filters"
})
public class GeocodeOptions {

    @XmlElementRef(name = "Count", namespace = "http://dev.virtualearth.net/webservices/v1/geocode", type = JAXBElement.class)
    protected JAXBElement<Integer> count;
    @XmlElementRef(name = "Filters", namespace = "http://dev.virtualearth.net/webservices/v1/geocode", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFilterBase> filters;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCount(JAXBElement<Integer> value) {
        this.count = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFilterBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFilterBase> getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFilterBase }{@code >}
     *     
     */
    public void setFilters(JAXBElement<ArrayOfFilterBase> value) {
        this.filters = ((JAXBElement<ArrayOfFilterBase> ) value);
    }

}
