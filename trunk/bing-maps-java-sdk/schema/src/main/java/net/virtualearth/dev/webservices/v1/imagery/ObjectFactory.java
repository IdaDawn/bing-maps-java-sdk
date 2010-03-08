
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import net.virtualearth.dev.webservices.v1.common.ArrayOfPushpin;
import net.virtualearth.dev.webservices.v1.common.Heading;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.RangeOfdateTime;
import net.virtualearth.dev.webservices.v1.common.RangeOfint;
import net.virtualearth.dev.webservices.v1.common.Rectangle;
import net.virtualearth.dev.webservices.v1.common.SizeOfint;


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
    private final static QName _ImageryProviderCoverageAreas_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "CoverageAreas");
    private final static QName _ImageryProviderAttribution_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Attribution");
    private final static QName _ImageryMetadataResultVintage_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Vintage");
    private final static QName _ImageryMetadataResultImageUri_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageUri");
    private final static QName _ImageryMetadataResultImageUriSubdomains_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageUriSubdomains");
    private final static QName _ImageryMetadataResultImageryProviders_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryProviders");
    private final static QName _ImageryMetadataResultZoomRange_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ZoomRange");
    private final static QName _ImageryMetadataResultImageSize_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageSize");
    private final static QName _MapUriResponseUri_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Uri");
    private final static QName _ImageryMetadataResponseResults_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Results");
    private final static QName _ImageryMetadataOptionsHeading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Heading");
    private final static QName _ImageryMetadataOptionsLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Location");
    private final static QName _ImageryMetadataOptionsZoomLevel_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ZoomLevel");
    private final static QName _MapUriRequestOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Options");
    private final static QName _MapUriRequestPushpins_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Pushpins");
    private final static QName _MapUriRequestCenter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Center");
    private final static QName _MapUriRequestMajorRoutesDestination_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MajorRoutesDestination");
    private final static QName _MapUriOptionsDisplayLayers_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "DisplayLayers");
    private final static QName _CoverageAreaBoundingRectangle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "BoundingRectangle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.imagery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImageryProvider }
     * 
     */
    public ImageryProvider createImageryProvider() {
        return new ImageryProvider();
    }

    /**
     * Create an instance of {@link ImageryMetadataResult }
     * 
     */
    public ImageryMetadataResult createImageryMetadataResult() {
        return new ImageryMetadataResult();
    }

    /**
     * Create an instance of {@link MapUriResponse }
     * 
     */
    public MapUriResponse createMapUriResponse() {
        return new MapUriResponse();
    }

    /**
     * Create an instance of {@link ImageryMetadataResponse }
     * 
     */
    public ImageryMetadataResponse createImageryMetadataResponse() {
        return new ImageryMetadataResponse();
    }

    /**
     * Create an instance of {@link ImageryMetadataOptions }
     * 
     */
    public ImageryMetadataOptions createImageryMetadataOptions() {
        return new ImageryMetadataOptions();
    }

    /**
     * Create an instance of {@link ImageryMetadataBirdseyeResult }
     * 
     */
    public ImageryMetadataBirdseyeResult createImageryMetadataBirdseyeResult() {
        return new ImageryMetadataBirdseyeResult();
    }

    /**
     * Create an instance of {@link MapUriRequest }
     * 
     */
    public MapUriRequest createMapUriRequest() {
        return new MapUriRequest();
    }

    /**
     * Create an instance of {@link ArrayOfImageryProvider }
     * 
     */
    public ArrayOfImageryProvider createArrayOfImageryProvider() {
        return new ArrayOfImageryProvider();
    }

    /**
     * Create an instance of {@link MapUriOptions }
     * 
     */
    public MapUriOptions createMapUriOptions() {
        return new MapUriOptions();
    }

    /**
     * Create an instance of {@link CoverageArea }
     * 
     */
    public CoverageArea createCoverageArea() {
        return new CoverageArea();
    }

    /**
     * Create an instance of {@link ImageryMetadataRequest }
     * 
     */
    public ImageryMetadataRequest createImageryMetadataRequest() {
        return new ImageryMetadataRequest();
    }

    /**
     * Create an instance of {@link ArrayOfImageryMetadataResult }
     * 
     */
    public ArrayOfImageryMetadataResult createArrayOfImageryMetadataResult() {
        return new ArrayOfImageryMetadataResult();
    }

    /**
     * Create an instance of {@link ArrayOfCoverageArea }
     * 
     */
    public ArrayOfCoverageArea createArrayOfCoverageArea() {
        return new ArrayOfCoverageArea();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoverageArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "CoverageAreas", scope = ImageryProvider.class)
    public JAXBElement<ArrayOfCoverageArea> createImageryProviderCoverageAreas(ArrayOfCoverageArea value) {
        return new JAXBElement<ArrayOfCoverageArea>(_ImageryProviderCoverageAreas_QNAME, ArrayOfCoverageArea.class, ImageryProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Attribution", scope = ImageryProvider.class)
    public JAXBElement<String> createImageryProviderAttribution(String value) {
        return new JAXBElement<String>(_ImageryProviderAttribution_QNAME, String.class, ImageryProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeOfdateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Vintage", scope = ImageryMetadataResult.class)
    public JAXBElement<RangeOfdateTime> createImageryMetadataResultVintage(RangeOfdateTime value) {
        return new JAXBElement<RangeOfdateTime>(_ImageryMetadataResultVintage_QNAME, RangeOfdateTime.class, ImageryMetadataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageUri", scope = ImageryMetadataResult.class)
    public JAXBElement<String> createImageryMetadataResultImageUri(String value) {
        return new JAXBElement<String>(_ImageryMetadataResultImageUri_QNAME, String.class, ImageryMetadataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageUriSubdomains", scope = ImageryMetadataResult.class)
    public JAXBElement<ArrayOfstring> createImageryMetadataResultImageUriSubdomains(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ImageryMetadataResultImageUriSubdomains_QNAME, ArrayOfstring.class, ImageryMetadataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImageryProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageryProviders", scope = ImageryMetadataResult.class)
    public JAXBElement<ArrayOfImageryProvider> createImageryMetadataResultImageryProviders(ArrayOfImageryProvider value) {
        return new JAXBElement<ArrayOfImageryProvider>(_ImageryMetadataResultImageryProviders_QNAME, ArrayOfImageryProvider.class, ImageryMetadataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ZoomRange", scope = ImageryMetadataResult.class)
    public JAXBElement<RangeOfint> createImageryMetadataResultZoomRange(RangeOfint value) {
        return new JAXBElement<RangeOfint>(_ImageryMetadataResultZoomRange_QNAME, RangeOfint.class, ImageryMetadataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageSize", scope = ImageryMetadataResult.class)
    public JAXBElement<SizeOfint> createImageryMetadataResultImageSize(SizeOfint value) {
        return new JAXBElement<SizeOfint>(_ImageryMetadataResultImageSize_QNAME, SizeOfint.class, ImageryMetadataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Uri", scope = MapUriResponse.class)
    public JAXBElement<String> createMapUriResponseUri(String value) {
        return new JAXBElement<String>(_MapUriResponseUri_QNAME, String.class, MapUriResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImageryMetadataResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Results", scope = ImageryMetadataResponse.class)
    public JAXBElement<ArrayOfImageryMetadataResult> createImageryMetadataResponseResults(ArrayOfImageryMetadataResult value) {
        return new JAXBElement<ArrayOfImageryMetadataResult>(_ImageryMetadataResponseResults_QNAME, ArrayOfImageryMetadataResult.class, ImageryMetadataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Heading }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Heading", scope = ImageryMetadataOptions.class)
    public JAXBElement<Heading> createImageryMetadataOptionsHeading(Heading value) {
        return new JAXBElement<Heading>(_ImageryMetadataOptionsHeading_QNAME, Heading.class, ImageryMetadataOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Location", scope = ImageryMetadataOptions.class)
    public JAXBElement<Location> createImageryMetadataOptionsLocation(Location value) {
        return new JAXBElement<Location>(_ImageryMetadataOptionsLocation_QNAME, Location.class, ImageryMetadataOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ZoomLevel", scope = ImageryMetadataOptions.class)
    public JAXBElement<Integer> createImageryMetadataOptionsZoomLevel(Integer value) {
        return new JAXBElement<Integer>(_ImageryMetadataOptionsZoomLevel_QNAME, Integer.class, ImageryMetadataOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Heading }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Heading", scope = ImageryMetadataBirdseyeResult.class)
    public JAXBElement<Heading> createImageryMetadataBirdseyeResultHeading(Heading value) {
        return new JAXBElement<Heading>(_ImageryMetadataOptionsHeading_QNAME, Heading.class, ImageryMetadataBirdseyeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Options", scope = MapUriRequest.class)
    public JAXBElement<MapUriOptions> createMapUriRequestOptions(MapUriOptions value) {
        return new JAXBElement<MapUriOptions>(_MapUriRequestOptions_QNAME, MapUriOptions.class, MapUriRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPushpin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Pushpins", scope = MapUriRequest.class)
    public JAXBElement<ArrayOfPushpin> createMapUriRequestPushpins(ArrayOfPushpin value) {
        return new JAXBElement<ArrayOfPushpin>(_MapUriRequestPushpins_QNAME, ArrayOfPushpin.class, MapUriRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Center", scope = MapUriRequest.class)
    public JAXBElement<Location> createMapUriRequestCenter(Location value) {
        return new JAXBElement<Location>(_MapUriRequestCenter_QNAME, Location.class, MapUriRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "MajorRoutesDestination", scope = MapUriRequest.class)
    public JAXBElement<Location> createMapUriRequestMajorRoutesDestination(Location value) {
        return new JAXBElement<Location>(_MapUriRequestMajorRoutesDestination_QNAME, Location.class, MapUriRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "DisplayLayers", scope = MapUriOptions.class)
    public JAXBElement<ArrayOfstring> createMapUriOptionsDisplayLayers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_MapUriOptionsDisplayLayers_QNAME, ArrayOfstring.class, MapUriOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ZoomLevel", scope = MapUriOptions.class)
    public JAXBElement<Integer> createMapUriOptionsZoomLevel(Integer value) {
        return new JAXBElement<Integer>(_ImageryMetadataOptionsZoomLevel_QNAME, Integer.class, MapUriOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ImageSize", scope = MapUriOptions.class)
    public JAXBElement<SizeOfint> createMapUriOptionsImageSize(SizeOfint value) {
        return new JAXBElement<SizeOfint>(_ImageryMetadataResultImageSize_QNAME, SizeOfint.class, MapUriOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rectangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "BoundingRectangle", scope = CoverageArea.class)
    public JAXBElement<Rectangle> createCoverageAreaBoundingRectangle(Rectangle value) {
        return new JAXBElement<Rectangle>(_CoverageAreaBoundingRectangle_QNAME, Rectangle.class, CoverageArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "ZoomRange", scope = CoverageArea.class)
    public JAXBElement<RangeOfint> createCoverageAreaZoomRange(RangeOfint value) {
        return new JAXBElement<RangeOfint>(_ImageryMetadataResultZoomRange_QNAME, RangeOfint.class, CoverageArea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Options", scope = ImageryMetadataRequest.class)
    public JAXBElement<ImageryMetadataOptions> createImageryMetadataRequestOptions(ImageryMetadataOptions value) {
        return new JAXBElement<ImageryMetadataOptions>(_MapUriRequestOptions_QNAME, ImageryMetadataOptions.class, ImageryMetadataRequest.class, value);
    }

}
