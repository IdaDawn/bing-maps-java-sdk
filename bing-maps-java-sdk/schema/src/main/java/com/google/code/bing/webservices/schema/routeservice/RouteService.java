
package com.google.code.bing.webservices.schema.routeservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_02-b08-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "RouteService", targetNamespace = "http://dev.virtualearth.net/webservices/v1/route", wsdlLocation = "routeservice.wsdl")
public class RouteService
    extends Service
{

    private final static URL ROUTESERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("file:/E:/workspace/opensource/bing-maps-java-sdk/schema/src/main/resources/com/google/code/bing/webservices/schema/routeservice.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ROUTESERVICE_WSDL_LOCATION = url;
    }

    public RouteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RouteService() {
        super(ROUTESERVICE_WSDL_LOCATION, new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteService"));
    }

    /**
     * 
     * @return
     *     returns IRouteService
     */
    @WebEndpoint(name = "BasicHttpBinding_IRouteService")
    public IRouteService getBasicHttpBindingIRouteService() {
        return (IRouteService)super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/route", "BasicHttpBinding_IRouteService"), IRouteService.class);
    }

    /**
     * 
     * @return
     *     returns IRouteService
     */
    @WebEndpoint(name = "CustomBinding_IRouteService")
    public IRouteService getCustomBindingIRouteService() {
        return (IRouteService)super.getPort(new QName("http://dev.virtualearth.net/webservices/v1/route", "CustomBinding_IRouteService"), IRouteService.class);
    }

}
