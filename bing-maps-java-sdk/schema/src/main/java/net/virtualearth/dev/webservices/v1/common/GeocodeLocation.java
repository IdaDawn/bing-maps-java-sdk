
package net.virtualearth.dev.webservices.v1.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeocodeLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeocodeLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}Location">
 *       &lt;sequence>
 *         &lt;element name="CalculationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeLocation", propOrder = {
    "calculationMethod"
})
public class GeocodeLocation
    extends Location
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CalculationMethod", nillable = true)
    protected String calculationMethod;

    /**
     * Gets the value of the calculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * Sets the value of the calculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationMethod(String value) {
        this.calculationMethod = value;
    }

}
