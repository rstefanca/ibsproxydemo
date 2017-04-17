
package cz.codingmonkeys.smartclub.integration.jaxb;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


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
 *         &lt;element name="IsMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "isMember",
    "points"
})
@XmlRootElement(name = "SmartClubFinancialProfile", namespace = "http://www.tbc.ge/MCH/getSmartClubInfo")
public class SmartClubFinancialProfile {

    @XmlElement(name = "IsMember", namespace = "http://www.tbc.ge/MCH/getSmartClubInfo")
    protected boolean isMember;
    @XmlElement(name = "Points", namespace = "http://www.tbc.ge/MCH/getSmartClubInfo", required = true)
    protected BigDecimal points;

    /**
     * Gets the value of the isMember property.
     * 
     */
    public boolean isIsMember() {
        return isMember;
    }

    /**
     * Sets the value of the isMember property.
     * 
     */
    public void setIsMember(boolean value) {
        this.isMember = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPoints(BigDecimal value) {
        this.points = value;
    }

}
