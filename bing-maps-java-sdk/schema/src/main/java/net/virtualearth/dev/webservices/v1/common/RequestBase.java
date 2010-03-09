
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.search.SearchRequest;


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
@XmlType(name = "RequestBase", propOrder = {
    "credentials",
    "culture",
    "executionOptions",
    "userProfile"
})
@XmlSeeAlso({
    SearchRequest.class
})
public class RequestBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Credentials", nillable = true)
    protected Credentials credentials;
    @XmlElement(name = "Culture", nillable = true)
    protected String culture;
    @XmlElement(name = "ExecutionOptions", nillable = true)
    protected ExecutionOptions executionOptions;
    @XmlElement(name = "UserProfile", nillable = true)
    protected UserProfile userProfile;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the culture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCulture() {
        return culture;
    }

    /**
     * Sets the value of the culture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCulture(String value) {
        this.culture = value;
    }

    /**
     * Gets the value of the executionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionOptions }
     *     
     */
    public ExecutionOptions getExecutionOptions() {
        return executionOptions;
    }

    /**
     * Sets the value of the executionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionOptions }
     *     
     */
    public void setExecutionOptions(ExecutionOptions value) {
        this.executionOptions = value;
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfile }
     *     
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfile }
     *     
     */
    public void setUserProfile(UserProfile value) {
        this.userProfile = value;
    }

}
