
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9q_P9s complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9q_P9s">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfintCategorySpecificPropertySetn6Q9q_P9s" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Value" type="{http://dev.virtualearth.net/webservices/v1/search}CategorySpecificPropertySet"/>
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
@XmlType(name = "ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9q_P9s", propOrder = {
    "keyValueOfintCategorySpecificPropertySetn6Q9QP9S"
})
public class ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "KeyValueOfintCategorySpecificPropertySetn6Q9q_P9s")
    protected List<KeyValueOfintCategorySpecificPropertySetn6Q9QP9S> keyValueOfintCategorySpecificPropertySetn6Q9QP9S;

    /**
     * Gets the value of the keyValueOfintCategorySpecificPropertySetn6Q9QP9S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintCategorySpecificPropertySetn6Q9QP9S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintCategorySpecificPropertySetn6Q9QP9S().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueOfintCategorySpecificPropertySetn6Q9QP9S }
     * 
     * 
     */
    public List<KeyValueOfintCategorySpecificPropertySetn6Q9QP9S> getKeyValueOfintCategorySpecificPropertySetn6Q9QP9S() {
        if (keyValueOfintCategorySpecificPropertySetn6Q9QP9S == null) {
            keyValueOfintCategorySpecificPropertySetn6Q9QP9S = new ArrayList<KeyValueOfintCategorySpecificPropertySetn6Q9QP9S>();
        }
        return this.keyValueOfintCategorySpecificPropertySetn6Q9QP9S;
    }

}
