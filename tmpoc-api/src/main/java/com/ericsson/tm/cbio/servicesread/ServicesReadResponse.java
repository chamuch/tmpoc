
package com.ericsson.tm.cbio.servicesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicesReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicesReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpVscode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="spcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extProductId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extProductIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svMapping" type="{http://ericsson.com/services/ws_CIL_5/servicesread}svMappingResponse" minOccurs="0"/>
 *         &lt;element name="numSv" type="{http://ericsson.com/services/ws_CIL_5/servicesread}numSvResponse" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicesReadResponse", propOrder = {

})
public class ServicesReadResponse {

    protected Long rpcode;
    protected String rpcodePub;
    protected Long rpVscode;
    protected Long spcode;
    protected String spcodePub;
    protected Long extProductId;
    protected String extProductIdPub;
    protected SvMappingResponse svMapping;
    protected NumSvResponse numSv;

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
     * Gets the value of the svMapping property.
     * 
     * @return
     *     possible object is
     *     {@link SvMappingResponse }
     *     
     */
    public SvMappingResponse getSvMapping() {
        return svMapping;
    }

    /**
     * Sets the value of the svMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvMappingResponse }
     *     
     */
    public void setSvMapping(SvMappingResponse value) {
        this.svMapping = value;
    }

    /**
     * Gets the value of the numSv property.
     * 
     * @return
     *     possible object is
     *     {@link NumSvResponse }
     *     
     */
    public NumSvResponse getNumSv() {
        return numSv;
    }

    /**
     * Sets the value of the numSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumSvResponse }
     *     
     */
    public void setNumSv(NumSvResponse value) {
        this.numSv = value;
    }

}
