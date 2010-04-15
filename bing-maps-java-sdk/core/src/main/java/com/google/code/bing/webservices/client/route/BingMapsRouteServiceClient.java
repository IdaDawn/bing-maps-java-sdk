/**
 *
 */
package com.google.code.bing.webservices.client.route;

import net.virtualearth.dev.webservices.v1.route.MajorRoutesRequest;
import net.virtualearth.dev.webservices.v1.route.RouteOptimization;
import net.virtualearth.dev.webservices.v1.route.RoutePathType;
import net.virtualearth.dev.webservices.v1.route.RouteRequest;
import net.virtualearth.dev.webservices.v1.route.TrafficUsage;
import net.virtualearth.dev.webservices.v1.route.TravelMode;

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
		public RouteRequestBuilder withOptionsMode(TravelMode travelMode);
		public RouteRequestBuilder withOptionsOptimization(RouteOptimization optimization);
		public RouteRequestBuilder withOptionsRoutePathType(RoutePathType routePathType);
		public RouteRequestBuilder withOptionsTrafficUsage(TrafficUsage trafficUsage);
		public RouteRequestBuilder withWaypoint(String description, Double altitude, Double latitude, Double longitude);
	}
	
	public interface MajorRoutesRequestBuilder extends RequestBuilder<MajorRoutesRequest> {
		public MajorRoutesRequestBuilder withDestination(String description, Double altitude, Double latitude, Double longitude);
		public MajorRoutesRequestBuilder withOptionsMode(TravelMode travelMode);
		public MajorRoutesRequestBuilder withOptionsOptimization(RouteOptimization optimization);
		public MajorRoutesRequestBuilder withOptionsRoutePathType(RoutePathType routePathType);
		public MajorRoutesRequestBuilder withOptionsTrafficUsage(TrafficUsage trafficUsage);
		public MajorRoutesRequestBuilder withOptionsReturnRoutes(Boolean returnRoutes);
	}
}
