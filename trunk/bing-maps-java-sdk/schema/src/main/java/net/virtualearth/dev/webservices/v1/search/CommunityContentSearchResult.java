
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;


/**
 * <p>Java class for CommunityContentSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunityContentSearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/search}SearchResultBase">
 *       &lt;sequence>
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunityContentSearchResult", propOrder = {
    "additionalProperties",
    "description"
})
public class CommunityContentSearchResult
    extends SearchResultBase
{

    @XmlElementRef(name = "AdditionalProperties", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> additionalProperties;
    @XmlElementRef(name = "Description", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> description;

    /**
     * Gets the value of the additionalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Sets the value of the additionalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setAdditionalProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.additionalProperties = ((JAXBElement<ArrayOfKeyValueOfstringanyType> ) value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

}
