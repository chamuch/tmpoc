
package com.ericsson.tm.cbio.rateplansread;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for creditLimitsListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditLimitsListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="crlStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="crlEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="crlPrdicAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="crlDailyAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="crlDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="crlChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditLimitsListpartResponse", propOrder = {

})
public class CreditLimitsListpartResponse {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crlStart;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crlEnd;
    protected Double crlPrdicAmount;
    protected Double crlDailyAmount;
    protected BigInteger crlDays;
    protected Boolean crlChangeable;

    /**
     * Gets the value of the crlStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrlStart() {
        return crlStart;
    }

    /**
     * Sets the value of the crlStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrlStart(XMLGregorianCalendar value) {
        this.crlStart = value;
    }

    /**
     * Gets the value of the crlEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrlEnd() {
        return crlEnd;
    }

    /**
     * Sets the value of the crlEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrlEnd(XMLGregorianCalendar value) {
        this.crlEnd = value;
    }

    /**
     * Gets the value of the crlPrdicAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrlPrdicAmount() {
        return crlPrdicAmount;
    }

    /**
     * Sets the value of the crlPrdicAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrlPrdicAmount(Double value) {
        this.crlPrdicAmount = value;
    }

    /**
     * Gets the value of the crlDailyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrlDailyAmount() {
        return crlDailyAmount;
    }

    /**
     * Sets the value of the crlDailyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrlDailyAmount(Double value) {
        this.crlDailyAmount = value;
    }

    /**
     * Gets the value of the crlDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCrlDays() {
        return crlDays;
    }

    /**
     * Sets the value of the crlDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCrlDays(BigInteger value) {
        this.crlDays = value;
    }

    /**
     * Gets the value of the crlChangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrlChangeable() {
        return crlChangeable;
    }

    /**
     * Sets the value of the crlChangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrlChangeable(Boolean value) {
        this.crlChangeable = value;
    }

}
