
package net.virtualearth.dev.webservices.v1.search;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class CategoryCount
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Category", nillable = true)
    protected Category category;
    @XmlElement(name = "Count")
    protected Integer count;
    @XmlElement(name = "CountByNeighborhood", nillable = true)
    protected ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 countByNeighborhood;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
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
     *     {@link ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 }
     *     
     */
    public ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 getCountByNeighborhood() {
        return countByNeighborhood;
    }

    /**
     * Sets the value of the countByNeighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 }
     *     
     */
    public void setCountByNeighborhood(ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 value) {
        this.countByNeighborhood = value;
    }

}
