
package com.ericsson.tm.cbio.servicesread;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intSvListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intSvListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sncode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sncodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extResourceTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extResourceTypeIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceTypeCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intSvListpartResponse", propOrder = {

})
public class IntSvListpartResponse {

    protected Long sncode;
    protected String sncodePub;
    protected Long extResourceTypeId;
    protected String extResourceTypeIdPub;
    protected BigInteger resourceTypeCode;

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
     * Gets the value of the extResourceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtResourceTypeId() {
        return extResourceTypeId;
    }

    /**
     * Sets the value of the extResourceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtResourceTypeId(Long value) {
        this.extResourceTypeId = value;
    }

    /**
     * Gets the value of the extResourceTypeIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtResourceTypeIdPub() {
        return extResourceTypeIdPub;
    }

    /**
     * Sets the value of the extResourceTypeIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtResourceTypeIdPub(String value) {
        this.extResourceTypeIdPub = value;
    }

    /**
     * Gets the value of the resourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResourceTypeCode() {
        return resourceTypeCode;
    }

    /**
     * Sets the value of the resourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResourceTypeCode(BigInteger value) {
        this.resourceTypeCode = value;
    }

}
