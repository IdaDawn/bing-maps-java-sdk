
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.ws.WebFault;
import net.virtualearth.dev.webservices.v1.common.ResponseSummary;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-hudson-208-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ResponseSummary", targetNamespace = "http://dev.virtualearth.net/webservices/v1/common")
public class IRouteServiceCalculateRoutesFromMajorRoadsResponseSummaryFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ResponseSummary faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IRouteServiceCalculateRoutesFromMajorRoadsResponseSummaryFaultFaultMessage(String message, ResponseSummary faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IRouteServiceCalculateRoutesFromMajorRoadsResponseSummaryFaultFaultMessage(String message, ResponseSummary faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: net.virtualearth.dev.webservices.v1.common.ResponseSummary
     */
    public ResponseSummary getFaultInfo() {
        return faultInfo;
    }

}
