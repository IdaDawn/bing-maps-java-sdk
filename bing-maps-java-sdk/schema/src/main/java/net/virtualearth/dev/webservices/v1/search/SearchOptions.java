
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.FilterExpressionBase;


/**
 * <p>Java class for SearchOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutocorrectQuery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Filters" type="{http://dev.virtualearth.net/webservices/v1/common}FilterExpressionBase" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{http://dev.virtualearth.net/webservices/v1/search}ListingType" minOccurs="0"/>
 *         &lt;element name="ParseOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://dev.virtualearth.net/webservices/v1/search}SortOrder" minOccurs="0"/>
 *         &lt;element name="StartingIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOptions", propOrder = {
    "autocorrectQuery",
    "count",
    "filters",
    "listingType",
    "parseOnly",
    "radius",
    "sortOrder",
    "startingIndex"
})
public class SearchOptions {

    @XmlElementRef(name = "AutocorrectQuery", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<Boolean> autocorrectQuery;
    @XmlElementRef(name = "Count", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<Integer> count;
    @XmlElementRef(name = "Filters", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<FilterExpressionBase> filters;
    @XmlElement(name = "ListingType")
    protected ListingType listingType;
    @XmlElement(name = "ParseOnly")
    protected Boolean parseOnly;
    @XmlElementRef(name = "Radius", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<Double> radius;
    @XmlElement(name = "SortOrder")
    protected SortOrder sortOrder;
    @XmlElement(name = "StartingIndex")
    protected Integer startingIndex;

    /**
     * Gets the value of the autocorrectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutocorrectQuery() {
        return autocorrectQuery;
    }

    /**
     * Sets the value of the autocorrectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutocorrectQuery(JAXBElement<Boolean> value) {
        this.autocorrectQuery = ((JAXBElement<Boolean> ) value);
    }

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
     *     {@link JAXBElement }{@code <}{@link FilterExpressionBase }{@code >}
     *     
     */
    public JAXBElement<FilterExpressionBase> getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilterExpressionBase }{@code >}
     *     
     */
    public void setFilters(JAXBElement<FilterExpressionBase> value) {
        this.filters = ((JAXBElement<FilterExpressionBase> ) value);
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingType }
     *     
     */
    public ListingType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingType }
     *     
     */
    public void setListingType(ListingType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the parseOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParseOnly() {
        return parseOnly;
    }

    /**
     * Sets the value of the parseOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParseOnly(Boolean value) {
        this.parseOnly = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadius(JAXBElement<Double> value) {
        this.radius = ((JAXBElement<Double> ) value);
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the startingIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingIndex() {
        return startingIndex;
    }

    /**
     * Sets the value of the startingIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingIndex(Integer value) {
        this.startingIndex = value;
    }

}
