
package com.bing.maps.rest.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BirdseyeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BirdseyeMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/search/local/ws/rest/v1}ImageryMetadata">
 *       &lt;sequence>
 *         &lt;element name="Orientation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TilesX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TilesY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BirdseyeMetadata", propOrder = {
    "orientation",
    "tilesX",
    "tilesY"
})
public class BirdseyeMetadata
    extends ImageryMetadata
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Orientation", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double orientation;
    @XmlElement(name = "TilesX")
    protected int tilesX;
    @XmlElement(name = "TilesY")
    protected int tilesY;

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(Double value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the tilesX property.
     * 
     */
    public int getTilesX() {
        return tilesX;
    }

    /**
     * Sets the value of the tilesX property.
     * 
     */
    public void setTilesX(int value) {
        this.tilesX = value;
    }

    /**
     * Gets the value of the tilesY property.
     * 
     */
    public int getTilesY() {
        return tilesY;
    }

    /**
     * Sets the value of the tilesY property.
     * 
     */
    public void setTilesY(int value) {
        this.tilesY = value;
    }

}
