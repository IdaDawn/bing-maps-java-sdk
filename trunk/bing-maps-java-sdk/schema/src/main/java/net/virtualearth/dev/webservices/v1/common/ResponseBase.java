
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrandLogoUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ResponseSummary" type="{http://dev.virtualearth.net/webservices/v1/common}ResponseSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBase", propOrder = {
    "brandLogoUri",
    "responseSummary"
})
public class ResponseBase {

    @XmlElementRef(name = "BrandLogoUri", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<String> brandLogoUri;
    @XmlElementRef(name = "ResponseSummary", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<ResponseSummary> responseSummary;

    /**
     * Gets the value of the brandLogoUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandLogoUri() {
        return brandLogoUri;
    }

    /**
     * Sets the value of the brandLogoUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandLogoUri(JAXBElement<String> value) {
        this.brandLogoUri = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the responseSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseSummary }{@code >}
     *     
     */
    public JAXBElement<ResponseSummary> getResponseSummary() {
        return responseSummary;
    }

    /**
     * Sets the value of the responseSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseSummary }{@code >}
     *     
     */
    public void setResponseSummary(JAXBElement<ResponseSummary> value) {
        this.responseSummary = ((JAXBElement<ResponseSummary> ) value);
    }

}
