/**
 * 
 */
package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.route.ArrayOfWaypoint;
import net.virtualearth.dev.webservices.v1.route.RouteRequest;
import net.virtualearth.dev.webservices.v1.route.RouteResponse;
import net.virtualearth.dev.webservices.v1.route.Waypoint;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.route.BingMapsRouteServiceClient;

/**
 * @author nmukhtar
 *
 */
public class BingMapsRouteServiceSample {
	
	public static void main(String[] args) throws Exception {
		BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
		BingMapsRouteServiceClient client = factory.createRouteServiceClient();
		RouteResponse response = client.calculateRoute(createRouteRequest(client));
		printResponse(response);
	}
	
	private static void printResponse(RouteResponse response) {
		// TODO Auto-generated method stub
		
	}

	private static RouteRequest createRouteRequest(BingMapsRouteServiceClient client) {
		RouteRequest request = ROUTE_FACTORY.createRouteRequest();
		
		Credentials credential = COMMON_FACTORY.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		ArrayOfWaypoint arrayOfWaypoint = ROUTE_FACTORY.createArrayOfWaypoint();
		
		Waypoint waypoint1 = ROUTE_FACTORY.createWaypoint();
		waypoint1.setDescription("Start");
		Location location1 = COMMON_FACTORY.createLocation();
		location1.setLatitude(40.0);
		location1.setLongitude(-120.0);
		waypoint1.setLocation(location1);
		arrayOfWaypoint.getWaypoint().add(waypoint1);
		
		Waypoint waypoint2 = ROUTE_FACTORY.createWaypoint();
		waypoint2.setDescription("Stop");
		Location location2 = COMMON_FACTORY.createLocation();
		location2.setLatitude(40.5);
		location2.setLongitude(-120.5);
		waypoint2.setLocation(location2);
		arrayOfWaypoint.getWaypoint().add(waypoint2);
		
		Waypoint waypoint3 = ROUTE_FACTORY.createWaypoint();
		waypoint3.setDescription("End");
		Location location3 = COMMON_FACTORY.createLocation();
		location3.setLatitude(41.0);
		location3.setLongitude(-121.0);
		waypoint3.setLocation(location3);
		arrayOfWaypoint.getWaypoint().add(waypoint3);
		
		request.setWaypoints(arrayOfWaypoint);
		
		return request;
	}
}
