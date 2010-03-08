
package net.virtualearth.dev.webservices.v1.geocode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Address;
import net.virtualearth.dev.webservices.v1.common.RequestBase;


/**
 * <p>Java class for GeocodeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeocodeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://dev.virtualearth.net/webservices/v1/common}Address" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://dev.virtualearth.net/webservices/v1/geocode}GeocodeOptions" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeRequest", propOrder = {
    "address",
    "options",
    "query"
})
public class GeocodeRequest
    extends RequestBase
{

    @XmlElementRef(name = "Address", namespace = "http://dev.virtualearth.net/webservices/v1/geocode", type = JAXBElement.class)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "Options", namespace = "http://dev.virtualearth.net/webservices/v1/geocode", type = JAXBElement.class)
    protected JAXBElement<GeocodeOptions> options;
    @XmlElementRef(name = "Query", namespace = "http://dev.virtualearth.net/webservices/v1/geocode", type = JAXBElement.class)
    protected JAXBElement<String> query;

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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}
     *     
     */
    public JAXBElement<GeocodeOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<GeocodeOptions> value) {
        this.options = ((JAXBElement<GeocodeOptions> ) value);
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuery(JAXBElement<String> value) {
        this.query = ((JAXBElement<String> ) value);
    }

}
