
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.imagery package. 
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

    private final static QName _ImageryProvider_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryProvider");
    private final static QName _ArrayOfImageryProvider_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ArrayOfImageryProvider");
    private final static QName _ImageryMetadataRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataRequest");
    private final static QName _ImageryMetadataOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataOptions");
    private final static QName _MapUriResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MapUriResponse");
    private final static QName _ArrayOfCoverageArea_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ArrayOfCoverageArea");
    private final static QName _ImageryMetadataBirdseyeResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataBirdseyeResult");
    private final static QName _MapUriRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MapUriRequest");
    private final static QName _CoverageArea_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "CoverageArea");
    private final static QName _ArrayOfImageryMetadataResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ArrayOfImageryMetadataResult");
    private final static QName _MapUriOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MapUriOptions");
    private final static QName _ImageryMetadataResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataResponse");
    private final static QName _ImageryMetadataResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.imagery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImageryMetadataBirdseyeResult }
     * 
     */
    public ImageryMetadataBirdseyeResult createImageryMetadataBirdseyeResult() {
        return new ImageryMetadataBirdseyeResult();
    }

    /**
     * Create an instance of {@link ImageryMetadataResult }
     * 
     */
    public ImageryMetadataResult createImageryMetadataResult() {
        return new ImageryMetadataResult();
    }

    /**
     * Create an instance of {@link ArrayOfImageryMetadataResult }
     * 
     */
    public ArrayOfImageryMetadataResult createArrayOfImageryMetadataResult() {
        return new ArrayOfImageryMetadataResult();
    }

    /**
     * Create an instance of {@link ArrayOfImageryProvider }
     * 
     */
    public ArrayOfImageryProvider createArrayOfImageryProvider() {
        return new ArrayOfImageryProvider();
    }

    /**
     * Create an instance of {@link ImageryMetadataOptions }
     * 
     */
    public ImageryMetadataOptions createImageryMetadataOptions() {
        return new ImageryMetadataOptions();
    }

    /**
     * Create an instance of {@link MapUriResponse }
     * 
     */
    public MapUriResponse createMapUriResponse() {
        return new MapUriResponse();
    }

    /**
     * Create an instance of {@link MapUriOptions }
     * 
     */
    public MapUriOptions createMapUriOptions() {
        return new MapUriOptions();
    }

    /**
     * Create an instance of {@link MapUriRequest }
     * 
     */
    public MapUriRequest createMapUriRequest() {
        return new MapUriRequest();
    }

    /**
     * Create an instance of {@link ImageryMetadataRequest }
     * 
     */
    public ImageryMetadataRequest createImageryMetadataRequest() {
        return new ImageryMetadataRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCoverageArea }
     * 
     */
    public ArrayOfCoverageArea createArrayOfCoverageArea() {
        return new ArrayOfCoverageArea();
    }

    /**
     * Create an instance of {@link ImageryMetadataResponse }
     * 
     */
    public ImageryMetadataResponse createImageryMetadataResponse() {
        return new ImageryMetadataResponse();
    }

    /**
     * Create an instance of {@link CoverageArea }
     * 
     */
    public CoverageArea createCoverageArea() {
        return new CoverageArea();
    }

    /**
     * Create an instance of {@link ImageryProvider }
     * 
     */
    public ImageryProvider createImageryProvider() {
        return new ImageryProvider();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageryProvider")
    public JAXBElement<ImageryProvider> createImageryProvider(ImageryProvider value) {
        return new JAXBElement<ImageryProvider>(_ImageryProvider_QNAME, ImageryProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImageryProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ArrayOfImageryProvider")
    public JAXBElement<ArrayOfImageryProvider> createArrayOfImageryProvider(ArrayOfImageryProvider value) {
        return new JAXBElement<ArrayOfImageryProvider>(_ArrayOfImageryProvider_QNAME, ArrayOfImageryProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageryMetadataRequest")
    public JAXBElement<ImageryMetadataRequest> createImageryMetadataRequest(ImageryMetadataRequest value) {
        return new JAXBElement<ImageryMetadataRequest>(_ImageryMetadataRequest_QNAME, ImageryMetadataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageryMetadataOptions")
    public JAXBElement<ImageryMetadataOptions> createImageryMetadataOptions(ImageryMetadataOptions value) {
        return new JAXBElement<ImageryMetadataOptions>(_ImageryMetadataOptions_QNAME, ImageryMetadataOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "MapUriResponse")
    public JAXBElement<MapUriResponse> createMapUriResponse(MapUriResponse value) {
        return new JAXBElement<MapUriResponse>(_MapUriResponse_QNAME, MapUriResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoverageArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ArrayOfCoverageArea")
    public JAXBElement<ArrayOfCoverageArea> createArrayOfCoverageArea(ArrayOfCoverageArea value) {
        return new JAXBElement<ArrayOfCoverageArea>(_ArrayOfCoverageArea_QNAME, ArrayOfCoverageArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataBirdseyeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageryMetadataBirdseyeResult")
    public JAXBElement<ImageryMetadataBirdseyeResult> createImageryMetadataBirdseyeResult(ImageryMetadataBirdseyeResult value) {
        return new JAXBElement<ImageryMetadataBirdseyeResult>(_ImageryMetadataBirdseyeResult_QNAME, ImageryMetadataBirdseyeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "MapUriRequest")
    public JAXBElement<MapUriRequest> createMapUriRequest(MapUriRequest value) {
        return new JAXBElement<MapUriRequest>(_MapUriRequest_QNAME, MapUriRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "CoverageArea")
    public JAXBElement<CoverageArea> createCoverageArea(CoverageArea value) {
        return new JAXBElement<CoverageArea>(_CoverageArea_QNAME, CoverageArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImageryMetadataResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ArrayOfImageryMetadataResult")
    public JAXBElement<ArrayOfImageryMetadataResult> createArrayOfImageryMetadataResult(ArrayOfImageryMetadataResult value) {
        return new JAXBElement<ArrayOfImageryMetadataResult>(_ArrayOfImageryMetadataResult_QNAME, ArrayOfImageryMetadataResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "MapUriOptions")
    public JAXBElement<MapUriOptions> createMapUriOptions(MapUriOptions value) {
        return new JAXBElement<MapUriOptions>(_MapUriOptions_QNAME, MapUriOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageryMetadataResponse")
    public JAXBElement<ImageryMetadataResponse> createImageryMetadataResponse(ImageryMetadataResponse value) {
        return new JAXBElement<ImageryMetadataResponse>(_ImageryMetadataResponse_QNAME, ImageryMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageryMetadataResult")
    public JAXBElement<ImageryMetadataResult> createImageryMetadataResult(ImageryMetadataResult value) {
        return new JAXBElement<ImageryMetadataResult>(_ImageryMetadataResult_QNAME, ImageryMetadataResult.class, null, value);
    }

}
