
package net.virtualearth.dev.webservices.v1.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterExpressionClause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterExpressionClause">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}FilterExpressionBase">
 *       &lt;sequence>
 *         &lt;element name="Expressions" type="{http://dev.virtualearth.net/webservices/v1/common}ArrayOfFilterExpressionBase" minOccurs="0"/>
 *         &lt;element name="LogicalOperator" type="{http://dev.virtualearth.net/webservices/v1/common}LogicalOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExpressionClause", propOrder = {
    "expressions",
    "logicalOperator"
})
public class FilterExpressionClause
    extends FilterExpressionBase
{

    @XmlElementRef(name = "Expressions", namespace = "http://dev.virtualearth.net/webservices/v1/common", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFilterExpressionBase> expressions;
    @XmlElement(name = "LogicalOperator")
    protected LogicalOperator logicalOperator;

    /**
     * Gets the value of the expressions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFilterExpressionBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFilterExpressionBase> getExpressions() {
        return expressions;
    }

    /**
     * Sets the value of the expressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFilterExpressionBase }{@code >}
     *     
     */
    public void setExpressions(JAXBElement<ArrayOfFilterExpressionBase> value) {
        this.expressions = ((JAXBElement<ArrayOfFilterExpressionBase> ) value);
    }

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperator }
     *     
     */
    public LogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperator }
     *     
     */
    public void setLogicalOperator(LogicalOperator value) {
        this.logicalOperator = value;
    }

}
