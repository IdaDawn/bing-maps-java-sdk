package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.common.Confidence;
import net.virtualearth.dev.webservices.v1.common.GeocodeResult;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;
import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient.GeocodeRequestBuilder;

public class BingMapsGeocodeServiceSample {
	
	public static void main(String[] args) throws Exception {
		BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
		BingMapsGeocodeServiceClient client = factory.createGeocodeServiceClient();
		GeocodeResponse response = client.geocode(createGeocodeRequest(client));
		printResponse(response);
	}
	
	private static void printResponse(GeocodeResponse response) {
		for (GeocodeResult result : response.getResults().getGeocodeResult()) {
			System.out.println(result.getDisplayName());
		}
	}

	private static GeocodeRequest createGeocodeRequest(BingMapsGeocodeServiceClient client) {
		GeocodeRequestBuilder builder = client.newGeocodeRequestBuilder();
		builder.withCredentials("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE", null);
		builder.withQuery("1 Microsoft Way, Redmond, WA");
		builder.withOptionsFilter(Confidence.HIGH);
		return builder.getResult();
	}
}
