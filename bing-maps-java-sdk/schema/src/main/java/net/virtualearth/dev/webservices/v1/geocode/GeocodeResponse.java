
package net.virtualearth.dev.webservices.v1.geocode;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.ArrayOfGeocodeResult;
import net.virtualearth.dev.webservices.v1.common.ResponseBase;


/**
 * <p>Java class for GeocodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeocodeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://dev.virtualearth.net/webservices/v1/common}ArrayOfGeocodeResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeResponse", propOrder = {
    "results"
})
public class GeocodeResponse
    extends ResponseBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Results", nillable = true)
    protected ArrayOfGeocodeResult results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeocodeResult }
     *     
     */
    public ArrayOfGeocodeResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeocodeResult }
     *     
     */
    public void setResults(ArrayOfGeocodeResult value) {
        this.results = value;
    }

}
