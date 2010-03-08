
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import net.virtualearth.dev.webservices.v1.common.Address;
import net.virtualearth.dev.webservices.v1.common.ArrayOfGeocodeLocation;
import net.virtualearth.dev.webservices.v1.common.FilterExpressionBase;
import net.virtualearth.dev.webservices.v1.common.GeocodeResult;
import net.virtualearth.dev.webservices.v1.common.ShapeBase;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.search package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfCategoryCount_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ArrayOfCategoryCount");
    private final static QName _ArrayOfSearchResultSet_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ArrayOfSearchResultSet");
    private final static QName _SearchRegion_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SearchRegion");
    private final static QName _ValueListFilter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ValueListFilter");
    private final static QName _ArrayOfNeighborhood_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ArrayOfNeighborhood");
    private final static QName _SearchRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SearchRequest");
    private final static QName _AvailableFilter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "AvailableFilter");
    private final static QName _QuerySuggestion_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "QuerySuggestion");
    private final static QName _PersonSearchResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "PersonSearchResult");
    private final static QName _RangeFilter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "RangeFilter");
    private final static QName _ArrayOfSearchRegion_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ArrayOfSearchRegion");
    private final static QName _SearchResultSet_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SearchResultSet");
    private final static QName _FilterValue_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "FilterValue");
    private final static QName _CategorySpecificPropertySet_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "CategorySpecificPropertySet");
    private final static QName _ArrayOfAvailableFilter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ArrayOfAvailableFilter");
    private final static QName _SortOrder_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SortOrder");
    private final static QName _CategoryCount_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "CategoryCount");
    private final static QName _BusinessSearchResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "BusinessSearchResult");
    private final static QName _Category_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Category");
    private final static QName _Parse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Parse");
    private final static QName _ArrayOfSearchResultBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ArrayOfSearchResultBase");
    private final static QName _ListingType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ListingType");
    private final static QName _LocationData_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "LocationData");
    private final static QName _CommunityContentSearchResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "CommunityContentSearchResult");
    private final static QName _StructuredSearchQuery_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "StructuredSearchQuery");
    private final static QName _Neighborhood_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Neighborhood");
    private final static QName _SearchResultBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SearchResultBase");
    private final static QName _SearchOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SearchOptions");
    private final static QName _ArrayOfCategory_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ArrayOfCategory");
    private final static QName _SearchResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SearchResponse");
    private final static QName _SearchResultSetQueryCategory_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "QueryCategory");
    private final static QName _SearchResultSetAvailableFilters_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "AvailableFilters");
    private final static QName _SearchResultSetResults_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Results");
    private final static QName _SearchResultSetCategoryCounts_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "CategoryCounts");
    private final static QName _SearchResultSetAlternateSearchRegions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "AlternateSearchRegions");
    private final static QName _ValueListFilterValues_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Values");
    private final static QName _CommunityContentSearchResultDescription_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Description");
    private final static QName _CommunityContentSearchResultAdditionalProperties_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "AdditionalProperties");
    private final static QName _CategoryCountCountByNeighborhood_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "CountByNeighborhood");
    private final static QName _LocationDataLocations_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Locations");
    private final static QName _LocationDataMatchCodes_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "MatchCodes");
    private final static QName _SearchRequestStructuredQuery_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "StructuredQuery");
    private final static QName _SearchRequestQuery_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Query");
    private final static QName _PersonSearchResultAddress_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Address");
    private final static QName _PersonSearchResultPhoneNumber_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "PhoneNumber");
    private final static QName _CategorySpecificPropertySetCategoryName_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "CategoryName");
    private final static QName _CategorySpecificPropertySetProperties_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Properties");
    private final static QName _SearchResultBaseName_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Name");
    private final static QName _SearchResultBaseId_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Id");
    private final static QName _RangeFilterMaximumValue_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "MaximumValue");
    private final static QName _RangeFilterMinimumValue_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "MinimumValue");
    private final static QName _SearchOptionsCount_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Count");
    private final static QName _SearchOptionsFilters_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Filters");
    private final static QName _SearchOptionsRadius_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Radius");
    private final static QName _SearchOptionsAutocorrectQuery_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "AutocorrectQuery");
    private final static QName _BusinessSearchResultWebsite_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Website");
    private final static QName _BusinessSearchResultNeighborhoods_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Neighborhoods");
    private final static QName _BusinessSearchResultCategorySpecificProperties_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "CategorySpecificProperties");
    private final static QName _BusinessSearchResultCategories_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Categories");
    private final static QName _SearchRegionSource_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Source");
    private final static QName _SearchRegionGeocodeLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "GeocodeLocation");
    private final static QName _SearchRegionBoundingArea_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "BoundingArea");
    private final static QName _StructuredSearchQueryKeyword_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Keyword");
    private final static QName _StructuredSearchQueryLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Location");
    private final static QName _ParseLandmark_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Landmark");
    private final static QName _ParseLocationSeparator_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "LocationSeparator");
    private final static QName _AvailableFilterPropertyName_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "PropertyName");
    private final static QName _NeighborhoodCity_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "City");
    private final static QName _SearchResponseResultSets_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "ResultSets");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.search
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchResultSet }
     * 
     */
    public SearchResultSet createSearchResultSet() {
        return new SearchResultSet();
    }

    /**
     * Create an instance of {@link CommunityContentSearchResult }
     * 
     */
    public CommunityContentSearchResult createCommunityContentSearchResult() {
        return new CommunityContentSearchResult();
    }

    /**
     * Create an instance of {@link ArrayOfSearchResultSet }
     * 
     */
    public ArrayOfSearchResultSet createArrayOfSearchResultSet() {
        return new ArrayOfSearchResultSet();
    }

    /**
     * Create an instance of {@link LocationData }
     * 
     */
    public LocationData createLocationData() {
        return new LocationData();
    }

    /**
     * Create an instance of {@link ArrayOfSearchRegion }
     * 
     */
    public ArrayOfSearchRegion createArrayOfSearchRegion() {
        return new ArrayOfSearchRegion();
    }

    /**
     * Create an instance of {@link CategoryCount }
     * 
     */
    public CategoryCount createCategoryCount() {
        return new CategoryCount();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link CategorySpecificPropertySet }
     * 
     */
    public CategorySpecificPropertySet createCategorySpecificPropertySet() {
        return new CategorySpecificPropertySet();
    }

    /**
     * Create an instance of {@link SearchResultBase }
     * 
     */
    public SearchResultBase createSearchResultBase() {
        return new SearchResultBase();
    }

    /**
     * Create an instance of {@link RangeFilter }
     * 
     */
    public RangeFilter createRangeFilter() {
        return new RangeFilter();
    }

    /**
     * Create an instance of {@link BusinessSearchResult }
     * 
     */
    public BusinessSearchResult createBusinessSearchResult() {
        return new BusinessSearchResult();
    }

    /**
     * Create an instance of {@link QuerySuggestion }
     * 
     */
    public QuerySuggestion createQuerySuggestion() {
        return new QuerySuggestion();
    }

    /**
     * Create an instance of {@link Parse }
     * 
     */
    public Parse createParse() {
        return new Parse();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ArrayOfAvailableFilter }
     * 
     */
    public ArrayOfAvailableFilter createArrayOfAvailableFilter() {
        return new ArrayOfAvailableFilter();
    }

    /**
     * Create an instance of {@link ValueListFilter }
     * 
     */
    public ValueListFilter createValueListFilter() {
        return new ValueListFilter();
    }

    /**
     * Create an instance of {@link PersonSearchResult }
     * 
     */
    public PersonSearchResult createPersonSearchResult() {
        return new PersonSearchResult();
    }

    /**
     * Create an instance of {@link ArrayOfCategoryCount }
     * 
     */
    public ArrayOfCategoryCount createArrayOfCategoryCount() {
        return new ArrayOfCategoryCount();
    }

    /**
     * Create an instance of {@link ArrayOfSearchResultBase }
     * 
     */
    public ArrayOfSearchResultBase createArrayOfSearchResultBase() {
        return new ArrayOfSearchResultBase();
    }

    /**
     * Create an instance of {@link SearchOptions }
     * 
     */
    public SearchOptions createSearchOptions() {
        return new SearchOptions();
    }

    /**
     * Create an instance of {@link SearchRegion }
     * 
     */
    public SearchRegion createSearchRegion() {
        return new SearchRegion();
    }

    /**
     * Create an instance of {@link StructuredSearchQuery }
     * 
     */
    public StructuredSearchQuery createStructuredSearchQuery() {
        return new StructuredSearchQuery();
    }

    /**
     * Create an instance of {@link AvailableFilter }
     * 
     */
    public AvailableFilter createAvailableFilter() {
        return new AvailableFilter();
    }

    /**
     * Create an instance of {@link Neighborhood }
     * 
     */
    public Neighborhood createNeighborhood() {
        return new Neighborhood();
    }

    /**
     * Create an instance of {@link ArrayOfNeighborhood }
     * 
     */
    public ArrayOfNeighborhood createArrayOfNeighborhood() {
        return new ArrayOfNeighborhood();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCategory }
     * 
     */
    public ArrayOfCategory createArrayOfCategory() {
        return new ArrayOfCategory();
    }

    /**
     * Create an instance of {@link FilterValue }
     * 
     */
    public FilterValue createFilterValue() {
        return new FilterValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoryCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ArrayOfCategoryCount")
    public JAXBElement<ArrayOfCategoryCount> createArrayOfCategoryCount(ArrayOfCategoryCount value) {
        return new JAXBElement<ArrayOfCategoryCount>(_ArrayOfCategoryCount_QNAME, ArrayOfCategoryCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResultSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ArrayOfSearchResultSet")
    public JAXBElement<ArrayOfSearchResultSet> createArrayOfSearchResultSet(ArrayOfSearchResultSet value) {
        return new JAXBElement<ArrayOfSearchResultSet>(_ArrayOfSearchResultSet_QNAME, ArrayOfSearchResultSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchRegion")
    public JAXBElement<SearchRegion> createSearchRegion(SearchRegion value) {
        return new JAXBElement<SearchRegion>(_SearchRegion_QNAME, SearchRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueListFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ValueListFilter")
    public JAXBElement<ValueListFilter> createValueListFilter(ValueListFilter value) {
        return new JAXBElement<ValueListFilter>(_ValueListFilter_QNAME, ValueListFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNeighborhood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ArrayOfNeighborhood")
    public JAXBElement<ArrayOfNeighborhood> createArrayOfNeighborhood(ArrayOfNeighborhood value) {
        return new JAXBElement<ArrayOfNeighborhood>(_ArrayOfNeighborhood_QNAME, ArrayOfNeighborhood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchRequest")
    public JAXBElement<SearchRequest> createSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchRequest_QNAME, SearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "AvailableFilter")
    public JAXBElement<AvailableFilter> createAvailableFilter(AvailableFilter value) {
        return new JAXBElement<AvailableFilter>(_AvailableFilter_QNAME, AvailableFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "QuerySuggestion")
    public JAXBElement<QuerySuggestion> createQuerySuggestion(QuerySuggestion value) {
        return new JAXBElement<QuerySuggestion>(_QuerySuggestion_QNAME, QuerySuggestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "PersonSearchResult")
    public JAXBElement<PersonSearchResult> createPersonSearchResult(PersonSearchResult value) {
        return new JAXBElement<PersonSearchResult>(_PersonSearchResult_QNAME, PersonSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "RangeFilter")
    public JAXBElement<RangeFilter> createRangeFilter(RangeFilter value) {
        return new JAXBElement<RangeFilter>(_RangeFilter_QNAME, RangeFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ArrayOfSearchRegion")
    public JAXBElement<ArrayOfSearchRegion> createArrayOfSearchRegion(ArrayOfSearchRegion value) {
        return new JAXBElement<ArrayOfSearchRegion>(_ArrayOfSearchRegion_QNAME, ArrayOfSearchRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResultSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchResultSet")
    public JAXBElement<SearchResultSet> createSearchResultSet(SearchResultSet value) {
        return new JAXBElement<SearchResultSet>(_SearchResultSet_QNAME, SearchResultSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "FilterValue")
    public JAXBElement<FilterValue> createFilterValue(FilterValue value) {
        return new JAXBElement<FilterValue>(_FilterValue_QNAME, FilterValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorySpecificPropertySet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "CategorySpecificPropertySet")
    public JAXBElement<CategorySpecificPropertySet> createCategorySpecificPropertySet(CategorySpecificPropertySet value) {
        return new JAXBElement<CategorySpecificPropertySet>(_CategorySpecificPropertySet_QNAME, CategorySpecificPropertySet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAvailableFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ArrayOfAvailableFilter")
    public JAXBElement<ArrayOfAvailableFilter> createArrayOfAvailableFilter(ArrayOfAvailableFilter value) {
        return new JAXBElement<ArrayOfAvailableFilter>(_ArrayOfAvailableFilter_QNAME, ArrayOfAvailableFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<SortOrder>(_SortOrder_QNAME, SortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "CategoryCount")
    public JAXBElement<CategoryCount> createCategoryCount(CategoryCount value) {
        return new JAXBElement<CategoryCount>(_CategoryCount_QNAME, CategoryCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "BusinessSearchResult")
    public JAXBElement<BusinessSearchResult> createBusinessSearchResult(BusinessSearchResult value) {
        return new JAXBElement<BusinessSearchResult>(_BusinessSearchResult_QNAME, BusinessSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Parse")
    public JAXBElement<Parse> createParse(Parse value) {
        return new JAXBElement<Parse>(_Parse_QNAME, Parse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResultBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ArrayOfSearchResultBase")
    public JAXBElement<ArrayOfSearchResultBase> createArrayOfSearchResultBase(ArrayOfSearchResultBase value) {
        return new JAXBElement<ArrayOfSearchResultBase>(_ArrayOfSearchResultBase_QNAME, ArrayOfSearchResultBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ListingType")
    public JAXBElement<ListingType> createListingType(ListingType value) {
        return new JAXBElement<ListingType>(_ListingType_QNAME, ListingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "LocationData")
    public JAXBElement<LocationData> createLocationData(LocationData value) {
        return new JAXBElement<LocationData>(_LocationData_QNAME, LocationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunityContentSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "CommunityContentSearchResult")
    public JAXBElement<CommunityContentSearchResult> createCommunityContentSearchResult(CommunityContentSearchResult value) {
        return new JAXBElement<CommunityContentSearchResult>(_CommunityContentSearchResult_QNAME, CommunityContentSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredSearchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "StructuredSearchQuery")
    public JAXBElement<StructuredSearchQuery> createStructuredSearchQuery(StructuredSearchQuery value) {
        return new JAXBElement<StructuredSearchQuery>(_StructuredSearchQuery_QNAME, StructuredSearchQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Neighborhood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Neighborhood")
    public JAXBElement<Neighborhood> createNeighborhood(Neighborhood value) {
        return new JAXBElement<Neighborhood>(_Neighborhood_QNAME, Neighborhood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResultBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchResultBase")
    public JAXBElement<SearchResultBase> createSearchResultBase(SearchResultBase value) {
        return new JAXBElement<SearchResultBase>(_SearchResultBase_QNAME, SearchResultBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchOptions")
    public JAXBElement<SearchOptions> createSearchOptions(SearchOptions value) {
        return new JAXBElement<SearchOptions>(_SearchOptions_QNAME, SearchOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ArrayOfCategory")
    public JAXBElement<ArrayOfCategory> createArrayOfCategory(ArrayOfCategory value) {
        return new JAXBElement<ArrayOfCategory>(_ArrayOfCategory_QNAME, ArrayOfCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Parse", scope = SearchResultSet.class)
    public JAXBElement<Parse> createSearchResultSetParse(Parse value) {
        return new JAXBElement<Parse>(_Parse_QNAME, Parse.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "QueryCategory", scope = SearchResultSet.class)
    public JAXBElement<Category> createSearchResultSetQueryCategory(Category value) {
        return new JAXBElement<Category>(_SearchResultSetQueryCategory_QNAME, Category.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ListingType", scope = SearchResultSet.class)
    public JAXBElement<String> createSearchResultSetListingType(String value) {
        return new JAXBElement<String>(_ListingType_QNAME, String.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAvailableFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "AvailableFilters", scope = SearchResultSet.class)
    public JAXBElement<ArrayOfAvailableFilter> createSearchResultSetAvailableFilters(ArrayOfAvailableFilter value) {
        return new JAXBElement<ArrayOfAvailableFilter>(_SearchResultSetAvailableFilters_QNAME, ArrayOfAvailableFilter.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchRegion", scope = SearchResultSet.class)
    public JAXBElement<SearchRegion> createSearchResultSetSearchRegion(SearchRegion value) {
        return new JAXBElement<SearchRegion>(_SearchRegion_QNAME, SearchRegion.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResultBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Results", scope = SearchResultSet.class)
    public JAXBElement<ArrayOfSearchResultBase> createSearchResultSetResults(ArrayOfSearchResultBase value) {
        return new JAXBElement<ArrayOfSearchResultBase>(_SearchResultSetResults_QNAME, ArrayOfSearchResultBase.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoryCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "CategoryCounts", scope = SearchResultSet.class)
    public JAXBElement<ArrayOfCategoryCount> createSearchResultSetCategoryCounts(ArrayOfCategoryCount value) {
        return new JAXBElement<ArrayOfCategoryCount>(_SearchResultSetCategoryCounts_QNAME, ArrayOfCategoryCount.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "AlternateSearchRegions", scope = SearchResultSet.class)
    public JAXBElement<ArrayOfSearchRegion> createSearchResultSetAlternateSearchRegions(ArrayOfSearchRegion value) {
        return new JAXBElement<ArrayOfSearchRegion>(_SearchResultSetAlternateSearchRegions_QNAME, ArrayOfSearchRegion.class, SearchResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Values", scope = ValueListFilter.class)
    public JAXBElement<ArrayOfanyType> createValueListFilterValues(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ValueListFilterValues_QNAME, ArrayOfanyType.class, ValueListFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Description", scope = CommunityContentSearchResult.class)
    public JAXBElement<String> createCommunityContentSearchResultDescription(String value) {
        return new JAXBElement<String>(_CommunityContentSearchResultDescription_QNAME, String.class, CommunityContentSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "AdditionalProperties", scope = CommunityContentSearchResult.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createCommunityContentSearchResultAdditionalProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_CommunityContentSearchResultAdditionalProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, CommunityContentSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Category", scope = CategoryCount.class)
    public JAXBElement<Category> createCategoryCountCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, CategoryCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "CountByNeighborhood", scope = CategoryCount.class)
    public JAXBElement<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6> createCategoryCountCountByNeighborhood(ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 value) {
        return new JAXBElement<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6>(_CategoryCountCountByNeighborhood_QNAME, ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 .class, CategoryCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeocodeLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Locations", scope = LocationData.class)
    public JAXBElement<ArrayOfGeocodeLocation> createLocationDataLocations(ArrayOfGeocodeLocation value) {
        return new JAXBElement<ArrayOfGeocodeLocation>(_LocationDataLocations_QNAME, ArrayOfGeocodeLocation.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "MatchCodes", scope = LocationData.class)
    public JAXBElement<ArrayOfstring> createLocationDataMatchCodes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_LocationDataMatchCodes_QNAME, ArrayOfstring.class, LocationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchOptions", scope = SearchRequest.class)
    public JAXBElement<SearchOptions> createSearchRequestSearchOptions(SearchOptions value) {
        return new JAXBElement<SearchOptions>(_SearchOptions_QNAME, SearchOptions.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredSearchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "StructuredQuery", scope = SearchRequest.class)
    public JAXBElement<StructuredSearchQuery> createSearchRequestStructuredQuery(StructuredSearchQuery value) {
        return new JAXBElement<StructuredSearchQuery>(_SearchRequestStructuredQuery_QNAME, StructuredSearchQuery.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Query", scope = SearchRequest.class)
    public JAXBElement<String> createSearchRequestQuery(String value) {
        return new JAXBElement<String>(_SearchRequestQuery_QNAME, String.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Address", scope = PersonSearchResult.class)
    public JAXBElement<Address> createPersonSearchResultAddress(Address value) {
        return new JAXBElement<Address>(_PersonSearchResultAddress_QNAME, Address.class, PersonSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "PhoneNumber", scope = PersonSearchResult.class)
    public JAXBElement<String> createPersonSearchResultPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonSearchResultPhoneNumber_QNAME, String.class, PersonSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "CategoryName", scope = CategorySpecificPropertySet.class)
    public JAXBElement<String> createCategorySpecificPropertySetCategoryName(String value) {
        return new JAXBElement<String>(_CategorySpecificPropertySetCategoryName_QNAME, String.class, CategorySpecificPropertySet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Properties", scope = CategorySpecificPropertySet.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createCategorySpecificPropertySetProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_CategorySpecificPropertySetProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, CategorySpecificPropertySet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "LocationData", scope = SearchResultBase.class)
    public JAXBElement<LocationData> createSearchResultBaseLocationData(LocationData value) {
        return new JAXBElement<LocationData>(_LocationData_QNAME, LocationData.class, SearchResultBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Name", scope = SearchResultBase.class)
    public JAXBElement<String> createSearchResultBaseName(String value) {
        return new JAXBElement<String>(_SearchResultBaseName_QNAME, String.class, SearchResultBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Id", scope = SearchResultBase.class)
    public JAXBElement<String> createSearchResultBaseId(String value) {
        return new JAXBElement<String>(_SearchResultBaseId_QNAME, String.class, SearchResultBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "MaximumValue", scope = RangeFilter.class)
    public JAXBElement<Object> createRangeFilterMaximumValue(Object value) {
        return new JAXBElement<Object>(_RangeFilterMaximumValue_QNAME, Object.class, RangeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "MinimumValue", scope = RangeFilter.class)
    public JAXBElement<Object> createRangeFilterMinimumValue(Object value) {
        return new JAXBElement<Object>(_RangeFilterMinimumValue_QNAME, Object.class, RangeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Count", scope = SearchOptions.class)
    public JAXBElement<Integer> createSearchOptionsCount(Integer value) {
        return new JAXBElement<Integer>(_SearchOptionsCount_QNAME, Integer.class, SearchOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterExpressionBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Filters", scope = SearchOptions.class)
    public JAXBElement<FilterExpressionBase> createSearchOptionsFilters(FilterExpressionBase value) {
        return new JAXBElement<FilterExpressionBase>(_SearchOptionsFilters_QNAME, FilterExpressionBase.class, SearchOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Radius", scope = SearchOptions.class)
    public JAXBElement<Double> createSearchOptionsRadius(Double value) {
        return new JAXBElement<Double>(_SearchOptionsRadius_QNAME, Double.class, SearchOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "AutocorrectQuery", scope = SearchOptions.class)
    public JAXBElement<Boolean> createSearchOptionsAutocorrectQuery(Boolean value) {
        return new JAXBElement<Boolean>(_SearchOptionsAutocorrectQuery_QNAME, Boolean.class, SearchOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "AdditionalProperties", scope = BusinessSearchResult.class)
    public JAXBElement<ArrayOfKeyValueOfstringanyType> createBusinessSearchResultAdditionalProperties(ArrayOfKeyValueOfstringanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfstringanyType>(_CommunityContentSearchResultAdditionalProperties_QNAME, ArrayOfKeyValueOfstringanyType.class, BusinessSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Address", scope = BusinessSearchResult.class)
    public JAXBElement<Address> createBusinessSearchResultAddress(Address value) {
        return new JAXBElement<Address>(_PersonSearchResultAddress_QNAME, Address.class, BusinessSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Website", scope = BusinessSearchResult.class)
    public JAXBElement<String> createBusinessSearchResultWebsite(String value) {
        return new JAXBElement<String>(_BusinessSearchResultWebsite_QNAME, String.class, BusinessSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "PhoneNumber", scope = BusinessSearchResult.class)
    public JAXBElement<String> createBusinessSearchResultPhoneNumber(String value) {
        return new JAXBElement<String>(_PersonSearchResultPhoneNumber_QNAME, String.class, BusinessSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNeighborhood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Neighborhoods", scope = BusinessSearchResult.class)
    public JAXBElement<ArrayOfNeighborhood> createBusinessSearchResultNeighborhoods(ArrayOfNeighborhood value) {
        return new JAXBElement<ArrayOfNeighborhood>(_BusinessSearchResultNeighborhoods_QNAME, ArrayOfNeighborhood.class, BusinessSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "CategorySpecificProperties", scope = BusinessSearchResult.class)
    public JAXBElement<ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S> createBusinessSearchResultCategorySpecificProperties(ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S value) {
        return new JAXBElement<ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S>(_BusinessSearchResultCategorySpecificProperties_QNAME, ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S.class, BusinessSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Categories", scope = BusinessSearchResult.class)
    public JAXBElement<ArrayOfCategory> createBusinessSearchResultCategories(ArrayOfCategory value) {
        return new JAXBElement<ArrayOfCategory>(_BusinessSearchResultCategories_QNAME, ArrayOfCategory.class, BusinessSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Source", scope = SearchRegion.class)
    public JAXBElement<String> createSearchRegionSource(String value) {
        return new JAXBElement<String>(_SearchRegionSource_QNAME, String.class, SearchRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "GeocodeLocation", scope = SearchRegion.class)
    public JAXBElement<GeocodeResult> createSearchRegionGeocodeLocation(GeocodeResult value) {
        return new JAXBElement<GeocodeResult>(_SearchRegionGeocodeLocation_QNAME, GeocodeResult.class, SearchRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShapeBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "BoundingArea", scope = SearchRegion.class)
    public JAXBElement<ShapeBase> createSearchRegionBoundingArea(ShapeBase value) {
        return new JAXBElement<ShapeBase>(_SearchRegionBoundingArea_QNAME, ShapeBase.class, SearchRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Keyword", scope = StructuredSearchQuery.class)
    public JAXBElement<String> createStructuredSearchQueryKeyword(String value) {
        return new JAXBElement<String>(_StructuredSearchQueryKeyword_QNAME, String.class, StructuredSearchQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Location", scope = StructuredSearchQuery.class)
    public JAXBElement<String> createStructuredSearchQueryLocation(String value) {
        return new JAXBElement<String>(_StructuredSearchQueryLocation_QNAME, String.class, StructuredSearchQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredSearchQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "StructuredQuery", scope = QuerySuggestion.class)
    public JAXBElement<StructuredSearchQuery> createQuerySuggestionStructuredQuery(StructuredSearchQuery value) {
        return new JAXBElement<StructuredSearchQuery>(_SearchRequestStructuredQuery_QNAME, StructuredSearchQuery.class, QuerySuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Query", scope = QuerySuggestion.class)
    public JAXBElement<String> createQuerySuggestionQuery(String value) {
        return new JAXBElement<String>(_SearchRequestQuery_QNAME, String.class, QuerySuggestion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Landmark", scope = Parse.class)
    public JAXBElement<String> createParseLandmark(String value) {
        return new JAXBElement<String>(_ParseLandmark_QNAME, String.class, Parse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Keyword", scope = Parse.class)
    public JAXBElement<String> createParseKeyword(String value) {
        return new JAXBElement<String>(_StructuredSearchQueryKeyword_QNAME, String.class, Parse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Address", scope = Parse.class)
    public JAXBElement<Address> createParseAddress(Address value) {
        return new JAXBElement<Address>(_PersonSearchResultAddress_QNAME, Address.class, Parse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "LocationSeparator", scope = Parse.class)
    public JAXBElement<String> createParseLocationSeparator(String value) {
        return new JAXBElement<String>(_ParseLocationSeparator_QNAME, String.class, Parse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "PropertyName", scope = AvailableFilter.class)
    public JAXBElement<String> createAvailableFilterPropertyName(String value) {
        return new JAXBElement<String>(_AvailableFilterPropertyName_QNAME, String.class, AvailableFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Name", scope = Category.class)
    public JAXBElement<String> createCategoryName(String value) {
        return new JAXBElement<String>(_SearchResultBaseName_QNAME, String.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Name", scope = Neighborhood.class)
    public JAXBElement<String> createNeighborhoodName(String value) {
        return new JAXBElement<String>(_SearchResultBaseName_QNAME, String.class, Neighborhood.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "City", scope = Neighborhood.class)
    public JAXBElement<String> createNeighborhoodCity(String value) {
        return new JAXBElement<String>(_NeighborhoodCity_QNAME, String.class, Neighborhood.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerySuggestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "QuerySuggestion", scope = SearchResponse.class)
    public JAXBElement<QuerySuggestion> createSearchResponseQuerySuggestion(QuerySuggestion value) {
        return new JAXBElement<QuerySuggestion>(_QuerySuggestion_QNAME, QuerySuggestion.class, SearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSearchResultSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "ResultSets", scope = SearchResponse.class)
    public JAXBElement<ArrayOfSearchResultSet> createSearchResponseResultSets(ArrayOfSearchResultSet value) {
        return new JAXBElement<ArrayOfSearchResultSet>(_SearchResponseResultSets_QNAME, ArrayOfSearchResultSet.class, SearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Name", scope = FilterValue.class)
    public JAXBElement<String> createFilterValueName(String value) {
        return new JAXBElement<String>(_SearchResultBaseName_QNAME, String.class, FilterValue.class, value);
    }

}
