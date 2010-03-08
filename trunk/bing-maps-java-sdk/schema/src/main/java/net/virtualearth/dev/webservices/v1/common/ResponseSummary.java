
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
public class ResponseSummary {

    @XmlElement(name = "AuthenticationResultCode")
    protected AuthenticationResultCode authenticationResultCode;
    @XmlElementRef(name = "Copyright", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> copyright;
    @XmlElementRef(name = "FaultReason", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> faultReason;
    @XmlElement(name = "StatusCode")
    protected ResponseStatusCode statusCode;
    @XmlElementRef(name = "TraceId", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> traceId;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCopyright(JAXBElement<String> value) {
        this.copyright = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the faultReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaultReason() {
        return faultReason;
    }

    /**
     * Sets the value of the faultReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaultReason(JAXBElement<String> value) {
        this.faultReason = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTraceId(JAXBElement<String> value) {
        this.traceId = ((JAXBElement<String> ) value);
    }

}
