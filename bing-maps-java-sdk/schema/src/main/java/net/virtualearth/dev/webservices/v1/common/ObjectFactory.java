
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.common package. 
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

    private final static QName _DeviceType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "DeviceType");
    private final static QName _ShapeBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ShapeBase");
    private final static QName _Confidence_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Confidence");
    private final static QName _DistanceUnit_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "DistanceUnit");
    private final static QName _Circle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Circle");
    private final static QName _ResponseBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseBase");
    private final static QName _AuthenticationResultCode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "AuthenticationResultCode");
    private final static QName _GeocodeLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "GeocodeLocation");
    private final static QName _Heading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Heading");
    private final static QName _Credentials_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Credentials");
    private final static QName _ExecutionOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ExecutionOptions");
    private final static QName _ResponseStatusCode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseStatusCode");
    private final static QName _RequestBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "RequestBase");
    private final static QName _Location_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Location");
    private final static QName _UserLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "UserLocation");
    private final static QName _SizeOfint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "SizeOfint");
    private final static QName _ArrayOfLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ArrayOfLocation");
    private final static QName _Rectangle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Rectangle");
    private final static QName _UserProfile_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "UserProfile");
    private final static QName _Polygon_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Polygon");
    private final static QName _ResponseSummary_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseSummary");
    private final static QName _ResponseBaseBrandLogoUri_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "BrandLogoUri");
    private final static QName _PolygonVertices_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Vertices");
    private final static QName _UserProfileScreenSize_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ScreenSize");
    private final static QName _UserProfileCurrentLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CurrentLocation");
    private final static QName _UserProfileCurrentHeading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CurrentHeading");
    private final static QName _UserProfileMapView_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "MapView");
    private final static QName _UserProfileIPAddress_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "IPAddress");
    private final static QName _CircleCenter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Center");
    private final static QName _RequestBaseCulture_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Culture");
    private final static QName _ResponseSummaryTraceId_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "TraceId");
    private final static QName _ResponseSummaryCopyright_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Copyright");
    private final static QName _ResponseSummaryFaultReason_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "FaultReason");
    private final static QName _GeocodeLocationCalculationMethod_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CalculationMethod");
    private final static QName _RectangleSouthwest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Southwest");
    private final static QName _RectangleNortheast_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Northeast");
    private final static QName _CredentialsToken_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Token");
    private final static QName _CredentialsApplicationId_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ApplicationId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link UserLocation }
     * 
     */
    public UserLocation createUserLocation() {
        return new UserLocation();
    }

    /**
     * Create an instance of {@link SizeOfint }
     * 
     */
    public SizeOfint createSizeOfint() {
        return new SizeOfint();
    }

    /**
     * Create an instance of {@link UserProfile }
     * 
     */
    public UserProfile createUserProfile() {
        return new UserProfile();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link ShapeBase }
     * 
     */
    public ShapeBase createShapeBase() {
        return new ShapeBase();
    }

    /**
     * Create an instance of {@link ExecutionOptions }
     * 
     */
    public ExecutionOptions createExecutionOptions() {
        return new ExecutionOptions();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link Heading }
     * 
     */
    public Heading createHeading() {
        return new Heading();
    }

    /**
     * Create an instance of {@link ResponseSummary }
     * 
     */
    public ResponseSummary createResponseSummary() {
        return new ResponseSummary();
    }

    /**
     * Create an instance of {@link GeocodeLocation }
     * 
     */
    public GeocodeLocation createGeocodeLocation() {
        return new GeocodeLocation();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link ArrayOfLocation }
     * 
     */
    public ArrayOfLocation createArrayOfLocation() {
        return new ArrayOfLocation();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Confidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Confidence")
    public JAXBElement<Confidence> createConfidence(Confidence value) {
        return new JAXBElement<Confidence>(_Confidence_QNAME, Confidence.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ResponseBase")
    public JAXBElement<ResponseBase> createResponseBase(ResponseBase value) {
        return new JAXBElement<ResponseBase>(_ResponseBase_QNAME, ResponseBase.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "GeocodeLocation")
    public JAXBElement<GeocodeLocation> createGeocodeLocation(GeocodeLocation value) {
        return new JAXBElement<GeocodeLocation>(_GeocodeLocation_QNAME, GeocodeLocation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ResponseStatusCode")
    public JAXBElement<ResponseStatusCode> createResponseStatusCode(ResponseStatusCode value) {
        return new JAXBElement<ResponseStatusCode>(_ResponseStatusCode_QNAME, ResponseStatusCode.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ArrayOfLocation")
    public JAXBElement<ArrayOfLocation> createArrayOfLocation(ArrayOfLocation value) {
        return new JAXBElement<ArrayOfLocation>(_ArrayOfLocation_QNAME, ArrayOfLocation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "UserProfile")
    public JAXBElement<UserProfile> createUserProfile(UserProfile value) {
        return new JAXBElement<UserProfile>(_UserProfile_QNAME, UserProfile.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "ResponseSummary")
    public JAXBElement<ResponseSummary> createResponseSummary(ResponseSummary value) {
        return new JAXBElement<ResponseSummary>(_ResponseSummary_QNAME, ResponseSummary.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Center", scope = Circle.class)
    public JAXBElement<Location> createCircleCenter(Location value) {
        return new JAXBElement<Location>(_CircleCenter_QNAME, Location.class, Circle.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "CalculationMethod", scope = GeocodeLocation.class)
    public JAXBElement<String> createGeocodeLocationCalculationMethod(String value) {
        return new JAXBElement<String>(_GeocodeLocationCalculationMethod_QNAME, String.class, GeocodeLocation.class, value);
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

}
