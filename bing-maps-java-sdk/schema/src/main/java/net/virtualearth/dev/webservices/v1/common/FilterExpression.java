
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
{

    @XmlElement(name = "CompareOperator")
    protected CompareOperator compareOperator;
    @XmlElementRef(name = "FilterValue", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<Object> filterValue;
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
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFilterValue() {
        return filterValue;
    }

    /**
     * Sets the value of the filterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFilterValue(JAXBElement<Object> value) {
        this.filterValue = ((JAXBElement<Object> ) value);
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
