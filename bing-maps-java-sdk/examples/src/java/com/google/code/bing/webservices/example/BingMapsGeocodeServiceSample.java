package com.google.code.bing.webservices.example;

import net.virtualearth.dev.webservices.v1.common.Confidence;
import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.geocode.ArrayOfFilterBase;
import net.virtualearth.dev.webservices.v1.geocode.ConfidenceFilter;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeOptions;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse;

import com.google.code.bing.webservices.client.BingMapsWebServicesClientFactory;
import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;

public class BingMapsGeocodeServiceSample {
	
	public static void main(String[] args) throws Exception {
		BingMapsWebServicesClientFactory factory = BingMapsWebServicesClientFactory.newInstance();
		BingMapsGeocodeServiceClient client = factory.createGeocodeServiceClient();
		GeocodeResponse response = client.geocode(createGeocodeRequest(client));
		printResponse(response);
	}
	
	private static void printResponse(GeocodeResponse response) {
		// TODO Auto-generated method stub
		
	}

	private static GeocodeRequest createGeocodeRequest(BingMapsGeocodeServiceClient client) {
		GeocodeRequest request = GEOCODE_FACTORY.createGeocodeRequest();
		
		Credentials credential = COMMON_FACTORY.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		request.setQuery("1 Microsoft Way, Redmond, WA");
		
		GeocodeOptions geocodeOptions = GEOCODE_FACTORY.createGeocodeOptions();

		ArrayOfFilterBase array = GEOCODE_FACTORY.createArrayOfFilterBase();
		ConfidenceFilter filter = GEOCODE_FACTORY.createConfidenceFilter();
		filter.setMinimumConfidence(Confidence.HIGH);
		array.getFilterBase().add(filter);
		geocodeOptions.setFilters(array);
		request.setOptions(geocodeOptions);
		
		return request;
	}
}
