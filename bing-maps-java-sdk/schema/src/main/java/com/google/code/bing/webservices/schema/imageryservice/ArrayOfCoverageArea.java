
package com.google.code.bing.webservices.schema.imageryservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCoverageArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCoverageArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageArea" type="{http://dev.virtualearth.net/webservices/v1/imagery}CoverageArea" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCoverageArea", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", propOrder = {
    "coverageArea"
})
public class ArrayOfCoverageArea {

    @XmlElement(name = "CoverageArea", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", nillable = true)
    protected List<CoverageArea> coverageArea;

    /**
     * Gets the value of the coverageArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageArea }
     * 
     * 
     */
    public List<CoverageArea> getCoverageArea() {
        if (coverageArea == null) {
            coverageArea = new ArrayList<CoverageArea>();
        }
        return this.coverageArea;
    }

}
