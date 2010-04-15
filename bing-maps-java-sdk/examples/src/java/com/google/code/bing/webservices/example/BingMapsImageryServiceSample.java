package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.common.MapStyle;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;
import net.virtualearth.dev.webservices.v1.imagery.MapUriResponse;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient;
import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient.MapUriRequestBuilder;

public class BingMapsImageryServiceSample {
	
	public static void main(String[] args) throws Exception {
		BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
		BingMapsImageryServiceClient client = factory.createImageryServiceClient();
		MapUriResponse response = client.getMapUri(createMapUriRequest(client));
		printResponse(response);
	}
	
	private static void printResponse(MapUriResponse response) {
		System.out.println(response.getUri());
	}

	private static MapUriRequest createMapUriRequest(BingMapsImageryServiceClient client) {
		MapUriRequestBuilder builder = client.newMapUriRequestBuilder();
		builder.withCredentials("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE", null);
		builder.withCenter(null, 24.826942, 67.033665);
		builder.withOptionsStyle(MapStyle.AERIAL_WITH_LABELS);
		builder.withOptionsZoomLevel(10);
		builder.withOptionsImageSize(400, 400);
		return builder.getResult();
	}
}
