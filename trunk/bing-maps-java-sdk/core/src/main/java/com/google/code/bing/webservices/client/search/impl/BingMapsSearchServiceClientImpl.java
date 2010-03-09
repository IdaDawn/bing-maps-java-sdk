package com.google.code.bing.webservices.client.search.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.search.ISearchService;

import com.google.code.bing.webservices.client.search.BingMapsSearchServiceClient;

public class BingMapsSearchServiceClientImpl implements
		BingMapsSearchServiceClient {
	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/searchservice/dev.virtualearth.net.webservices.v1.search.wsdl")
	static ISearchService searchService;
}
