
package com.ericsson.tm.cbio.paymentarrangementsread;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for listOfPaymentArrangementsListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfPaymentArrangementsListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="cspId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cspSeqno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cspPmntId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cspPmntIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspAccno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspAccowner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankzip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankstreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspCcagCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cspCcagCodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspCcvaliddt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspCeiling" type="{http://lhsgroup.com/lhsws/money}money" minOccurs="0"/>
 *         &lt;element name="cspBankstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankcounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspOrdernumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankstreetno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspBankcountry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cspBankcountryPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspSwiftcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cspActUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cspValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="authOk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="authDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authCredit" type="{http://lhsgroup.com/lhsws/money}money" minOccurs="0"/>
 *         &lt;element name="authTn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="csIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfPaymentArrangementsListpartResponse", propOrder = {

})
public class ListOfPaymentArrangementsListpartResponse {

    protected Long cspId;
    protected Long cspSeqno;
    protected Long cspPmntId;
    protected String cspPmntIdPub;
    protected String cspAccno;
    protected String cspAccowner;
    protected String cspBankcode;
    protected String cspBankname;
    protected String cspBankzip;
    protected String cspBankcity;
    protected String cspBankstreet;
    protected Long cspCcagCode;
    protected String cspCcagCodePub;
    protected String cspCcvaliddt;
    protected Money cspCeiling;
    protected String cspBankstate;
    protected String cspBankcounty;
    protected String cspOrdernumber;
    protected String cspBankstreetno;
    protected Long cspBankcountry;
    protected String cspBankcountryPub;
    protected String cspSwiftcode;
    protected Boolean cspActUsed;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cspValidFrom;
    protected Boolean authOk;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authDate;
    protected String authNo;
    protected Money authCredit;
    protected String authTn;
    protected String authRemark;
    protected Long csId;
    protected String csIdPub;

    /**
     * Gets the value of the cspId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCspId() {
        return cspId;
    }

    /**
     * Sets the value of the cspId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCspId(Long value) {
        this.cspId = value;
    }

    /**
     * Gets the value of the cspSeqno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCspSeqno() {
        return cspSeqno;
    }

    /**
     * Sets the value of the cspSeqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCspSeqno(Long value) {
        this.cspSeqno = value;
    }

    /**
     * Gets the value of the cspPmntId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCspPmntId() {
        return cspPmntId;
    }

    /**
     * Sets the value of the cspPmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCspPmntId(Long value) {
        this.cspPmntId = value;
    }

    /**
     * Gets the value of the cspPmntIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspPmntIdPub() {
        return cspPmntIdPub;
    }

    /**
     * Sets the value of the cspPmntIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspPmntIdPub(String value) {
        this.cspPmntIdPub = value;
    }

    /**
     * Gets the value of the cspAccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspAccno() {
        return cspAccno;
    }

    /**
     * Sets the value of the cspAccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspAccno(String value) {
        this.cspAccno = value;
    }

    /**
     * Gets the value of the cspAccowner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspAccowner() {
        return cspAccowner;
    }

    /**
     * Sets the value of the cspAccowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspAccowner(String value) {
        this.cspAccowner = value;
    }

    /**
     * Gets the value of the cspBankcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankcode() {
        return cspBankcode;
    }

    /**
     * Sets the value of the cspBankcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankcode(String value) {
        this.cspBankcode = value;
    }

    /**
     * Gets the value of the cspBankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankname() {
        return cspBankname;
    }

    /**
     * Sets the value of the cspBankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankname(String value) {
        this.cspBankname = value;
    }

    /**
     * Gets the value of the cspBankzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankzip() {
        return cspBankzip;
    }

    /**
     * Sets the value of the cspBankzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankzip(String value) {
        this.cspBankzip = value;
    }

    /**
     * Gets the value of the cspBankcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankcity() {
        return cspBankcity;
    }

    /**
     * Sets the value of the cspBankcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankcity(String value) {
        this.cspBankcity = value;
    }

    /**
     * Gets the value of the cspBankstreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankstreet() {
        return cspBankstreet;
    }

    /**
     * Sets the value of the cspBankstreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankstreet(String value) {
        this.cspBankstreet = value;
    }

    /**
     * Gets the value of the cspCcagCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCspCcagCode() {
        return cspCcagCode;
    }

    /**
     * Sets the value of the cspCcagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCspCcagCode(Long value) {
        this.cspCcagCode = value;
    }

    /**
     * Gets the value of the cspCcagCodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspCcagCodePub() {
        return cspCcagCodePub;
    }

    /**
     * Sets the value of the cspCcagCodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspCcagCodePub(String value) {
        this.cspCcagCodePub = value;
    }

    /**
     * Gets the value of the cspCcvaliddt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspCcvaliddt() {
        return cspCcvaliddt;
    }

    /**
     * Sets the value of the cspCcvaliddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspCcvaliddt(String value) {
        this.cspCcvaliddt = value;
    }

    /**
     * Gets the value of the cspCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCspCeiling() {
        return cspCeiling;
    }

    /**
     * Sets the value of the cspCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCspCeiling(Money value) {
        this.cspCeiling = value;
    }

    /**
     * Gets the value of the cspBankstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankstate() {
        return cspBankstate;
    }

    /**
     * Sets the value of the cspBankstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankstate(String value) {
        this.cspBankstate = value;
    }

    /**
     * Gets the value of the cspBankcounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankcounty() {
        return cspBankcounty;
    }

    /**
     * Sets the value of the cspBankcounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankcounty(String value) {
        this.cspBankcounty = value;
    }

    /**
     * Gets the value of the cspOrdernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspOrdernumber() {
        return cspOrdernumber;
    }

    /**
     * Sets the value of the cspOrdernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspOrdernumber(String value) {
        this.cspOrdernumber = value;
    }

    /**
     * Gets the value of the cspBankstreetno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankstreetno() {
        return cspBankstreetno;
    }

    /**
     * Sets the value of the cspBankstreetno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankstreetno(String value) {
        this.cspBankstreetno = value;
    }

    /**
     * Gets the value of the cspBankcountry property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCspBankcountry() {
        return cspBankcountry;
    }

    /**
     * Sets the value of the cspBankcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCspBankcountry(Long value) {
        this.cspBankcountry = value;
    }

    /**
     * Gets the value of the cspBankcountryPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspBankcountryPub() {
        return cspBankcountryPub;
    }

    /**
     * Sets the value of the cspBankcountryPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspBankcountryPub(String value) {
        this.cspBankcountryPub = value;
    }

    /**
     * Gets the value of the cspSwiftcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCspSwiftcode() {
        return cspSwiftcode;
    }

    /**
     * Sets the value of the cspSwiftcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCspSwiftcode(String value) {
        this.cspSwiftcode = value;
    }

    /**
     * Gets the value of the cspActUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCspActUsed() {
        return cspActUsed;
    }

    /**
     * Sets the value of the cspActUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCspActUsed(Boolean value) {
        this.cspActUsed = value;
    }

    /**
     * Gets the value of the cspValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCspValidFrom() {
        return cspValidFrom;
    }

    /**
     * Sets the value of the cspValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCspValidFrom(XMLGregorianCalendar value) {
        this.cspValidFrom = value;
    }

    /**
     * Gets the value of the authOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthOk() {
        return authOk;
    }

    /**
     * Sets the value of the authOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthOk(Boolean value) {
        this.authOk = value;
    }

    /**
     * Gets the value of the authDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthDate() {
        return authDate;
    }

    /**
     * Sets the value of the authDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthDate(XMLGregorianCalendar value) {
        this.authDate = value;
    }

    /**
     * Gets the value of the authNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthNo() {
        return authNo;
    }

    /**
     * Sets the value of the authNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthNo(String value) {
        this.authNo = value;
    }

    /**
     * Gets the value of the authCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAuthCredit() {
        return authCredit;
    }

    /**
     * Sets the value of the authCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAuthCredit(Money value) {
        this.authCredit = value;
    }

    /**
     * Gets the value of the authTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthTn() {
        return authTn;
    }

    /**
     * Sets the value of the authTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthTn(String value) {
        this.authTn = value;
    }

    /**
     * Gets the value of the authRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRemark() {
        return authRemark;
    }

    /**
     * Sets the value of the authRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRemark(String value) {
        this.authRemark = value;
    }

    /**
     * Gets the value of the csId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCsId() {
        return csId;
    }

    /**
     * Sets the value of the csId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCsId(Long value) {
        this.csId = value;
    }

    /**
     * Gets the value of the csIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsIdPub() {
        return csIdPub;
    }

    /**
     * Sets the value of the csIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsIdPub(String value) {
        this.csIdPub = value;
    }

}
