
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResultSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateSearchRegions" type="{http://dev.virtualearth.net/webservices/v1/search}ArrayOfSearchRegion" minOccurs="0"/>
 *         &lt;element name="AvailableFilters" type="{http://dev.virtualearth.net/webservices/v1/search}ArrayOfAvailableFilter" minOccurs="0"/>
 *         &lt;element name="CategoryCounts" type="{http://dev.virtualearth.net/webservices/v1/search}ArrayOfCategoryCount" minOccurs="0"/>
 *         &lt;element name="EstimatedMatches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parse" type="{http://dev.virtualearth.net/webservices/v1/search}Parse" minOccurs="0"/>
 *         &lt;element name="QueryCategory" type="{http://dev.virtualearth.net/webservices/v1/search}Category" minOccurs="0"/>
 *         &lt;element name="QueryCorrected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://dev.virtualearth.net/webservices/v1/search}ArrayOfSearchResultBase" minOccurs="0"/>
 *         &lt;element name="SearchRegion" type="{http://dev.virtualearth.net/webservices/v1/search}SearchRegion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultSet", propOrder = {
    "alternateSearchRegions",
    "availableFilters",
    "categoryCounts",
    "estimatedMatches",
    "listingType",
    "parse",
    "queryCategory",
    "queryCorrected",
    "results",
    "searchRegion"
})
public class SearchResultSet {

    @XmlElementRef(name = "AlternateSearchRegions", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSearchRegion> alternateSearchRegions;
    @XmlElementRef(name = "AvailableFilters", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAvailableFilter> availableFilters;
    @XmlElementRef(name = "CategoryCounts", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCategoryCount> categoryCounts;
    @XmlElement(name = "EstimatedMatches")
    protected Integer estimatedMatches;
    @XmlElementRef(name = "ListingType", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> listingType;
    @XmlElementRef(name = "Parse", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<Parse> parse;
    @XmlElementRef(name = "QueryCategory", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<Category> queryCategory;
    @XmlElement(name = "QueryCorrected")
    protected Boolean queryCorrected;
    @XmlElementRef(name = "Results", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSearchResultBase> results;
    @XmlElementRef(name = "SearchRegion", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<SearchRegion> searchRegion;

    /**
     * Gets the value of the alternateSearchRegions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchRegion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSearchRegion> getAlternateSearchRegions() {
        return alternateSearchRegions;
    }

    /**
     * Sets the value of the alternateSearchRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchRegion }{@code >}
     *     
     */
    public void setAlternateSearchRegions(JAXBElement<ArrayOfSearchRegion> value) {
        this.alternateSearchRegions = ((JAXBElement<ArrayOfSearchRegion> ) value);
    }

    /**
     * Gets the value of the availableFilters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAvailableFilter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAvailableFilter> getAvailableFilters() {
        return availableFilters;
    }

    /**
     * Sets the value of the availableFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAvailableFilter }{@code >}
     *     
     */
    public void setAvailableFilters(JAXBElement<ArrayOfAvailableFilter> value) {
        this.availableFilters = ((JAXBElement<ArrayOfAvailableFilter> ) value);
    }

    /**
     * Gets the value of the categoryCounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoryCount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCategoryCount> getCategoryCounts() {
        return categoryCounts;
    }

    /**
     * Sets the value of the categoryCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCategoryCount }{@code >}
     *     
     */
    public void setCategoryCounts(JAXBElement<ArrayOfCategoryCount> value) {
        this.categoryCounts = ((JAXBElement<ArrayOfCategoryCount> ) value);
    }

    /**
     * Gets the value of the estimatedMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedMatches() {
        return estimatedMatches;
    }

    /**
     * Sets the value of the estimatedMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedMatches(Integer value) {
        this.estimatedMatches = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setListingType(JAXBElement<String> value) {
        this.listingType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parse }{@code >}
     *     
     */
    public JAXBElement<Parse> getParse() {
        return parse;
    }

    /**
     * Sets the value of the parse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parse }{@code >}
     *     
     */
    public void setParse(JAXBElement<Parse> value) {
        this.parse = ((JAXBElement<Parse> ) value);
    }

    /**
     * Gets the value of the queryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Category }{@code >}
     *     
     */
    public JAXBElement<Category> getQueryCategory() {
        return queryCategory;
    }

    /**
     * Sets the value of the queryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Category }{@code >}
     *     
     */
    public void setQueryCategory(JAXBElement<Category> value) {
        this.queryCategory = ((JAXBElement<Category> ) value);
    }

    /**
     * Gets the value of the queryCorrected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryCorrected() {
        return queryCorrected;
    }

    /**
     * Sets the value of the queryCorrected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryCorrected(Boolean value) {
        this.queryCorrected = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchResultBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSearchResultBase> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchResultBase }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfSearchResultBase> value) {
        this.results = ((JAXBElement<ArrayOfSearchResultBase> ) value);
    }

    /**
     * Gets the value of the searchRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchRegion }{@code >}
     *     
     */
    public JAXBElement<SearchRegion> getSearchRegion() {
        return searchRegion;
    }

    /**
     * Sets the value of the searchRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchRegion }{@code >}
     *     
     */
    public void setSearchRegion(JAXBElement<SearchRegion> value) {
        this.searchRegion = ((JAXBElement<SearchRegion> ) value);
    }

}
