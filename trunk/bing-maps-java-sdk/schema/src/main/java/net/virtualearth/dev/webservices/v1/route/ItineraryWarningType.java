
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryWarningType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItineraryWarningType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accident"/>
 *     &lt;enumeration value="AdminDivisionChange"/>
 *     &lt;enumeration value="BlockedRoad"/>
 *     &lt;enumeration value="CheckTimetable"/>
 *     &lt;enumeration value="Congestion"/>
 *     &lt;enumeration value="CountryChange"/>
 *     &lt;enumeration value="DisabledVehicle"/>
 *     &lt;enumeration value="GateAccess"/>
 *     &lt;enumeration value="GetOffTransit"/>
 *     &lt;enumeration value="GetOnTransit"/>
 *     &lt;enumeration value="IllegalUTurn"/>
 *     &lt;enumeration value="MassTransit"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="NoIncident"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OtherNews"/>
 *     &lt;enumeration value="OtherTrafficIncidents"/>
 *     &lt;enumeration value="PlannedEvent"/>
 *     &lt;enumeration value="PrivateRoad"/>
 *     &lt;enumeration value="RestrictedTurn"/>
 *     &lt;enumeration value="RoadClosures"/>
 *     &lt;enumeration value="RoadHazard"/>
 *     &lt;enumeration value="ScheduledConstruction"/>
 *     &lt;enumeration value="SeasonalClosures"/>
 *     &lt;enumeration value="Tollbooth"/>
 *     &lt;enumeration value="TollRoad"/>
 *     &lt;enumeration value="TrafficFlow"/>
 *     &lt;enumeration value="UnpavedRoad"/>
 *     &lt;enumeration value="UnscheduledConstruction"/>
 *     &lt;enumeration value="Weather"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItineraryWarningType")
@XmlEnum
public enum ItineraryWarningType {

    @XmlEnumValue("Accident")
    ACCIDENT("Accident"),
    @XmlEnumValue("AdminDivisionChange")
    ADMIN_DIVISION_CHANGE("AdminDivisionChange"),
    @XmlEnumValue("BlockedRoad")
    BLOCKED_ROAD("BlockedRoad"),
    @XmlEnumValue("CheckTimetable")
    CHECK_TIMETABLE("CheckTimetable"),
    @XmlEnumValue("Congestion")
    CONGESTION("Congestion"),
    @XmlEnumValue("CountryChange")
    COUNTRY_CHANGE("CountryChange"),
    @XmlEnumValue("DisabledVehicle")
    DISABLED_VEHICLE("DisabledVehicle"),
    @XmlEnumValue("GateAccess")
    GATE_ACCESS("GateAccess"),
    @XmlEnumValue("GetOffTransit")
    GET_OFF_TRANSIT("GetOffTransit"),
    @XmlEnumValue("GetOnTransit")
    GET_ON_TRANSIT("GetOnTransit"),
    @XmlEnumValue("IllegalUTurn")
    ILLEGAL_U_TURN("IllegalUTurn"),
    @XmlEnumValue("MassTransit")
    MASS_TRANSIT("MassTransit"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    @XmlEnumValue("NoIncident")
    NO_INCIDENT("NoIncident"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("OtherNews")
    OTHER_NEWS("OtherNews"),
    @XmlEnumValue("OtherTrafficIncidents")
    OTHER_TRAFFIC_INCIDENTS("OtherTrafficIncidents"),
    @XmlEnumValue("PlannedEvent")
    PLANNED_EVENT("PlannedEvent"),
    @XmlEnumValue("PrivateRoad")
    PRIVATE_ROAD("PrivateRoad"),
    @XmlEnumValue("RestrictedTurn")
    RESTRICTED_TURN("RestrictedTurn"),
    @XmlEnumValue("RoadClosures")
    ROAD_CLOSURES("RoadClosures"),
    @XmlEnumValue("RoadHazard")
    ROAD_HAZARD("RoadHazard"),
    @XmlEnumValue("ScheduledConstruction")
    SCHEDULED_CONSTRUCTION("ScheduledConstruction"),
    @XmlEnumValue("SeasonalClosures")
    SEASONAL_CLOSURES("SeasonalClosures"),
    @XmlEnumValue("Tollbooth")
    TOLLBOOTH("Tollbooth"),
    @XmlEnumValue("TollRoad")
    TOLL_ROAD("TollRoad"),
    @XmlEnumValue("TrafficFlow")
    TRAFFIC_FLOW("TrafficFlow"),
    @XmlEnumValue("UnpavedRoad")
    UNPAVED_ROAD("UnpavedRoad"),
    @XmlEnumValue("UnscheduledConstruction")
    UNSCHEDULED_CONSTRUCTION("UnscheduledConstruction"),
    @XmlEnumValue("Weather")
    WEATHER("Weather");
    private final String value;

    ItineraryWarningType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItineraryWarningType fromValue(String v) {
        for (ItineraryWarningType c: ItineraryWarningType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
