
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.search.Neighborhood;


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
public class ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 {

    @XmlElement(name = "KeyValueOfNeighborhoodintkC8b0tr6")
    protected List<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 .KeyValueOfNeighborhoodintkC8B0Tr6> keyValueOfNeighborhoodintkC8B0Tr6;

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
     * {@link ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 .KeyValueOfNeighborhoodintkC8B0Tr6 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 .KeyValueOfNeighborhoodintkC8B0Tr6> getKeyValueOfNeighborhoodintkC8B0Tr6() {
        if (keyValueOfNeighborhoodintkC8B0Tr6 == null) {
            keyValueOfNeighborhoodintkC8B0Tr6 = new ArrayList<ArrayOfKeyValueOfNeighborhoodintkC8B0Tr6 .KeyValueOfNeighborhoodintkC8B0Tr6>();
        }
        return this.keyValueOfNeighborhoodintkC8B0Tr6;
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
     *         &lt;element name="Key" type="{http://dev.virtualearth.net/webservices/v1/search}Neighborhood"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    public static class KeyValueOfNeighborhoodintkC8B0Tr6 {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected Neighborhood key;
        @XmlElement(name = "Value")
        protected int value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link Neighborhood }
         *     
         */
        public Neighborhood getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link Neighborhood }
         *     
         */
        public void setKey(Neighborhood value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(int value) {
            this.value = value;
        }

    }

}
