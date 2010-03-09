/**
 * 
 */
package com.google.code.bing.webservices.client.route.impl;

import javax.xml.ws.WebServiceRef;

import net.virtualearth.dev.webservices.v1.route.IRouteService;

import com.google.code.bing.webservices.client.route.BingMapsRouteServiceClient;

/**
 * @author nmukhtar
 *
 */
public class BingMapsRouteServiceClientImpl implements
		BingMapsRouteServiceClient {

	@WebServiceRef(wsdlLocation="http://dev.virtualearth.net/webservices/v1/metadata/routeservice/routeservice.wsdl")
	static IRouteService routeService;
}
