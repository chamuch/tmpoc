
package com.ericsson.services.ws_cil_5.servicesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpVscode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sncode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sncodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extProductId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extProductIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extServiceIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputAttributes", propOrder = {

})
public class InputAttributes {

    protected Long rpcode;
    protected String rpcodePub;
    protected Long rpVscode;
    protected Long spcode;
    protected String spcodePub;
    protected Long sncode;
    protected String sncodePub;
    protected Long extProductId;
    protected String extProductIdPub;
    protected Long extServiceId;
    protected String extServiceIdPub;

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
     * Gets the value of the rpVscode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpVscode() {
        return rpVscode;
    }

    /**
     * Sets the value of the rpVscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpVscode(Long value) {
        this.rpVscode = value;
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
     * Gets the value of the extProductId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtProductId() {
        return extProductId;
    }

    /**
     * Sets the value of the extProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtProductId(Long value) {
        this.extProductId = value;
    }

    /**
     * Gets the value of the extProductIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtProductIdPub() {
        return extProductIdPub;
    }

    /**
     * Sets the value of the extProductIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtProductIdPub(String value) {
        this.extProductIdPub = value;
    }

    /**
     * Gets the value of the extServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtServiceId() {
        return extServiceId;
    }

    /**
     * Sets the value of the extServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtServiceId(Long value) {
        this.extServiceId = value;
    }

    /**
     * Gets the value of the extServiceIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtServiceIdPub() {
        return extServiceIdPub;
    }

    /**
     * Sets the value of the extServiceIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtServiceIdPub(String value) {
        this.extServiceIdPub = value;
    }

}
