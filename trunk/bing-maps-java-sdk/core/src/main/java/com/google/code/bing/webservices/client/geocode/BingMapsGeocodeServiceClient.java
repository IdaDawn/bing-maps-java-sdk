/**
 *
 */
package com.google.code.bing.webservices.client.geocode;

import net.virtualearth.dev.webservices.v1.geocode.GeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.ReverseGeocodeRequest;

import com.google.code.bing.webservices.client.BingMapsWebServicesClient;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsGeocodeServiceClient extends BingMapsWebServicesClient {
	
	public GeocodeRequestBuilder newGeocodeRequestBuilder();
	
	public ReverseGeocodeRequestBuilder newReverseGeocodeRequestBuilder();
	
	public interface GeocodeRequestBuilder extends RequestBuilder<GeocodeRequest> {
		
	}
	
	public interface ReverseGeocodeRequestBuilder extends RequestBuilder<ReverseGeocodeRequest> {
		
	}
}
