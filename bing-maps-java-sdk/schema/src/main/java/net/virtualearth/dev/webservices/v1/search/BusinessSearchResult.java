
package net.virtualearth.dev.webservices.v1.search;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import net.virtualearth.dev.webservices.v1.common.Address;


/**
 * <p>Java class for BusinessSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/search}SearchResultBase">
 *       &lt;sequence>
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://dev.virtualearth.net/webservices/v1/common}Address" minOccurs="0"/>
 *         &lt;element name="Categories" type="{http://dev.virtualearth.net/webservices/v1/search}ArrayOfCategory" minOccurs="0"/>
 *         &lt;element name="CategorySpecificProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9q_P9s" minOccurs="0"/>
 *         &lt;element name="Neighborhoods" type="{http://dev.virtualearth.net/webservices/v1/search}ArrayOfNeighborhood" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserRating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSearchResult", propOrder = {
    "additionalProperties",
    "address",
    "categories",
    "categorySpecificProperties",
    "neighborhoods",
    "phoneNumber",
    "ratingCount",
    "reviewCount",
    "userRating",
    "website"
})
public class BusinessSearchResult
    extends SearchResultBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AdditionalProperties", nillable = true)
    protected ArrayOfKeyValueOfstringanyType additionalProperties;
    @XmlElement(name = "Address", nillable = true)
    protected Address address;
    @XmlElement(name = "Categories", nillable = true)
    protected ArrayOfCategory categories;
    @XmlElement(name = "CategorySpecificProperties", nillable = true)
    protected ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S categorySpecificProperties;
    @XmlElement(name = "Neighborhoods", nillable = true)
    protected ArrayOfNeighborhood neighborhoods;
    @XmlElement(name = "PhoneNumber", nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "RatingCount")
    protected Integer ratingCount;
    @XmlElement(name = "ReviewCount")
    protected Integer reviewCount;
    @XmlElement(name = "UserRating")
    protected Double userRating;
    @XmlElement(name = "Website", nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String website;

    /**
     * Gets the value of the additionalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public ArrayOfKeyValueOfstringanyType getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Sets the value of the additionalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringanyType }
     *     
     */
    public void setAdditionalProperties(ArrayOfKeyValueOfstringanyType value) {
        this.additionalProperties = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *     
     */
    public ArrayOfCategory getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *     
     */
    public void setCategories(ArrayOfCategory value) {
        this.categories = value;
    }

    /**
     * Gets the value of the categorySpecificProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S }
     *     
     */
    public ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S getCategorySpecificProperties() {
        return categorySpecificProperties;
    }

    /**
     * Sets the value of the categorySpecificProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S }
     *     
     */
    public void setCategorySpecificProperties(ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S value) {
        this.categorySpecificProperties = value;
    }

    /**
     * Gets the value of the neighborhoods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNeighborhood }
     *     
     */
    public ArrayOfNeighborhood getNeighborhoods() {
        return neighborhoods;
    }

    /**
     * Sets the value of the neighborhoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNeighborhood }
     *     
     */
    public void setNeighborhoods(ArrayOfNeighborhood value) {
        this.neighborhoods = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the ratingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingCount() {
        return ratingCount;
    }

    /**
     * Sets the value of the ratingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingCount(Integer value) {
        this.ratingCount = value;
    }

    /**
     * Gets the value of the reviewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * Sets the value of the reviewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewCount(Integer value) {
        this.reviewCount = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUserRating(Double value) {
        this.userRating = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

}
