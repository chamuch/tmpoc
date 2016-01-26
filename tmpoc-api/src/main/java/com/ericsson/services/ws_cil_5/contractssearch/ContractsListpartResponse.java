
package com.ericsson.services.ws_cil_5.contractssearch;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractsListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractsListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="contractTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="foreignPlcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="homeBidGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="foreignBidGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lecCoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lecCoIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="csCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirnumBlocks" type="{http://ericsson.com/services/ws_CIL_5/contractssearch}dirnumBlocksResponse" minOccurs="0"/>
 *         &lt;element name="adrFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrLname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrStreetno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coActivated" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="portNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devPortNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainCoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mainCoIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="csIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentDn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dnPending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="markedForRerating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="csDealerid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentResp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csContrResp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethodInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coTemplateIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesChannels" type="{http://ericsson.com/services/ws_CIL_5/contractssearch}salesChannelsResponse" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractsListpartResponse", propOrder = {

})
public class ContractsListpartResponse {

    protected Long contractTypeId;
    protected Long foreignPlcode;
    protected Long homeBidGroupId;
    protected Long foreignBidGroupId;
    protected Long lecCoId;
    protected String lecCoIdPub;
    protected Long buId;
    protected BigInteger coStatus;
    protected String csCode;
    protected String dirnum;
    protected DirnumBlocksResponse dirnumBlocks;
    protected String adrFname;
    protected String adrLname;
    protected String adrName;
    protected String adrStreet;
    protected String adrStreetno;
    protected String adrZip;
    protected String adrCity;
    protected Long submId;
    protected Long plcode;
    protected String coType;
    protected Long vpnId;
    protected Boolean externalind;
    protected Long rpcode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coActivated;
    protected String portNum;
    protected String smNum;
    protected String devPortNum;
    protected Long coId;
    protected String coIdPub;
    protected Long mainCoId;
    protected String mainCoIdPub;
    protected Long csId;
    protected String csIdPub;
    protected String description;
    protected Boolean currentDn;
    protected Boolean dnPending;
    protected Boolean markedForRerating;
    protected Long csDealerid;
    protected String paymentResp;
    protected String csContrResp;
    protected String paymentMethodInd;
    protected Long coTemplateId;
    protected String coTemplateIdPub;
    protected SalesChannelsResponse salesChannels;

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
     * Gets the value of the homeBidGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHomeBidGroupId() {
        return homeBidGroupId;
    }

    /**
     * Sets the value of the homeBidGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHomeBidGroupId(Long value) {
        this.homeBidGroupId = value;
    }

    /**
     * Gets the value of the foreignBidGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForeignBidGroupId() {
        return foreignBidGroupId;
    }

    /**
     * Sets the value of the foreignBidGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForeignBidGroupId(Long value) {
        this.foreignBidGroupId = value;
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
     * Gets the value of the buId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuId() {
        return buId;
    }

    /**
     * Sets the value of the buId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuId(Long value) {
        this.buId = value;
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
     * Gets the value of the dirnumBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link DirnumBlocksResponse }
     *     
     */
    public DirnumBlocksResponse getDirnumBlocks() {
        return dirnumBlocks;
    }

    /**
     * Sets the value of the dirnumBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirnumBlocksResponse }
     *     
     */
    public void setDirnumBlocks(DirnumBlocksResponse value) {
        this.dirnumBlocks = value;
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
     * Gets the value of the coActivated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoActivated() {
        return coActivated;
    }

    /**
     * Sets the value of the coActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoActivated(XMLGregorianCalendar value) {
        this.coActivated = value;
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
     * Gets the value of the mainCoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainCoId() {
        return mainCoId;
    }

    /**
     * Sets the value of the mainCoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainCoId(Long value) {
        this.mainCoId = value;
    }

    /**
     * Gets the value of the mainCoIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCoIdPub() {
        return mainCoIdPub;
    }

    /**
     * Sets the value of the mainCoIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCoIdPub(String value) {
        this.mainCoIdPub = value;
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
     * Gets the value of the currentDn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentDn() {
        return currentDn;
    }

    /**
     * Sets the value of the currentDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentDn(Boolean value) {
        this.currentDn = value;
    }

    /**
     * Gets the value of the dnPending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDnPending() {
        return dnPending;
    }

    /**
     * Sets the value of the dnPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDnPending(Boolean value) {
        this.dnPending = value;
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
     * Gets the value of the paymentResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentResp() {
        return paymentResp;
    }

    /**
     * Sets the value of the paymentResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentResp(String value) {
        this.paymentResp = value;
    }

    /**
     * Gets the value of the csContrResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsContrResp() {
        return csContrResp;
    }

    /**
     * Sets the value of the csContrResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsContrResp(String value) {
        this.csContrResp = value;
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
     * Gets the value of the coTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoTemplateId() {
        return coTemplateId;
    }

    /**
     * Sets the value of the coTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoTemplateId(Long value) {
        this.coTemplateId = value;
    }

    /**
     * Gets the value of the coTemplateIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoTemplateIdPub() {
        return coTemplateIdPub;
    }

    /**
     * Sets the value of the coTemplateIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoTemplateIdPub(String value) {
        this.coTemplateIdPub = value;
    }

    /**
     * Gets the value of the salesChannels property.
     * 
     * @return
     *     possible object is
     *     {@link SalesChannelsResponse }
     *     
     */
    public SalesChannelsResponse getSalesChannels() {
        return salesChannels;
    }

    /**
     * Sets the value of the salesChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesChannelsResponse }
     *     
     */
    public void setSalesChannels(SalesChannelsResponse value) {
        this.salesChannels = value;
    }

}
