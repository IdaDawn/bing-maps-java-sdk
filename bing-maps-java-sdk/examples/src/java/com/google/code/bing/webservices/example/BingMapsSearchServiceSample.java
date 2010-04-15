package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.common.CompareOperator;
import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.FilterExpression;
import net.virtualearth.dev.webservices.v1.search.SearchOptions;
import net.virtualearth.dev.webservices.v1.search.SearchRequest;
import net.virtualearth.dev.webservices.v1.search.SearchResponse;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient;

public class BingMapsSearchServiceSample {
	
	public static void main(String[] args) throws Exception {
		BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
		BingMapsSearchServiceClient client = factory.createSearchServiceClient();
		SearchResponse response = client.search(createSearchRequest(client));
		printResponse(response);
	}
	
	private static void printResponse(SearchResponse response) {
		// TODO Auto-generated method stub
		
	}

	private static SearchRequest createSearchRequest(BingMapsSearchServiceClient client) {
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
}
