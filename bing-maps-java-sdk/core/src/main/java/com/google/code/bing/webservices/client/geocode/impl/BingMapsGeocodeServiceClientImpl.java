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

import com.google.code.bing.webservices.client.BaseBingMapsServiceClientImpl;
import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;

public class BingMapsGeocodeServiceClientImpl extends BaseBingMapsServiceClientImpl implements
		BingMapsGeocodeServiceClient {
	private static final ObjectFactory GEOCODE_FACTORY = new ObjectFactory();
	
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
	
	private static class GeocodeRequestBuilderImpl extends BaseRequestBuilderImpl<GeocodeRequest> implements GeocodeRequestBuilder {

		protected GeocodeRequestBuilderImpl() {
			super(new GeocodeRequest());
		}
	}
	
	private static class ReverseGeocodeRequestBuilderImpl extends BaseRequestBuilderImpl<ReverseGeocodeRequest> implements ReverseGeocodeRequestBuilder {

		protected ReverseGeocodeRequestBuilderImpl() {
			super(new ReverseGeocodeRequest());
		}
	}
}
