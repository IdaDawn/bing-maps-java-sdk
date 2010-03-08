
package net.virtualearth.dev.webservices.v1.geocode.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.virtualearth.dev.webservices.v1.geocode.GeocodeRequest;
import net.virtualearth.dev.webservices.v1.geocode.ReverseGeocodeRequest;


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

    private final static QName _ReverseGeocodeResponseReverseGeocodeResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode/contracts", "ReverseGeocodeResult");
    private final static QName _GeocodeRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode/contracts", "request");
    private final static QName _GeocodeResponseGeocodeResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode/contracts", "GeocodeResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.geocode.contracts
     * 
     */
    public ObjectFactory() {
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

    /**
     * Create an instance of {@link net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse }
     * 
     */
    public net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse createGeocodeResponse() {
        return new net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse();
    }

    /**
     * Create an instance of {@link ReverseGeocode }
     * 
     */
    public ReverseGeocode createReverseGeocode() {
        return new ReverseGeocode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode/contracts", name = "ReverseGeocodeResult", scope = ReverseGeocodeResponse.class)
    public JAXBElement<net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse> createReverseGeocodeResponseReverseGeocodeResult(net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse value) {
        return new JAXBElement<net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse>(_ReverseGeocodeResponseReverseGeocodeResult_QNAME, net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse.class, ReverseGeocodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode/contracts", name = "request", scope = Geocode.class)
    public JAXBElement<GeocodeRequest> createGeocodeRequest(GeocodeRequest value) {
        return new JAXBElement<GeocodeRequest>(_GeocodeRequest_QNAME, GeocodeRequest.class, Geocode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode/contracts", name = "GeocodeResult", scope = net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse.class)
    public JAXBElement<net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse> createGeocodeResponseGeocodeResult(net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse value) {
        return new JAXBElement<net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse>(_GeocodeResponseGeocodeResult_QNAME, net.virtualearth.dev.webservices.v1.geocode.GeocodeResponse.class, net.virtualearth.dev.webservices.v1.geocode.contracts.GeocodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseGeocodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode/contracts", name = "request", scope = ReverseGeocode.class)
    public JAXBElement<ReverseGeocodeRequest> createReverseGeocodeRequest(ReverseGeocodeRequest value) {
        return new JAXBElement<ReverseGeocodeRequest>(_GeocodeRequest_QNAME, ReverseGeocodeRequest.class, ReverseGeocode.class, value);
    }

}
