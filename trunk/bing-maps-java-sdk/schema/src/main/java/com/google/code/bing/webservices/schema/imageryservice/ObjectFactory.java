
package com.google.code.bing.webservices.schema.imageryservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.code.bing.webservices.schema.imageryservice package. 
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

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DeviceType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "DeviceType");
    private final static QName _ShapeBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ShapeBase");
    private final static QName _ImageType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ImageType");
    private final static QName _Confidence_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Confidence");
    private final static QName _ImageryProvider_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryProvider");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfImageryProvider_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ArrayOfImageryProvider");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DistanceUnit_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "DistanceUnit");
    private final static QName _Circle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Circle");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _MapStyle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "MapStyle");
    private final static QName _ArrayOfPushpin_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ArrayOfPushpin");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ResponseBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseBase");
    private final static QName _ImageryMetadataRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataRequest");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _AuthenticationResultCode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "AuthenticationResultCode");
    private final static QName _ImageryMetadataOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataOptions");
    private final static QName _MapUriResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MapUriResponse");
    private final static QName _GeocodeLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "GeocodeLocation");
    private final static QName _ArrayOfCoverageArea_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ArrayOfCoverageArea");
    private final static QName _SearchPoint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "SearchPoint");
    private final static QName _Heading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Heading");
    private final static QName _ImageryMetadataBirdseyeResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataBirdseyeResult");
    private final static QName _Credentials_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Credentials");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _MapUriRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MapUriRequest");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ExecutionOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ExecutionOptions");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _UriScheme_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "UriScheme");
    private final static QName _Pushpin_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Pushpin");
    private final static QName _ResponseStatusCode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseStatusCode");
    private final static QName _CoverageArea_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "CoverageArea");
    private final static QName _RequestBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "RequestBase");
    private final static QName _Location_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Location");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfImageryMetadataResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ArrayOfImageryMetadataResult");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _UserLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "UserLocation");
    private final static QName _SizeOfint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "SizeOfint");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Rectangle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Rectangle");
    private final static QName _ArrayOfLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ArrayOfLocation");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _UserProfile_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "UserProfile");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _RangeOfdateTime_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "RangeOfdateTime");
    private final static QName _MapUriOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MapUriOptions");
    private final static QName _ImageryMetadataResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataResponse");
    private final static QName _RangeOfint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "RangeOfint");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Polygon_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Polygon");
    private final static QName _ImageryMetadataResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ImageryMetadataResult");
    private final static QName _ResponseSummary_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseSummary");
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
    private final static QName _GetImageryMetadataRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery/contracts", "request");
    private final static QName _GetMapUriResponseGetMapUriResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery/contracts", "GetMapUriResult");
    private final static QName _CredentialsToken_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Token");
    private final static QName _CredentialsApplicationId_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ApplicationId");
    private final static QName _RequestBaseCulture_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Culture");
    private final static QName _ImageryMetadataOptionsHeading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Heading");
    private final static QName _ImageryMetadataOptionsLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Location");
    private final static QName _ImageryMetadataOptionsZoomLevel_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "ZoomLevel");
    private final static QName _ImageryMetadataRequestOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Options");
    private final static QName _GeocodeLocationCalculationMethod_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CalculationMethod");
    private final static QName _MapUriOptionsDisplayLayers_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "DisplayLayers");
    private final static QName _GetImageryMetadataResponseGetImageryMetadataResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery/contracts", "GetImageryMetadataResult");
    private final static QName _CircleCenter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Center");
    private final static QName _ResponseSummaryTraceId_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "TraceId");
    private final static QName _ResponseSummaryCopyright_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Copyright");
    private final static QName _ResponseSummaryFaultReason_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "FaultReason");
    private final static QName _CoverageAreaBoundingRectangle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "BoundingRectangle");
    private final static QName _PolygonVertices_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Vertices");
    private final static QName _UserProfileScreenSize_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ScreenSize");
    private final static QName _UserProfileCurrentLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CurrentLocation");
    private final static QName _UserProfileCurrentHeading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CurrentHeading");
    private final static QName _UserProfileMapView_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "MapView");
    private final static QName _UserProfileIPAddress_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "IPAddress");
    private final static QName _PushpinLabel_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Label");
    private final static QName _PushpinIconStyle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "IconStyle");
    private final static QName _SearchPointPoint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search", "Point");
    private final static QName _MapUriRequestPushpins_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Pushpins");
    private final static QName _MapUriRequestCenter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "Center");
    private final static QName _MapUriRequestMajorRoutesDestination_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery", "MajorRoutesDestination");
    private final static QName _RectangleSouthwest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Southwest");
    private final static QName _RectangleNortheast_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Northeast");
    private final static QName _ResponseBaseBrandLogoUri_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "BrandLogoUri");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.code.bing.webservices.schema.imageryservice
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
     * Create an instance of {@link Heading }
     * 
     */
    public Heading createHeading() {
        return new Heading();
    }

    /**
     * Create an instance of {@link ImageryMetadataResponse }
     * 
     */
    public ImageryMetadataResponse createImageryMetadataResponse() {
        return new ImageryMetadataResponse();
    }

    /**
     * Create an instance of {@link GetImageryMetadata }
     * 
     */
    public GetImageryMetadata createGetImageryMetadata() {
        return new GetImageryMetadata();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link GetMapUriResponse }
     * 
     */
    public GetMapUriResponse createGetMapUriResponse() {
        return new GetMapUriResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link ImageryMetadataRequest }
     * 
     */
    public ImageryMetadataRequest createImageryMetadataRequest() {
        return new ImageryMetadataRequest();
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
     * Create an instance of {@link ArrayOfImageryProvider }
     * 
     */
    public ArrayOfImageryProvider createArrayOfImageryProvider() {
        return new ArrayOfImageryProvider();
    }

    /**
     * Create an instance of {@link GeocodeLocation }
     * 
     */
    public GeocodeLocation createGeocodeLocation() {
        return new GeocodeLocation();
    }

    /**
     * Create an instance of {@link MapUriOptions }
     * 
     */
    public MapUriOptions createMapUriOptions() {
        return new MapUriOptions();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link UserLocation }
     * 
     */
    public UserLocation createUserLocation() {
        return new UserLocation();
    }

    /**
     * Create an instance of {@link GetImageryMetadataResponse }
     * 
     */
    public GetImageryMetadataResponse createGetImageryMetadataResponse() {
        return new GetImageryMetadataResponse();
    }

    /**
     * Create an instance of {@link ExecutionOptions }
     * 
     */
    public ExecutionOptions createExecutionOptions() {
        return new ExecutionOptions();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link ArrayOfLocation }
     * 
     */
    public ArrayOfLocation createArrayOfLocation() {
        return new ArrayOfLocation();
    }

    /**
     * Create an instance of {@link ResponseSummary }
     * 
     */
    public ResponseSummary createResponseSummary() {
        return new ResponseSummary();
    }

    /**
     * Create an instance of {@link CoverageArea }
     * 
     */
    public CoverageArea createCoverageArea() {
        return new CoverageArea();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link UserProfile }
     * 
     */
    public UserProfile createUserProfile() {
        return new UserProfile();
    }

    /**
     * Create an instance of {@link Pushpin }
     * 
     */
    public Pushpin createPushpin() {
        return new Pushpin();
    }

    /**
     * Create an instance of {@link ArrayOfImageryMetadataResult }
     * 
     */
    public ArrayOfImageryMetadataResult createArrayOfImageryMetadataResult() {
        return new ArrayOfImageryMetadataResult();
    }

    /**
     * Create an instance of {@link ArrayOfPushpin }
     * 
     */
    public ArrayOfPushpin createArrayOfPushpin() {
        return new ArrayOfPushpin();
    }

    /**
     * Create an instance of {@link ArrayOfCoverageArea }
     * 
     */
    public ArrayOfCoverageArea createArrayOfCoverageArea() {
        return new ArrayOfCoverageArea();
    }

    /**
     * Create an instance of {@link SearchPoint }
     * 
     */
    public SearchPoint createSearchPoint() {
        return new SearchPoint();
    }

    /**
     * Create an instance of {@link RangeOfdateTime }
     * 
     */
    public RangeOfdateTime createRangeOfdateTime() {
        return new RangeOfdateTime();
    }

    /**
     * Create an instance of {@link MapUriRequest }
     * 
     */
    public MapUriRequest createMapUriRequest() {
        return new MapUriRequest();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link SizeOfint }
     * 
     */
    public SizeOfint createSizeOfint() {
        return new SizeOfint();
    }

    /**
     * Create an instance of {@link GetMapUri }
     * 
     */
    public GetMapUri createGetMapUri() {
        return new GetMapUri();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link RangeOfint }
     * 
     */
    public RangeOfint createRangeOfint() {
        return new RangeOfint();
    }

    /**
     * Create an instance of {@link ShapeBase }
     * 
     */
    public ShapeBase createShapeBase() {
        return new ShapeBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "DeviceType")
    public JAXBElement<DeviceType> createDeviceType(DeviceType value) {
        return new JAXBElement<DeviceType>(_DeviceType_QNAME, DeviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShapeBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ShapeBase")
    public JAXBElement<ShapeBase> createShapeBase(ShapeBase value) {
        return new JAXBElement<ShapeBase>(_ShapeBase_QNAME, ShapeBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ImageType")
    public JAXBElement<ImageType> createImageType(ImageType value) {
        return new JAXBElement<ImageType>(_ImageType_QNAME, ImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Confidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Confidence")
    public JAXBElement<Confidence> createConfidence(Confidence value) {
        return new JAXBElement<Confidence>(_Confidence_QNAME, Confidence.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "DistanceUnit")
    public JAXBElement<DistanceUnit> createDistanceUnit(DistanceUnit value) {
        return new JAXBElement<DistanceUnit>(_DistanceUnit_QNAME, DistanceUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Circle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Circle")
    public JAXBElement<Circle> createCircle(Circle value) {
        return new JAXBElement<Circle>(_Circle_QNAME, Circle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapStyle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "MapStyle")
    public JAXBElement<MapStyle> createMapStyle(MapStyle value) {
        return new JAXBElement<MapStyle>(_MapStyle_QNAME, MapStyle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPushpin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ArrayOfPushpin")
    public JAXBElement<ArrayOfPushpin> createArrayOfPushpin(ArrayOfPushpin value) {
        return new JAXBElement<ArrayOfPushpin>(_ArrayOfPushpin_QNAME, ArrayOfPushpin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ResponseBase")
    public JAXBElement<ResponseBase> createResponseBase(ResponseBase value) {
        return new JAXBElement<ResponseBase>(_ResponseBase_QNAME, ResponseBase.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationResultCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "AuthenticationResultCode")
    public JAXBElement<AuthenticationResultCode> createAuthenticationResultCode(AuthenticationResultCode value) {
        return new JAXBElement<AuthenticationResultCode>(_AuthenticationResultCode_QNAME, AuthenticationResultCode.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "GeocodeLocation")
    public JAXBElement<GeocodeLocation> createGeocodeLocation(GeocodeLocation value) {
        return new JAXBElement<GeocodeLocation>(_GeocodeLocation_QNAME, GeocodeLocation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "SearchPoint")
    public JAXBElement<SearchPoint> createSearchPoint(SearchPoint value) {
        return new JAXBElement<SearchPoint>(_SearchPoint_QNAME, SearchPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Heading }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Heading")
    public JAXBElement<Heading> createHeading(Heading value) {
        return new JAXBElement<Heading>(_Heading_QNAME, Heading.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutionOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ExecutionOptions")
    public JAXBElement<ExecutionOptions> createExecutionOptions(ExecutionOptions value) {
        return new JAXBElement<ExecutionOptions>(_ExecutionOptions_QNAME, ExecutionOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriScheme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "UriScheme")
    public JAXBElement<UriScheme> createUriScheme(UriScheme value) {
        return new JAXBElement<UriScheme>(_UriScheme_QNAME, UriScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pushpin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Pushpin")
    public JAXBElement<Pushpin> createPushpin(Pushpin value) {
        return new JAXBElement<Pushpin>(_Pushpin_QNAME, Pushpin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ResponseStatusCode")
    public JAXBElement<ResponseStatusCode> createResponseStatusCode(ResponseStatusCode value) {
        return new JAXBElement<ResponseStatusCode>(_ResponseStatusCode_QNAME, ResponseStatusCode.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "RequestBase")
    public JAXBElement<RequestBase> createRequestBase(RequestBase value) {
        return new JAXBElement<RequestBase>(_RequestBase_QNAME, RequestBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "UserLocation")
    public JAXBElement<UserLocation> createUserLocation(UserLocation value) {
        return new JAXBElement<UserLocation>(_UserLocation_QNAME, UserLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "SizeOfint")
    public JAXBElement<SizeOfint> createSizeOfint(SizeOfint value) {
        return new JAXBElement<SizeOfint>(_SizeOfint_QNAME, SizeOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rectangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Rectangle")
    public JAXBElement<Rectangle> createRectangle(Rectangle value) {
        return new JAXBElement<Rectangle>(_Rectangle_QNAME, Rectangle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ArrayOfLocation")
    public JAXBElement<ArrayOfLocation> createArrayOfLocation(ArrayOfLocation value) {
        return new JAXBElement<ArrayOfLocation>(_ArrayOfLocation_QNAME, ArrayOfLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "UserProfile")
    public JAXBElement<UserProfile> createUserProfile(UserProfile value) {
        return new JAXBElement<UserProfile>(_UserProfile_QNAME, UserProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeOfdateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "RangeOfdateTime")
    public JAXBElement<RangeOfdateTime> createRangeOfdateTime(RangeOfdateTime value) {
        return new JAXBElement<RangeOfdateTime>(_RangeOfdateTime_QNAME, RangeOfdateTime.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "RangeOfint")
    public JAXBElement<RangeOfint> createRangeOfint(RangeOfint value) {
        return new JAXBElement<RangeOfint>(_RangeOfint_QNAME, RangeOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Polygon")
    public JAXBElement<Polygon> createPolygon(Polygon value) {
        return new JAXBElement<Polygon>(_Polygon_QNAME, Polygon.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ResponseSummary")
    public JAXBElement<ResponseSummary> createResponseSummary(ResponseSummary value) {
        return new JAXBElement<ResponseSummary>(_ResponseSummary_QNAME, ResponseSummary.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "request", scope = GetImageryMetadata.class)
    public JAXBElement<ImageryMetadataRequest> createGetImageryMetadataRequest(ImageryMetadataRequest value) {
        return new JAXBElement<ImageryMetadataRequest>(_GetImageryMetadataRequest_QNAME, ImageryMetadataRequest.class, GetImageryMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "GetMapUriResult", scope = GetMapUriResponse.class)
    public JAXBElement<MapUriResponse> createGetMapUriResponseGetMapUriResult(MapUriResponse value) {
        return new JAXBElement<MapUriResponse>(_GetMapUriResponseGetMapUriResult_QNAME, MapUriResponse.class, GetMapUriResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Token", scope = Credentials.class)
    public JAXBElement<String> createCredentialsToken(String value) {
        return new JAXBElement<String>(_CredentialsToken_QNAME, String.class, Credentials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ApplicationId", scope = Credentials.class)
    public JAXBElement<String> createCredentialsApplicationId(String value) {
        return new JAXBElement<String>(_CredentialsApplicationId_QNAME, String.class, Credentials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "UserProfile", scope = RequestBase.class)
    public JAXBElement<UserProfile> createRequestBaseUserProfile(UserProfile value) {
        return new JAXBElement<UserProfile>(_UserProfile_QNAME, UserProfile.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Credentials", scope = RequestBase.class)
    public JAXBElement<Credentials> createRequestBaseCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Culture", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseCulture(String value) {
        return new JAXBElement<String>(_RequestBaseCulture_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutionOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ExecutionOptions", scope = RequestBase.class)
    public JAXBElement<ExecutionOptions> createRequestBaseExecutionOptions(ExecutionOptions value) {
        return new JAXBElement<ExecutionOptions>(_ExecutionOptions_QNAME, ExecutionOptions.class, RequestBase.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Options", scope = ImageryMetadataRequest.class)
    public JAXBElement<ImageryMetadataOptions> createImageryMetadataRequestOptions(ImageryMetadataOptions value) {
        return new JAXBElement<ImageryMetadataOptions>(_ImageryMetadataRequestOptions_QNAME, ImageryMetadataOptions.class, ImageryMetadataRequest.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "CalculationMethod", scope = GeocodeLocation.class)
    public JAXBElement<String> createGeocodeLocationCalculationMethod(String value) {
        return new JAXBElement<String>(_GeocodeLocationCalculationMethod_QNAME, String.class, GeocodeLocation.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "GetImageryMetadataResult", scope = GetImageryMetadataResponse.class)
    public JAXBElement<ImageryMetadataResponse> createGetImageryMetadataResponseGetImageryMetadataResult(ImageryMetadataResponse value) {
        return new JAXBElement<ImageryMetadataResponse>(_GetImageryMetadataResponseGetImageryMetadataResult_QNAME, ImageryMetadataResponse.class, GetImageryMetadataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Center", scope = Circle.class)
    public JAXBElement<Location> createCircleCenter(Location value) {
        return new JAXBElement<Location>(_CircleCenter_QNAME, Location.class, Circle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "TraceId", scope = ResponseSummary.class)
    public JAXBElement<String> createResponseSummaryTraceId(String value) {
        return new JAXBElement<String>(_ResponseSummaryTraceId_QNAME, String.class, ResponseSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Copyright", scope = ResponseSummary.class)
    public JAXBElement<String> createResponseSummaryCopyright(String value) {
        return new JAXBElement<String>(_ResponseSummaryCopyright_QNAME, String.class, ResponseSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "FaultReason", scope = ResponseSummary.class)
    public JAXBElement<String> createResponseSummaryFaultReason(String value) {
        return new JAXBElement<String>(_ResponseSummaryFaultReason_QNAME, String.class, ResponseSummary.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Vertices", scope = Polygon.class)
    public JAXBElement<ArrayOfLocation> createPolygonVertices(ArrayOfLocation value) {
        return new JAXBElement<ArrayOfLocation>(_PolygonVertices_QNAME, ArrayOfLocation.class, Polygon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ScreenSize", scope = UserProfile.class)
    public JAXBElement<SizeOfint> createUserProfileScreenSize(SizeOfint value) {
        return new JAXBElement<SizeOfint>(_UserProfileScreenSize_QNAME, SizeOfint.class, UserProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "CurrentLocation", scope = UserProfile.class)
    public JAXBElement<UserLocation> createUserProfileCurrentLocation(UserLocation value) {
        return new JAXBElement<UserLocation>(_UserProfileCurrentLocation_QNAME, UserLocation.class, UserProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Heading }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "CurrentHeading", scope = UserProfile.class)
    public JAXBElement<Heading> createUserProfileCurrentHeading(Heading value) {
        return new JAXBElement<Heading>(_UserProfileCurrentHeading_QNAME, Heading.class, UserProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShapeBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "MapView", scope = UserProfile.class)
    public JAXBElement<ShapeBase> createUserProfileMapView(ShapeBase value) {
        return new JAXBElement<ShapeBase>(_UserProfileMapView_QNAME, ShapeBase.class, UserProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "IPAddress", scope = UserProfile.class)
    public JAXBElement<String> createUserProfileIPAddress(String value) {
        return new JAXBElement<String>(_UserProfileIPAddress_QNAME, String.class, UserProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Label", scope = Pushpin.class)
    public JAXBElement<String> createPushpinLabel(String value) {
        return new JAXBElement<String>(_PushpinLabel_QNAME, String.class, Pushpin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "IconStyle", scope = Pushpin.class)
    public JAXBElement<String> createPushpinIconStyle(String value) {
        return new JAXBElement<String>(_PushpinIconStyle_QNAME, String.class, Pushpin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Location", scope = Pushpin.class)
    public JAXBElement<Location> createPushpinLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, Pushpin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search", name = "Point", scope = SearchPoint.class)
    public JAXBElement<Location> createSearchPointPoint(Location value) {
        return new JAXBElement<Location>(_SearchPointPoint_QNAME, Location.class, SearchPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery", name = "Options", scope = MapUriRequest.class)
    public JAXBElement<MapUriOptions> createMapUriRequestOptions(MapUriOptions value) {
        return new JAXBElement<MapUriOptions>(_ImageryMetadataRequestOptions_QNAME, MapUriOptions.class, MapUriRequest.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Southwest", scope = Rectangle.class)
    public JAXBElement<Location> createRectangleSouthwest(Location value) {
        return new JAXBElement<Location>(_RectangleSouthwest_QNAME, Location.class, Rectangle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Northeast", scope = Rectangle.class)
    public JAXBElement<Location> createRectangleNortheast(Location value) {
        return new JAXBElement<Location>(_RectangleNortheast_QNAME, Location.class, Rectangle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "request", scope = GetMapUri.class)
    public JAXBElement<MapUriRequest> createGetMapUriRequest(MapUriRequest value) {
        return new JAXBElement<MapUriRequest>(_GetImageryMetadataRequest_QNAME, MapUriRequest.class, GetMapUri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "BrandLogoUri", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseBrandLogoUri(String value) {
        return new JAXBElement<String>(_ResponseBaseBrandLogoUri_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ResponseSummary", scope = ResponseBase.class)
    public JAXBElement<ResponseSummary> createResponseBaseResponseSummary(ResponseSummary value) {
        return new JAXBElement<ResponseSummary>(_ResponseSummary_QNAME, ResponseSummary.class, ResponseBase.class, value);
    }

}
