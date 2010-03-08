
package net.virtualearth.dev.webservices.v1.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchResultSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchResultSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchResultSet" type="{http://dev.virtualearth.net/webservices/v1/search}SearchResultSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchResultSet", propOrder = {
    "searchResultSet"
})
public class ArrayOfSearchResultSet {

    @XmlElement(name = "SearchResultSet", nillable = true)
    protected List<SearchResultSet> searchResultSet;

    /**
     * Gets the value of the searchResultSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResultSet }
     * 
     * 
     */
    public List<SearchResultSet> getSearchResultSet() {
        if (searchResultSet == null) {
            searchResultSet = new ArrayList<SearchResultSet>();
        }
        return this.searchResultSet;
    }

}
