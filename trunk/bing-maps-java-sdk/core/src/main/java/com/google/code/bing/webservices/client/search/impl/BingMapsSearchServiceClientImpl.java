package com.google.code.bing.webservices.client.search.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.CompareOperator;
import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.FilterExpression;
import net.virtualearth.dev.webservices.v1.search.ISearchService;
import net.virtualearth.dev.webservices.v1.search.ObjectFactory;
import net.virtualearth.dev.webservices.v1.search.SearchOptions;
import net.virtualearth.dev.webservices.v1.search.SearchRequest;
import net.virtualearth.dev.webservices.v1.search.SearchResponse;
import net.virtualearth.dev.webservices.v1.search.SearchResultBase;
import net.virtualearth.dev.webservices.v1.search.SearchResultSet;
import net.virtualearth.dev.webservices.v1.search.SearchService;

import com.google.code.bing.webservices.client.BaseBingMapsServiceClientImpl;
import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient;

public class BingMapsSearchServiceClientImpl extends BaseBingMapsServiceClientImpl implements
		BingMapsSearchServiceClient {
	
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/searchservice/dev.virtualearth.net.webservices.v1.search.wsdl")
	static SearchService searchService;
	
	@Override
	public SearchRequestBuilder newSearchRequestBuilder() {
		return new SearchRequestBuilderImpl();
	}
	
	
	public static void main(String[] args) throws Exception {
		searchService = new SearchService();
		ISearchService proxy = searchService.getBasicHttpBindingISearchService();
		SearchResponse response = proxy.search(createSearchRequest());
		for (SearchResultSet result : response.getResultSets().getSearchResultSet()) {
			for (SearchResultBase base : result.getResults().getSearchResultBase()) {
				System.out.println(base.getName());				
			}
		}
	}
	
	private static SearchRequest createSearchRequest() {
		ObjectFactory searchFactory = new ObjectFactory();
		SearchRequest request = searchFactory.createSearchRequest();
		
		net.virtualearth.dev.webservices.v1.common.ObjectFactory commonFactory = new net.virtualearth.dev.webservices.v1.common.ObjectFactory();
		
		Credentials credential = commonFactory.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		request.setQuery("restaurant in Seattle, WA");
		
		
		SearchOptions searchOptions = searchFactory.createSearchOptions();
		
		FilterExpression filter = commonFactory.createFilterExpression();
		filter.setCompareOperator(CompareOperator.GREATER_THAN_OR_EQUALS);
		filter.setPropertyId(3);
		filter.setFilterValue(8);
		searchOptions.setFilters(filter);
		
		request.setSearchOptions(searchOptions);
		
		return request;
	}
	
	private static class SearchRequestBuilderImpl extends BaseRequestBuilderImpl<SearchRequest> implements SearchRequestBuilder {

		protected SearchRequestBuilderImpl() {
			super(new SearchRequest());
		}
	}
}
