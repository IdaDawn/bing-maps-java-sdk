
package com.google.code.bing.webservices.schema.routeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Credentials" type="{http://dev.virtualearth.net/webservices/v1/common}Credentials" minOccurs="0"/>
 *         &lt;element name="Culture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExecutionOptions" type="{http://dev.virtualearth.net/webservices/v1/common}ExecutionOptions" minOccurs="0"/>
 *         &lt;element name="UserProfile" type="{http://dev.virtualearth.net/webservices/v1/common}UserProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBase", namespace = "http://dev.virtualearth.net/webservices/v1/common", propOrder = {
    "credentials",
    "culture",
    "executionOptions",
    "userProfile"
})
public class RequestBase {

    @XmlElementRef(name = "Credentials", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<Credentials> credentials;
    @XmlElementRef(name = "Culture", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> culture;
    @XmlElementRef(name = "ExecutionOptions", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<ExecutionOptions> executionOptions;
    @XmlElementRef(name = "UserProfile", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<UserProfile> userProfile;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     *     
     */
    public JAXBElement<Credentials> getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     *     
     */
    public void setCredentials(JAXBElement<Credentials> value) {
        this.credentials = ((JAXBElement<Credentials> ) value);
    }

    /**
     * Gets the value of the culture property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCulture() {
        return culture;
    }

    /**
     * Sets the value of the culture property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCulture(JAXBElement<String> value) {
        this.culture = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the executionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExecutionOptions }{@code >}
     *     
     */
    public JAXBElement<ExecutionOptions> getExecutionOptions() {
        return executionOptions;
    }

    /**
     * Sets the value of the executionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExecutionOptions }{@code >}
     *     
     */
    public void setExecutionOptions(JAXBElement<ExecutionOptions> value) {
        this.executionOptions = ((JAXBElement<ExecutionOptions> ) value);
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserProfile }{@code >}
     *     
     */
    public JAXBElement<UserProfile> getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserProfile }{@code >}
     *     
     */
    public void setUserProfile(JAXBElement<UserProfile> value) {
        this.userProfile = ((JAXBElement<UserProfile> ) value);
    }

}
