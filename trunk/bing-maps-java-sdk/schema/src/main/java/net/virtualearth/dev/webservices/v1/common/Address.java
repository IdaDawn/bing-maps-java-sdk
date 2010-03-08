
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "addressLine",
    "adminDistrict",
    "countryRegion",
    "district",
    "formattedAddress",
    "locality",
    "postalCode",
    "postalTown"
})
public class Address {

    @XmlElementRef(name = "AddressLine", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> addressLine;
    @XmlElementRef(name = "AdminDistrict", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> adminDistrict;
    @XmlElementRef(name = "CountryRegion", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> countryRegion;
    @XmlElementRef(name = "District", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> district;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "Locality", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> locality;
    @XmlElementRef(name = "PostalCode", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "PostalTown", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> postalTown;

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine(JAXBElement<String> value) {
        this.addressLine = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the adminDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdminDistrict() {
        return adminDistrict;
    }

    /**
     * Sets the value of the adminDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdminDistrict(JAXBElement<String> value) {
        this.adminDistrict = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the countryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryRegion() {
        return countryRegion;
    }

    /**
     * Sets the value of the countryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryRegion(JAXBElement<String> value) {
        this.countryRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrict(JAXBElement<String> value) {
        this.district = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedAddress(JAXBElement<String> value) {
        this.formattedAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocality(JAXBElement<String> value) {
        this.locality = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postalTown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalTown() {
        return postalTown;
    }

    /**
     * Sets the value of the postalTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalTown(JAXBElement<String> value) {
        this.postalTown = ((JAXBElement<String> ) value);
    }

}
