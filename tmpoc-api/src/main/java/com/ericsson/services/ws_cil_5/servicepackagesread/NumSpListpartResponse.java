
package com.ericsson.services.ws_cil_5.servicepackagesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numSpListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numSpListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="spcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spShdes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdeServicePackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="atomicServicePackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numSpListpartResponse", propOrder = {

})
public class NumSpListpartResponse {

    protected Long spcode;
    protected String spcodePub;
    protected String spShdes;
    protected String spDes;
    protected Boolean pdeServicePackage;
    protected Boolean atomicServicePackage;

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

    /**
     * Gets the value of the spShdes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpShdes() {
        return spShdes;
    }

    /**
     * Sets the value of the spShdes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpShdes(String value) {
        this.spShdes = value;
    }

    /**
     * Gets the value of the spDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpDes() {
        return spDes;
    }

    /**
     * Sets the value of the spDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpDes(String value) {
        this.spDes = value;
    }

    /**
     * Gets the value of the pdeServicePackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdeServicePackage() {
        return pdeServicePackage;
    }

    /**
     * Sets the value of the pdeServicePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPdeServicePackage(Boolean value) {
        this.pdeServicePackage = value;
    }

    /**
     * Gets the value of the atomicServicePackage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtomicServicePackage() {
        return atomicServicePackage;
    }

    /**
     * Sets the value of the atomicServicePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtomicServicePackage(Boolean value) {
        this.atomicServicePackage = value;
    }

}
