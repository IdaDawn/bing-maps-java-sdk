package com.google.code.bing.webservices.client.geocode.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.geocode.IGeocodeService;

import com.google.code.bing.webservices.client.geocode.BingMapsGeocodeServiceClient;

public class BingMapsGeocodeServiceClientImpl implements
		BingMapsGeocodeServiceClient {
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/geocodeservice/geocodeservice.wsdl")
	static IGeocodeService geocodeService;
}
