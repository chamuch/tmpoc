
package com.ericsson.services.ws_cil_5.servicepackagesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicePackagesReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePackagesReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numSp" type="{http://ericsson.com/services/ws_CIL_5/servicepackagesread}numSpResponse" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicePackagesReadResponse", propOrder = {

})
public class ServicePackagesReadResponse {

    protected Long rpcode;
    protected String rpcodePub;
    protected NumSpResponse numSp;

    /**
     * Gets the value of the rpcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpcode() {
        return rpcode;
    }

    /**
     * Sets the value of the rpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpcode(Long value) {
        this.rpcode = value;
    }

    /**
     * Gets the value of the rpcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpcodePub() {
        return rpcodePub;
    }

    /**
     * Sets the value of the rpcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpcodePub(String value) {
        this.rpcodePub = value;
    }

    /**
     * Gets the value of the numSp property.
     * 
     * @return
     *     possible object is
     *     {@link NumSpResponse }
     *     
     */
    public NumSpResponse getNumSp() {
        return numSp;
    }

    /**
     * Sets the value of the numSp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumSpResponse }
     *     
     */
    public void setNumSp(NumSpResponse value) {
        this.numSp = value;
    }

}
