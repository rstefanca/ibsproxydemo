
package cz.codingmonkeys.smartclub.integration.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BaseEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tbc.ge/EAI/Service/Base/v1}Message">
 *       &lt;sequence>
 *         &lt;element name="applicationDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="correlationId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(\p{Lu})+::(\p{IsBasicLatin})+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseEvent", propOrder = {
    "applicationDN",
    "eventTime",
    "correlationId"
})
public abstract class BaseEvent
    extends Message
{

    @XmlElement(required = true, nillable = true)
    protected String applicationDN;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlElementRef(name = "correlationId", namespace = "http://www.tbc.ge/EAI/Service/Base/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correlationId;

    /**
     * Gets the value of the applicationDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDN() {
        return applicationDN;
    }

    /**
     * Sets the value of the applicationDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDN(String value) {
        this.applicationDN = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrelationId(JAXBElement<String> value) {
        this.correlationId = value;
    }

}
