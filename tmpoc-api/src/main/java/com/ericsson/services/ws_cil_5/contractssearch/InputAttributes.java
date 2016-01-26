
package com.ericsson.services.ws_cil_5.contractssearch;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="partyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="types" type="{http://ericsson.com/services/ws_CIL_5/contractssearch}typesRequest" minOccurs="0"/>
 *         &lt;element name="excludeSubscriberContracts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="foreignPlcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="foreignPlcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lecCoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lecCoIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ignoreBuInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searcher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="csCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csDealerid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="csDealeridPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="related" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devPortNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sncode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sncodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coPofu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sccode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sccodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainDirnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useInstallationAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrLname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrStreetno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrBirthdt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="adrSocialseno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrDrivelicence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPassportno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCompno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrTaxno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="countryIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="submIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowerExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upperExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srchCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkedPublicDirnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vpnIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpnSubscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="laMemberContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flagCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flagMatchcode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="csIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nonPendingOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markedForRerating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bscsContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="familyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="csLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentResp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="csContrResp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rootCsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rootCsIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuPackId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fuPackIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuCoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fuCoIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuSncode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fuSncodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notInServiceCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prmId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parameterValues" type="{http://ericsson.com/services/ws_CIL_5/contractssearch}parameterValuesRequest" minOccurs="0"/>
 *         &lt;element name="salesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerCoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ownerCoIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharedAccountPackageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sharedAccountPackageIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

    protected String partyType;
    protected Long contractTypeId;
    protected TypesRequest types;
    protected Boolean excludeSubscriberContracts;
    protected Long foreignPlcode;
    protected String foreignPlcodePub;
    protected Long lecCoId;
    protected String lecCoIdPub;
    protected Boolean ignoreBuInd;
    protected String searcher;
    protected String coUser;
    protected BigInteger coStatus;
    protected String csCode;
    protected String csStatus;
    protected Long csDealerid;
    protected String csDealeridPub;
    protected String smNum;
    protected String related;
    protected String portNum;
    protected String devPortNum;
    protected Long sncode;
    protected String sncodePub;
    protected Boolean coPofu;
    protected Long rpcode;
    protected String rpcodePub;
    protected String paymentMethodInd;
    protected Long sccode;
    protected String sccodePub;
    protected String dirnum;
    protected String mainDirnum;
    protected String billNo;
    protected Boolean useInstallationAddress;
    protected String adrName;
    protected String adrFname;
    protected String adrLname;
    protected String adrStreet;
    protected String adrStreetno;
    protected String adrZip;
    protected String adrCity;
    protected String adrEmail;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adrBirthdt;
    protected String adrSocialseno;
    protected String adrDrivelicence;
    protected String adrPassportno;
    protected String adrCompno;
    protected String adrTaxno;
    protected String adrState;
    protected Long countryId;
    protected String countryIdPub;
    protected Long submId;
    protected String submIdPub;
    protected Long plcode;
    protected String plcodePub;
    protected String lowerExt;
    protected String upperExt;
    protected Long srchCount;
    protected String linkedPublicDirnum;
    protected Long vpnId;
    protected String vpnIdPub;
    protected Boolean vpnSubscriber;
    protected Boolean externalind;
    protected Boolean laMemberContract;
    protected Boolean flagCase;
    protected Boolean flagMatchcode;
    protected String description;
    protected Long coId;
    protected String coIdPub;
    protected Long csId;
    protected String csIdPub;
    protected Long startIndex;
    protected Boolean nonPendingOnly;
    protected String callDetail;
    protected Boolean markedForRerating;
    protected Boolean bscsContract;
    protected Long familyId;
    protected String csLevelCode;
    protected Boolean paymentResp;
    protected Boolean csContrResp;
    protected Long rootCsId;
    protected String rootCsIdPub;
    protected Long fuPackId;
    protected String fuPackIdPub;
    protected Long fuCoId;
    protected String fuCoIdPub;
    protected Long fuSncode;
    protected String fuSncodePub;
    protected String snStatus;
    protected Boolean notInServiceCriteria;
    protected Long prmId;
    protected ParameterValuesRequest parameterValues;
    protected String salesChannel;
    protected Long ownerCoId;
    protected String ownerCoIdPub;
    protected Long sharedAccountPackageId;
    protected String sharedAccountPackageIdPub;

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the contractTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractTypeId() {
        return contractTypeId;
    }

    /**
     * Sets the value of the contractTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractTypeId(Long value) {
        this.contractTypeId = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link TypesRequest }
     *     
     */
    public TypesRequest getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesRequest }
     *     
     */
    public void setTypes(TypesRequest value) {
        this.types = value;
    }

    /**
     * Gets the value of the excludeSubscriberContracts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeSubscriberContracts() {
        return excludeSubscriberContracts;
    }

    /**
     * Sets the value of the excludeSubscriberContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeSubscriberContracts(Boolean value) {
        this.excludeSubscriberContracts = value;
    }

    /**
     * Gets the value of the foreignPlcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForeignPlcode() {
        return foreignPlcode;
    }

    /**
     * Sets the value of the foreignPlcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForeignPlcode(Long value) {
        this.foreignPlcode = value;
    }

    /**
     * Gets the value of the foreignPlcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPlcodePub() {
        return foreignPlcodePub;
    }

    /**
     * Sets the value of the foreignPlcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPlcodePub(String value) {
        this.foreignPlcodePub = value;
    }

    /**
     * Gets the value of the lecCoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLecCoId() {
        return lecCoId;
    }

    /**
     * Sets the value of the lecCoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLecCoId(Long value) {
        this.lecCoId = value;
    }

    /**
     * Gets the value of the lecCoIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLecCoIdPub() {
        return lecCoIdPub;
    }

    /**
     * Sets the value of the lecCoIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLecCoIdPub(String value) {
        this.lecCoIdPub = value;
    }

    /**
     * Gets the value of the ignoreBuInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreBuInd() {
        return ignoreBuInd;
    }

    /**
     * Sets the value of the ignoreBuInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreBuInd(Boolean value) {
        this.ignoreBuInd = value;
    }

    /**
     * Gets the value of the searcher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearcher() {
        return searcher;
    }

    /**
     * Sets the value of the searcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearcher(String value) {
        this.searcher = value;
    }

    /**
     * Gets the value of the coUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoUser() {
        return coUser;
    }

    /**
     * Sets the value of the coUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoUser(String value) {
        this.coUser = value;
    }

    /**
     * Gets the value of the coStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoStatus() {
        return coStatus;
    }

    /**
     * Sets the value of the coStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoStatus(BigInteger value) {
        this.coStatus = value;
    }

    /**
     * Gets the value of the csCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsCode() {
        return csCode;
    }

    /**
     * Sets the value of the csCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsCode(String value) {
        this.csCode = value;
    }

    /**
     * Gets the value of the csStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsStatus() {
        return csStatus;
    }

    /**
     * Sets the value of the csStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsStatus(String value) {
        this.csStatus = value;
    }

    /**
     * Gets the value of the csDealerid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCsDealerid() {
        return csDealerid;
    }

    /**
     * Sets the value of the csDealerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCsDealerid(Long value) {
        this.csDealerid = value;
    }

    /**
     * Gets the value of the csDealeridPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsDealeridPub() {
        return csDealeridPub;
    }

    /**
     * Sets the value of the csDealeridPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsDealeridPub(String value) {
        this.csDealeridPub = value;
    }

    /**
     * Gets the value of the smNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmNum() {
        return smNum;
    }

    /**
     * Sets the value of the smNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmNum(String value) {
        this.smNum = value;
    }

    /**
     * Gets the value of the related property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated() {
        return related;
    }

    /**
     * Sets the value of the related property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated(String value) {
        this.related = value;
    }

    /**
     * Gets the value of the portNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNum() {
        return portNum;
    }

    /**
     * Sets the value of the portNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNum(String value) {
        this.portNum = value;
    }

    /**
     * Gets the value of the devPortNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevPortNum() {
        return devPortNum;
    }

    /**
     * Sets the value of the devPortNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevPortNum(String value) {
        this.devPortNum = value;
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
     * Gets the value of the coPofu property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoPofu() {
        return coPofu;
    }

    /**
     * Sets the value of the coPofu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoPofu(Boolean value) {
        this.coPofu = value;
    }

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
     * Gets the value of the sccode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSccode() {
        return sccode;
    }

    /**
     * Sets the value of the sccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSccode(Long value) {
        this.sccode = value;
    }

    /**
     * Gets the value of the sccodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSccodePub() {
        return sccodePub;
    }

    /**
     * Sets the value of the sccodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSccodePub(String value) {
        this.sccodePub = value;
    }

    /**
     * Gets the value of the dirnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirnum() {
        return dirnum;
    }

    /**
     * Sets the value of the dirnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirnum(String value) {
        this.dirnum = value;
    }

    /**
     * Gets the value of the mainDirnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainDirnum() {
        return mainDirnum;
    }

    /**
     * Sets the value of the mainDirnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainDirnum(String value) {
        this.mainDirnum = value;
    }

    /**
     * Gets the value of the billNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * Sets the value of the billNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * Gets the value of the useInstallationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInstallationAddress() {
        return useInstallationAddress;
    }

    /**
     * Sets the value of the useInstallationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInstallationAddress(Boolean value) {
        this.useInstallationAddress = value;
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
     * Gets the value of the adrPassportno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPassportno() {
        return adrPassportno;
    }

    /**
     * Sets the value of the adrPassportno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPassportno(String value) {
        this.adrPassportno = value;
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
     * Gets the value of the submId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubmId() {
        return submId;
    }

    /**
     * Sets the value of the submId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubmId(Long value) {
        this.submId = value;
    }

    /**
     * Gets the value of the submIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmIdPub() {
        return submIdPub;
    }

    /**
     * Sets the value of the submIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmIdPub(String value) {
        this.submIdPub = value;
    }

    /**
     * Gets the value of the plcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlcode() {
        return plcode;
    }

    /**
     * Sets the value of the plcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlcode(Long value) {
        this.plcode = value;
    }

    /**
     * Gets the value of the plcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcodePub() {
        return plcodePub;
    }

    /**
     * Sets the value of the plcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcodePub(String value) {
        this.plcodePub = value;
    }

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

    /**
     * Gets the value of the srchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrchCount() {
        return srchCount;
    }

    /**
     * Sets the value of the srchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrchCount(Long value) {
        this.srchCount = value;
    }

    /**
     * Gets the value of the linkedPublicDirnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedPublicDirnum() {
        return linkedPublicDirnum;
    }

    /**
     * Sets the value of the linkedPublicDirnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedPublicDirnum(String value) {
        this.linkedPublicDirnum = value;
    }

    /**
     * Gets the value of the vpnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVpnId() {
        return vpnId;
    }

    /**
     * Sets the value of the vpnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVpnId(Long value) {
        this.vpnId = value;
    }

    /**
     * Gets the value of the vpnIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnIdPub() {
        return vpnIdPub;
    }

    /**
     * Sets the value of the vpnIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnIdPub(String value) {
        this.vpnIdPub = value;
    }

    /**
     * Gets the value of the vpnSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpnSubscriber() {
        return vpnSubscriber;
    }

    /**
     * Sets the value of the vpnSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpnSubscriber(Boolean value) {
        this.vpnSubscriber = value;
    }

    /**
     * Gets the value of the externalind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalind() {
        return externalind;
    }

    /**
     * Sets the value of the externalind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalind(Boolean value) {
        this.externalind = value;
    }

    /**
     * Gets the value of the laMemberContract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaMemberContract() {
        return laMemberContract;
    }

    /**
     * Sets the value of the laMemberContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaMemberContract(Boolean value) {
        this.laMemberContract = value;
    }

    /**
     * Gets the value of the flagCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagCase() {
        return flagCase;
    }

    /**
     * Sets the value of the flagCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagCase(Boolean value) {
        this.flagCase = value;
    }

    /**
     * Gets the value of the flagMatchcode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagMatchcode() {
        return flagMatchcode;
    }

    /**
     * Sets the value of the flagMatchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagMatchcode(Boolean value) {
        this.flagMatchcode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartIndex(Long value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the nonPendingOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonPendingOnly() {
        return nonPendingOnly;
    }

    /**
     * Sets the value of the nonPendingOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonPendingOnly(Boolean value) {
        this.nonPendingOnly = value;
    }

    /**
     * Gets the value of the callDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDetail() {
        return callDetail;
    }

    /**
     * Sets the value of the callDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDetail(String value) {
        this.callDetail = value;
    }

    /**
     * Gets the value of the markedForRerating property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkedForRerating() {
        return markedForRerating;
    }

    /**
     * Sets the value of the markedForRerating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkedForRerating(Boolean value) {
        this.markedForRerating = value;
    }

    /**
     * Gets the value of the bscsContract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBscsContract() {
        return bscsContract;
    }

    /**
     * Sets the value of the bscsContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBscsContract(Boolean value) {
        this.bscsContract = value;
    }

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFamilyId(Long value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the csLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsLevelCode() {
        return csLevelCode;
    }

    /**
     * Sets the value of the csLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsLevelCode(String value) {
        this.csLevelCode = value;
    }

    /**
     * Gets the value of the paymentResp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentResp() {
        return paymentResp;
    }

    /**
     * Sets the value of the paymentResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentResp(Boolean value) {
        this.paymentResp = value;
    }

    /**
     * Gets the value of the csContrResp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCsContrResp() {
        return csContrResp;
    }

    /**
     * Sets the value of the csContrResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCsContrResp(Boolean value) {
        this.csContrResp = value;
    }

    /**
     * Gets the value of the rootCsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRootCsId() {
        return rootCsId;
    }

    /**
     * Sets the value of the rootCsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRootCsId(Long value) {
        this.rootCsId = value;
    }

    /**
     * Gets the value of the rootCsIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCsIdPub() {
        return rootCsIdPub;
    }

    /**
     * Sets the value of the rootCsIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCsIdPub(String value) {
        this.rootCsIdPub = value;
    }

    /**
     * Gets the value of the fuPackId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFuPackId() {
        return fuPackId;
    }

    /**
     * Sets the value of the fuPackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFuPackId(Long value) {
        this.fuPackId = value;
    }

    /**
     * Gets the value of the fuPackIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuPackIdPub() {
        return fuPackIdPub;
    }

    /**
     * Sets the value of the fuPackIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuPackIdPub(String value) {
        this.fuPackIdPub = value;
    }

    /**
     * Gets the value of the fuCoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFuCoId() {
        return fuCoId;
    }

    /**
     * Sets the value of the fuCoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFuCoId(Long value) {
        this.fuCoId = value;
    }

    /**
     * Gets the value of the fuCoIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuCoIdPub() {
        return fuCoIdPub;
    }

    /**
     * Sets the value of the fuCoIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuCoIdPub(String value) {
        this.fuCoIdPub = value;
    }

    /**
     * Gets the value of the fuSncode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFuSncode() {
        return fuSncode;
    }

    /**
     * Sets the value of the fuSncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFuSncode(Long value) {
        this.fuSncode = value;
    }

    /**
     * Gets the value of the fuSncodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuSncodePub() {
        return fuSncodePub;
    }

    /**
     * Sets the value of the fuSncodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuSncodePub(String value) {
        this.fuSncodePub = value;
    }

    /**
     * Gets the value of the snStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnStatus() {
        return snStatus;
    }

    /**
     * Sets the value of the snStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnStatus(String value) {
        this.snStatus = value;
    }

    /**
     * Gets the value of the notInServiceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotInServiceCriteria() {
        return notInServiceCriteria;
    }

    /**
     * Sets the value of the notInServiceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotInServiceCriteria(Boolean value) {
        this.notInServiceCriteria = value;
    }

    /**
     * Gets the value of the prmId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrmId() {
        return prmId;
    }

    /**
     * Sets the value of the prmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrmId(Long value) {
        this.prmId = value;
    }

    /**
     * Gets the value of the parameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValuesRequest }
     *     
     */
    public ParameterValuesRequest getParameterValues() {
        return parameterValues;
    }

    /**
     * Sets the value of the parameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValuesRequest }
     *     
     */
    public void setParameterValues(ParameterValuesRequest value) {
        this.parameterValues = value;
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannel(String value) {
        this.salesChannel = value;
    }

    /**
     * Gets the value of the ownerCoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerCoId() {
        return ownerCoId;
    }

    /**
     * Sets the value of the ownerCoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerCoId(Long value) {
        this.ownerCoId = value;
    }

    /**
     * Gets the value of the ownerCoIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCoIdPub() {
        return ownerCoIdPub;
    }

    /**
     * Sets the value of the ownerCoIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCoIdPub(String value) {
        this.ownerCoIdPub = value;
    }

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

}
