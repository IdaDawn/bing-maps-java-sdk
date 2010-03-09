
package net.virtualearth.dev.webservices.v1.search;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class QuerySuggestion
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Query", nillable = true)
    protected String query;
    @XmlElement(name = "StructuredQuery", nillable = true)
    protected StructuredSearchQuery structuredQuery;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the structuredQuery property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredSearchQuery }
     *     
     */
    public StructuredSearchQuery getStructuredQuery() {
        return structuredQuery;
    }

    /**
     * Sets the value of the structuredQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredSearchQuery }
     *     
     */
    public void setStructuredQuery(StructuredSearchQuery value) {
        this.structuredQuery = value;
    }

}
