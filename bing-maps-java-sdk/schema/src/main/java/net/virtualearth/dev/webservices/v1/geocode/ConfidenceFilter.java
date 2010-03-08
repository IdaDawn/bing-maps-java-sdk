
package net.virtualearth.dev.webservices.v1.geocode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Confidence;


/**
 * <p>Java class for ConfidenceFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfidenceFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/geocode}FilterBase">
 *       &lt;sequence>
 *         &lt;element name="MinimumConfidence" type="{http://dev.virtualearth.net/webservices/v1/common}Confidence" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfidenceFilter", propOrder = {
    "minimumConfidence"
})
public class ConfidenceFilter
    extends FilterBase
{

    @XmlElement(name = "MinimumConfidence")
    protected Confidence minimumConfidence;

    /**
     * Gets the value of the minimumConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link Confidence }
     *     
     */
    public Confidence getMinimumConfidence() {
        return minimumConfidence;
    }

    /**
     * Sets the value of the minimumConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confidence }
     *     
     */
    public void setMinimumConfidence(Confidence value) {
        this.minimumConfidence = value;
    }

}
