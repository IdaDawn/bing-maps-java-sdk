package com.google.code.bing.webservices.client.geocode.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.geocode.GeocodeService;
import net.virtualearth.dev.webservices.v1.geocode.IGeocodeService;

import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;

public class BingMapsGeocodeServiceClientImpl implements
		BingMapsGeocodeServiceClient {
	
	@WebServiceRef(wsdlLocation="geocodeservice.wsdl")
	static GeocodeService geocodeService;
	
	public static void main(String[] args) throws Exception {
		geocodeService = new GeocodeService();
		IGeocodeService proxy = geocodeService.getBasicHttpBindingIGeocodeService();
		proxy.geocode(null);
	}
}
