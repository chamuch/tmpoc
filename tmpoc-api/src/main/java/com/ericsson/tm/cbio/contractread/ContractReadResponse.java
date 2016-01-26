
package com.ericsson.tm.cbio.contractread;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractReadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="accPackId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="firstCsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="firstCsIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="csId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="csIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coTrialStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="commonRefData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homeBidGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="foreignBidGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sccode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sccodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="plcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extProductId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extProductIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altRpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="altRpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendingRpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pendingRpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coStmedno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coOpDir" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coPstnDir" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="coLastReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coPendingStatus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coPendingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="coLastStatusChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="coModdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="coEntdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="coActivated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currencyIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractRequest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coTrialEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="coExpirDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="anPackageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="anPackageIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preratedTapRp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coNonexplServPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coSignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="relatedContracts" type="{http://ericsson.com/services/ws_CIL_5/contractread}relatedContractsResponse" minOccurs="0"/>
 *         &lt;element name="services" type="{http://ericsson.com/services/ws_CIL_5/contractread}servicesResponse" minOccurs="0"/>
 *         &lt;element name="coId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="submIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userinstallationAdr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bmId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bmIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationMediumId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="notificationMediumIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargingPeriodAdjustmentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextCutOffDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastCutOffDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="chargeStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="coEquipmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earliestEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ivrBarringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ivrLangId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ivrLangIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendingIvrLangId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pendingIvrLangIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markedForRerating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currentRpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currentRpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refillBarredUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mainAccount1" type="{http://lhsgroup.com/lhsws/money}money" minOccurs="0"/>
 *         &lt;element name="promotionPlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="promotionPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sdpId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="svpFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractReadResponse", propOrder = {

})
public class ContractReadResponse {

    protected Long accPackId;
    protected Long firstCsId;
    protected String firstCsIdPub;
    protected Long csId;
    protected String csIdPub;
    protected Long contractTypeId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coTrialStartDate;
    protected Boolean commonRefData;
    protected Long homeBidGroupId;
    protected Long foreignBidGroupId;
    protected String description;
    protected Long sccode;
    protected String sccodePub;
    protected Long plcode;
    protected String plcodePub;
    protected Long rpcode;
    protected String rpcodePub;
    protected Long extProductId;
    protected String extProductIdPub;
    protected Long altRpcode;
    protected String altRpcodePub;
    protected Long pendingRpcode;
    protected String pendingRpcodePub;
    protected String coStmedno;
    protected Boolean coArchive;
    protected Boolean coOpDir;
    protected Boolean coPstnDir;
    protected BigInteger coStatus;
    protected Long coLastReason;
    protected BigInteger coPendingStatus;
    protected Long reason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coPendingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coLastStatusChangeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coModdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coEntdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coActivated;
    protected Long currencyId;
    protected String currencyIdPub;
    protected Long contractRequest;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coTrialEndDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coExpirDate;
    protected Long anPackageId;
    protected String anPackageIdPub;
    protected Boolean preratedTapRp;
    protected String coType;
    protected String coNonexplServPaymentType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coSignedDate;
    protected RelatedContractsResponse relatedContracts;
    protected ServicesResponse services;
    protected Long coId;
    protected String coIdPub;
    protected Long submId;
    protected String submIdPub;
    protected String callDetail;
    protected Boolean userinstallationAdr;
    protected Long bmId;
    protected String bmIdPub;
    protected Long notificationMediumId;
    protected String notificationMediumIdPub;
    protected String chargingPeriodAdjustmentReference;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextCutOffDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastCutOffDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastNotificationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chargeStartDate;
    protected String coEquipmentStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ivrBarringDate;
    protected Long ivrLangId;
    protected String ivrLangIdPub;
    protected Long pendingIvrLangId;
    protected String pendingIvrLangIdPub;
    protected Boolean markedForRerating;
    protected Long currentRpcode;
    protected String currentRpcodePub;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refillBarredUntil;
    protected Money mainAccount1;
    protected Long promotionPlanId;
    protected String promotionPlanCode;
    protected Long sdpId;
    protected String svpFile;

    /**
     * Gets the value of the accPackId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccPackId() {
        return accPackId;
    }

    /**
     * Sets the value of the accPackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccPackId(Long value) {
        this.accPackId = value;
    }

    /**
     * Gets the value of the firstCsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstCsId() {
        return firstCsId;
    }

    /**
     * Sets the value of the firstCsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstCsId(Long value) {
        this.firstCsId = value;
    }

    /**
     * Gets the value of the firstCsIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstCsIdPub() {
        return firstCsIdPub;
    }

    /**
     * Sets the value of the firstCsIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstCsIdPub(String value) {
        this.firstCsIdPub = value;
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
     * Gets the value of the coTrialStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoTrialStartDate() {
        return coTrialStartDate;
    }

    /**
     * Sets the value of the coTrialStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoTrialStartDate(XMLGregorianCalendar value) {
        this.coTrialStartDate = value;
    }

    /**
     * Gets the value of the commonRefData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommonRefData() {
        return commonRefData;
    }

    /**
     * Sets the value of the commonRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommonRefData(Boolean value) {
        this.commonRefData = value;
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
     * Gets the value of the extProductId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtProductId() {
        return extProductId;
    }

    /**
     * Sets the value of the extProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtProductId(Long value) {
        this.extProductId = value;
    }

    /**
     * Gets the value of the extProductIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtProductIdPub() {
        return extProductIdPub;
    }

    /**
     * Sets the value of the extProductIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtProductIdPub(String value) {
        this.extProductIdPub = value;
    }

    /**
     * Gets the value of the altRpcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAltRpcode() {
        return altRpcode;
    }

    /**
     * Sets the value of the altRpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAltRpcode(Long value) {
        this.altRpcode = value;
    }

    /**
     * Gets the value of the altRpcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltRpcodePub() {
        return altRpcodePub;
    }

    /**
     * Sets the value of the altRpcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltRpcodePub(String value) {
        this.altRpcodePub = value;
    }

    /**
     * Gets the value of the pendingRpcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPendingRpcode() {
        return pendingRpcode;
    }

    /**
     * Sets the value of the pendingRpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPendingRpcode(Long value) {
        this.pendingRpcode = value;
    }

    /**
     * Gets the value of the pendingRpcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingRpcodePub() {
        return pendingRpcodePub;
    }

    /**
     * Sets the value of the pendingRpcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingRpcodePub(String value) {
        this.pendingRpcodePub = value;
    }

    /**
     * Gets the value of the coStmedno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoStmedno() {
        return coStmedno;
    }

    /**
     * Sets the value of the coStmedno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoStmedno(String value) {
        this.coStmedno = value;
    }

    /**
     * Gets the value of the coArchive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoArchive() {
        return coArchive;
    }

    /**
     * Sets the value of the coArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoArchive(Boolean value) {
        this.coArchive = value;
    }

    /**
     * Gets the value of the coOpDir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoOpDir() {
        return coOpDir;
    }

    /**
     * Sets the value of the coOpDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoOpDir(Boolean value) {
        this.coOpDir = value;
    }

    /**
     * Gets the value of the coPstnDir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoPstnDir() {
        return coPstnDir;
    }

    /**
     * Sets the value of the coPstnDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoPstnDir(Boolean value) {
        this.coPstnDir = value;
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
     * Gets the value of the coLastReason property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoLastReason() {
        return coLastReason;
    }

    /**
     * Sets the value of the coLastReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoLastReason(Long value) {
        this.coLastReason = value;
    }

    /**
     * Gets the value of the coPendingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoPendingStatus() {
        return coPendingStatus;
    }

    /**
     * Sets the value of the coPendingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoPendingStatus(BigInteger value) {
        this.coPendingStatus = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReason(Long value) {
        this.reason = value;
    }

    /**
     * Gets the value of the coPendingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoPendingDate() {
        return coPendingDate;
    }

    /**
     * Sets the value of the coPendingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoPendingDate(XMLGregorianCalendar value) {
        this.coPendingDate = value;
    }

    /**
     * Gets the value of the coLastStatusChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoLastStatusChangeDate() {
        return coLastStatusChangeDate;
    }

    /**
     * Sets the value of the coLastStatusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoLastStatusChangeDate(XMLGregorianCalendar value) {
        this.coLastStatusChangeDate = value;
    }

    /**
     * Gets the value of the coModdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoModdate() {
        return coModdate;
    }

    /**
     * Sets the value of the coModdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoModdate(XMLGregorianCalendar value) {
        this.coModdate = value;
    }

    /**
     * Gets the value of the coEntdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoEntdate() {
        return coEntdate;
    }

    /**
     * Sets the value of the coEntdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoEntdate(XMLGregorianCalendar value) {
        this.coEntdate = value;
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
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyId(Long value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the currencyIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIdPub() {
        return currencyIdPub;
    }

    /**
     * Sets the value of the currencyIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIdPub(String value) {
        this.currencyIdPub = value;
    }

    /**
     * Gets the value of the contractRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractRequest() {
        return contractRequest;
    }

    /**
     * Sets the value of the contractRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractRequest(Long value) {
        this.contractRequest = value;
    }

    /**
     * Gets the value of the coTrialEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoTrialEndDate() {
        return coTrialEndDate;
    }

    /**
     * Sets the value of the coTrialEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoTrialEndDate(XMLGregorianCalendar value) {
        this.coTrialEndDate = value;
    }

    /**
     * Gets the value of the coExpirDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoExpirDate() {
        return coExpirDate;
    }

    /**
     * Sets the value of the coExpirDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoExpirDate(XMLGregorianCalendar value) {
        this.coExpirDate = value;
    }

    /**
     * Gets the value of the anPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnPackageId() {
        return anPackageId;
    }

    /**
     * Sets the value of the anPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnPackageId(Long value) {
        this.anPackageId = value;
    }

    /**
     * Gets the value of the anPackageIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnPackageIdPub() {
        return anPackageIdPub;
    }

    /**
     * Sets the value of the anPackageIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnPackageIdPub(String value) {
        this.anPackageIdPub = value;
    }

    /**
     * Gets the value of the preratedTapRp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreratedTapRp() {
        return preratedTapRp;
    }

    /**
     * Sets the value of the preratedTapRp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreratedTapRp(Boolean value) {
        this.preratedTapRp = value;
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
     * Gets the value of the coNonexplServPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoNonexplServPaymentType() {
        return coNonexplServPaymentType;
    }

    /**
     * Sets the value of the coNonexplServPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoNonexplServPaymentType(String value) {
        this.coNonexplServPaymentType = value;
    }

    /**
     * Gets the value of the coSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoSignedDate() {
        return coSignedDate;
    }

    /**
     * Sets the value of the coSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoSignedDate(XMLGregorianCalendar value) {
        this.coSignedDate = value;
    }

    /**
     * Gets the value of the relatedContracts property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedContractsResponse }
     *     
     */
    public RelatedContractsResponse getRelatedContracts() {
        return relatedContracts;
    }

    /**
     * Sets the value of the relatedContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedContractsResponse }
     *     
     */
    public void setRelatedContracts(RelatedContractsResponse value) {
        this.relatedContracts = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesResponse }
     *     
     */
    public ServicesResponse getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesResponse }
     *     
     */
    public void setServices(ServicesResponse value) {
        this.services = value;
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
     * Gets the value of the userinstallationAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserinstallationAdr() {
        return userinstallationAdr;
    }

    /**
     * Sets the value of the userinstallationAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserinstallationAdr(Boolean value) {
        this.userinstallationAdr = value;
    }

    /**
     * Gets the value of the bmId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBmId() {
        return bmId;
    }

    /**
     * Sets the value of the bmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBmId(Long value) {
        this.bmId = value;
    }

    /**
     * Gets the value of the bmIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmIdPub() {
        return bmIdPub;
    }

    /**
     * Sets the value of the bmIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmIdPub(String value) {
        this.bmIdPub = value;
    }

    /**
     * Gets the value of the notificationMediumId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotificationMediumId() {
        return notificationMediumId;
    }

    /**
     * Sets the value of the notificationMediumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotificationMediumId(Long value) {
        this.notificationMediumId = value;
    }

    /**
     * Gets the value of the notificationMediumIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationMediumIdPub() {
        return notificationMediumIdPub;
    }

    /**
     * Sets the value of the notificationMediumIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationMediumIdPub(String value) {
        this.notificationMediumIdPub = value;
    }

    /**
     * Gets the value of the chargingPeriodAdjustmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargingPeriodAdjustmentReference() {
        return chargingPeriodAdjustmentReference;
    }

    /**
     * Sets the value of the chargingPeriodAdjustmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargingPeriodAdjustmentReference(String value) {
        this.chargingPeriodAdjustmentReference = value;
    }

    /**
     * Gets the value of the nextCutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextCutOffDate() {
        return nextCutOffDate;
    }

    /**
     * Sets the value of the nextCutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextCutOffDate(XMLGregorianCalendar value) {
        this.nextCutOffDate = value;
    }

    /**
     * Gets the value of the lastCutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCutOffDate() {
        return lastCutOffDate;
    }

    /**
     * Sets the value of the lastCutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCutOffDate(XMLGregorianCalendar value) {
        this.lastCutOffDate = value;
    }

    /**
     * Gets the value of the lastNotificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastNotificationDate() {
        return lastNotificationDate;
    }

    /**
     * Sets the value of the lastNotificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastNotificationDate(XMLGregorianCalendar value) {
        this.lastNotificationDate = value;
    }

    /**
     * Gets the value of the chargeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeStartDate() {
        return chargeStartDate;
    }

    /**
     * Sets the value of the chargeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeStartDate(XMLGregorianCalendar value) {
        this.chargeStartDate = value;
    }

    /**
     * Gets the value of the coEquipmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoEquipmentStatus() {
        return coEquipmentStatus;
    }

    /**
     * Sets the value of the coEquipmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoEquipmentStatus(String value) {
        this.coEquipmentStatus = value;
    }

    /**
     * Gets the value of the earliestEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestEndDate() {
        return earliestEndDate;
    }

    /**
     * Sets the value of the earliestEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestEndDate(XMLGregorianCalendar value) {
        this.earliestEndDate = value;
    }

    /**
     * Gets the value of the ivrBarringDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIvrBarringDate() {
        return ivrBarringDate;
    }

    /**
     * Sets the value of the ivrBarringDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIvrBarringDate(XMLGregorianCalendar value) {
        this.ivrBarringDate = value;
    }

    /**
     * Gets the value of the ivrLangId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIvrLangId() {
        return ivrLangId;
    }

    /**
     * Sets the value of the ivrLangId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIvrLangId(Long value) {
        this.ivrLangId = value;
    }

    /**
     * Gets the value of the ivrLangIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvrLangIdPub() {
        return ivrLangIdPub;
    }

    /**
     * Sets the value of the ivrLangIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvrLangIdPub(String value) {
        this.ivrLangIdPub = value;
    }

    /**
     * Gets the value of the pendingIvrLangId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPendingIvrLangId() {
        return pendingIvrLangId;
    }

    /**
     * Sets the value of the pendingIvrLangId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPendingIvrLangId(Long value) {
        this.pendingIvrLangId = value;
    }

    /**
     * Gets the value of the pendingIvrLangIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingIvrLangIdPub() {
        return pendingIvrLangIdPub;
    }

    /**
     * Sets the value of the pendingIvrLangIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingIvrLangIdPub(String value) {
        this.pendingIvrLangIdPub = value;
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
     * Gets the value of the currentRpcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentRpcode() {
        return currentRpcode;
    }

    /**
     * Sets the value of the currentRpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentRpcode(Long value) {
        this.currentRpcode = value;
    }

    /**
     * Gets the value of the currentRpcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentRpcodePub() {
        return currentRpcodePub;
    }

    /**
     * Sets the value of the currentRpcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentRpcodePub(String value) {
        this.currentRpcodePub = value;
    }

    /**
     * Gets the value of the refillBarredUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefillBarredUntil() {
        return refillBarredUntil;
    }

    /**
     * Sets the value of the refillBarredUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefillBarredUntil(XMLGregorianCalendar value) {
        this.refillBarredUntil = value;
    }

    /**
     * Gets the value of the mainAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMainAccount1() {
        return mainAccount1;
    }

    /**
     * Sets the value of the mainAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMainAccount1(Money value) {
        this.mainAccount1 = value;
    }

    /**
     * Gets the value of the promotionPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionPlanId() {
        return promotionPlanId;
    }

    /**
     * Sets the value of the promotionPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionPlanId(Long value) {
        this.promotionPlanId = value;
    }

    /**
     * Gets the value of the promotionPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionPlanCode() {
        return promotionPlanCode;
    }

    /**
     * Sets the value of the promotionPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionPlanCode(String value) {
        this.promotionPlanCode = value;
    }

    /**
     * Gets the value of the sdpId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSdpId() {
        return sdpId;
    }

    /**
     * Sets the value of the sdpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSdpId(Long value) {
        this.sdpId = value;
    }

    /**
     * Gets the value of the svpFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvpFile() {
        return svpFile;
    }

    /**
     * Sets the value of the svpFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvpFile(String value) {
        this.svpFile = value;
    }

}
