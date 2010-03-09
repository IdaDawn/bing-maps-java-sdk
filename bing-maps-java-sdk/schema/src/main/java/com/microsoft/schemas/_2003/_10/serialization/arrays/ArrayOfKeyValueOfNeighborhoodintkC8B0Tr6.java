
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueOfNeighborhoodintkC8b0tr6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfNeighborhoodintkC8b0tr6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfNeighborhoodintkC8b0tr6" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://dev.virtualearth.net/webservices/v1/search}Neighborhood"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfNeighborhoodintkC8b0tr6", propOrder = {
    "keyValueOfNeighborhoodintkC8B0Tr6"
})
public class ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "KeyValueOfNeighborhoodintkC8b0tr6")
    protected List<KeyValueOfNeighborhoodintkC8B0Tr6> keyValueOfNeighborhoodintkC8B0Tr6;

    /**
     * Gets the value of the keyValueOfNeighborhoodintkC8B0Tr6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfNeighborhoodintkC8B0Tr6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfNeighborhoodintkC8B0Tr6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueOfNeighborhoodintkC8B0Tr6 }
     * 
     * 
     */
    public List<KeyValueOfNeighborhoodintkC8B0Tr6> getKeyValueOfNeighborhoodintkC8B0Tr6() {
        if (keyValueOfNeighborhoodintkC8B0Tr6 == null) {
            keyValueOfNeighborhoodintkC8B0Tr6 = new ArrayList<KeyValueOfNeighborhoodintkC8B0Tr6>();
        }
        return this.keyValueOfNeighborhoodintkC8B0Tr6;
    }

}
