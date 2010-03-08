
package net.virtualearth.dev.webservices.v1.imagery.contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.virtualearth.dev.webservices.v1.imagery.ImageryMetadataRequest;
import net.virtualearth.dev.webservices.v1.imagery.ImageryMetadataResponse;
import net.virtualearth.dev.webservices.v1.imagery.MapUriRequest;
import net.virtualearth.dev.webservices.v1.imagery.MapUriResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.virtualearth.dev.webservices.v1.imagery.contracts package. 
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

    private final static QName _GetImageryMetadataRequest_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery/contracts", "request");
    private final static QName _GetMapUriResponseGetMapUriResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery/contracts", "GetMapUriResult");
    private final static QName _GetImageryMetadataResponseGetImageryMetadataResult_QNAME = new QName("http://dev.virtualearth.net/webservices/v1/imagery/contracts", "GetImageryMetadataResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.virtualearth.dev.webservices.v1.imagery.contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImageryMetadata }
     * 
     */
    public GetImageryMetadata createGetImageryMetadata() {
        return new GetImageryMetadata();
    }

    /**
     * Create an instance of {@link GetMapUriResponse }
     * 
     */
    public GetMapUriResponse createGetMapUriResponse() {
        return new GetMapUriResponse();
    }

    /**
     * Create an instance of {@link GetMapUri }
     * 
     */
    public GetMapUri createGetMapUri() {
        return new GetMapUri();
    }

    /**
     * Create an instance of {@link GetImageryMetadataResponse }
     * 
     */
    public GetImageryMetadataResponse createGetImageryMetadataResponse() {
        return new GetImageryMetadataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "request", scope = GetImageryMetadata.class)
    public JAXBElement<ImageryMetadataRequest> createGetImageryMetadataRequest(ImageryMetadataRequest value) {
        return new JAXBElement<ImageryMetadataRequest>(_GetImageryMetadataRequest_QNAME, ImageryMetadataRequest.class, GetImageryMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "GetMapUriResult", scope = GetMapUriResponse.class)
    public JAXBElement<MapUriResponse> createGetMapUriResponseGetMapUriResult(MapUriResponse value) {
        return new JAXBElement<MapUriResponse>(_GetMapUriResponseGetMapUriResult_QNAME, MapUriResponse.class, GetMapUriResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUriRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "request", scope = GetMapUri.class)
    public JAXBElement<MapUriRequest> createGetMapUriRequest(MapUriRequest value) {
        return new JAXBElement<MapUriRequest>(_GetImageryMetadataRequest_QNAME, MapUriRequest.class, GetMapUri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageryMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.virtualearth.net/webservices/v1/imagery/contracts", name = "GetImageryMetadataResult", scope = GetImageryMetadataResponse.class)
    public JAXBElement<ImageryMetadataResponse> createGetImageryMetadataResponseGetImageryMetadataResult(ImageryMetadataResponse value) {
        return new JAXBElement<ImageryMetadataResponse>(_GetImageryMetadataResponseGetImageryMetadataResult_QNAME, ImageryMetadataResponse.class, GetImageryMetadataResponse.class, value);
    }

}
