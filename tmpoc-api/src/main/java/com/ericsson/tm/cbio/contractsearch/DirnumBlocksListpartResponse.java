
package com.ericsson.tm.cbio.contractsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dirnumBlocksListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dirnumBlocksListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="lowerExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upperExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dirnumBlocksListpartResponse", propOrder = {

})
public class DirnumBlocksListpartResponse {

    protected String lowerExt;
    protected String upperExt;

    /**
     * Gets the value of the lowerExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerExt() {
        return lowerExt;
    }

    /**
     * Sets the value of the lowerExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerExt(String value) {
        this.lowerExt = value;
    }

    /**
     * Gets the value of the upperExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperExt() {
        return upperExt;
    }

    /**
     * Sets the value of the upperExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperExt(String value) {
        this.upperExt = value;
    }

}
