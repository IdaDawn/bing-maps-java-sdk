/**
 *
 */
package com.google.code.bing.webservices.client.search;

import net.virtualearth.dev.webservices.v1.search.ListingType;
import net.virtualearth.dev.webservices.v1.search.SearchRequest;
import net.virtualearth.dev.webservices.v1.search.SortOrder;

import com.google.code.bing.webservices.client.BingMapsWebServicesClient;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsSearchServiceClient extends BingMapsWebServicesClient {
	
	public SearchRequestBuilder newSearchRequestBuilder();
	
	public interface SearchRequestBuilder extends RequestBuilder<SearchRequest> {
		public SearchRequestBuilder withQuery(String query);
		public SearchRequestBuilder withAutocorrectQuery(boolean autocorrectQuery);
		public SearchRequestBuilder withCount(int count);
		
		public SearchRequestBuilder withListingType(ListingType listingType);
		public SearchRequestBuilder withParseOnly(boolean parseOnly);
		public SearchRequestBuilder withRadius(double radius);
		public SearchRequestBuilder withSortOrder(SortOrder sortOrder);
		public SearchRequestBuilder withStartingIndex(int startingIndex);
		public SearchRequestBuilder withStructuredQuery(String query, String location);
	}
}
