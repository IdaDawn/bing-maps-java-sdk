
package net.virtualearth.dev.webservices.v1.route.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.route.MajorRoutesResponse;


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
 *         &lt;element name="CalculateRoutesFromMajorRoadsResult" type="{http://dev.virtualearth.net/webservices/v1/route}MajorRoutesResponse" minOccurs="0"/>
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
    "calculateRoutesFromMajorRoadsResult"
})
@XmlRootElement(name = "CalculateRoutesFromMajorRoadsResponse")
public class CalculateRoutesFromMajorRoadsResponse {

    @XmlElementRef(name = "CalculateRoutesFromMajorRoadsResult", namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", type = JAXBElement.class)
    protected JAXBElement<MajorRoutesResponse> calculateRoutesFromMajorRoadsResult;

    /**
     * Gets the value of the calculateRoutesFromMajorRoadsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MajorRoutesResponse }{@code >}
     *     
     */
    public JAXBElement<MajorRoutesResponse> getCalculateRoutesFromMajorRoadsResult() {
        return calculateRoutesFromMajorRoadsResult;
    }

    /**
     * Sets the value of the calculateRoutesFromMajorRoadsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MajorRoutesResponse }{@code >}
     *     
     */
    public void setCalculateRoutesFromMajorRoadsResult(JAXBElement<MajorRoutesResponse> value) {
        this.calculateRoutesFromMajorRoadsResult = ((JAXBElement<MajorRoutesResponse> ) value);
    }

}
