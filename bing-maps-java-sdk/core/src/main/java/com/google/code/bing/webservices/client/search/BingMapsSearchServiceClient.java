/**
 *
 */
package com.google.code.bing.webservices.client.search;

import net.virtualearth.dev.webservices.v1.search.SearchRequest;

import com.google.code.bing.webservices.client.BingMapsWebServicesClient;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsSearchServiceClient extends BingMapsWebServicesClient {
	
	public SearchRequestBuilder newSearchRequestBuilder();
	
	public interface SearchRequestBuilder extends RequestBuilder<SearchRequest> {
		
	}
}
