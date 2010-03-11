/**
 *
 */
package com.google.code.bing.webservices.client.route;

import net.virtualearth.dev.webservices.v1.route.MajorRoutesRequest;
import net.virtualearth.dev.webservices.v1.route.RouteRequest;

import com.google.code.bing.webservices.client.BingMapsWebServicesClient;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingMapsRouteServiceClient extends BingMapsWebServicesClient {
	
	public RouteRequestBuilder newRouteRequestBuilder();
	
	public MajorRoutesRequestBuilder newMajorRoutesRequestBuilder();
	
	public interface RouteRequestBuilder extends RequestBuilder<RouteRequest> {
		
	}
	
	public interface MajorRoutesRequestBuilder extends RequestBuilder<MajorRoutesRequest> {
		
	}
}
