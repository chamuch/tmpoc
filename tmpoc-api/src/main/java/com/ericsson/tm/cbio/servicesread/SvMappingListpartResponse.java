
package com.ericsson.tm.cbio.servicesread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for svMappingListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="svMappingListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="extServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extServiceIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intSv" type="{http://ericsson.com/services/ws_CIL_5/servicesread}intSvResponse" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "svMappingListpartResponse", propOrder = {

})
public class SvMappingListpartResponse {

    protected Long extServiceId;
    protected String extServiceIdPub;
    protected IntSvResponse intSv;

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

    /**
     * Gets the value of the intSv property.
     * 
     * @return
     *     possible object is
     *     {@link IntSvResponse }
     *     
     */
    public IntSvResponse getIntSv() {
        return intSv;
    }

    /**
     * Sets the value of the intSv property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntSvResponse }
     *     
     */
    public void setIntSv(IntSvResponse value) {
        this.intSv = value;
    }

}
