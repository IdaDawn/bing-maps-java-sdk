
package com.bing.maps.rest.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Line">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/search/local/ws/rest/v1}Shape">
 *       &lt;sequence>
 *         &lt;element name="Point" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Point" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
    "point"
})
public class Line
    extends Shape
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Point")
    protected List<Point> point;

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * 
     * 
     */
    public List<Point> getPoint() {
        if (point == null) {
            point = new ArrayList<Point>();
        }
        return this.point;
    }

}
