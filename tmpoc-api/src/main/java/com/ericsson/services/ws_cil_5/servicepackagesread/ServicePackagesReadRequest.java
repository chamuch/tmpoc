
package com.ericsson.services.ws_cil_5.servicepackagesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.ericsson.services.ws_cil_5.sessionchange.SessionChangeRequest;


/**
 * <p>Java class for servicePackagesReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePackagesReadRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="inputAttributes" type="{http://ericsson.com/services/ws_CIL_5/servicepackagesread}inputAttributes" minOccurs="0"/>
 *         &lt;element name="sessionChangeRequest" type="{http://ericsson.com/services/ws_CIL_5/sessionchange}sessionChangeRequest" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicePackagesReadRequest", propOrder = {

})
public class ServicePackagesReadRequest {

    protected InputAttributes inputAttributes;
    protected SessionChangeRequest sessionChangeRequest;

    /**
     * Gets the value of the inputAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link InputAttributes }
     *     
     */
    public InputAttributes getInputAttributes() {
        return inputAttributes;
    }

    /**
     * Sets the value of the inputAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputAttributes }
     *     
     */
    public void setInputAttributes(InputAttributes value) {
        this.inputAttributes = value;
    }

    /**
     * Gets the value of the sessionChangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SessionChangeRequest }
     *     
     */
    public SessionChangeRequest getSessionChangeRequest() {
        return sessionChangeRequest;
    }

    /**
     * Sets the value of the sessionChangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionChangeRequest }
     *     
     */
    public void setSessionChangeRequest(SessionChangeRequest value) {
        this.sessionChangeRequest = value;
    }

}
