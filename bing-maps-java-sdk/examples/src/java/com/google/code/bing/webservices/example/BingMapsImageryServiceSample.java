package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.MapStyle;
import net.virtualearth.dev.webservices.v1.common.SizeOfint;
import net.virtualearth.dev.webservices.v1.imagery.MapUriOptions;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;
import net.virtualearth.dev.webservices.v1.imagery.MapUriResponse;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient;

public class BingMapsImageryServiceSample {
	
	public static void main(String[] args) throws Exception {
		BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
		BingMapsImageryServiceClient client = factory.createImageryServiceClient();
		MapUriResponse response = client.getMapUri(createMapUriRequest(client));
		printResponse(response);
	}
	
	private static void printResponse(MapUriResponse response) {
		// TODO Auto-generated method stub
		
	}

	private static MapUriRequest createMapUriRequest(BingMapsImageryServiceClient client) {
		MapUriRequest request = IMAGERY_FACTORY.createMapUriRequest();
		
		Credentials credential = COMMON_FACTORY.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		
		Location location = COMMON_FACTORY.createLocation();
		location.setLatitude(24.826942);
		location.setLongitude(67.033665);
		request.setCenter(location);
		
		MapUriOptions mapUriOptions = IMAGERY_FACTORY.createMapUriOptions();
		mapUriOptions.setStyle(MapStyle.AERIAL_WITH_LABELS);
		mapUriOptions.setZoomLevel(10);
		
		SizeOfint sizeOfInt = COMMON_FACTORY.createSizeOfint();
		sizeOfInt.setHeight(400);
		sizeOfInt.setWidth(400);
		mapUriOptions.setImageSize(sizeOfInt);
		request.setOptions(mapUriOptions);
		
		return request;
	}
}
