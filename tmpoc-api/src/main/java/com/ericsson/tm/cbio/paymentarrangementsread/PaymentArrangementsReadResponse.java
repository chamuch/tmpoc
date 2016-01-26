
package com.ericsson.tm.cbio.paymentarrangementsread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentArrangementsReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentArrangementsReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="listOfPaymentArrangements" type="{http://ericsson.com/services/ws_CIL_5/paymentarrangementsread}listOfPaymentArrangementsResponse" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentArrangementsReadResponse", propOrder = {

})
public class PaymentArrangementsReadResponse {

    protected ListOfPaymentArrangementsResponse listOfPaymentArrangements;

    /**
     * Gets the value of the listOfPaymentArrangements property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPaymentArrangementsResponse }
     *     
     */
    public ListOfPaymentArrangementsResponse getListOfPaymentArrangements() {
        return listOfPaymentArrangements;
    }

    /**
     * Sets the value of the listOfPaymentArrangements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPaymentArrangementsResponse }
     *     
     */
    public void setListOfPaymentArrangements(ListOfPaymentArrangementsResponse value) {
        this.listOfPaymentArrangements = value;
    }

}
