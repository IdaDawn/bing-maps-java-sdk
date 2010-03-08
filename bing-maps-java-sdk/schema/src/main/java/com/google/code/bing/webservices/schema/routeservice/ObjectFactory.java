
package com.google.code.bing.webservices.schema.routeservice;

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
 * generated in the com.google.code.bing.webservices.schema.routeservice package. 
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
    private final static QName _ArrayOfRouteResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfRouteResult");
    private final static QName _RouteResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteResponse");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DeviceType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "DeviceType");
    private final static QName _ShapeBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ShapeBase");
    private final static QName _Confidence_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Confidence");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _RouteRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteRequest");
    private final static QName _MajorRoutesResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesResponse");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _MajorRoutesOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesOptions");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfWaypoint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfWaypoint");
    private final static QName _DistanceUnit_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "DistanceUnit");
    private final static QName _Circle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Circle");
    private final static QName _ItineraryItemHint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItemHint");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _RouteSummary_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteSummary");
    private final static QName _ArrayOfItineraryItemHint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfItineraryItemHint");
    private final static QName _ManeuverType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ManeuverType");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ItineraryWarningSeverity_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryWarningSeverity");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _TravelMode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "TravelMode");
    private final static QName _ResponseBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseBase");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Waypoint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Waypoint");
    private final static QName _RoutePathType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RoutePathType");
    private final static QName _ArrayOfRouteLeg_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfRouteLeg");
    private final static QName _AuthenticationResultCode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "AuthenticationResultCode");
    private final static QName _GeocodeLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "GeocodeLocation");
    private final static QName _ItineraryWarningType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryWarningType");
    private final static QName _RouteOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteOptions");
    private final static QName _Heading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Heading");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Credentials_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Credentials");
    private final static QName _RouteLeg_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteLeg");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfItineraryItemWarning_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfItineraryItemWarning");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ExecutionOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ExecutionOptions");
    private final static QName _RoutePath_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RoutePath");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ItineraryItem_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItem");
    private final static QName _RouteOptimization_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteOptimization");
    private final static QName _ResponseStatusCode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseStatusCode");
    private final static QName _RequestBase_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "RequestBase");
    private final static QName _Location_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Location");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _RouteResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteResult");
    private final static QName _ItineraryItemHintType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItemHintType");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _UserLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "UserLocation");
    private final static QName _ItineraryItemWarning_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItemWarning");
    private final static QName _SizeOfint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "SizeOfint");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ArrayOfLocation");
    private final static QName _Rectangle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Rectangle");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _UserProfile_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "UserProfile");
    private final static QName _ArrayOfItineraryItem_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfItineraryItem");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _MajorRoutesRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesRequest");
    private final static QName _Polygon_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Polygon");
    private final static QName _TrafficUsage_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "TrafficUsage");
    private final static QName _ResponseSummary_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ResponseSummary");
    private final static QName _RequestBaseCulture_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Culture");
    private final static QName _CredentialsToken_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Token");
    private final static QName _CredentialsApplicationId_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ApplicationId");
    private final static QName _RouteResponseResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Result");
    private final static QName _RouteRequestWaypoints_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Waypoints");
    private final static QName _RouteRequestOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Options");
    private final static QName _ItineraryItemText_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Text");
    private final static QName _ItineraryItemCompassDirection_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "CompassDirection");
    private final static QName _ItineraryItemWarnings_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Warnings");
    private final static QName _ItineraryItemSummary_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Summary");
    private final static QName _ItineraryItemHints_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Hints");
    private final static QName _ItineraryItemLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Location");
    private final static QName _ResponseSummaryTraceId_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "TraceId");
    private final static QName _ResponseSummaryCopyright_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Copyright");
    private final static QName _ResponseSummaryFaultReason_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "FaultReason");
    private final static QName _RouteResultLegs_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Legs");
    private final static QName _CalculateRouteRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route/contracts", "request");
    private final static QName _RoutePathPoints_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Points");
    private final static QName _RectangleSouthwest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Southwest");
    private final static QName _RectangleNortheast_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Northeast");
    private final static QName _RouteSummaryBoundingRectangle_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "BoundingRectangle");
    private final static QName _MajorRoutesResponseRoutes_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Routes");
    private final static QName _MajorRoutesResponseStartingPoints_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "StartingPoints");
    private final static QName _MajorRoutesRequestDestination_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Destination");
    private final static QName _CalculateRouteResponseCalculateRouteResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route/contracts", "CalculateRouteResult");
    private final static QName _PolygonVertices_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Vertices");
    private final static QName _CircleCenter_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "Center");
    private final static QName _CalculateRoutesFromMajorRoadsResponseCalculateRoutesFromMajorRoadsResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route/contracts", "CalculateRoutesFromMajorRoadsResult");
    private final static QName _UserProfileScreenSize_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "ScreenSize");
    private final static QName _UserProfileCurrentLocation_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CurrentLocation");
    private final static QName _UserProfileCurrentHeading_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CurrentHeading");
    private final static QName _UserProfileMapView_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "MapView");
    private final static QName _UserProfileIPAddress_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "IPAddress");
    private final static QName _RouteLegActualEnd_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ActualEnd");
    private final static QName _RouteLegItinerary_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Itinerary");
    private final static QName _RouteLegActualStart_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ActualStart");
    private final static QName _GeocodeLocationCalculationMethod_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "CalculationMethod");
    private final static QName _ResponseBaseBrandLogoUri_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/common", "BrandLogoUri");
    private final static QName _WaypointDescription_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.code.bing.webservices.schema.routeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShapeBase }
     * 
     */
    public ShapeBase createShapeBase() {
        return new ShapeBase();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link RouteResponse }
     * 
     */
    public RouteResponse createRouteResponse() {
        return new RouteResponse();
    }

    /**
     * Create an instance of {@link ArrayOfItineraryItemHint }
     * 
     */
    public ArrayOfItineraryItemHint createArrayOfItineraryItemHint() {
        return new ArrayOfItineraryItemHint();
    }

    /**
     * Create an instance of {@link RouteRequest }
     * 
     */
    public RouteRequest createRouteRequest() {
        return new RouteRequest();
    }

    /**
     * Create an instance of {@link MajorRoutesOptions }
     * 
     */
    public MajorRoutesOptions createMajorRoutesOptions() {
        return new MajorRoutesOptions();
    }

    /**
     * Create an instance of {@link Heading }
     * 
     */
    public Heading createHeading() {
        return new Heading();
    }

    /**
     * Create an instance of {@link UserLocation }
     * 
     */
    public UserLocation createUserLocation() {
        return new UserLocation();
    }

    /**
     * Create an instance of {@link ItineraryItem }
     * 
     */
    public ItineraryItem createItineraryItem() {
        return new ItineraryItem();
    }

    /**
     * Create an instance of {@link ResponseSummary }
     * 
     */
    public ResponseSummary createResponseSummary() {
        return new ResponseSummary();
    }

    /**
     * Create an instance of {@link RouteResult }
     * 
     */
    public RouteResult createRouteResult() {
        return new RouteResult();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link ItineraryItemHint }
     * 
     */
    public ItineraryItemHint createItineraryItemHint() {
        return new ItineraryItemHint();
    }

    /**
     * Create an instance of {@link ArrayOfLocation }
     * 
     */
    public ArrayOfLocation createArrayOfLocation() {
        return new ArrayOfLocation();
    }

    /**
     * Create an instance of {@link CalculateRoute }
     * 
     */
    public CalculateRoute createCalculateRoute() {
        return new CalculateRoute();
    }

    /**
     * Create an instance of {@link RoutePath }
     * 
     */
    public RoutePath createRoutePath() {
        return new RoutePath();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link MajorRoutesResponse }
     * 
     */
    public MajorRoutesResponse createMajorRoutesResponse() {
        return new MajorRoutesResponse();
    }

    /**
     * Create an instance of {@link RouteSummary }
     * 
     */
    public RouteSummary createRouteSummary() {
        return new RouteSummary();
    }

    /**
     * Create an instance of {@link ArrayOfItineraryItemWarning }
     * 
     */
    public ArrayOfItineraryItemWarning createArrayOfItineraryItemWarning() {
        return new ArrayOfItineraryItemWarning();
    }

    /**
     * Create an instance of {@link ExecutionOptions }
     * 
     */
    public ExecutionOptions createExecutionOptions() {
        return new ExecutionOptions();
    }

    /**
     * Create an instance of {@link ArrayOfWaypoint }
     * 
     */
    public ArrayOfWaypoint createArrayOfWaypoint() {
        return new ArrayOfWaypoint();
    }

    /**
     * Create an instance of {@link ItineraryItemWarning }
     * 
     */
    public ItineraryItemWarning createItineraryItemWarning() {
        return new ItineraryItemWarning();
    }

    /**
     * Create an instance of {@link MajorRoutesRequest }
     * 
     */
    public MajorRoutesRequest createMajorRoutesRequest() {
        return new MajorRoutesRequest();
    }

    /**
     * Create an instance of {@link CalculateRoutesFromMajorRoads }
     * 
     */
    public CalculateRoutesFromMajorRoads createCalculateRoutesFromMajorRoads() {
        return new CalculateRoutesFromMajorRoads();
    }

    /**
     * Create an instance of {@link CalculateRouteResponse }
     * 
     */
    public CalculateRouteResponse createCalculateRouteResponse() {
        return new CalculateRouteResponse();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link Polygon }
     * 
     */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /**
     * Create an instance of {@link ArrayOfItineraryItem }
     * 
     */
    public ArrayOfItineraryItem createArrayOfItineraryItem() {
        return new ArrayOfItineraryItem();
    }

    /**
     * Create an instance of {@link CalculateRoutesFromMajorRoadsResponse }
     * 
     */
    public CalculateRoutesFromMajorRoadsResponse createCalculateRoutesFromMajorRoadsResponse() {
        return new CalculateRoutesFromMajorRoadsResponse();
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
     * Create an instance of {@link ArrayOfRouteLeg }
     * 
     */
    public ArrayOfRouteLeg createArrayOfRouteLeg() {
        return new ArrayOfRouteLeg();
    }

    /**
     * Create an instance of {@link RouteLeg }
     * 
     */
    public RouteLeg createRouteLeg() {
        return new RouteLeg();
    }

    /**
     * Create an instance of {@link GeocodeLocation }
     * 
     */
    public GeocodeLocation createGeocodeLocation() {
        return new GeocodeLocation();
    }

    /**
     * Create an instance of {@link RouteOptions }
     * 
     */
    public RouteOptions createRouteOptions() {
        return new RouteOptions();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link Waypoint }
     * 
     */
    public Waypoint createWaypoint() {
        return new Waypoint();
    }

    /**
     * Create an instance of {@link ArrayOfRouteResult }
     * 
     */
    public ArrayOfRouteResult createArrayOfRouteResult() {
        return new ArrayOfRouteResult();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ArrayOfRouteResult")
    public JAXBElement<ArrayOfRouteResult> createArrayOfRouteResult(ArrayOfRouteResult value) {
        return new JAXBElement<ArrayOfRouteResult>(_ArrayOfRouteResult_QNAME, ArrayOfRouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteResponse")
    public JAXBElement<RouteResponse> createRouteResponse(RouteResponse value) {
        return new JAXBElement<RouteResponse>(_RouteResponse_QNAME, RouteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Confidence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Confidence")
    public JAXBElement<Confidence> createConfidence(Confidence value) {
        return new JAXBElement<Confidence>(_Confidence_QNAME, Confidence.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteRequest")
    public JAXBElement<RouteRequest> createRouteRequest(RouteRequest value) {
        return new JAXBElement<RouteRequest>(_RouteRequest_QNAME, RouteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "MajorRoutesResponse")
    public JAXBElement<MajorRoutesResponse> createMajorRoutesResponse(MajorRoutesResponse value) {
        return new JAXBElement<MajorRoutesResponse>(_MajorRoutesResponse_QNAME, MajorRoutesResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "MajorRoutesOptions")
    public JAXBElement<MajorRoutesOptions> createMajorRoutesOptions(MajorRoutesOptions value) {
        return new JAXBElement<MajorRoutesOptions>(_MajorRoutesOptions_QNAME, MajorRoutesOptions.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWaypoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ArrayOfWaypoint")
    public JAXBElement<ArrayOfWaypoint> createArrayOfWaypoint(ArrayOfWaypoint value) {
        return new JAXBElement<ArrayOfWaypoint>(_ArrayOfWaypoint_QNAME, ArrayOfWaypoint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryItemHint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryItemHint")
    public JAXBElement<ItineraryItemHint> createItineraryItemHint(ItineraryItemHint value) {
        return new JAXBElement<ItineraryItemHint>(_ItineraryItemHint_QNAME, ItineraryItemHint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteSummary")
    public JAXBElement<RouteSummary> createRouteSummary(RouteSummary value) {
        return new JAXBElement<RouteSummary>(_RouteSummary_QNAME, RouteSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemHint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ArrayOfItineraryItemHint")
    public JAXBElement<ArrayOfItineraryItemHint> createArrayOfItineraryItemHint(ArrayOfItineraryItemHint value) {
        return new JAXBElement<ArrayOfItineraryItemHint>(_ArrayOfItineraryItemHint_QNAME, ArrayOfItineraryItemHint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManeuverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ManeuverType")
    public JAXBElement<ManeuverType> createManeuverType(ManeuverType value) {
        return new JAXBElement<ManeuverType>(_ManeuverType_QNAME, ManeuverType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryWarningSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryWarningSeverity")
    public JAXBElement<ItineraryWarningSeverity> createItineraryWarningSeverity(ItineraryWarningSeverity value) {
        return new JAXBElement<ItineraryWarningSeverity>(_ItineraryWarningSeverity_QNAME, ItineraryWarningSeverity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "TravelMode")
    public JAXBElement<TravelMode> createTravelMode(TravelMode value) {
        return new JAXBElement<TravelMode>(_TravelMode_QNAME, TravelMode.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Waypoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Waypoint")
    public JAXBElement<Waypoint> createWaypoint(Waypoint value) {
        return new JAXBElement<Waypoint>(_Waypoint_QNAME, Waypoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePathType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RoutePathType")
    public JAXBElement<RoutePathType> createRoutePathType(RoutePathType value) {
        return new JAXBElement<RoutePathType>(_RoutePathType_QNAME, RoutePathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteLeg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ArrayOfRouteLeg")
    public JAXBElement<ArrayOfRouteLeg> createArrayOfRouteLeg(ArrayOfRouteLeg value) {
        return new JAXBElement<ArrayOfRouteLeg>(_ArrayOfRouteLeg_QNAME, ArrayOfRouteLeg.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryWarningType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryWarningType")
    public JAXBElement<ItineraryWarningType> createItineraryWarningType(ItineraryWarningType value) {
        return new JAXBElement<ItineraryWarningType>(_ItineraryWarningType_QNAME, ItineraryWarningType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteOptions")
    public JAXBElement<RouteOptions> createRouteOptions(RouteOptions value) {
        return new JAXBElement<RouteOptions>(_RouteOptions_QNAME, RouteOptions.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteLeg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteLeg")
    public JAXBElement<RouteLeg> createRouteLeg(RouteLeg value) {
        return new JAXBElement<RouteLeg>(_RouteLeg_QNAME, RouteLeg.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemWarning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ArrayOfItineraryItemWarning")
    public JAXBElement<ArrayOfItineraryItemWarning> createArrayOfItineraryItemWarning(ArrayOfItineraryItemWarning value) {
        return new JAXBElement<ArrayOfItineraryItemWarning>(_ArrayOfItineraryItemWarning_QNAME, ArrayOfItineraryItemWarning.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RoutePath")
    public JAXBElement<RoutePath> createRoutePath(RoutePath value) {
        return new JAXBElement<RoutePath>(_RoutePath_QNAME, RoutePath.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryItem")
    public JAXBElement<ItineraryItem> createItineraryItem(ItineraryItem value) {
        return new JAXBElement<ItineraryItem>(_ItineraryItem_QNAME, ItineraryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOptimization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteOptimization")
    public JAXBElement<RouteOptimization> createRouteOptimization(RouteOptimization value) {
        return new JAXBElement<RouteOptimization>(_RouteOptimization_QNAME, RouteOptimization.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteResult")
    public JAXBElement<RouteResult> createRouteResult(RouteResult value) {
        return new JAXBElement<RouteResult>(_RouteResult_QNAME, RouteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryItemHintType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryItemHintType")
    public JAXBElement<ItineraryItemHintType> createItineraryItemHintType(ItineraryItemHintType value) {
        return new JAXBElement<ItineraryItemHintType>(_ItineraryItemHintType_QNAME, ItineraryItemHintType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "UserLocation")
    public JAXBElement<UserLocation> createUserLocation(UserLocation value) {
        return new JAXBElement<UserLocation>(_UserLocation_QNAME, UserLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryItemWarning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryItemWarning")
    public JAXBElement<ItineraryItemWarning> createItineraryItemWarning(ItineraryItemWarning value) {
        return new JAXBElement<ItineraryItemWarning>(_ItineraryItemWarning_QNAME, ItineraryItemWarning.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItineraryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ArrayOfItineraryItem")
    public JAXBElement<ArrayOfItineraryItem> createArrayOfItineraryItem(ArrayOfItineraryItem value) {
        return new JAXBElement<ArrayOfItineraryItem>(_ArrayOfItineraryItem_QNAME, ArrayOfItineraryItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "MajorRoutesRequest")
    public JAXBElement<MajorRoutesRequest> createMajorRoutesRequest(MajorRoutesRequest value) {
        return new JAXBElement<MajorRoutesRequest>(_MajorRoutesRequest_QNAME, MajorRoutesRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "TrafficUsage")
    public JAXBElement<TrafficUsage> createTrafficUsage(TrafficUsage value) {
        return new JAXBElement<TrafficUsage>(_TrafficUsage_QNAME, TrafficUsage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Result", scope = RouteResponse.class)
    public JAXBElement<RouteResult> createRouteResponseResult(RouteResult value) {
        return new JAXBElement<RouteResult>(_RouteResponseResult_QNAME, RouteResult.class, RouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWaypoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Waypoints", scope = RouteRequest.class)
    public JAXBElement<ArrayOfWaypoint> createRouteRequestWaypoints(ArrayOfWaypoint value) {
        return new JAXBElement<ArrayOfWaypoint>(_RouteRequestWaypoints_QNAME, ArrayOfWaypoint.class, RouteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Options", scope = RouteRequest.class)
    public JAXBElement<RouteOptions> createRouteRequestOptions(RouteOptions value) {
        return new JAXBElement<RouteOptions>(_RouteRequestOptions_QNAME, RouteOptions.class, RouteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Text", scope = ItineraryItem.class)
    public JAXBElement<String> createItineraryItemText(String value) {
        return new JAXBElement<String>(_ItineraryItemText_QNAME, String.class, ItineraryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "CompassDirection", scope = ItineraryItem.class)
    public JAXBElement<String> createItineraryItemCompassDirection(String value) {
        return new JAXBElement<String>(_ItineraryItemCompassDirection_QNAME, String.class, ItineraryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemWarning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Warnings", scope = ItineraryItem.class)
    public JAXBElement<ArrayOfItineraryItemWarning> createItineraryItemWarnings(ArrayOfItineraryItemWarning value) {
        return new JAXBElement<ArrayOfItineraryItemWarning>(_ItineraryItemWarnings_QNAME, ArrayOfItineraryItemWarning.class, ItineraryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Summary", scope = ItineraryItem.class)
    public JAXBElement<RouteSummary> createItineraryItemSummary(RouteSummary value) {
        return new JAXBElement<RouteSummary>(_ItineraryItemSummary_QNAME, RouteSummary.class, ItineraryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItineraryItemHint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Hints", scope = ItineraryItem.class)
    public JAXBElement<ArrayOfItineraryItemHint> createItineraryItemHints(ArrayOfItineraryItemHint value) {
        return new JAXBElement<ArrayOfItineraryItemHint>(_ItineraryItemHints_QNAME, ArrayOfItineraryItemHint.class, ItineraryItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Location", scope = ItineraryItem.class)
    public JAXBElement<Location> createItineraryItemLocation(Location value) {
        return new JAXBElement<Location>(_ItineraryItemLocation_QNAME, Location.class, ItineraryItem.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Summary", scope = RouteResult.class)
    public JAXBElement<RouteSummary> createRouteResultSummary(RouteSummary value) {
        return new JAXBElement<RouteSummary>(_ItineraryItemSummary_QNAME, RouteSummary.class, RouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RoutePath", scope = RouteResult.class)
    public JAXBElement<RoutePath> createRouteResultRoutePath(RoutePath value) {
        return new JAXBElement<RoutePath>(_RoutePath_QNAME, RoutePath.class, RouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteLeg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Legs", scope = RouteResult.class)
    public JAXBElement<ArrayOfRouteLeg> createRouteResultLegs(ArrayOfRouteLeg value) {
        return new JAXBElement<ArrayOfRouteLeg>(_RouteResultLegs_QNAME, ArrayOfRouteLeg.class, RouteResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Text", scope = ItineraryItemHint.class)
    public JAXBElement<String> createItineraryItemHintText(String value) {
        return new JAXBElement<String>(_ItineraryItemText_QNAME, String.class, ItineraryItemHint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "request", scope = CalculateRoute.class)
    public JAXBElement<RouteRequest> createCalculateRouteRequest(RouteRequest value) {
        return new JAXBElement<RouteRequest>(_CalculateRouteRequest_QNAME, RouteRequest.class, CalculateRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Points", scope = RoutePath.class)
    public JAXBElement<ArrayOfLocation> createRoutePathPoints(ArrayOfLocation value) {
        return new JAXBElement<ArrayOfLocation>(_RoutePathPoints_QNAME, ArrayOfLocation.class, RoutePath.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Rectangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "BoundingRectangle", scope = RouteSummary.class)
    public JAXBElement<Rectangle> createRouteSummaryBoundingRectangle(Rectangle value) {
        return new JAXBElement<Rectangle>(_RouteSummaryBoundingRectangle_QNAME, Rectangle.class, RouteSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Routes", scope = MajorRoutesResponse.class)
    public JAXBElement<ArrayOfRouteResult> createMajorRoutesResponseRoutes(ArrayOfRouteResult value) {
        return new JAXBElement<ArrayOfRouteResult>(_MajorRoutesResponseRoutes_QNAME, ArrayOfRouteResult.class, MajorRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWaypoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "StartingPoints", scope = MajorRoutesResponse.class)
    public JAXBElement<ArrayOfWaypoint> createMajorRoutesResponseStartingPoints(ArrayOfWaypoint value) {
        return new JAXBElement<ArrayOfWaypoint>(_MajorRoutesResponseStartingPoints_QNAME, ArrayOfWaypoint.class, MajorRoutesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Text", scope = ItineraryItemWarning.class)
    public JAXBElement<String> createItineraryItemWarningText(String value) {
        return new JAXBElement<String>(_ItineraryItemText_QNAME, String.class, ItineraryItemWarning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Options", scope = MajorRoutesRequest.class)
    public JAXBElement<MajorRoutesOptions> createMajorRoutesRequestOptions(MajorRoutesOptions value) {
        return new JAXBElement<MajorRoutesOptions>(_RouteRequestOptions_QNAME, MajorRoutesOptions.class, MajorRoutesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Waypoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Destination", scope = MajorRoutesRequest.class)
    public JAXBElement<Waypoint> createMajorRoutesRequestDestination(Waypoint value) {
        return new JAXBElement<Waypoint>(_MajorRoutesRequestDestination_QNAME, Waypoint.class, MajorRoutesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "request", scope = CalculateRoutesFromMajorRoads.class)
    public JAXBElement<MajorRoutesRequest> createCalculateRoutesFromMajorRoadsRequest(MajorRoutesRequest value) {
        return new JAXBElement<MajorRoutesRequest>(_CalculateRouteRequest_QNAME, MajorRoutesRequest.class, CalculateRoutesFromMajorRoads.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "CalculateRouteResult", scope = CalculateRouteResponse.class)
    public JAXBElement<RouteResponse> createCalculateRouteResponseCalculateRouteResult(RouteResponse value) {
        return new JAXBElement<RouteResponse>(_CalculateRouteResponseCalculateRouteResult_QNAME, RouteResponse.class, CalculateRouteResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/common", name = "Center", scope = Circle.class)
    public JAXBElement<Location> createCircleCenter(Location value) {
        return new JAXBElement<Location>(_CircleCenter_QNAME, Location.class, Circle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", name = "CalculateRoutesFromMajorRoadsResult", scope = CalculateRoutesFromMajorRoadsResponse.class)
    public JAXBElement<MajorRoutesResponse> createCalculateRoutesFromMajorRoadsResponseCalculateRoutesFromMajorRoadsResult(MajorRoutesResponse value) {
        return new JAXBElement<MajorRoutesResponse>(_CalculateRoutesFromMajorRoadsResponseCalculateRoutesFromMajorRoadsResult_QNAME, MajorRoutesResponse.class, CalculateRoutesFromMajorRoadsResponse.class, value);
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
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ActualEnd", scope = RouteLeg.class)
    public JAXBElement<Location> createRouteLegActualEnd(Location value) {
        return new JAXBElement<Location>(_RouteLegActualEnd_QNAME, Location.class, RouteLeg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfItineraryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Itinerary", scope = RouteLeg.class)
    public JAXBElement<ArrayOfItineraryItem> createRouteLegItinerary(ArrayOfItineraryItem value) {
        return new JAXBElement<ArrayOfItineraryItem>(_RouteLegItinerary_QNAME, ArrayOfItineraryItem.class, RouteLeg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ActualStart", scope = RouteLeg.class)
    public JAXBElement<Location> createRouteLegActualStart(Location value) {
        return new JAXBElement<Location>(_RouteLegActualStart_QNAME, Location.class, RouteLeg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Summary", scope = RouteLeg.class)
    public JAXBElement<RouteSummary> createRouteLegSummary(RouteSummary value) {
        return new JAXBElement<RouteSummary>(_ItineraryItemSummary_QNAME, RouteSummary.class, RouteLeg.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Description", scope = Waypoint.class)
    public JAXBElement<String> createWaypointDescription(String value) {
        return new JAXBElement<String>(_WaypointDescription_QNAME, String.class, Waypoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "Location", scope = Waypoint.class)
    public JAXBElement<Location> createWaypointLocation(Location value) {
        return new JAXBElement<Location>(_ItineraryItemLocation_QNAME, Location.class, Waypoint.class, value);
    }

}
