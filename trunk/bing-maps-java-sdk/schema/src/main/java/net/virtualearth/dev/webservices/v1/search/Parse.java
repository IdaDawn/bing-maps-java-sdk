
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Address;


/**
 * <p>Java class for Parse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://dev.virtualearth.net/webservices/v1/common}Address" minOccurs="0"/>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Landmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parse", propOrder = {
    "address",
    "keyword",
    "landmark",
    "locationSeparator"
})
public class Parse {

    @XmlElementRef(name = "Address", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<Address> address;
    @XmlElementRef(name = "Keyword", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> keyword;
    @XmlElementRef(name = "Landmark", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> landmark;
    @XmlElementRef(name = "LocationSeparator", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> locationSeparator;

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
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyword(JAXBElement<String> value) {
        this.keyword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the landmark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLandmark() {
        return landmark;
    }

    /**
     * Sets the value of the landmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLandmark(JAXBElement<String> value) {
        this.landmark = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locationSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationSeparator() {
        return locationSeparator;
    }

    /**
     * Sets the value of the locationSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationSeparator(JAXBElement<String> value) {
        this.locationSeparator = ((JAXBElement<String> ) value);
    }

}
