
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFilterExpressionBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFilterExpressionBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterExpressionBase" type="{http://dev.virtualearth.net/webservices/v1/common}FilterExpressionBase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFilterExpressionBase", propOrder = {
    "filterExpressionBase"
})
public class ArrayOfFilterExpressionBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "FilterExpressionBase", nillable = true)
    protected List<FilterExpressionBase> filterExpressionBase;

    /**
     * Gets the value of the filterExpressionBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterExpressionBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterExpressionBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterExpressionBase }
     * 
     * 
     */
    public List<FilterExpressionBase> getFilterExpressionBase() {
        if (filterExpressionBase == null) {
            filterExpressionBase = new ArrayList<FilterExpressionBase>();
        }
        return this.filterExpressionBase;
    }

}
