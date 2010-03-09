
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManeuverType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManeuverType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="DepartStart"/>
 *     &lt;enumeration value="DepartIntermediateStop"/>
 *     &lt;enumeration value="DepartIntermediateStopReturning"/>
 *     &lt;enumeration value="ArriveFinish"/>
 *     &lt;enumeration value="ArriveIntermediateStop"/>
 *     &lt;enumeration value="TurnLeft"/>
 *     &lt;enumeration value="TurnRight"/>
 *     &lt;enumeration value="TurnBack"/>
 *     &lt;enumeration value="UTurn"/>
 *     &lt;enumeration value="TurnToStayLeft"/>
 *     &lt;enumeration value="TurnToStayRight"/>
 *     &lt;enumeration value="BearLeft"/>
 *     &lt;enumeration value="BearRight"/>
 *     &lt;enumeration value="KeepToStayLeft"/>
 *     &lt;enumeration value="KeepToStayRight"/>
 *     &lt;enumeration value="KeepToStayStraight"/>
 *     &lt;enumeration value="KeepLeft"/>
 *     &lt;enumeration value="KeepRight"/>
 *     &lt;enumeration value="KeepStraight"/>
 *     &lt;enumeration value="Take"/>
 *     &lt;enumeration value="TakeRampLeft"/>
 *     &lt;enumeration value="TakeRampRight"/>
 *     &lt;enumeration value="TakeRampStraight"/>
 *     &lt;enumeration value="KeepOnrampLeft"/>
 *     &lt;enumeration value="KeepOnrampRight"/>
 *     &lt;enumeration value="KeepOnrampStraight"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="Continue"/>
 *     &lt;enumeration value="RoadNameChange"/>
 *     &lt;enumeration value="EnterRoundabout"/>
 *     &lt;enumeration value="ExitRoundabout"/>
 *     &lt;enumeration value="TurnRightThenTurnRight"/>
 *     &lt;enumeration value="TurnRightThenTurnLeft"/>
 *     &lt;enumeration value="TurnRightThenBearRight"/>
 *     &lt;enumeration value="TurnRightThenBearLeft"/>
 *     &lt;enumeration value="TurnLeftThenTurnLeft"/>
 *     &lt;enumeration value="TurnLeftThenTurnRight"/>
 *     &lt;enumeration value="TurnLeftThenBearLeft"/>
 *     &lt;enumeration value="TurnLeftThenBearRight"/>
 *     &lt;enumeration value="BearRightThenTurnRight"/>
 *     &lt;enumeration value="BearRightThenTurnLeft"/>
 *     &lt;enumeration value="BearRightThenBearRight"/>
 *     &lt;enumeration value="BearRightThenBearLeft"/>
 *     &lt;enumeration value="BearLeftThenTurnLeft"/>
 *     &lt;enumeration value="BearLeftThenTurnRight"/>
 *     &lt;enumeration value="BearLeftThenBearRight"/>
 *     &lt;enumeration value="BearLeftThenBearLeft"/>
 *     &lt;enumeration value="RampThenHighwayRight"/>
 *     &lt;enumeration value="RampThenHighwayLeft"/>
 *     &lt;enumeration value="RampToHighwayStraight"/>
 *     &lt;enumeration value="EnterThenExitRoundabout"/>
 *     &lt;enumeration value="BearThenMerge"/>
 *     &lt;enumeration value="TurnThenMerge"/>
 *     &lt;enumeration value="BearThenKeep"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="Wait"/>
 *     &lt;enumeration value="TakeTransit"/>
 *     &lt;enumeration value="Walk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManeuverType")
@XmlEnum
public enum ManeuverType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DepartStart")
    DEPART_START("DepartStart"),
    @XmlEnumValue("DepartIntermediateStop")
    DEPART_INTERMEDIATE_STOP("DepartIntermediateStop"),
    @XmlEnumValue("DepartIntermediateStopReturning")
    DEPART_INTERMEDIATE_STOP_RETURNING("DepartIntermediateStopReturning"),
    @XmlEnumValue("ArriveFinish")
    ARRIVE_FINISH("ArriveFinish"),
    @XmlEnumValue("ArriveIntermediateStop")
    ARRIVE_INTERMEDIATE_STOP("ArriveIntermediateStop"),
    @XmlEnumValue("TurnLeft")
    TURN_LEFT("TurnLeft"),
    @XmlEnumValue("TurnRight")
    TURN_RIGHT("TurnRight"),
    @XmlEnumValue("TurnBack")
    TURN_BACK("TurnBack"),
    @XmlEnumValue("UTurn")
    U_TURN("UTurn"),
    @XmlEnumValue("TurnToStayLeft")
    TURN_TO_STAY_LEFT("TurnToStayLeft"),
    @XmlEnumValue("TurnToStayRight")
    TURN_TO_STAY_RIGHT("TurnToStayRight"),
    @XmlEnumValue("BearLeft")
    BEAR_LEFT("BearLeft"),
    @XmlEnumValue("BearRight")
    BEAR_RIGHT("BearRight"),
    @XmlEnumValue("KeepToStayLeft")
    KEEP_TO_STAY_LEFT("KeepToStayLeft"),
    @XmlEnumValue("KeepToStayRight")
    KEEP_TO_STAY_RIGHT("KeepToStayRight"),
    @XmlEnumValue("KeepToStayStraight")
    KEEP_TO_STAY_STRAIGHT("KeepToStayStraight"),
    @XmlEnumValue("KeepLeft")
    KEEP_LEFT("KeepLeft"),
    @XmlEnumValue("KeepRight")
    KEEP_RIGHT("KeepRight"),
    @XmlEnumValue("KeepStraight")
    KEEP_STRAIGHT("KeepStraight"),
    @XmlEnumValue("Take")
    TAKE("Take"),
    @XmlEnumValue("TakeRampLeft")
    TAKE_RAMP_LEFT("TakeRampLeft"),
    @XmlEnumValue("TakeRampRight")
    TAKE_RAMP_RIGHT("TakeRampRight"),
    @XmlEnumValue("TakeRampStraight")
    TAKE_RAMP_STRAIGHT("TakeRampStraight"),
    @XmlEnumValue("KeepOnrampLeft")
    KEEP_ONRAMP_LEFT("KeepOnrampLeft"),
    @XmlEnumValue("KeepOnrampRight")
    KEEP_ONRAMP_RIGHT("KeepOnrampRight"),
    @XmlEnumValue("KeepOnrampStraight")
    KEEP_ONRAMP_STRAIGHT("KeepOnrampStraight"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("Continue")
    CONTINUE("Continue"),
    @XmlEnumValue("RoadNameChange")
    ROAD_NAME_CHANGE("RoadNameChange"),
    @XmlEnumValue("EnterRoundabout")
    ENTER_ROUNDABOUT("EnterRoundabout"),
    @XmlEnumValue("ExitRoundabout")
    EXIT_ROUNDABOUT("ExitRoundabout"),
    @XmlEnumValue("TurnRightThenTurnRight")
    TURN_RIGHT_THEN_TURN_RIGHT("TurnRightThenTurnRight"),
    @XmlEnumValue("TurnRightThenTurnLeft")
    TURN_RIGHT_THEN_TURN_LEFT("TurnRightThenTurnLeft"),
    @XmlEnumValue("TurnRightThenBearRight")
    TURN_RIGHT_THEN_BEAR_RIGHT("TurnRightThenBearRight"),
    @XmlEnumValue("TurnRightThenBearLeft")
    TURN_RIGHT_THEN_BEAR_LEFT("TurnRightThenBearLeft"),
    @XmlEnumValue("TurnLeftThenTurnLeft")
    TURN_LEFT_THEN_TURN_LEFT("TurnLeftThenTurnLeft"),
    @XmlEnumValue("TurnLeftThenTurnRight")
    TURN_LEFT_THEN_TURN_RIGHT("TurnLeftThenTurnRight"),
    @XmlEnumValue("TurnLeftThenBearLeft")
    TURN_LEFT_THEN_BEAR_LEFT("TurnLeftThenBearLeft"),
    @XmlEnumValue("TurnLeftThenBearRight")
    TURN_LEFT_THEN_BEAR_RIGHT("TurnLeftThenBearRight"),
    @XmlEnumValue("BearRightThenTurnRight")
    BEAR_RIGHT_THEN_TURN_RIGHT("BearRightThenTurnRight"),
    @XmlEnumValue("BearRightThenTurnLeft")
    BEAR_RIGHT_THEN_TURN_LEFT("BearRightThenTurnLeft"),
    @XmlEnumValue("BearRightThenBearRight")
    BEAR_RIGHT_THEN_BEAR_RIGHT("BearRightThenBearRight"),
    @XmlEnumValue("BearRightThenBearLeft")
    BEAR_RIGHT_THEN_BEAR_LEFT("BearRightThenBearLeft"),
    @XmlEnumValue("BearLeftThenTurnLeft")
    BEAR_LEFT_THEN_TURN_LEFT("BearLeftThenTurnLeft"),
    @XmlEnumValue("BearLeftThenTurnRight")
    BEAR_LEFT_THEN_TURN_RIGHT("BearLeftThenTurnRight"),
    @XmlEnumValue("BearLeftThenBearRight")
    BEAR_LEFT_THEN_BEAR_RIGHT("BearLeftThenBearRight"),
    @XmlEnumValue("BearLeftThenBearLeft")
    BEAR_LEFT_THEN_BEAR_LEFT("BearLeftThenBearLeft"),
    @XmlEnumValue("RampThenHighwayRight")
    RAMP_THEN_HIGHWAY_RIGHT("RampThenHighwayRight"),
    @XmlEnumValue("RampThenHighwayLeft")
    RAMP_THEN_HIGHWAY_LEFT("RampThenHighwayLeft"),
    @XmlEnumValue("RampToHighwayStraight")
    RAMP_TO_HIGHWAY_STRAIGHT("RampToHighwayStraight"),
    @XmlEnumValue("EnterThenExitRoundabout")
    ENTER_THEN_EXIT_ROUNDABOUT("EnterThenExitRoundabout"),
    @XmlEnumValue("BearThenMerge")
    BEAR_THEN_MERGE("BearThenMerge"),
    @XmlEnumValue("TurnThenMerge")
    TURN_THEN_MERGE("TurnThenMerge"),
    @XmlEnumValue("BearThenKeep")
    BEAR_THEN_KEEP("BearThenKeep"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("Wait")
    WAIT("Wait"),
    @XmlEnumValue("TakeTransit")
    TAKE_TRANSIT("TakeTransit"),
    @XmlEnumValue("Walk")
    WALK("Walk");
    private final String value;

    ManeuverType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManeuverType fromValue(String v) {
        for (ManeuverType c: ManeuverType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
