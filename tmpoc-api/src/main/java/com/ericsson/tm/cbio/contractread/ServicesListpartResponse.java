
package com.ericsson.tm.cbio.contractread;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicesListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicesListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sncode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sncodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coSnStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="coSnPendingStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="coReqPending" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicesListpartResponse", propOrder = {

})
public class ServicesListpartResponse {

    protected Long sncode;
    protected String sncodePub;
    protected Long profileId;
    protected BigInteger coSnStatus;
    protected BigInteger coSnPendingStatus;
    protected Long coReqPending;
    protected Long spcode;
    protected String spcodePub;

    /**
     * Gets the value of the sncode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSncode() {
        return sncode;
    }

    /**
     * Sets the value of the sncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSncode(Long value) {
        this.sncode = value;
    }

    /**
     * Gets the value of the sncodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSncodePub() {
        return sncodePub;
    }

    /**
     * Sets the value of the sncodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSncodePub(String value) {
        this.sncodePub = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileId(Long value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the coSnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoSnStatus() {
        return coSnStatus;
    }

    /**
     * Sets the value of the coSnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoSnStatus(BigInteger value) {
        this.coSnStatus = value;
    }

    /**
     * Gets the value of the coSnPendingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoSnPendingStatus() {
        return coSnPendingStatus;
    }

    /**
     * Sets the value of the coSnPendingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoSnPendingStatus(BigInteger value) {
        this.coSnPendingStatus = value;
    }

    /**
     * Gets the value of the coReqPending property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoReqPending() {
        return coReqPending;
    }

    /**
     * Sets the value of the coReqPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoReqPending(Long value) {
        this.coReqPending = value;
    }

    /**
     * Gets the value of the spcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpcode() {
        return spcode;
    }

    /**
     * Sets the value of the spcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpcode(Long value) {
        this.spcode = value;
    }

    /**
     * Gets the value of the spcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpcodePub() {
        return spcodePub;
    }

    /**
     * Sets the value of the spcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpcodePub(String value) {
        this.spcodePub = value;
    }

}
