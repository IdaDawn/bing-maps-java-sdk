
package net.virtualearth.dev.webservices.v1.search.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.virtualearth.dev.webservices.v1.search.SearchRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.search.contracts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchResponseSearchResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search/contracts", "SearchResult");
    private final static QName _SearchRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/search/contracts", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.search.contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse }
     * 
     */
    public net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse createSearchResponse() {
        return new net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link net.virtualearth.dev.webservices.v1.search.SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search/contracts", name = "SearchResult", scope = net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse.class)
    public JAXBElement<net.virtualearth.dev.webservices.v1.search.SearchResponse> createSearchResponseSearchResult(net.virtualearth.dev.webservices.v1.search.SearchResponse value) {
        return new JAXBElement<net.virtualearth.dev.webservices.v1.search.SearchResponse>(_SearchResponseSearchResult_QNAME, net.virtualearth.dev.webservices.v1.search.SearchResponse.class, net.virtualearth.dev.webservices.v1.search.contracts.SearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/search/contracts", name = "request", scope = Search.class)
    public JAXBElement<SearchRequest> createSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchRequest_QNAME, SearchRequest.class, Search.class, value);
    }

}
