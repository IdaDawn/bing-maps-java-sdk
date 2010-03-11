package com.google.code.bing.webservices.client.geocode.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.common.Confidence;
import net.virtualearth.dev.webservices.v1.common.Credentials;
import net.virtualearth.dev.webservices.v1.geocode.ArrayOfFilterBase;
import net.virtualearth.dev.webservices.v1.geocode.ConfidenceFilter;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeOptions;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeService;
import net.virtualearth.dev.webservices.v1.geocode.IGeocodeService;
import net.virtualearth.dev.webservices.v1.geocode.ObjectFactory;
import net.virtualearth.dev.webservices.v1.geocode.ReverseGeocodeRequest;

import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;

public class BingMapsGeocodeServiceClientImpl implements
		BingMapsGeocodeServiceClient {
	
	@WebServiceRef(wsdlLocation="geocodeservice.wsdl")
	static GeocodeService geocodeService;
	
	@Override
	public GeocodeRequestBuilder newGeocodeRequestBuilder() {
		return new GeocodeRequestBuilderImpl();
	}

	@Override
	public ReverseGeocodeRequestBuilder newReverseGeocodeRequestBuilder() {
		return new ReverseGeocodeRequestBuilderImpl();
	}
	
	public static void main(String[] args) throws Exception {
		geocodeService = new GeocodeService();
		IGeocodeService proxy = geocodeService.getBasicHttpBindingIGeocodeService();
		GeocodeResponse response = proxy.geocode(createGeocodeRequest());
		System.out.println(response.getResults().getGeocodeResult().get(0).getDisplayName());
	}
	
	private static GeocodeRequest createGeocodeRequest() {
		ObjectFactory geocodeFactory = new ObjectFactory();
		GeocodeRequest request = geocodeFactory.createGeocodeRequest();
		
		net.virtualearth.dev.webservices.v1.common.ObjectFactory commonFactory = new net.virtualearth.dev.webservices.v1.common.ObjectFactory();
		
		Credentials credential = commonFactory.createCredentials();
		credential.setApplicationId("AgBXisHgZAEfpDnT95skGJiYu_Oh9XgeAi7O0UJfhg_GdEYB2yeeETJ8ayQ-3kNE");
		request.setCredentials(credential);
		request.setQuery("1 Microsoft Way, Redmond, WA");
		
		GeocodeOptions geocodeOptions = geocodeFactory.createGeocodeOptions();

		ArrayOfFilterBase array = geocodeFactory.createArrayOfFilterBase();
		ConfidenceFilter filter = geocodeFactory.createConfidenceFilter();
		filter.setMinimumConfidence(Confidence.HIGH);
		array.getFilterBase().add(filter);
		geocodeOptions.setFilters(array);
		request.setOptions(geocodeOptions);
		
		return request;
	}
	
	private static class GeocodeRequestBuilderImpl implements GeocodeRequestBuilder {

		@Override
		public GeocodeRequest getResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<GeocodeRequest> withCredentials(
				String applicationId, String token) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<GeocodeRequest> withCulture(String culture) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<GeocodeRequest> withExecutionOptions(
				boolean suppressFaults) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	private static class ReverseGeocodeRequestBuilderImpl implements ReverseGeocodeRequestBuilder {

		@Override
		public ReverseGeocodeRequest getResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<ReverseGeocodeRequest> withCredentials(
				String applicationId, String token) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<ReverseGeocodeRequest> withCulture(String culture) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RequestBuilder<ReverseGeocodeRequest> withExecutionOptions(
				boolean suppressFaults) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
