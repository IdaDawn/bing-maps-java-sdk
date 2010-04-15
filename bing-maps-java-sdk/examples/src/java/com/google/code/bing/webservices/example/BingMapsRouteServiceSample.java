/**
 * 
 */
package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.route.ItineraryItem;
import net.virtualearth.dev.webservices.v1.route.RouteLeg;
import net.virtualearth.dev.webservices.v1.route.RouteRequest;
import net.virtualearth.dev.webservices.v1.route.RouteResponse;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.route.BingMapsRouteServiceClient;
import com.google.code.bing.webservices.client.route.BingMapsRouteServiceClient.RouteRequestBuilder;

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
		for (RouteLeg routeLeg : response.getResult().getLegs().getRouteLeg()) {
			for (ItineraryItem itineraryItem : routeLeg.getItinerary().getItineraryItem()) {
				System.out.println(itineraryItem.getText());
			}
		}
	}

	private static RouteRequest createRouteRequest(BingMapsRouteServiceClient client) {
		RouteRequestBuilder builder = client.newRouteRequestBuilder();
		builder.withCredentials("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE", null);
		builder.withWaypoint("Start", null, 40.0, -120.0);
		builder.withWaypoint("Stop", null, 40.5, -120.5);
		builder.withWaypoint("End", null, 41.0, -121.0);
		return builder.getResult();
	}
}
