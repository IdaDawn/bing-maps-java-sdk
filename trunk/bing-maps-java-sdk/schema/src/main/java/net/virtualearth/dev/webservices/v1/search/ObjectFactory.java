
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.search
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link FilterValue }
     * 
     */
    public FilterValue createFilterValue() {
        return new FilterValue();
    }

    /**
     * Create an instance of {@link ArrayOfNeighborhood }
     * 
     */
    public ArrayOfNeighborhood createArrayOfNeighborhood() {
        return new ArrayOfNeighborhood();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link PersonSearchResult }
     * 
     */
    public PersonSearchResult createPersonSearchResult() {
        return new PersonSearchResult();
    }

    /**
     * Create an instance of {@link Neighborhood }
     * 
     */
    public Neighborhood createNeighborhood() {
        return new Neighborhood();
    }

    /**
     * Create an instance of {@link ArrayOfCategoryCount }
     * 
     */
    public ArrayOfCategoryCount createArrayOfCategoryCount() {
        return new ArrayOfCategoryCount();
    }

    /**
     * Create an instance of {@link AvailableFilter }
     * 
     */
    public AvailableFilter createAvailableFilter() {
        return new AvailableFilter();
    }

    /**
     * Create an instance of {@link StructuredSearchQuery }
     * 
     */
    public StructuredSearchQuery createStructuredSearchQuery() {
        return new StructuredSearchQuery();
    }

    /**
     * Create an instance of {@link QuerySuggestion }
     * 
     */
    public QuerySuggestion createQuerySuggestion() {
        return new QuerySuggestion();
    }

    /**
     * Create an instance of {@link ArrayOfSearchRegion }
     * 
     */
    public ArrayOfSearchRegion createArrayOfSearchRegion() {
        return new ArrayOfSearchRegion();
    }

    /**
     * Create an instance of {@link BusinessSearchResult }
     * 
     */
    public BusinessSearchResult createBusinessSearchResult() {
        return new BusinessSearchResult();
    }

    /**
     * Create an instance of {@link ArrayOfCategory }
     * 
     */
    public ArrayOfCategory createArrayOfCategory() {
        return new ArrayOfCategory();
    }

    /**
     * Create an instance of {@link SearchResultSet }
     * 
     */
    public SearchResultSet createSearchResultSet() {
        return new SearchResultSet();
    }

    /**
     * Create an instance of {@link ArrayOfSearchResultSet }
     * 
     */
    public ArrayOfSearchResultSet createArrayOfSearchResultSet() {
        return new ArrayOfSearchResultSet();
    }

    /**
     * Create an instance of {@link RangeFilter }
     * 
     */
    public RangeFilter createRangeFilter() {
        return new RangeFilter();
    }

    /**
     * Create an instance of {@link SearchResultBase }
     * 
     */
    public SearchResultBase createSearchResultBase() {
        return new SearchResultBase();
    }

    /**
     * Create an instance of {@link Parse }
     * 
     */
    public Parse createParse() {
        return new Parse();
    }

    /**
     * Create an instance of {@link SearchRegion }
     * 
     */
    public SearchRegion createSearchRegion() {
        return new SearchRegion();
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
     * Create an instance of {@link LocationData }
     * 
     */
    public LocationData createLocationData() {
        return new LocationData();
    }

    /**
     * Create an instance of {@link CommunityContentSearchResult }
     * 
     */
    public CommunityContentSearchResult createCommunityContentSearchResult() {
        return new CommunityContentSearchResult();
    }

    /**
     * Create an instance of {@link ArrayOfAvailableFilter }
     * 
     */
    public ArrayOfAvailableFilter createArrayOfAvailableFilter() {
        return new ArrayOfAvailableFilter();
    }

    /**
     * Create an instance of {@link CategoryCount }
     * 
     */
    public CategoryCount createCategoryCount() {
        return new CategoryCount();
    }

    /**
     * Create an instance of {@link ValueListFilter }
     * 
     */
    public ValueListFilter createValueListFilter() {
        return new ValueListFilter();
    }

    /**
     * Create an instance of {@link CategorySpecificPropertySet }
     * 
     */
    public CategorySpecificPropertySet createCategorySpecificPropertySet() {
        return new CategorySpecificPropertySet();
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

}
