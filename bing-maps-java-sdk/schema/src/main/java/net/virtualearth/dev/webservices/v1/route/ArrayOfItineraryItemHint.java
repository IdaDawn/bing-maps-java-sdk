
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfItineraryItemHint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItineraryItemHint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItineraryItemHint" type="{http://dev.virtualearth.net/webservices/v1/route}ItineraryItemHint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItineraryItemHint", propOrder = {
    "itineraryItemHint"
})
public class ArrayOfItineraryItemHint
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ItineraryItemHint", nillable = true)
    protected List<ItineraryItemHint> itineraryItemHint;

    /**
     * Gets the value of the itineraryItemHint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryItemHint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryItemHint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryItemHint }
     * 
     * 
     */
    public List<ItineraryItemHint> getItineraryItemHint() {
        if (itineraryItemHint == null) {
            itineraryItemHint = new ArrayList<ItineraryItemHint>();
        }
        return this.itineraryItemHint;
    }

}
