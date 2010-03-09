
package net.virtualearth.dev.webservices.v1.search;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.virtualearth.dev.webservices.v1.common.ResponseBase;


/**
 * <p>Java class for SearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="QuerySuggestion" type="{http://dev.virtualearth.net/webservices/v1/search}QuerySuggestion" minOccurs="0"/>
 *         &lt;element name="ResultSets" type="{http://dev.virtualearth.net/webservices/v1/search}ArrayOfSearchResultSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponse", propOrder = {
    "querySuggestion",
    "resultSets"
})
public class SearchResponse
    extends ResponseBase
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "QuerySuggestion", nillable = true)
    protected QuerySuggestion querySuggestion;
    @XmlElement(name = "ResultSets", nillable = true)
    protected ArrayOfSearchResultSet resultSets;

    /**
     * Gets the value of the querySuggestion property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySuggestion }
     *     
     */
    public QuerySuggestion getQuerySuggestion() {
        return querySuggestion;
    }

    /**
     * Sets the value of the querySuggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySuggestion }
     *     
     */
    public void setQuerySuggestion(QuerySuggestion value) {
        this.querySuggestion = value;
    }

    /**
     * Gets the value of the resultSets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchResultSet }
     *     
     */
    public ArrayOfSearchResultSet getResultSets() {
        return resultSets;
    }

    /**
     * Sets the value of the resultSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchResultSet }
     *     
     */
    public void setResultSets(ArrayOfSearchResultSet value) {
        this.resultSets = value;
    }

}
