
package com.ericsson.services.ws_cil_5.rateplansread;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for numRpListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numRpListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpVscode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpShdes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="avTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rpOcc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rpIsExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preratedTapInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimits" type="{http://ericsson.com/services/ws_CIL_5/rateplansread}creditLimitsResponse" minOccurs="0"/>
 *         &lt;element name="coObligationPeriodYears" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="coObligationPeriodMonths" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="coObligationPeriodWeeks" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="coObligationPeriodDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sharedAccountPackages" type="{http://ericsson.com/services/ws_CIL_5/rateplansread}sharedAccountPackagesResponse" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numRpListpartResponse", propOrder = {

})
public class NumRpListpartResponse {

    protected Long rpcode;
    protected String rpcodePub;
    protected Long rpVscode;
    protected String rpShdes;
    protected String rpDes;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar avFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar avTo;
    protected Boolean rpOcc;
    protected Boolean rpIsExternal;
    protected Boolean preratedTapInd;
    protected String scope;
    protected String paymentMethodInd;
    protected CreditLimitsResponse creditLimits;
    protected BigInteger coObligationPeriodYears;
    protected BigInteger coObligationPeriodMonths;
    protected BigInteger coObligationPeriodWeeks;
    protected BigInteger coObligationPeriodDays;
    protected SharedAccountPackagesResponse sharedAccountPackages;

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
     * Gets the value of the rpShdes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpShdes() {
        return rpShdes;
    }

    /**
     * Sets the value of the rpShdes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpShdes(String value) {
        this.rpShdes = value;
    }

    /**
     * Gets the value of the rpDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpDes() {
        return rpDes;
    }

    /**
     * Sets the value of the rpDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpDes(String value) {
        this.rpDes = value;
    }

    /**
     * Gets the value of the avFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvFrom() {
        return avFrom;
    }

    /**
     * Sets the value of the avFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvFrom(XMLGregorianCalendar value) {
        this.avFrom = value;
    }

    /**
     * Gets the value of the avTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvTo() {
        return avTo;
    }

    /**
     * Sets the value of the avTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvTo(XMLGregorianCalendar value) {
        this.avTo = value;
    }

    /**
     * Gets the value of the rpOcc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRpOcc() {
        return rpOcc;
    }

    /**
     * Sets the value of the rpOcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRpOcc(Boolean value) {
        this.rpOcc = value;
    }

    /**
     * Gets the value of the rpIsExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRpIsExternal() {
        return rpIsExternal;
    }

    /**
     * Sets the value of the rpIsExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRpIsExternal(Boolean value) {
        this.rpIsExternal = value;
    }

    /**
     * Gets the value of the preratedTapInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreratedTapInd() {
        return preratedTapInd;
    }

    /**
     * Sets the value of the preratedTapInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreratedTapInd(Boolean value) {
        this.preratedTapInd = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the paymentMethodInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodInd() {
        return paymentMethodInd;
    }

    /**
     * Sets the value of the paymentMethodInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodInd(String value) {
        this.paymentMethodInd = value;
    }

    /**
     * Gets the value of the creditLimits property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLimitsResponse }
     *     
     */
    public CreditLimitsResponse getCreditLimits() {
        return creditLimits;
    }

    /**
     * Sets the value of the creditLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLimitsResponse }
     *     
     */
    public void setCreditLimits(CreditLimitsResponse value) {
        this.creditLimits = value;
    }

    /**
     * Gets the value of the coObligationPeriodYears property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoObligationPeriodYears() {
        return coObligationPeriodYears;
    }

    /**
     * Sets the value of the coObligationPeriodYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoObligationPeriodYears(BigInteger value) {
        this.coObligationPeriodYears = value;
    }

    /**
     * Gets the value of the coObligationPeriodMonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoObligationPeriodMonths() {
        return coObligationPeriodMonths;
    }

    /**
     * Sets the value of the coObligationPeriodMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoObligationPeriodMonths(BigInteger value) {
        this.coObligationPeriodMonths = value;
    }

    /**
     * Gets the value of the coObligationPeriodWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoObligationPeriodWeeks() {
        return coObligationPeriodWeeks;
    }

    /**
     * Sets the value of the coObligationPeriodWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoObligationPeriodWeeks(BigInteger value) {
        this.coObligationPeriodWeeks = value;
    }

    /**
     * Gets the value of the coObligationPeriodDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoObligationPeriodDays() {
        return coObligationPeriodDays;
    }

    /**
     * Sets the value of the coObligationPeriodDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoObligationPeriodDays(BigInteger value) {
        this.coObligationPeriodDays = value;
    }

    /**
     * Gets the value of the sharedAccountPackages property.
     * 
     * @return
     *     possible object is
     *     {@link SharedAccountPackagesResponse }
     *     
     */
    public SharedAccountPackagesResponse getSharedAccountPackages() {
        return sharedAccountPackages;
    }

    /**
     * Sets the value of the sharedAccountPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedAccountPackagesResponse }
     *     
     */
    public void setSharedAccountPackages(SharedAccountPackagesResponse value) {
        this.sharedAccountPackages = value;
    }

}
