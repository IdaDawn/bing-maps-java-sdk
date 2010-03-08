
package net.virtualearth.dev.webservices.v1.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
{

    @XmlElementRef(name = "QuerySuggestion", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<QuerySuggestion> querySuggestion;
    @XmlElementRef(name = "ResultSets", namespace = "http://dev.virtualearth.net/webservices/v1/search", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSearchResultSet> resultSets;

    /**
     * Gets the value of the querySuggestion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuerySuggestion }{@code >}
     *     
     */
    public JAXBElement<QuerySuggestion> getQuerySuggestion() {
        return querySuggestion;
    }

    /**
     * Sets the value of the querySuggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuerySuggestion }{@code >}
     *     
     */
    public void setQuerySuggestion(JAXBElement<QuerySuggestion> value) {
        this.querySuggestion = ((JAXBElement<QuerySuggestion> ) value);
    }

    /**
     * Gets the value of the resultSets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchResultSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSearchResultSet> getResultSets() {
        return resultSets;
    }

    /**
     * Sets the value of the resultSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSearchResultSet }{@code >}
     *     
     */
    public void setResultSets(JAXBElement<ArrayOfSearchResultSet> value) {
        this.resultSets = ((JAXBElement<ArrayOfSearchResultSet> ) value);
    }

}
