package com.google.code.bing.webservices.client.search.impl;

import java.util.concurrent.Future;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.CompareOperator;
import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.FilterExpression;
import net.virtualearth.dev.webservices.v1.common.ResponseSummary;
import net.virtualearth.dev.webservices.v1.search.ISearchService;
import net.virtualearth.dev.webservices.v1.search.ISearchServiceSearchResponseSummaryFaultFaultMessage;
import net.virtualearth.dev.webservices.v1.search.ListingType;
import net.virtualearth.dev.webservices.v1.search.ObjectFactory;
import net.virtualearth.dev.webservices.v1.search.SearchOptions;
import net.virtualearth.dev.webservices.v1.search.SearchRequest;
import net.virtualearth.dev.webservices.v1.search.SearchResponse;
import net.virtualearth.dev.webservices.v1.search.SearchResultBase;
import net.virtualearth.dev.webservices.v1.search.SearchResultSet;
import net.virtualearth.dev.webservices.v1.search.SearchService;
import net.virtualearth.dev.webservices.v1.search.SortOrder;
import net.virtualearth.dev.webservices.v1.search.StructuredSearchQuery;

import com.google.code.bing.webservices.client.Adaptable;
import com.google.code.bing.webservices.client.AdaptableFuture;
import com.google.code.bing.webservices.client.BaseBingMapsServiceClientImpl;
import com.google.code.bing.webservices.client.constant.ApplicationConstants;
import com.google.code.bing.webservices.client.exception.BingMapsSearchServiceClientException;
import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient;

public class BingMapsSearchServiceClientImpl extends BaseBingMapsServiceClientImpl implements
		BingMapsSearchServiceClient {
	
	private static final ObjectFactory SEARCH_FACTORY = new ObjectFactory();
	
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/searchservice/dev.virtualearth.net.webservices.v1.search.wsdl")
	static SearchService searchService;
	
	static {
		if (ApplicationConstants.STANDALONE_MODE) {
			searchService = new SearchService();
		}
	}
	
	@Override
	public SearchResponse search(SearchRequest request) {
		ISearchService proxy = searchService.getBasicHttpBindingISearchService();
		try {
			return proxy.search(request);
		} catch (ISearchServiceSearchResponseSummaryFaultFaultMessage e) {
			throw createException(e.getMessage(), e.getCause(), e.getFaultInfo());
		}
	}


	@Override
	public Future<SearchResponse> searchAsync(SearchRequest request) {
		ISearchService proxy = searchService.getBasicHttpBindingISearchService();
		return new AdaptableFuture<SearchResponse, net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse>(proxy.searchAsync(request), new Adaptable<SearchResponse, net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse>() {
			@Override
			public SearchResponse adaptFrom(
					net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse adaptee) {
				return adaptee.getSearchResult();
			}

			@Override
			public net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse adaptTo(
					SearchResponse adapter) {
				return null;
			}
		});
	}
	
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
	
	/**
	 * @param e
	 */
	private BingMapsSearchServiceClientException createException(String message, Throwable cause, ResponseSummary faultInfo) {
		String authenticationResultCode = (faultInfo.getAuthenticationResultCode() == null) ? null : faultInfo.getAuthenticationResultCode().value();
		String statusCode = (faultInfo.getStatusCode() == null)? null : faultInfo.getStatusCode().value();
		return new BingMapsSearchServiceClientException(message, cause, authenticationResultCode, faultInfo.getCopyright(), faultInfo.getFaultReason(), statusCode, faultInfo.getTraceId());
	}
	
	private static SearchRequest createSearchRequest() {
		SearchRequest request = SEARCH_FACTORY.createSearchRequest();
		
		Credentials credential = COMMON_FACTORY.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		request.setQuery("restaurant in Seattle, WA");
		
		
		SearchOptions searchOptions = SEARCH_FACTORY.createSearchOptions();
		
		FilterExpression filter = COMMON_FACTORY.createFilterExpression();
		filter.setCompareOperator(CompareOperator.GREATER_THAN_OR_EQUALS);
		filter.setPropertyId(3);
		filter.setFilterValue(8);
		searchOptions.setFilters(filter);
		
		request.setSearchOptions(searchOptions);
		
		return request;
	}
	
	private static class SearchRequestBuilderImpl extends BaseRequestBuilderImpl<SearchRequest, SearchRequestBuilder> implements SearchRequestBuilder {

		protected SearchRequestBuilderImpl() {
			super(SEARCH_FACTORY.createSearchRequest());
		}

		@Override
		public SearchRequestBuilder withQuery(String query) {
			result.setQuery(query);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsAutocorrectQuery(
				Boolean autocorrectQuery) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			result.getSearchOptions().setAutocorrectQuery(autocorrectQuery);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsCount(Integer count) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			result.getSearchOptions().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsFilter(
				CompareOperator compareOperator, Object filterValue,
				Integer propertyId) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			FilterExpression filterExpression = COMMON_FACTORY.createFilterExpression();
			filterExpression.setCompareOperator(compareOperator);
			filterExpression.setFilterValue(filterValue);
			filterExpression.setPropertyId(propertyId);
			result.getSearchOptions().setFilters(filterExpression);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsListingType(
				ListingType listingType) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			result.getSearchOptions().setListingType(listingType);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsParseOnly(Boolean parseOnly) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			result.getSearchOptions().setParseOnly(parseOnly);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsRadius(Double radius) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			result.getSearchOptions().setRadius(radius);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsSortOrder(
				SortOrder sortOrder) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			result.getSearchOptions().setSortOrder(sortOrder);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOptionsStartingIndex(
				Integer startingIndex) {
			if (result.getSearchOptions() == null) {
				result.setSearchOptions(SEARCH_FACTORY.createSearchOptions());
			}
			result.getSearchOptions().setStartingIndex(startingIndex);
			return this;
		}

		@Override
		public SearchRequestBuilder withStructuredQuery(String query,
				String location) {
			StructuredSearchQuery structuredSearchQuery = SEARCH_FACTORY.createStructuredSearchQuery();
			structuredSearchQuery.setKeyword(query);
			structuredSearchQuery.setLocation(location);
			result.setStructuredQuery(structuredSearchQuery);
			return this;
		}
	}
}
