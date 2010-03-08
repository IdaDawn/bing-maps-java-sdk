
package com.google.code.bing.webservices.schema.imageryservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageryMetadataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryMetadataResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://dev.virtualearth.net/webservices/v1/imagery}ArrayOfImageryMetadataResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryMetadataResponse", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", propOrder = {
    "results"
})
public class ImageryMetadataResponse
    extends ResponseBase
{

    @XmlElementRef(name = "Results", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<ArrayOfImageryMetadataResult> results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImageryMetadataResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfImageryMetadataResult> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfImageryMetadataResult }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfImageryMetadataResult> value) {
        this.results = ((JAXBElement<ArrayOfImageryMetadataResult> ) value);
    }

}
