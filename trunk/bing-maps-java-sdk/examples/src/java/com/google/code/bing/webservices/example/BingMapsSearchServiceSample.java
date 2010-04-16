package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.search.SearchRequest;
import net.virtualearth.dev.webservices.v1.search.SearchResponse;
import net.virtualearth.dev.webservices.v1.search.SearchResultBase;
import net.virtualearth.dev.webservices.v1.search.SearchResultSet;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient;
import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient.SearchRequestBuilder;

public class BingMapsSearchServiceSample {
	
	public static void main(String[] args) throws Exception {
		BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
		BingMapsSearchServiceClient client = factory.createSearchServiceClient();
		SearchResponse response = client.search(createSearchRequest(client));
		printResponse(response);
	}
	
	private static void printResponse(SearchResponse response) {
		for (SearchResultSet result : response.getResultSets().getSearchResultSet()) {
			for (SearchResultBase searchResult : result.getResults().getSearchResultBase()) {
				System.out.println(searchResult.getName());
			}
		}
	}

	private static SearchRequest createSearchRequest(BingMapsSearchServiceClient client) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withCredentials("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE", null);
		builder.withQuery("restaurant in Seattle, WA");
//		builder.withSearchOptionsFilter(CompareOperator.GREATER_THAN_OR_EQUALS, 8, 3);
		
		return builder.getResult();
	}
}
