
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.search.SearchResponse;


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
@XmlSeeAlso({
    SearchResponse.class
})
public class ResponseBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BrandLogoUri", nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String brandLogoUri;
    @XmlElement(name = "ResponseSummary", nillable = true)
    protected ResponseSummary responseSummary;

    /**
     * Gets the value of the brandLogoUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandLogoUri() {
        return brandLogoUri;
    }

    /**
     * Sets the value of the brandLogoUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandLogoUri(String value) {
        this.brandLogoUri = value;
    }

    /**
     * Gets the value of the responseSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseSummary }
     *     
     */
    public ResponseSummary getResponseSummary() {
        return responseSummary;
    }

    /**
     * Sets the value of the responseSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseSummary }
     *     
     */
    public void setResponseSummary(ResponseSummary value) {
        this.responseSummary = value;
    }

}
