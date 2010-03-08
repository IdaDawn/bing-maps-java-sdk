
package net.virtualearth.dev.webservices.v1.imagery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfImageryMetadataResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImageryMetadataResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageryMetadataResult" type="{http://dev.virtualearth.net/webservices/v1/imagery}ImageryMetadataResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImageryMetadataResult", propOrder = {
    "imageryMetadataResult"
})
public class ArrayOfImageryMetadataResult {

    @XmlElement(name = "ImageryMetadataResult", nillable = true)
    protected List<ImageryMetadataResult> imageryMetadataResult;

    /**
     * Gets the value of the imageryMetadataResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageryMetadataResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageryMetadataResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageryMetadataResult }
     * 
     * 
     */
    public List<ImageryMetadataResult> getImageryMetadataResult() {
        if (imageryMetadataResult == null) {
            imageryMetadataResult = new ArrayList<ImageryMetadataResult>();
        }
        return this.imageryMetadataResult;
    }

}
