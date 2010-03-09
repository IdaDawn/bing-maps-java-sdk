package com.google.code.bing.webservices.client.imagery.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.imagery.ImageryService;

import com.google.code.bing.webservices.client.imagery.BingMapsImageryServiceClient;

public class BingMapsImageryServiceClientImpl implements
		BingMapsImageryServiceClient {
	
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/imageryservice/imageryservice.wsdl")
	static ImageryService imageryService;
}
