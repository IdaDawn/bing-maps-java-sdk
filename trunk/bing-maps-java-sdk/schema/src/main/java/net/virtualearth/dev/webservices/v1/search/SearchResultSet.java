
package net.virtualearth.dev.webservices.v1.search;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class SearchResultSet
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AlternateSearchRegions", nillable = true)
    protected ArrayOfSearchRegion alternateSearchRegions;
    @XmlElement(name = "AvailableFilters", nillable = true)
    protected ArrayOfAvailableFilter availableFilters;
    @XmlElement(name = "CategoryCounts", nillable = true)
    protected ArrayOfCategoryCount categoryCounts;
    @XmlElement(name = "EstimatedMatches")
    protected Integer estimatedMatches;
    @XmlElement(name = "ListingType", nillable = true)
    protected String listingType;
    @XmlElement(name = "Parse", nillable = true)
    protected Parse parse;
    @XmlElement(name = "QueryCategory", nillable = true)
    protected Category queryCategory;
    @XmlElement(name = "QueryCorrected")
    protected Boolean queryCorrected;
    @XmlElement(name = "Results", nillable = true)
    protected ArrayOfSearchResultBase results;
    @XmlElement(name = "SearchRegion", nillable = true)
    protected SearchRegion searchRegion;

    /**
     * Gets the value of the alternateSearchRegions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchRegion }
     *     
     */
    public ArrayOfSearchRegion getAlternateSearchRegions() {
        return alternateSearchRegions;
    }

    /**
     * Sets the value of the alternateSearchRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchRegion }
     *     
     */
    public void setAlternateSearchRegions(ArrayOfSearchRegion value) {
        this.alternateSearchRegions = value;
    }

    /**
     * Gets the value of the availableFilters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailableFilter }
     *     
     */
    public ArrayOfAvailableFilter getAvailableFilters() {
        return availableFilters;
    }

    /**
     * Sets the value of the availableFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailableFilter }
     *     
     */
    public void setAvailableFilters(ArrayOfAvailableFilter value) {
        this.availableFilters = value;
    }

    /**
     * Gets the value of the categoryCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategoryCount }
     *     
     */
    public ArrayOfCategoryCount getCategoryCounts() {
        return categoryCounts;
    }

    /**
     * Sets the value of the categoryCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategoryCount }
     *     
     */
    public void setCategoryCounts(ArrayOfCategoryCount value) {
        this.categoryCounts = value;
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
     *     {@link String }
     *     
     */
    public String getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingType(String value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the parse property.
     * 
     * @return
     *     possible object is
     *     {@link Parse }
     *     
     */
    public Parse getParse() {
        return parse;
    }

    /**
     * Sets the value of the parse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parse }
     *     
     */
    public void setParse(Parse value) {
        this.parse = value;
    }

    /**
     * Gets the value of the queryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getQueryCategory() {
        return queryCategory;
    }

    /**
     * Sets the value of the queryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setQueryCategory(Category value) {
        this.queryCategory = value;
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
     *     {@link ArrayOfSearchResultBase }
     *     
     */
    public ArrayOfSearchResultBase getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchResultBase }
     *     
     */
    public void setResults(ArrayOfSearchResultBase value) {
        this.results = value;
    }

    /**
     * Gets the value of the searchRegion property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRegion }
     *     
     */
    public SearchRegion getSearchRegion() {
        return searchRegion;
    }

    /**
     * Sets the value of the searchRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRegion }
     *     
     */
    public void setSearchRegion(SearchRegion value) {
        this.searchRegion = value;
    }

}
