
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryItemWarning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryItemWarning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Severity" type="{http://dev.virtualearth.net/webservices/v1/route}ItineraryWarningSeverity" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarningType" type="{http://dev.virtualearth.net/webservices/v1/route}ItineraryWarningType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItemWarning", propOrder = {
    "severity",
    "text",
    "warningType"
})
public class ItineraryItemWarning
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Severity")
    protected ItineraryWarningSeverity severity;
    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "WarningType")
    protected ItineraryWarningType warningType;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryWarningSeverity }
     *     
     */
    public ItineraryWarningSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryWarningSeverity }
     *     
     */
    public void setSeverity(ItineraryWarningSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the warningType property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryWarningType }
     *     
     */
    public ItineraryWarningType getWarningType() {
        return warningType;
    }

    /**
     * Sets the value of the warningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryWarningType }
     *     
     */
    public void setWarningType(ItineraryWarningType value) {
        this.warningType = value;
    }

}
