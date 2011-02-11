
package com.bing.maps.rest.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChoice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChoice1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Route" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Route"/>
 *         &lt;element name="DataflowJob" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}DataflowJob"/>
 *         &lt;element name="BirdseyeMetadata" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}BirdseyeMetadata"/>
 *         &lt;element name="Location" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Location"/>
 *         &lt;element name="Resource" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Resource"/>
 *         &lt;element name="ImageryMetadata" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}ImageryMetadata"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChoice1", propOrder = {
    "routeOrDataflowJobOrBirdseyeMetadata"
})
public class ArrayOfChoice1
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElements({
        @XmlElement(name = "DataflowJob", type = DataflowJob.class, nillable = true),
        @XmlElement(name = "Resource", nillable = true),
        @XmlElement(name = "Location", type = Location.class, nillable = true),
        @XmlElement(name = "Route", type = Route.class, nillable = true),
        @XmlElement(name = "ImageryMetadata", type = ImageryMetadata.class, nillable = true),
        @XmlElement(name = "BirdseyeMetadata", type = BirdseyeMetadata.class, nillable = true)
    })
    protected List<Resource> routeOrDataflowJobOrBirdseyeMetadata;

    /**
     * Gets the value of the routeOrDataflowJobOrBirdseyeMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeOrDataflowJobOrBirdseyeMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteOrDataflowJobOrBirdseyeMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataflowJob }
     * {@link Resource }
     * {@link Location }
     * {@link Route }
     * {@link ImageryMetadata }
     * {@link BirdseyeMetadata }
     * 
     * 
     */
    public List<Resource> getRouteOrDataflowJobOrBirdseyeMetadata() {
        if (routeOrDataflowJobOrBirdseyeMetadata == null) {
            routeOrDataflowJobOrBirdseyeMetadata = new ArrayList<Resource>();
        }
        return this.routeOrDataflowJobOrBirdseyeMetadata;
    }

}
