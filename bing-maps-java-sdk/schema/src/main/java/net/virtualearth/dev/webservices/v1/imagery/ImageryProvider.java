
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageryProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverageAreas" type="{http://dev.virtualearth.net/webservices/v1/imagery}ArrayOfCoverageArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryProvider", propOrder = {
    "attribution",
    "coverageAreas"
})
public class ImageryProvider {

    @XmlElementRef(name = "Attribution", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<String> attribution;
    @XmlElementRef(name = "CoverageAreas", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCoverageArea> coverageAreas;

    /**
     * Gets the value of the attribution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribution() {
        return attribution;
    }

    /**
     * Sets the value of the attribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribution(JAXBElement<String> value) {
        this.attribution = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the coverageAreas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoverageArea }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCoverageArea> getCoverageAreas() {
        return coverageAreas;
    }

    /**
     * Sets the value of the coverageAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoverageArea }{@code >}
     *     
     */
    public void setCoverageAreas(JAXBElement<ArrayOfCoverageArea> value) {
        this.coverageAreas = ((JAXBElement<ArrayOfCoverageArea> ) value);
    }

}
