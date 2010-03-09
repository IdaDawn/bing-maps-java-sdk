
package net.virtualearth.dev.webservices.v1.route.contracts;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.route.contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateRouteResponse }
     * 
     */
    public CalculateRouteResponse createCalculateRouteResponse() {
        return new CalculateRouteResponse();
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
     * Create an instance of {@link CalculateRoutesFromMajorRoadsResponse }
     * 
     */
    public CalculateRoutesFromMajorRoadsResponse createCalculateRoutesFromMajorRoadsResponse() {
        return new CalculateRoutesFromMajorRoadsResponse();
    }

}
