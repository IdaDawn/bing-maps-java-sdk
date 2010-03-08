
package net.virtualearth.dev.webservices.v1.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNeighborhood complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNeighborhood">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Neighborhood" type="{http://dev.virtualearth.net/webservices/v1/search}Neighborhood" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNeighborhood", propOrder = {
    "neighborhood"
})
public class ArrayOfNeighborhood {

    @XmlElement(name = "Neighborhood", nillable = true)
    protected List<Neighborhood> neighborhood;

    /**
     * Gets the value of the neighborhood property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neighborhood property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeighborhood().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Neighborhood }
     * 
     * 
     */
    public List<Neighborhood> getNeighborhood() {
        if (neighborhood == null) {
            neighborhood = new ArrayList<Neighborhood>();
        }
        return this.neighborhood;
    }

}
