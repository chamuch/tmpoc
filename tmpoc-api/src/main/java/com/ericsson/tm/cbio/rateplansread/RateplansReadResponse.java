
package com.ericsson.tm.cbio.rateplansread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateplansReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateplansReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="numRp" type="{http://ericsson.com/services/ws_CIL_5/rateplansread}numRpResponse" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateplansReadResponse", propOrder = {

})
public class RateplansReadResponse {

    protected NumRpResponse numRp;

    /**
     * Gets the value of the numRp property.
     * 
     * @return
     *     possible object is
     *     {@link NumRpResponse }
     *     
     */
    public NumRpResponse getNumRp() {
        return numRp;
    }

    /**
     * Sets the value of the numRp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumRpResponse }
     *     
     */
    public void setNumRp(NumRpResponse value) {
        this.numRp = value;
    }

}
