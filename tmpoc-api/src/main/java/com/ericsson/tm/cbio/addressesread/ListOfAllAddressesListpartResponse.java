
package com.ericsson.tm.cbio.addressesread;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for listOfAllAddressesListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfAllAddressesListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="adrSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adrRoles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrJurTaxOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adrTempbillOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adrDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ttlId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ttlIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrLname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrStreetno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="countryIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lngCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lngCodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrNote1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrNote2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrNote3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrJbdes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPhn1Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPhn1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPhn2Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPhn2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrFaxArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrMname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrSmsno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrYears" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="adrState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrValiddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="adrInccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrUrgent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adrForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adrLocation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrLocation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrTaxno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCompno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idtypeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adrIdno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrBirthdt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="adrSocialseno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrDrivelicence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrEmployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCusttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="masCodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrNationality" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adrNationalityPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrEmployee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfAllAddressesListpartResponse", propOrder = {

})
public class ListOfAllAddressesListpartResponse {

    protected Long adrSeq;
    protected String adrRoles;
    protected Boolean adrJurTaxOverridden;
    protected Boolean adrTempbillOverridden;
    protected Boolean adrDeleted;
    protected Long ttlId;
    protected String ttlIdPub;
    protected String adrLname;
    protected String adrName;
    protected String adrFname;
    protected String adrStreet;
    protected String adrStreetno;
    protected String adrZip;
    protected String adrCity;
    protected Long countryId;
    protected String countryIdPub;
    protected Long lngCode;
    protected String lngCodePub;
    protected String adrNote1;
    protected String adrNote2;
    protected String adrNote3;
    protected String adrJbdes;
    protected String adrPhn1Area;
    protected String adrPhn1;
    protected String adrPhn2Area;
    protected String adrPhn2;
    protected String adrFaxArea;
    protected String adrFax;
    protected String adrMname;
    protected String adrEmail;
    protected String adrSmsno;
    protected BigInteger adrYears;
    protected String adrState;
    protected String adrCounty;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adrValiddate;
    protected String adrInccode;
    protected Boolean adrUrgent;
    protected Boolean adrForward;
    protected String adrLocation1;
    protected String adrLocation2;
    protected String adrRemark;
    protected String adrTaxno;
    protected String adrCompno;
    protected Long idtypeCode;
    protected String adrIdno;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adrBirthdt;
    protected String adrSocialseno;
    protected String adrDrivelicence;
    protected String adrSex;
    protected String adrEmployer;
    protected String adrCusttype;
    protected Long masCode;
    protected String masCodePub;
    protected Long adrNationality;
    protected String adrNationalityPub;
    protected Boolean adrEmployee;

    /**
     * Gets the value of the adrSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdrSeq() {
        return adrSeq;
    }

    /**
     * Sets the value of the adrSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdrSeq(Long value) {
        this.adrSeq = value;
    }

    /**
     * Gets the value of the adrRoles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrRoles() {
        return adrRoles;
    }

    /**
     * Sets the value of the adrRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrRoles(String value) {
        this.adrRoles = value;
    }

    /**
     * Gets the value of the adrJurTaxOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdrJurTaxOverridden() {
        return adrJurTaxOverridden;
    }

    /**
     * Sets the value of the adrJurTaxOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdrJurTaxOverridden(Boolean value) {
        this.adrJurTaxOverridden = value;
    }

    /**
     * Gets the value of the adrTempbillOverridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdrTempbillOverridden() {
        return adrTempbillOverridden;
    }

    /**
     * Sets the value of the adrTempbillOverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdrTempbillOverridden(Boolean value) {
        this.adrTempbillOverridden = value;
    }

    /**
     * Gets the value of the adrDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdrDeleted() {
        return adrDeleted;
    }

    /**
     * Sets the value of the adrDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdrDeleted(Boolean value) {
        this.adrDeleted = value;
    }

    /**
     * Gets the value of the ttlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTtlId() {
        return ttlId;
    }

    /**
     * Sets the value of the ttlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTtlId(Long value) {
        this.ttlId = value;
    }

    /**
     * Gets the value of the ttlIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlIdPub() {
        return ttlIdPub;
    }

    /**
     * Sets the value of the ttlIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlIdPub(String value) {
        this.ttlIdPub = value;
    }

    /**
     * Gets the value of the adrLname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLname() {
        return adrLname;
    }

    /**
     * Sets the value of the adrLname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLname(String value) {
        this.adrLname = value;
    }

    /**
     * Gets the value of the adrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrName() {
        return adrName;
    }

    /**
     * Sets the value of the adrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrName(String value) {
        this.adrName = value;
    }

    /**
     * Gets the value of the adrFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrFname() {
        return adrFname;
    }

    /**
     * Sets the value of the adrFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrFname(String value) {
        this.adrFname = value;
    }

    /**
     * Gets the value of the adrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrStreet() {
        return adrStreet;
    }

    /**
     * Sets the value of the adrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrStreet(String value) {
        this.adrStreet = value;
    }

    /**
     * Gets the value of the adrStreetno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrStreetno() {
        return adrStreetno;
    }

    /**
     * Sets the value of the adrStreetno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrStreetno(String value) {
        this.adrStreetno = value;
    }

    /**
     * Gets the value of the adrZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrZip() {
        return adrZip;
    }

    /**
     * Sets the value of the adrZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrZip(String value) {
        this.adrZip = value;
    }

    /**
     * Gets the value of the adrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCity() {
        return adrCity;
    }

    /**
     * Sets the value of the adrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCity(String value) {
        this.adrCity = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountryId(Long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the countryIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIdPub() {
        return countryIdPub;
    }

    /**
     * Sets the value of the countryIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIdPub(String value) {
        this.countryIdPub = value;
    }

    /**
     * Gets the value of the lngCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLngCode() {
        return lngCode;
    }

    /**
     * Sets the value of the lngCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLngCode(Long value) {
        this.lngCode = value;
    }

    /**
     * Gets the value of the lngCodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngCodePub() {
        return lngCodePub;
    }

    /**
     * Sets the value of the lngCodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngCodePub(String value) {
        this.lngCodePub = value;
    }

    /**
     * Gets the value of the adrNote1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrNote1() {
        return adrNote1;
    }

    /**
     * Sets the value of the adrNote1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrNote1(String value) {
        this.adrNote1 = value;
    }

    /**
     * Gets the value of the adrNote2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrNote2() {
        return adrNote2;
    }

    /**
     * Sets the value of the adrNote2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrNote2(String value) {
        this.adrNote2 = value;
    }

    /**
     * Gets the value of the adrNote3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrNote3() {
        return adrNote3;
    }

    /**
     * Sets the value of the adrNote3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrNote3(String value) {
        this.adrNote3 = value;
    }

    /**
     * Gets the value of the adrJbdes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrJbdes() {
        return adrJbdes;
    }

    /**
     * Sets the value of the adrJbdes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrJbdes(String value) {
        this.adrJbdes = value;
    }

    /**
     * Gets the value of the adrPhn1Area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPhn1Area() {
        return adrPhn1Area;
    }

    /**
     * Sets the value of the adrPhn1Area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPhn1Area(String value) {
        this.adrPhn1Area = value;
    }

    /**
     * Gets the value of the adrPhn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPhn1() {
        return adrPhn1;
    }

    /**
     * Sets the value of the adrPhn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPhn1(String value) {
        this.adrPhn1 = value;
    }

    /**
     * Gets the value of the adrPhn2Area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPhn2Area() {
        return adrPhn2Area;
    }

    /**
     * Sets the value of the adrPhn2Area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPhn2Area(String value) {
        this.adrPhn2Area = value;
    }

    /**
     * Gets the value of the adrPhn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPhn2() {
        return adrPhn2;
    }

    /**
     * Sets the value of the adrPhn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPhn2(String value) {
        this.adrPhn2 = value;
    }

    /**
     * Gets the value of the adrFaxArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrFaxArea() {
        return adrFaxArea;
    }

    /**
     * Sets the value of the adrFaxArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrFaxArea(String value) {
        this.adrFaxArea = value;
    }

    /**
     * Gets the value of the adrFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrFax() {
        return adrFax;
    }

    /**
     * Sets the value of the adrFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrFax(String value) {
        this.adrFax = value;
    }

    /**
     * Gets the value of the adrMname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrMname() {
        return adrMname;
    }

    /**
     * Sets the value of the adrMname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrMname(String value) {
        this.adrMname = value;
    }

    /**
     * Gets the value of the adrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrEmail() {
        return adrEmail;
    }

    /**
     * Sets the value of the adrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrEmail(String value) {
        this.adrEmail = value;
    }

    /**
     * Gets the value of the adrSmsno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrSmsno() {
        return adrSmsno;
    }

    /**
     * Sets the value of the adrSmsno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrSmsno(String value) {
        this.adrSmsno = value;
    }

    /**
     * Gets the value of the adrYears property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdrYears() {
        return adrYears;
    }

    /**
     * Sets the value of the adrYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdrYears(BigInteger value) {
        this.adrYears = value;
    }

    /**
     * Gets the value of the adrState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrState() {
        return adrState;
    }

    /**
     * Sets the value of the adrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrState(String value) {
        this.adrState = value;
    }

    /**
     * Gets the value of the adrCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCounty() {
        return adrCounty;
    }

    /**
     * Sets the value of the adrCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCounty(String value) {
        this.adrCounty = value;
    }

    /**
     * Gets the value of the adrValiddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdrValiddate() {
        return adrValiddate;
    }

    /**
     * Sets the value of the adrValiddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdrValiddate(XMLGregorianCalendar value) {
        this.adrValiddate = value;
    }

    /**
     * Gets the value of the adrInccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrInccode() {
        return adrInccode;
    }

    /**
     * Sets the value of the adrInccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrInccode(String value) {
        this.adrInccode = value;
    }

    /**
     * Gets the value of the adrUrgent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdrUrgent() {
        return adrUrgent;
    }

    /**
     * Sets the value of the adrUrgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdrUrgent(Boolean value) {
        this.adrUrgent = value;
    }

    /**
     * Gets the value of the adrForward property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdrForward() {
        return adrForward;
    }

    /**
     * Sets the value of the adrForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdrForward(Boolean value) {
        this.adrForward = value;
    }

    /**
     * Gets the value of the adrLocation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLocation1() {
        return adrLocation1;
    }

    /**
     * Sets the value of the adrLocation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLocation1(String value) {
        this.adrLocation1 = value;
    }

    /**
     * Gets the value of the adrLocation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLocation2() {
        return adrLocation2;
    }

    /**
     * Sets the value of the adrLocation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLocation2(String value) {
        this.adrLocation2 = value;
    }

    /**
     * Gets the value of the adrRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrRemark() {
        return adrRemark;
    }

    /**
     * Sets the value of the adrRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrRemark(String value) {
        this.adrRemark = value;
    }

    /**
     * Gets the value of the adrTaxno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrTaxno() {
        return adrTaxno;
    }

    /**
     * Sets the value of the adrTaxno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrTaxno(String value) {
        this.adrTaxno = value;
    }

    /**
     * Gets the value of the adrCompno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCompno() {
        return adrCompno;
    }

    /**
     * Sets the value of the adrCompno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCompno(String value) {
        this.adrCompno = value;
    }

    /**
     * Gets the value of the idtypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdtypeCode() {
        return idtypeCode;
    }

    /**
     * Sets the value of the idtypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdtypeCode(Long value) {
        this.idtypeCode = value;
    }

    /**
     * Gets the value of the adrIdno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrIdno() {
        return adrIdno;
    }

    /**
     * Sets the value of the adrIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrIdno(String value) {
        this.adrIdno = value;
    }

    /**
     * Gets the value of the adrBirthdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdrBirthdt() {
        return adrBirthdt;
    }

    /**
     * Sets the value of the adrBirthdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdrBirthdt(XMLGregorianCalendar value) {
        this.adrBirthdt = value;
    }

    /**
     * Gets the value of the adrSocialseno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrSocialseno() {
        return adrSocialseno;
    }

    /**
     * Sets the value of the adrSocialseno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrSocialseno(String value) {
        this.adrSocialseno = value;
    }

    /**
     * Gets the value of the adrDrivelicence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrDrivelicence() {
        return adrDrivelicence;
    }

    /**
     * Sets the value of the adrDrivelicence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrDrivelicence(String value) {
        this.adrDrivelicence = value;
    }

    /**
     * Gets the value of the adrSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrSex() {
        return adrSex;
    }

    /**
     * Sets the value of the adrSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrSex(String value) {
        this.adrSex = value;
    }

    /**
     * Gets the value of the adrEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrEmployer() {
        return adrEmployer;
    }

    /**
     * Sets the value of the adrEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrEmployer(String value) {
        this.adrEmployer = value;
    }

    /**
     * Gets the value of the adrCusttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCusttype() {
        return adrCusttype;
    }

    /**
     * Sets the value of the adrCusttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCusttype(String value) {
        this.adrCusttype = value;
    }

    /**
     * Gets the value of the masCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMasCode() {
        return masCode;
    }

    /**
     * Sets the value of the masCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMasCode(Long value) {
        this.masCode = value;
    }

    /**
     * Gets the value of the masCodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasCodePub() {
        return masCodePub;
    }

    /**
     * Sets the value of the masCodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasCodePub(String value) {
        this.masCodePub = value;
    }

    /**
     * Gets the value of the adrNationality property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdrNationality() {
        return adrNationality;
    }

    /**
     * Sets the value of the adrNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdrNationality(Long value) {
        this.adrNationality = value;
    }

    /**
     * Gets the value of the adrNationalityPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrNationalityPub() {
        return adrNationalityPub;
    }

    /**
     * Sets the value of the adrNationalityPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrNationalityPub(String value) {
        this.adrNationalityPub = value;
    }

    /**
     * Gets the value of the adrEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdrEmployee() {
        return adrEmployee;
    }

    /**
     * Sets the value of the adrEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdrEmployee(Boolean value) {
        this.adrEmployee = value;
    }

}
