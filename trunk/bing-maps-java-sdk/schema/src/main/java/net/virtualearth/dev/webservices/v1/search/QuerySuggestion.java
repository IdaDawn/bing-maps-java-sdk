
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySuggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StructuredQuery" type="{http://dev.virtualearth.net/webservices/v1/search}StructuredSearchQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySuggestion", propOrder = {
    "query",
    "structuredQuery"
})
public class QuerySuggestion {

    @XmlElementRef(name = "Query", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> query;
    @XmlElementRef(name = "StructuredQuery", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<StructuredSearchQuery> structuredQuery;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuery(JAXBElement<String> value) {
        this.query = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the structuredQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StructuredSearchQuery }{@code >}
     *     
     */
    public JAXBElement<StructuredSearchQuery> getStructuredQuery() {
        return structuredQuery;
    }

    /**
     * Sets the value of the structuredQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StructuredSearchQuery }{@code >}
     *     
     */
    public void setStructuredQuery(JAXBElement<StructuredSearchQuery> value) {
        this.structuredQuery = ((JAXBElement<StructuredSearchQuery> ) value);
    }

}
