
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}FilterExpressionBase">
 *       &lt;sequence>
 *         &lt;element name="CompareOperator" type="{http://dev.virtualearth.net/webservices/v1/common}CompareOperator" minOccurs="0"/>
 *         &lt;element name="FilterValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="PropertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExpression", propOrder = {
    "compareOperator",
    "filterValue",
    "propertyId"
})
public class FilterExpression
    extends FilterExpressionBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CompareOperator")
    protected CompareOperator compareOperator;
    @XmlElement(name = "FilterValue", nillable = true)
    protected Object filterValue;
    @XmlElement(name = "PropertyId")
    protected Integer propertyId;

    /**
     * Gets the value of the compareOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOperator }
     *     
     */
    public CompareOperator getCompareOperator() {
        return compareOperator;
    }

    /**
     * Sets the value of the compareOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOperator }
     *     
     */
    public void setCompareOperator(CompareOperator value) {
        this.compareOperator = value;
    }

    /**
     * Gets the value of the filterValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFilterValue() {
        return filterValue;
    }

    /**
     * Sets the value of the filterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFilterValue(Object value) {
        this.filterValue = value;
    }

    /**
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyId(Integer value) {
        this.propertyId = value;
    }

}
