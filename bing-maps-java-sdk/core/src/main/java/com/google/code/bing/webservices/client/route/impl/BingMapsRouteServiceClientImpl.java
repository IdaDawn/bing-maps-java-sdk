/**
 * 
 */
package com.google.code.bing.webservices.client.route.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.route.ArrayOfWaypoint;
import net.virtualearth.dev.webservices.v1.route.IRouteService;
import net.virtualearth.dev.webservices.v1.route.ItineraryItem;
import net.virtualearth.dev.webservices.v1.route.MajorRoutesRequest;
import net.virtualearth.dev.webservices.v1.route.ObjectFactory;
import net.virtualearth.dev.webservices.v1.route.RouteLeg;
import net.virtualearth.dev.webservices.v1.route.RouteRequest;
import net.virtualearth.dev.webservices.v1.route.RouteResponse;
import net.virtualearth.dev.webservices.v1.route.RouteService;
import net.virtualearth.dev.webservices.v1.route.Waypoint;

import com.google.code.bing.webservices.client.route.BingMapsRouteServiceClient;

/**
 * @author nmukhtar
 *
 */
public class BingMapsRouteServiceClientImpl implements
		BingMapsRouteServiceClient {

	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/routeservice/routeservice.wsdl")
	static RouteService routeService;
	
	@Override
	public MajorRoutesRequestBuilder newMajorRoutesRequestBuilder() {
		return new MajorRoutesRequestBuilderImpl();
	}

	@Override
	public RouteRequestBuilder newRouteRequestBuilder() {
		return new RouteRequestBuilderImpl();
	}
	
	public static void main(String[] args) throws Exception {
		routeService = new RouteService();
		IRouteService proxy = routeService.getBasicHttpBindingIRouteService();
		RouteResponse response = proxy.calculateRoute(createRouteRequest());
		
		for (RouteLeg leg : response.getResult().getLegs().getRouteLeg()) {
			for (ItineraryItem item : leg.getItinerary().getItineraryItem()) {			
				System.out.println(item.getText());
			}
		}
	}
	
	private static RouteRequest createRouteRequest() {
		ObjectFactory routeFactory = new ObjectFactory();
		RouteRequest request = routeFactory.createRouteRequest();
		
		net.virtualearth.dev.webservices.v1.common.ObjectFactory commonFactory = new net.virtualearth.dev.webservices.v1.common.ObjectFactory();
		
		Credentials credential = commonFactory.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		ArrayOfWaypoint arrayOfWaypoint = routeFactory.createArrayOfWaypoint();
		
		Waypoint waypoint1 = routeFactory.createWaypoint();
		waypoint1.setDescription("Start");
		Location location1 = commonFactory.createLocation();
		location1.setLatitude(40.0);
		location1.setLongitude(-120.0);
		waypoint1.setLocation(location1);
		arrayOfWaypoint.getWaypoint().add(waypoint1);
		
		Waypoint waypoint2 = routeFactory.createWaypoint();
		waypoint2.setDescription("Stop");
		Location location2 = commonFactory.createLocation();
		location2.setLatitude(40.5);
		location2.setLongitude(-120.5);
		waypoint2.setLocation(location2);
		arrayOfWaypoint.getWaypoint().add(waypoint2);
		
		Waypoint waypoint3 = routeFactory.createWaypoint();
		waypoint3.setDescription("End");
		Location location3 = commonFactory.createLocation();
		location3.setLatitude(41.0);
		location3.setLongitude(-121.0);
		waypoint3.setLocation(location3);
		arrayOfWaypoint.getWaypoint().add(waypoint3);
		
		request.setWaypoints(arrayOfWaypoint);
		
		return request;
	}
	
	private static class RouteRequestBuilderImpl implements RouteRequestBuilder {

		@Override
		public RouteRequest getResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<RouteRequest> withCredentials(
				String applicationId, String token) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<RouteRequest> withCulture(String culture) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<RouteRequest> withExecutionOptions(
				boolean suppressFaults) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	private static class MajorRoutesRequestBuilderImpl implements MajorRoutesRequestBuilder {

		@Override
		public MajorRoutesRequest getResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<MajorRoutesRequest> withCredentials(
				String applicationId, String token) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<MajorRoutesRequest> withCulture(String culture) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<MajorRoutesRequest> withExecutionOptions(
				boolean suppressFaults) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
