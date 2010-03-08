
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;


/**
 * <p>Java class for CategorySpecificPropertySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategorySpecificPropertySet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategorySpecificPropertySet", propOrder = {
    "categoryName",
    "properties"
})
public class CategorySpecificPropertySet {

    @XmlElementRef(name = "CategoryName", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> categoryName;
    @XmlElementRef(name = "Properties", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> properties;

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryName(JAXBElement<String> value) {
        this.categoryName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.properties = ((JAXBElement<ArrayOfKeyValueOfstringanyType> ) value);
    }

}
