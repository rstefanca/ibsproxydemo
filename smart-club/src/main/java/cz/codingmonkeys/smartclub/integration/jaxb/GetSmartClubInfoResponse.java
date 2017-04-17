
package cz.codingmonkeys.smartclub.integration.jaxb;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tbc.ge/MCH/getSmartClubInfo}SmartClubFinancialProfile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "smartClubFinancialProfile"
})
@XmlRootElement(name = "getSmartClubInfoResponse", namespace = "http://www.tbc.ge/MCH/getSmartClubInfo")
public class GetSmartClubInfoResponse {

    @XmlElement(name = "SmartClubFinancialProfile", namespace = "http://www.tbc.ge/MCH/getSmartClubInfo", required = true)
    protected SmartClubFinancialProfile smartClubFinancialProfile;

    /**
     * Gets the value of the smartClubFinancialProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SmartClubFinancialProfile }
     *     
     */
    public SmartClubFinancialProfile getSmartClubFinancialProfile() {
        return smartClubFinancialProfile;
    }

    /**
     * Sets the value of the smartClubFinancialProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartClubFinancialProfile }
     *     
     */
    public void setSmartClubFinancialProfile(SmartClubFinancialProfile value) {
        this.smartClubFinancialProfile = value;
    }

}
