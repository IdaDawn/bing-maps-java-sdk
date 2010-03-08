
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.RequestBase;


/**
 * <p>Java class for SearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchOptions" type="{http://dev.virtualearth.net/webservices/v1/search}SearchOptions" minOccurs="0"/>
 *         &lt;element name="StructuredQuery" type="{http://dev.virtualearth.net/webservices/v1/search}StructuredSearchQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "query",
    "searchOptions",
    "structuredQuery"
})
public class SearchRequest
    extends RequestBase
{

    @XmlElementRef(name = "Query", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<String> query;
    @XmlElementRef(name = "SearchOptions", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<SearchOptions> searchOptions;
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
     * Gets the value of the searchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchOptions }{@code >}
     *     
     */
    public JAXBElement<SearchOptions> getSearchOptions() {
        return searchOptions;
    }

    /**
     * Sets the value of the searchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchOptions }{@code >}
     *     
     */
    public void setSearchOptions(JAXBElement<SearchOptions> value) {
        this.searchOptions = ((JAXBElement<SearchOptions> ) value);
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
