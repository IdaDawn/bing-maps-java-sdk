
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;


/**
 * <p>Java class for ValueListFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueListFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/search}AvailableFilter">
 *       &lt;sequence>
 *         &lt;element name="Values" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueListFilter", propOrder = {
    "values"
})
public class ValueListFilter
    extends AvailableFilter
{

    @XmlElementRef(name = "Values", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfanyType> values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setValues(JAXBElement<ArrayOfanyType> value) {
        this.values = ((JAXBElement<ArrayOfanyType> ) value);
    }

}
