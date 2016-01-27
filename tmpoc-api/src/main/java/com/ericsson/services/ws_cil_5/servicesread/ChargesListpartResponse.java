
package com.ericsson.services.ws_cil_5.servicesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.lhsgroup.lhsws.money.Money;


/**
 * <p>Java class for chargesListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargesListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="chargeTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="chargeAmount" type="{http://lhsgroup.com/lhsws/money}money" minOccurs="0"/>
 *         &lt;element name="chargeAmountOvw" type="{http://lhsgroup.com/lhsws/money}money" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargesListpartResponse", propOrder = {

})
public class ChargesListpartResponse {

    protected Long chargeTypeId;
    protected Money chargeAmount;
    protected Money chargeAmountOvw;

    /**
     * Gets the value of the chargeTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChargeTypeId() {
        return chargeTypeId;
    }

    /**
     * Sets the value of the chargeTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChargeTypeId(Long value) {
        this.chargeTypeId = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setChargeAmount(Money value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the chargeAmountOvw property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getChargeAmountOvw() {
        return chargeAmountOvw;
    }

    /**
     * Sets the value of the chargeAmountOvw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setChargeAmountOvw(Money value) {
        this.chargeAmountOvw = value;
    }

}
