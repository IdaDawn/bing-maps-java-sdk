
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6;


/**
 * <p>Java class for CategoryCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://dev.virtualearth.net/webservices/v1/search}Category" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountByNeighborhood" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfNeighborhoodintkC8b0tr6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryCount", propOrder = {
    "category",
    "count",
    "countByNeighborhood"
})
public class CategoryCount {

    @XmlElementRef(name = "Category", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<Category> category;
    @XmlElement(name = "Count")
    protected Integer count;
    @XmlElementRef(name = "CountByNeighborhood", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6> countByNeighborhood;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Category }{@code >}
     *     
     */
    public JAXBElement<Category> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Category }{@code >}
     *     
     */
    public void setCategory(JAXBElement<Category> value) {
        this.category = ((JAXBElement<Category> ) value);
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the countByNeighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6> getCountByNeighborhood() {
        return countByNeighborhood;
    }

    /**
     * Sets the value of the countByNeighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 }{@code >}
     *     
     */
    public void setCountByNeighborhood(JAXBElement<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6> value) {
        this.countByNeighborhood = ((JAXBElement<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6> ) value);
    }

}
