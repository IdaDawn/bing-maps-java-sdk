
package net.virtualearth.dev.webservices.v1.route.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.virtualearth.dev.webservices.v1.route.MajorRoutesRequest;
import net.virtualearth.dev.webservices.v1.route.MajorRoutesResponse;
import net.virtualearth.dev.webservices.v1.route.RouteRequest;
import net.virtualearth.dev.webservices.v1.route.RouteResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.route.contracts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculateRouteRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route/contracts", "request");
    private final static QName _CalculateRouteResponseCalculateRouteResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route/contracts", "CalculateRouteResult");
    private final static QName _CalculateRoutesFromMajorRoadsResponseCalculateRoutesFromMajorRoadsResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route/contracts", "CalculateRoutesFromMajorRoadsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.route.contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateRoute }
     * 
     */
    public CalculateRoute createCalculateRoute() {
        return new CalculateRoute();
    }

    /**
     * Create an instance of {@link CalculateRoutesFromMajorRoads }
     * 
     */
    public CalculateRoutesFromMajorRoads createCalculateRoutesFromMajorRoads() {
        return new CalculateRoutesFromMajorRoads();
    }

    /**
     * Create an instance of {@link CalculateRouteResponse }
     * 
     */
    public CalculateRouteResponse createCalculateRouteResponse() {
        return new CalculateRouteResponse();
    }

    /**
     * Create an instance of {@link CalculateRoutesFromMajorRoadsResponse }
     * 
     */
    public CalculateRoutesFromMajorRoadsResponse createCalculateRoutesFromMajorRoadsResponse() {
        return new CalculateRoutesFromMajorRoadsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "request", scope = CalculateRoute.class)
    public JAXBElement<RouteRequest> createCalculateRouteRequest(RouteRequest value) {
        return new JAXBElement<RouteRequest>(_CalculateRouteRequest_QNAME, RouteRequest.class, CalculateRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "request", scope = CalculateRoutesFromMajorRoads.class)
    public JAXBElement<MajorRoutesRequest> createCalculateRoutesFromMajorRoadsRequest(MajorRoutesRequest value) {
        return new JAXBElement<MajorRoutesRequest>(_CalculateRouteRequest_QNAME, MajorRoutesRequest.class, CalculateRoutesFromMajorRoads.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "CalculateRouteResult", scope = CalculateRouteResponse.class)
    public JAXBElement<RouteResponse> createCalculateRouteResponseCalculateRouteResult(RouteResponse value) {
        return new JAXBElement<RouteResponse>(_CalculateRouteResponseCalculateRouteResult_QNAME, RouteResponse.class, CalculateRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "CalculateRoutesFromMajorRoadsResult", scope = CalculateRoutesFromMajorRoadsResponse.class)
    public JAXBElement<MajorRoutesResponse> createCalculateRoutesFromMajorRoadsResponseCalculateRoutesFromMajorRoadsResult(MajorRoutesResponse value) {
        return new JAXBElement<MajorRoutesResponse>(_CalculateRoutesFromMajorRoadsResponseCalculateRoutesFromMajorRoadsResult_QNAME, MajorRoutesResponse.class, CalculateRoutesFromMajorRoadsResponse.class, value);
    }

}
