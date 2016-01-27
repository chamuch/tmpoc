
package com.ericsson.services.ws_cil_5.contractread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relatedContractsListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedContractsListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="coType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedContractsListpartResponse", propOrder = {

})
public class RelatedContractsListpartResponse {

    protected String coType;
    protected Long coId;
    protected String coIdPub;

    /**
     * Gets the value of the coType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoType() {
        return coType;
    }

    /**
     * Sets the value of the coType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoType(String value) {
        this.coType = value;
    }

    /**
     * Gets the value of the coId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoId() {
        return coId;
    }

    /**
     * Sets the value of the coId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoId(Long value) {
        this.coId = value;
    }

    /**
     * Gets the value of the coIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoIdPub() {
        return coIdPub;
    }

    /**
     * Sets the value of the coIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoIdPub(String value) {
        this.coIdPub = value;
    }

}
