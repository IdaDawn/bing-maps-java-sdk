
package net.virtualearth.dev.webservices.v1.imagery;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.ArrayOfPushpin;
import net.virtualearth.dev.webservices.v1.common.Location;
import net.virtualearth.dev.webservices.v1.common.RequestBase;


/**
 * <p>Java class for MapUriRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapUriRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Center" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="MajorRoutesDestination" type="{http://dev.virtualearth.net/webservices/v1/common}Location" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://dev.virtualearth.net/webservices/v1/imagery}MapUriOptions" minOccurs="0"/>
 *         &lt;element name="Pushpins" type="{http://dev.virtualearth.net/webservices/v1/common}ArrayOfPushpin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapUriRequest", propOrder = {
    "center",
    "majorRoutesDestination",
    "options",
    "pushpins"
})
public class MapUriRequest
    extends RequestBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Center", nillable = true)
    protected Location center;
    @XmlElement(name = "MajorRoutesDestination", nillable = true)
    protected Location majorRoutesDestination;
    @XmlElement(name = "Options", nillable = true)
    protected MapUriOptions options;
    @XmlElement(name = "Pushpins", nillable = true)
    protected ArrayOfPushpin pushpins;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setCenter(Location value) {
        this.center = value;
    }

    /**
     * Gets the value of the majorRoutesDestination property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getMajorRoutesDestination() {
        return majorRoutesDestination;
    }

    /**
     * Sets the value of the majorRoutesDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setMajorRoutesDestination(Location value) {
        this.majorRoutesDestination = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link MapUriOptions }
     *     
     */
    public MapUriOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapUriOptions }
     *     
     */
    public void setOptions(MapUriOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the pushpins property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPushpin }
     *     
     */
    public ArrayOfPushpin getPushpins() {
        return pushpins;
    }

    /**
     * Sets the value of the pushpins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPushpin }
     *     
     */
    public void setPushpins(ArrayOfPushpin value) {
        this.pushpins = value;
    }

}
