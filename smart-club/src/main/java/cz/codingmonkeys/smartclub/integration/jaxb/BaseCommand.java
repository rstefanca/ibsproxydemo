
package cz.codingmonkeys.smartclub.integration.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BaseCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tbc.ge/EAI/Service/Base/v1}Message">
 *       &lt;sequence>
 *         &lt;element name="requestorDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCommand", propOrder = {
    "requestorDN",
    "userDN"
})
public abstract class BaseCommand
    extends Message
{

    @XmlElement(required = true, nillable = true)
    protected String requestorDN;
    @XmlElementRef(name = "userDN", namespace = "http://www.tbc.ge/EAI/Service/Base/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDN;

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
     * Gets the value of the userDN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDN() {
        return userDN;
    }

    /**
     * Sets the value of the userDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDN(JAXBElement<String> value) {
        this.userDN = value;
    }

}
