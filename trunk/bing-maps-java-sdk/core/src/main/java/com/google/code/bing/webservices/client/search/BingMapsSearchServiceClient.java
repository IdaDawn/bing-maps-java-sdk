/**
 *
 */
package com.google.code.bing.webservices.client.search;

import net.virtualearth.dev.webservices.v1.common.CompareOperator;
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
		public SearchRequestBuilder withSearchOptionsAutocorrectQuery(Boolean autocorrectQuery);
		public SearchRequestBuilder withSearchOptionsCount(Integer count);
		
		public SearchRequestBuilder withSearchOptionsListingType(ListingType listingType);
		public SearchRequestBuilder withSearchOptionsParseOnly(Boolean parseOnly);
		public SearchRequestBuilder withSearchOptionsRadius(Double radius);
		public SearchRequestBuilder withSearchOptionsSortOrder(SortOrder sortOrder);
		public SearchRequestBuilder withSearchOptionsStartingIndex(Integer startingIndex);
		
		public SearchRequestBuilder withFilter(CompareOperator compareOperator, Object filterValue, Integer propertyId);
		public SearchRequestBuilder withStructuredQuery(String query, String location);
	}
}
