
package net.virtualearth.dev.webservices.v1.geocode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.virtualearth.dev.webservices.v1.common.Address;
import net.virtualearth.dev.webservices.v1.common.ArrayOfGeocodeResult;
import net.virtualearth.dev.webservices.v1.common.Location;


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
    private final static QName _GeocodeOptionsFilters_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "Filters");
    private final static QName _GeocodeOptionsCount_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "Count");
    private final static QName _GeocodeResponseResults_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "Results");
    private final static QName _GeocodeRequestOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "Options");
    private final static QName _GeocodeRequestAddress_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "Address");
    private final static QName _GeocodeRequestQuery_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "Query");
    private final static QName _ReverseGeocodeRequestLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/geocode", "Location");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.geocode
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
     * Create an instance of {@link ConfidenceFilter }
     * 
     */
    public ConfidenceFilter createConfidenceFilter() {
        return new ConfidenceFilter();
    }

    /**
     * Create an instance of {@link GeocodeRequest }
     * 
     */
    public GeocodeRequest createGeocodeRequest() {
        return new GeocodeRequest();
    }

    /**
     * Create an instance of {@link FilterBase }
     * 
     */
    public FilterBase createFilterBase() {
        return new FilterBase();
    }

    /**
     * Create an instance of {@link ReverseGeocodeRequest }
     * 
     */
    public ReverseGeocodeRequest createReverseGeocodeRequest() {
        return new ReverseGeocodeRequest();
    }

    /**
     * Create an instance of {@link ArrayOfFilterBase }
     * 
     */
    public ArrayOfFilterBase createArrayOfFilterBase() {
        return new ArrayOfFilterBase();
    }

    /**
     * Create an instance of {@link GeocodeOptions }
     * 
     */
    public GeocodeOptions createGeocodeOptions() {
        return new GeocodeOptions();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFilterBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "Filters", scope = GeocodeOptions.class)
    public JAXBElement<ArrayOfFilterBase> createGeocodeOptionsFilters(ArrayOfFilterBase value) {
        return new JAXBElement<ArrayOfFilterBase>(_GeocodeOptionsFilters_QNAME, ArrayOfFilterBase.class, GeocodeOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "Count", scope = GeocodeOptions.class)
    public JAXBElement<Integer> createGeocodeOptionsCount(Integer value) {
        return new JAXBElement<Integer>(_GeocodeOptionsCount_QNAME, Integer.class, GeocodeOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeocodeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "Results", scope = GeocodeResponse.class)
    public JAXBElement<ArrayOfGeocodeResult> createGeocodeResponseResults(ArrayOfGeocodeResult value) {
        return new JAXBElement<ArrayOfGeocodeResult>(_GeocodeResponseResults_QNAME, ArrayOfGeocodeResult.class, GeocodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "Options", scope = GeocodeRequest.class)
    public JAXBElement<GeocodeOptions> createGeocodeRequestOptions(GeocodeOptions value) {
        return new JAXBElement<GeocodeOptions>(_GeocodeRequestOptions_QNAME, GeocodeOptions.class, GeocodeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "Address", scope = GeocodeRequest.class)
    public JAXBElement<Address> createGeocodeRequestAddress(Address value) {
        return new JAXBElement<Address>(_GeocodeRequestAddress_QNAME, Address.class, GeocodeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "Query", scope = GeocodeRequest.class)
    public JAXBElement<String> createGeocodeRequestQuery(String value) {
        return new JAXBElement<String>(_GeocodeRequestQuery_QNAME, String.class, GeocodeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/geocode", name = "Location", scope = ReverseGeocodeRequest.class)
    public JAXBElement<Location> createReverseGeocodeRequestLocation(Location value) {
        return new JAXBElement<Location>(_ReverseGeocodeRequestLocation_QNAME, Location.class, ReverseGeocodeRequest.class, value);
    }

}
