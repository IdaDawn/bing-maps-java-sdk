
package net.virtualearth.dev.webservices.v1.geocode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.geocode package. 
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

    private final static QName _FilterBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "FilterBase");
    private final static QName _ReverseGeocodeRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "ReverseGeocodeRequest");
    private final static QName _GeocodeOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "GeocodeOptions");
    private final static QName _GeocodeRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "GeocodeRequest");
    private final static QName _ArrayOfFilterBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "ArrayOfFilterBase");
    private final static QName _ConfidenceFilter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "ConfidenceFilter");
    private final static QName _GeocodeResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "GeocodeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.geocode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeocodeRequest }
     * 
     */
    public GeocodeRequest createGeocodeRequest() {
        return new GeocodeRequest();
    }

    /**
     * Create an instance of {@link GeocodeResponse }
     * 
     */
    public GeocodeResponse createGeocodeResponse() {
        return new GeocodeResponse();
    }

    /**
     * Create an instance of {@link ReverseGeocodeRequest }
     * 
     */
    public ReverseGeocodeRequest createReverseGeocodeRequest() {
        return new ReverseGeocodeRequest();
    }

    /**
     * Create an instance of {@link ConfidenceFilter }
     * 
     */
    public ConfidenceFilter createConfidenceFilter() {
        return new ConfidenceFilter();
    }

    /**
     * Create an instance of {@link GeocodeOptions }
     * 
     */
    public GeocodeOptions createGeocodeOptions() {
        return new GeocodeOptions();
    }

    /**
     * Create an instance of {@link FilterBase }
     * 
     */
    public FilterBase createFilterBase() {
        return new FilterBase();
    }

    /**
     * Create an instance of {@link ArrayOfFilterBase }
     * 
     */
    public ArrayOfFilterBase createArrayOfFilterBase() {
        return new ArrayOfFilterBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "FilterBase")
    public JAXBElement<FilterBase> createFilterBase(FilterBase value) {
        return new JAXBElement<FilterBase>(_FilterBase_QNAME, FilterBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseGeocodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "ReverseGeocodeRequest")
    public JAXBElement<ReverseGeocodeRequest> createReverseGeocodeRequest(ReverseGeocodeRequest value) {
        return new JAXBElement<ReverseGeocodeRequest>(_ReverseGeocodeRequest_QNAME, ReverseGeocodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "GeocodeOptions")
    public JAXBElement<GeocodeOptions> createGeocodeOptions(GeocodeOptions value) {
        return new JAXBElement<GeocodeOptions>(_GeocodeOptions_QNAME, GeocodeOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "GeocodeRequest")
    public JAXBElement<GeocodeRequest> createGeocodeRequest(GeocodeRequest value) {
        return new JAXBElement<GeocodeRequest>(_GeocodeRequest_QNAME, GeocodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFilterBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "ArrayOfFilterBase")
    public JAXBElement<ArrayOfFilterBase> createArrayOfFilterBase(ArrayOfFilterBase value) {
        return new JAXBElement<ArrayOfFilterBase>(_ArrayOfFilterBase_QNAME, ArrayOfFilterBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfidenceFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "ConfidenceFilter")
    public JAXBElement<ConfidenceFilter> createConfidenceFilter(ConfidenceFilter value) {
        return new JAXBElement<ConfidenceFilter>(_ConfidenceFilter_QNAME, ConfidenceFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "GeocodeResponse")
    public JAXBElement<GeocodeResponse> createGeocodeResponse(GeocodeResponse value) {
        return new JAXBElement<GeocodeResponse>(_GeocodeResponse_QNAME, GeocodeResponse.class, null, value);
    }

}
