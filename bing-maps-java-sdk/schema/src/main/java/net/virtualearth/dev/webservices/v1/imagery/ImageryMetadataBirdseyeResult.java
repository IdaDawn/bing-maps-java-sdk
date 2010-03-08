
package net.virtualearth.dev.webservices.v1.imagery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.Heading;


/**
 * <p>Java class for ImageryMetadataBirdseyeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryMetadataBirdseyeResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/imagery}ImageryMetadataResult">
 *       &lt;sequence>
 *         &lt;element name="Heading" type="{http://dev.virtualearth.net/webservices/v1/common}Heading" minOccurs="0"/>
 *         &lt;element name="TilesX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TilesY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryMetadataBirdseyeResult", propOrder = {
    "heading",
    "tilesX",
    "tilesY"
})
public class ImageryMetadataBirdseyeResult
    extends ImageryMetadataResult
{

    @XmlElementRef(name = "Heading", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<Heading> heading;
    @XmlElement(name = "TilesX")
    protected Integer tilesX;
    @XmlElement(name = "TilesY")
    protected Integer tilesY;

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Heading }{@code >}
     *     
     */
    public JAXBElement<Heading> getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Heading }{@code >}
     *     
     */
    public void setHeading(JAXBElement<Heading> value) {
        this.heading = ((JAXBElement<Heading> ) value);
    }

    /**
     * Gets the value of the tilesX property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTilesX() {
        return tilesX;
    }

    /**
     * Sets the value of the tilesX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTilesX(Integer value) {
        this.tilesX = value;
    }

    /**
     * Gets the value of the tilesY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTilesY() {
        return tilesY;
    }

    /**
     * Sets the value of the tilesY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTilesY(Integer value) {
        this.tilesY = value;
    }

}
