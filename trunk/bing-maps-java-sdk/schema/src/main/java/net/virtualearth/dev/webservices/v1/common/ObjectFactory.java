
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseSummary }
     * 
     */
    public ResponseSummary createResponseSummary() {
        return new ResponseSummary();
    }

    /**
     * Create an instance of {@link ArrayOfLocation }
     * 
     */
    public ArrayOfLocation createArrayOfLocation() {
        return new ArrayOfLocation();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link UserProfile }
     * 
     */
    public UserProfile createUserProfile() {
        return new UserProfile();
    }

    /**
     * Create an instance of {@link SizeOfint }
     * 
     */
    public SizeOfint createSizeOfint() {
        return new SizeOfint();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link ShapeBase }
     * 
     */
    public ShapeBase createShapeBase() {
        return new ShapeBase();
    }

    /**
     * Create an instance of {@link GeocodeLocation }
     * 
     */
    public GeocodeLocation createGeocodeLocation() {
        return new GeocodeLocation();
    }

    /**
     * Create an instance of {@link Heading }
     * 
     */
    public Heading createHeading() {
        return new Heading();
    }

    /**
     * Create an instance of {@link ExecutionOptions }
     * 
     */
    public ExecutionOptions createExecutionOptions() {
        return new ExecutionOptions();
    }

    /**
     * Create an instance of {@link UserLocation }
     * 
     */
    public UserLocation createUserLocation() {
        return new UserLocation();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
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

}
