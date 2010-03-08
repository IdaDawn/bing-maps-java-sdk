
package com.google.code.bing.webservices.schema.imageryservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetImageryMetadataResult" type="{http://dev.virtualearth.net/webservices/v1/imagery}ImageryMetadataResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getImageryMetadataResult"
})
@XmlRootElement(name = "GetImageryMetadataResponse", namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts")
public class GetImageryMetadataResponse {

    @XmlElementRef(name = "GetImageryMetadataResult", namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", type = JAXBElement.class)
    protected JAXBElement<ImageryMetadataResponse> getImageryMetadataResult;

    /**
     * Gets the value of the getImageryMetadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageryMetadataResponse }{@code >}
     *     
     */
    public JAXBElement<ImageryMetadataResponse> getGetImageryMetadataResult() {
        return getImageryMetadataResult;
    }

    /**
     * Sets the value of the getImageryMetadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageryMetadataResponse }{@code >}
     *     
     */
    public void setGetImageryMetadataResult(JAXBElement<ImageryMetadataResponse> value) {
        this.getImageryMetadataResult = ((JAXBElement<ImageryMetadataResponse> ) value);
    }

}
