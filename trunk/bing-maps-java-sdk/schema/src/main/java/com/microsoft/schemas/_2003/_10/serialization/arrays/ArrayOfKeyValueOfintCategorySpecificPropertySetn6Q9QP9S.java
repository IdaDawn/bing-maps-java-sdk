
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.search.CategorySpecificPropertySet;


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
public class ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S {

    @XmlElement(name = "KeyValueOfintCategorySpecificPropertySetn6Q9q_P9s")
    protected List<ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S.KeyValueOfintCategorySpecificPropertySetn6Q9QP9S> keyValueOfintCategorySpecificPropertySetn6Q9QP9S;

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
     * {@link ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S.KeyValueOfintCategorySpecificPropertySetn6Q9QP9S }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S.KeyValueOfintCategorySpecificPropertySetn6Q9QP9S> getKeyValueOfintCategorySpecificPropertySetn6Q9QP9S() {
        if (keyValueOfintCategorySpecificPropertySetn6Q9QP9S == null) {
            keyValueOfintCategorySpecificPropertySetn6Q9QP9S = new ArrayList<ArrayOfKeyValueOfintCategorySpecificPropertySetn6Q9QP9S.KeyValueOfintCategorySpecificPropertySetn6Q9QP9S>();
        }
        return this.keyValueOfintCategorySpecificPropertySetn6Q9QP9S;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Value" type="{http://dev.virtualearth.net/webservices/v1/search}CategorySpecificPropertySet"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfintCategorySpecificPropertySetn6Q9QP9S {

        @XmlElement(name = "Key")
        protected int key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected CategorySpecificPropertySet value;

        /**
         * Gets the value of the key property.
         * 
         */
        public int getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         */
        public void setKey(int value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link CategorySpecificPropertySet }
         *     
         */
        public CategorySpecificPropertySet getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link CategorySpecificPropertySet }
         *     
         */
        public void setValue(CategorySpecificPropertySet value) {
            this.value = value;
        }

    }

}
