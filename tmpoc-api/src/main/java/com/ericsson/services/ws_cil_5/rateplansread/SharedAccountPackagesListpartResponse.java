
package com.ericsson.services.ws_cil_5.rateplansread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sharedAccountPackagesListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sharedAccountPackagesListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sharedAccountPackageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sharedAccountPackageIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharedAccountPackageDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sharedAccountPackagesListpartResponse", propOrder = {

})
public class SharedAccountPackagesListpartResponse {

    protected Long sharedAccountPackageId;
    protected String sharedAccountPackageIdPub;
    protected String sharedAccountPackageDes;

    /**
     * Gets the value of the sharedAccountPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedAccountPackageId() {
        return sharedAccountPackageId;
    }

    /**
     * Sets the value of the sharedAccountPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedAccountPackageId(Long value) {
        this.sharedAccountPackageId = value;
    }

    /**
     * Gets the value of the sharedAccountPackageIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedAccountPackageIdPub() {
        return sharedAccountPackageIdPub;
    }

    /**
     * Sets the value of the sharedAccountPackageIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedAccountPackageIdPub(String value) {
        this.sharedAccountPackageIdPub = value;
    }

    /**
     * Gets the value of the sharedAccountPackageDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedAccountPackageDes() {
        return sharedAccountPackageDes;
    }

    /**
     * Sets the value of the sharedAccountPackageDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedAccountPackageDes(String value) {
        this.sharedAccountPackageDes = value;
    }

}
