
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.route package. 
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

    private final static QName _ArrayOfRouteResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfRouteResult");
    private final static QName _RouteResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteResponse");
    private final static QName _RouteRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteRequest");
    private final static QName _MajorRoutesResponse_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesResponse");
    private final static QName _MajorRoutesOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesOptions");
    private final static QName _ArrayOfWaypoint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfWaypoint");
    private final static QName _ItineraryItemHint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItemHint");
    private final static QName _RouteSummary_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteSummary");
    private final static QName _ArrayOfItineraryItemHint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfItineraryItemHint");
    private final static QName _ManeuverType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ManeuverType");
    private final static QName _ItineraryWarningSeverity_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryWarningSeverity");
    private final static QName _TravelMode_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "TravelMode");
    private final static QName _Waypoint_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "Waypoint");
    private final static QName _RoutePathType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RoutePathType");
    private final static QName _ArrayOfRouteLeg_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfRouteLeg");
    private final static QName _ItineraryWarningType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryWarningType");
    private final static QName _RouteOptions_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteOptions");
    private final static QName _RouteLeg_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteLeg");
    private final static QName _ArrayOfItineraryItemWarning_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfItineraryItemWarning");
    private final static QName _RoutePath_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RoutePath");
    private final static QName _ItineraryItem_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItem");
    private final static QName _RouteOptimization_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteOptimization");
    private final static QName _RouteResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "RouteResult");
    private final static QName _ItineraryItemHintType_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItemHintType");
    private final static QName _ItineraryItemWarning_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ItineraryItemWarning");
    private final static QName _ArrayOfItineraryItem_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "ArrayOfItineraryItem");
    private final static QName _MajorRoutesRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "MajorRoutesRequest");
    private final static QName _TrafficUsage_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/route", "TrafficUsage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.route
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MajorRoutesResponse }
     * 
     */
    public MajorRoutesResponse createMajorRoutesResponse() {
        return new MajorRoutesResponse();
    }

    /**
     * Create an instance of {@link RouteOptions }
     * 
     */
    public RouteOptions createRouteOptions() {
        return new RouteOptions();
    }

    /**
     * Create an instance of {@link ItineraryItemHint }
     * 
     */
    public ItineraryItemHint createItineraryItemHint() {
        return new ItineraryItemHint();
    }

    /**
     * Create an instance of {@link RouteLeg }
     * 
     */
    public RouteLeg createRouteLeg() {
        return new RouteLeg();
    }

    /**
     * Create an instance of {@link MajorRoutesRequest }
     * 
     */
    public MajorRoutesRequest createMajorRoutesRequest() {
        return new MajorRoutesRequest();
    }

    /**
     * Create an instance of {@link ArrayOfRouteResult }
     * 
     */
    public ArrayOfRouteResult createArrayOfRouteResult() {
        return new ArrayOfRouteResult();
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
     * Create an instance of {@link ItineraryItemWarning }
     * 
     */
    public ItineraryItemWarning createItineraryItemWarning() {
        return new ItineraryItemWarning();
    }

    /**
     * Create an instance of {@link RouteRequest }
     * 
     */
    public RouteRequest createRouteRequest() {
        return new RouteRequest();
    }

    /**
     * Create an instance of {@link RouteResponse }
     * 
     */
    public RouteResponse createRouteResponse() {
        return new RouteResponse();
    }

    /**
     * Create an instance of {@link MajorRoutesOptions }
     * 
     */
    public MajorRoutesOptions createMajorRoutesOptions() {
        return new MajorRoutesOptions();
    }

    /**
     * Create an instance of {@link ArrayOfRouteLeg }
     * 
     */
    public ArrayOfRouteLeg createArrayOfRouteLeg() {
        return new ArrayOfRouteLeg();
    }

    /**
     * Create an instance of {@link ArrayOfWaypoint }
     * 
     */
    public ArrayOfWaypoint createArrayOfWaypoint() {
        return new ArrayOfWaypoint();
    }

    /**
     * Create an instance of {@link ArrayOfItineraryItemHint }
     * 
     */
    public ArrayOfItineraryItemHint createArrayOfItineraryItemHint() {
        return new ArrayOfItineraryItemHint();
    }

    /**
     * Create an instance of {@link ArrayOfItineraryItem }
     * 
     */
    public ArrayOfItineraryItem createArrayOfItineraryItem() {
        return new ArrayOfItineraryItem();
    }

    /**
     * Create an instance of {@link ItineraryItem }
     * 
     */
    public ItineraryItem createItineraryItem() {
        return new ItineraryItem();
    }

    /**
     * Create an instance of {@link Waypoint }
     * 
     */
    public Waypoint createWaypoint() {
        return new Waypoint();
    }

    /**
     * Create an instance of {@link RoutePath }
     * 
     */
    public RoutePath createRoutePath() {
        return new RoutePath();
    }

    /**
     * Create an instance of {@link RouteResult }
     * 
     */
    public RouteResult createRouteResult() {
        return new RouteResult();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "MajorRoutesOptions")
    public JAXBElement<MajorRoutesOptions> createMajorRoutesOptions(MajorRoutesOptions value) {
        return new JAXBElement<MajorRoutesOptions>(_MajorRoutesOptions_QNAME, MajorRoutesOptions.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryItemHint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryItemHint")
    public JAXBElement<ItineraryItemHint> createItineraryItemHint(ItineraryItemHint value) {
        return new JAXBElement<ItineraryItemHint>(_ItineraryItemHint_QNAME, ItineraryItemHint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryWarningSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryWarningSeverity")
    public JAXBElement<ItineraryWarningSeverity> createItineraryWarningSeverity(ItineraryWarningSeverity value) {
        return new JAXBElement<ItineraryWarningSeverity>(_ItineraryWarningSeverity_QNAME, ItineraryWarningSeverity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteLeg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RouteLeg")
    public JAXBElement<RouteLeg> createRouteLeg(RouteLeg value) {
        return new JAXBElement<RouteLeg>(_RouteLeg_QNAME, RouteLeg.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "RoutePath")
    public JAXBElement<RoutePath> createRoutePath(RoutePath value) {
        return new JAXBElement<RoutePath>(_RoutePath_QNAME, RoutePath.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryItemWarning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "ItineraryItemWarning")
    public JAXBElement<ItineraryItemWarning> createItineraryItemWarning(ItineraryItemWarning value) {
        return new JAXBElement<ItineraryItemWarning>(_ItineraryItemWarning_QNAME, ItineraryItemWarning.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MajorRoutesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "MajorRoutesRequest")
    public JAXBElement<MajorRoutesRequest> createMajorRoutesRequest(MajorRoutesRequest value) {
        return new JAXBElement<MajorRoutesRequest>(_MajorRoutesRequest_QNAME, MajorRoutesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/route", name = "TrafficUsage")
    public JAXBElement<TrafficUsage> createTrafficUsage(TrafficUsage value) {
        return new JAXBElement<TrafficUsage>(_TrafficUsage_QNAME, TrafficUsage.class, null, value);
    }

}
