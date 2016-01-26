
package com.ericsson.tm.cbio.addressesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressesReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressesReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="listOfAllAddresses" type="{http://ericsson.com/services/ws_CIL_5/addressesread}listOfAllAddressesResponse" minOccurs="0"/>
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="csIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressesReadResponse", propOrder = {

})
public class AddressesReadResponse {

    protected ListOfAllAddressesResponse listOfAllAddresses;
    protected Long csId;
    protected String csIdPub;

    /**
     * Gets the value of the listOfAllAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAllAddressesResponse }
     *     
     */
    public ListOfAllAddressesResponse getListOfAllAddresses() {
        return listOfAllAddresses;
    }

    /**
     * Sets the value of the listOfAllAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAllAddressesResponse }
     *     
     */
    public void setListOfAllAddresses(ListOfAllAddressesResponse value) {
        this.listOfAllAddresses = value;
    }

    /**
     * Gets the value of the csId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCsId() {
        return csId;
    }

    /**
     * Sets the value of the csId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCsId(Long value) {
        this.csId = value;
    }

    /**
     * Gets the value of the csIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsIdPub() {
        return csIdPub;
    }

    /**
     * Sets the value of the csIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsIdPub(String value) {
        this.csIdPub = value;
    }

}
