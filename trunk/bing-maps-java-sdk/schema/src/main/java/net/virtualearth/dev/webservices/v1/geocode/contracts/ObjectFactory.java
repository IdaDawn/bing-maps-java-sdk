
package net.virtualearth.dev.webservices.v1.geocode.contracts;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.geocode.contracts package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.geocode.contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeocodeResponse }
     * 
     */
    public GeocodeResponse createGeocodeResponse() {
        return new GeocodeResponse();
    }

    /**
     * Create an instance of {@link ReverseGeocode }
     * 
     */
    public ReverseGeocode createReverseGeocode() {
        return new ReverseGeocode();
    }

    /**
     * Create an instance of {@link ReverseGeocodeResponse }
     * 
     */
    public ReverseGeocodeResponse createReverseGeocodeResponse() {
        return new ReverseGeocodeResponse();
    }

    /**
     * Create an instance of {@link Geocode }
     * 
     */
    public Geocode createGeocode() {
        return new Geocode();
    }

}
