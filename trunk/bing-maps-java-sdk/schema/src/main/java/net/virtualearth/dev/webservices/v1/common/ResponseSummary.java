
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationResultCode" type="{http://dev.virtualearth.net/webservices/v1/common}AuthenticationResultCode" minOccurs="0"/>
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaultReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://dev.virtualearth.net/webservices/v1/common}ResponseStatusCode" minOccurs="0"/>
 *         &lt;element name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseSummary", propOrder = {
    "authenticationResultCode",
    "copyright",
    "faultReason",
    "statusCode",
    "traceId"
})
public class ResponseSummary
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthenticationResultCode")
    protected AuthenticationResultCode authenticationResultCode;
    @XmlElement(name = "Copyright", nillable = true)
    protected String copyright;
    @XmlElement(name = "FaultReason", nillable = true)
    protected String faultReason;
    @XmlElement(name = "StatusCode")
    protected ResponseStatusCode statusCode;
    @XmlElement(name = "TraceId", nillable = true)
    protected String traceId;

    /**
     * Gets the value of the authenticationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResultCode }
     *     
     */
    public AuthenticationResultCode getAuthenticationResultCode() {
        return authenticationResultCode;
    }

    /**
     * Sets the value of the authenticationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResultCode }
     *     
     */
    public void setAuthenticationResultCode(AuthenticationResultCode value) {
        this.authenticationResultCode = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the faultReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultReason() {
        return faultReason;
    }

    /**
     * Sets the value of the faultReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultReason(String value) {
        this.faultReason = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusCode }
     *     
     */
    public ResponseStatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusCode }
     *     
     */
    public void setStatusCode(ResponseStatusCode value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

}
