
package cz.codingmonkeys.smartclub.integration.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tbc.ge/EAI/Service/Base/v1}Message">
 *       &lt;sequence>
 *         &lt;element name="requestorDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponse", propOrder = {
    "requestorDN",
    "correlationId"
})
@XmlSeeAlso({
    BaseException.class
})
public abstract class BaseResponse
    extends Message
{

    @XmlElement(required = true, nillable = true)
    protected String requestorDN;
    @XmlElementRef(name = "correlationId", namespace = "http://www.tbc.ge/EAI/Service/Base/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correlationId;

    /**
     * Gets the value of the requestorDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorDN() {
        return requestorDN;
    }

    /**
     * Sets the value of the requestorDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorDN(String value) {
        this.requestorDN = value;
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
