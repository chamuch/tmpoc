
package com.ericsson.tm.cbio.servicesread;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numSvListpartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numSvListpartResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sncode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sncodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svShdes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="charges" type="{http://ericsson.com/services/ws_CIL_5/servicesread}chargesResponse" minOccurs="0"/>
 *         &lt;element name="frequencyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodLength" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="initialCredit" type="{http://lhsgroup.com/lhsws/money}money" minOccurs="0"/>
 *         &lt;element name="svDeposit" type="{http://lhsgroup.com/lhsws/money}money" minOccurs="0"/>
 *         &lt;element name="svCsind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="intervalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="proind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srvind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="advind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="susind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="amtind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scSccode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="scSnind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gprs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="srvType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srvSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lcmServiceType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vasMapping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bopModeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bopModeIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="portNpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirnumNpcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dirnumNpcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svMcotype" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="svRcotype" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="svAlcotype" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="svNetProvReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bsgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accGlaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accGlaccountDisc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accGlaccountMincom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accJobcost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accJobcostDisc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accJobcostMincom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vpn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vpnAdministratorInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vpnInternalAccessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vpnExternalAccessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vpnOwnerContractInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vpnUserContractInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prepaidSupportedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defPaymentCondUsgInd" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="paymentCondChngUsgInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defTimePackageUsg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="defTypeOfControl" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="defPaymentCondOnetimeRecInd" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="chargingSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdeImplicitInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="echind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resources" type="{http://ericsson.com/services/ws_CIL_5/servicesread}resourcesResponse" minOccurs="0"/>
 *         &lt;element name="numAction" type="{http://ericsson.com/services/ws_CIL_5/servicesread}numActionResponse" minOccurs="0"/>
 *         &lt;element name="svType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simpleDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="moneyWallet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="balanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contractBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="umcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="umcodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="individualSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceParamerterInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpExtKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rscode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rscodePub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accountTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accountTypeIdPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceOfferingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceParameterChargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pamRecChargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numSvListpartResponse", propOrder = {

})
public class NumSvListpartResponse {

    protected Long sncode;
    protected String sncodePub;
    protected String svShdes;
    protected String svDes;
    protected Boolean billingInd;
    protected ChargesResponse charges;
    protected String frequencyInd;
    protected String periodType;
    protected BigInteger periodLength;
    protected Money initialCredit;
    protected Money svDeposit;
    protected Boolean svCsind;
    protected String intervalType;
    protected BigInteger interval;
    protected String proind;
    protected String srvind;
    protected String advind;
    protected Boolean susind;
    protected String amtind;
    protected Long scSccode;
    protected String scSnind;
    protected Boolean gprs;
    protected String srvType;
    protected String srvSubtype;
    protected Long lcmServiceType;
    protected Boolean vasMapping;
    protected Long bopModeId;
    protected String bopModeIdPub;
    protected Long portNpcode;
    protected String portNpcodePub;
    protected Long dirnumNpcode;
    protected String dirnumNpcodePub;
    protected Boolean svMcotype;
    protected Boolean svRcotype;
    protected Boolean svAlcotype;
    protected Boolean svNetProvReq;
    protected Long bsgId;
    protected String accGlaccount;
    protected String accGlaccountDisc;
    protected String accGlaccountMincom;
    protected String accJobcost;
    protected String accJobcostDisc;
    protected String accJobcostMincom;
    protected Boolean suip;
    protected Boolean vpn;
    protected Boolean vpnAdministratorInd;
    protected Boolean vpnInternalAccessInd;
    protected Boolean vpnExternalAccessInd;
    protected Boolean vpnOwnerContractInd;
    protected Boolean vpnUserContractInd;
    protected Boolean prepaidSupportedInd;
    protected BigInteger defPaymentCondUsgInd;
    protected Boolean paymentCondChngUsgInd;
    protected Long defTimePackageUsg;
    protected BigInteger defTypeOfControl;
    protected BigInteger defPaymentCondOnetimeRecInd;
    protected String chargingSchedule;
    protected Boolean pdeImplicitInd;
    protected String echind;
    protected ResourcesResponse resources;
    protected NumActionResponse numAction;
    protected String svType;
    protected Boolean simpleDiscount;
    protected Boolean moneyWallet;
    protected String balanceType;
    protected Boolean selfMonitoring;
    protected Boolean contractBalance;
    protected Long umcode;
    protected String umcodePub;
    protected Boolean creditable;
    protected Boolean individualSubscription;
    protected Boolean serviceParamerterInd;
    protected String cpName;
    protected String cpExtKey;
    protected Long rscode;
    protected String rscodePub;
    protected Long accountId;
    protected Long accountTypeId;
    protected String accountTypeIdPub;
    protected Long serviceOfferingId;
    protected Boolean serviceParameterChargeInd;
    protected Boolean pamRecChargeInd;

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
     * Gets the value of the svShdes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvShdes() {
        return svShdes;
    }

    /**
     * Sets the value of the svShdes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvShdes(String value) {
        this.svShdes = value;
    }

    /**
     * Gets the value of the svDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvDes() {
        return svDes;
    }

    /**
     * Sets the value of the svDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvDes(String value) {
        this.svDes = value;
    }

    /**
     * Gets the value of the billingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillingInd() {
        return billingInd;
    }

    /**
     * Sets the value of the billingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillingInd(Boolean value) {
        this.billingInd = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesResponse }
     *     
     */
    public ChargesResponse getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesResponse }
     *     
     */
    public void setCharges(ChargesResponse value) {
        this.charges = value;
    }

    /**
     * Gets the value of the frequencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyInd() {
        return frequencyInd;
    }

    /**
     * Sets the value of the frequencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyInd(String value) {
        this.frequencyInd = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodType(String value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the periodLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeriodLength() {
        return periodLength;
    }

    /**
     * Sets the value of the periodLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeriodLength(BigInteger value) {
        this.periodLength = value;
    }

    /**
     * Gets the value of the initialCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInitialCredit() {
        return initialCredit;
    }

    /**
     * Sets the value of the initialCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInitialCredit(Money value) {
        this.initialCredit = value;
    }

    /**
     * Gets the value of the svDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSvDeposit() {
        return svDeposit;
    }

    /**
     * Sets the value of the svDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSvDeposit(Money value) {
        this.svDeposit = value;
    }

    /**
     * Gets the value of the svCsind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSvCsind() {
        return svCsind;
    }

    /**
     * Sets the value of the svCsind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSvCsind(Boolean value) {
        this.svCsind = value;
    }

    /**
     * Gets the value of the intervalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalType() {
        return intervalType;
    }

    /**
     * Sets the value of the intervalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalType(String value) {
        this.intervalType = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterval(BigInteger value) {
        this.interval = value;
    }

    /**
     * Gets the value of the proind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProind() {
        return proind;
    }

    /**
     * Sets the value of the proind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProind(String value) {
        this.proind = value;
    }

    /**
     * Gets the value of the srvind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvind() {
        return srvind;
    }

    /**
     * Sets the value of the srvind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvind(String value) {
        this.srvind = value;
    }

    /**
     * Gets the value of the advind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvind() {
        return advind;
    }

    /**
     * Sets the value of the advind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvind(String value) {
        this.advind = value;
    }

    /**
     * Gets the value of the susind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSusind() {
        return susind;
    }

    /**
     * Sets the value of the susind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSusind(Boolean value) {
        this.susind = value;
    }

    /**
     * Gets the value of the amtind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtind() {
        return amtind;
    }

    /**
     * Sets the value of the amtind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtind(String value) {
        this.amtind = value;
    }

    /**
     * Gets the value of the scSccode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScSccode() {
        return scSccode;
    }

    /**
     * Sets the value of the scSccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScSccode(Long value) {
        this.scSccode = value;
    }

    /**
     * Gets the value of the scSnind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScSnind() {
        return scSnind;
    }

    /**
     * Sets the value of the scSnind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScSnind(String value) {
        this.scSnind = value;
    }

    /**
     * Gets the value of the gprs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGprs() {
        return gprs;
    }

    /**
     * Sets the value of the gprs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGprs(Boolean value) {
        this.gprs = value;
    }

    /**
     * Gets the value of the srvType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvType() {
        return srvType;
    }

    /**
     * Sets the value of the srvType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvType(String value) {
        this.srvType = value;
    }

    /**
     * Gets the value of the srvSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvSubtype() {
        return srvSubtype;
    }

    /**
     * Sets the value of the srvSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvSubtype(String value) {
        this.srvSubtype = value;
    }

    /**
     * Gets the value of the lcmServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLcmServiceType() {
        return lcmServiceType;
    }

    /**
     * Sets the value of the lcmServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLcmServiceType(Long value) {
        this.lcmServiceType = value;
    }

    /**
     * Gets the value of the vasMapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVasMapping() {
        return vasMapping;
    }

    /**
     * Sets the value of the vasMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVasMapping(Boolean value) {
        this.vasMapping = value;
    }

    /**
     * Gets the value of the bopModeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBopModeId() {
        return bopModeId;
    }

    /**
     * Sets the value of the bopModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBopModeId(Long value) {
        this.bopModeId = value;
    }

    /**
     * Gets the value of the bopModeIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopModeIdPub() {
        return bopModeIdPub;
    }

    /**
     * Sets the value of the bopModeIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopModeIdPub(String value) {
        this.bopModeIdPub = value;
    }

    /**
     * Gets the value of the portNpcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortNpcode() {
        return portNpcode;
    }

    /**
     * Sets the value of the portNpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortNpcode(Long value) {
        this.portNpcode = value;
    }

    /**
     * Gets the value of the portNpcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNpcodePub() {
        return portNpcodePub;
    }

    /**
     * Sets the value of the portNpcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNpcodePub(String value) {
        this.portNpcodePub = value;
    }

    /**
     * Gets the value of the dirnumNpcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirnumNpcode() {
        return dirnumNpcode;
    }

    /**
     * Sets the value of the dirnumNpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirnumNpcode(Long value) {
        this.dirnumNpcode = value;
    }

    /**
     * Gets the value of the dirnumNpcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirnumNpcodePub() {
        return dirnumNpcodePub;
    }

    /**
     * Sets the value of the dirnumNpcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirnumNpcodePub(String value) {
        this.dirnumNpcodePub = value;
    }

    /**
     * Gets the value of the svMcotype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSvMcotype() {
        return svMcotype;
    }

    /**
     * Sets the value of the svMcotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSvMcotype(Boolean value) {
        this.svMcotype = value;
    }

    /**
     * Gets the value of the svRcotype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSvRcotype() {
        return svRcotype;
    }

    /**
     * Sets the value of the svRcotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSvRcotype(Boolean value) {
        this.svRcotype = value;
    }

    /**
     * Gets the value of the svAlcotype property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSvAlcotype() {
        return svAlcotype;
    }

    /**
     * Sets the value of the svAlcotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSvAlcotype(Boolean value) {
        this.svAlcotype = value;
    }

    /**
     * Gets the value of the svNetProvReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSvNetProvReq() {
        return svNetProvReq;
    }

    /**
     * Sets the value of the svNetProvReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSvNetProvReq(Boolean value) {
        this.svNetProvReq = value;
    }

    /**
     * Gets the value of the bsgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBsgId() {
        return bsgId;
    }

    /**
     * Sets the value of the bsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBsgId(Long value) {
        this.bsgId = value;
    }

    /**
     * Gets the value of the accGlaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccGlaccount() {
        return accGlaccount;
    }

    /**
     * Sets the value of the accGlaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccGlaccount(String value) {
        this.accGlaccount = value;
    }

    /**
     * Gets the value of the accGlaccountDisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccGlaccountDisc() {
        return accGlaccountDisc;
    }

    /**
     * Sets the value of the accGlaccountDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccGlaccountDisc(String value) {
        this.accGlaccountDisc = value;
    }

    /**
     * Gets the value of the accGlaccountMincom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccGlaccountMincom() {
        return accGlaccountMincom;
    }

    /**
     * Sets the value of the accGlaccountMincom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccGlaccountMincom(String value) {
        this.accGlaccountMincom = value;
    }

    /**
     * Gets the value of the accJobcost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccJobcost() {
        return accJobcost;
    }

    /**
     * Sets the value of the accJobcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccJobcost(String value) {
        this.accJobcost = value;
    }

    /**
     * Gets the value of the accJobcostDisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccJobcostDisc() {
        return accJobcostDisc;
    }

    /**
     * Sets the value of the accJobcostDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccJobcostDisc(String value) {
        this.accJobcostDisc = value;
    }

    /**
     * Gets the value of the accJobcostMincom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccJobcostMincom() {
        return accJobcostMincom;
    }

    /**
     * Sets the value of the accJobcostMincom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccJobcostMincom(String value) {
        this.accJobcostMincom = value;
    }

    /**
     * Gets the value of the suip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuip() {
        return suip;
    }

    /**
     * Sets the value of the suip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuip(Boolean value) {
        this.suip = value;
    }

    /**
     * Gets the value of the vpn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpn() {
        return vpn;
    }

    /**
     * Sets the value of the vpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpn(Boolean value) {
        this.vpn = value;
    }

    /**
     * Gets the value of the vpnAdministratorInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpnAdministratorInd() {
        return vpnAdministratorInd;
    }

    /**
     * Sets the value of the vpnAdministratorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpnAdministratorInd(Boolean value) {
        this.vpnAdministratorInd = value;
    }

    /**
     * Gets the value of the vpnInternalAccessInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpnInternalAccessInd() {
        return vpnInternalAccessInd;
    }

    /**
     * Sets the value of the vpnInternalAccessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpnInternalAccessInd(Boolean value) {
        this.vpnInternalAccessInd = value;
    }

    /**
     * Gets the value of the vpnExternalAccessInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpnExternalAccessInd() {
        return vpnExternalAccessInd;
    }

    /**
     * Sets the value of the vpnExternalAccessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpnExternalAccessInd(Boolean value) {
        this.vpnExternalAccessInd = value;
    }

    /**
     * Gets the value of the vpnOwnerContractInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpnOwnerContractInd() {
        return vpnOwnerContractInd;
    }

    /**
     * Sets the value of the vpnOwnerContractInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpnOwnerContractInd(Boolean value) {
        this.vpnOwnerContractInd = value;
    }

    /**
     * Gets the value of the vpnUserContractInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpnUserContractInd() {
        return vpnUserContractInd;
    }

    /**
     * Sets the value of the vpnUserContractInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpnUserContractInd(Boolean value) {
        this.vpnUserContractInd = value;
    }

    /**
     * Gets the value of the prepaidSupportedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrepaidSupportedInd() {
        return prepaidSupportedInd;
    }

    /**
     * Sets the value of the prepaidSupportedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrepaidSupportedInd(Boolean value) {
        this.prepaidSupportedInd = value;
    }

    /**
     * Gets the value of the defPaymentCondUsgInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefPaymentCondUsgInd() {
        return defPaymentCondUsgInd;
    }

    /**
     * Sets the value of the defPaymentCondUsgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefPaymentCondUsgInd(BigInteger value) {
        this.defPaymentCondUsgInd = value;
    }

    /**
     * Gets the value of the paymentCondChngUsgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentCondChngUsgInd() {
        return paymentCondChngUsgInd;
    }

    /**
     * Sets the value of the paymentCondChngUsgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentCondChngUsgInd(Boolean value) {
        this.paymentCondChngUsgInd = value;
    }

    /**
     * Gets the value of the defTimePackageUsg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefTimePackageUsg() {
        return defTimePackageUsg;
    }

    /**
     * Sets the value of the defTimePackageUsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefTimePackageUsg(Long value) {
        this.defTimePackageUsg = value;
    }

    /**
     * Gets the value of the defTypeOfControl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefTypeOfControl() {
        return defTypeOfControl;
    }

    /**
     * Sets the value of the defTypeOfControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefTypeOfControl(BigInteger value) {
        this.defTypeOfControl = value;
    }

    /**
     * Gets the value of the defPaymentCondOnetimeRecInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefPaymentCondOnetimeRecInd() {
        return defPaymentCondOnetimeRecInd;
    }

    /**
     * Sets the value of the defPaymentCondOnetimeRecInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefPaymentCondOnetimeRecInd(BigInteger value) {
        this.defPaymentCondOnetimeRecInd = value;
    }

    /**
     * Gets the value of the chargingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * Sets the value of the chargingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargingSchedule(String value) {
        this.chargingSchedule = value;
    }

    /**
     * Gets the value of the pdeImplicitInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdeImplicitInd() {
        return pdeImplicitInd;
    }

    /**
     * Sets the value of the pdeImplicitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPdeImplicitInd(Boolean value) {
        this.pdeImplicitInd = value;
    }

    /**
     * Gets the value of the echind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchind() {
        return echind;
    }

    /**
     * Sets the value of the echind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchind(String value) {
        this.echind = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesResponse }
     *     
     */
    public ResourcesResponse getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesResponse }
     *     
     */
    public void setResources(ResourcesResponse value) {
        this.resources = value;
    }

    /**
     * Gets the value of the numAction property.
     * 
     * @return
     *     possible object is
     *     {@link NumActionResponse }
     *     
     */
    public NumActionResponse getNumAction() {
        return numAction;
    }

    /**
     * Sets the value of the numAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumActionResponse }
     *     
     */
    public void setNumAction(NumActionResponse value) {
        this.numAction = value;
    }

    /**
     * Gets the value of the svType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvType() {
        return svType;
    }

    /**
     * Sets the value of the svType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvType(String value) {
        this.svType = value;
    }

    /**
     * Gets the value of the simpleDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSimpleDiscount() {
        return simpleDiscount;
    }

    /**
     * Sets the value of the simpleDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSimpleDiscount(Boolean value) {
        this.simpleDiscount = value;
    }

    /**
     * Gets the value of the moneyWallet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoneyWallet() {
        return moneyWallet;
    }

    /**
     * Sets the value of the moneyWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoneyWallet(Boolean value) {
        this.moneyWallet = value;
    }

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the selfMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfMonitoring() {
        return selfMonitoring;
    }

    /**
     * Sets the value of the selfMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfMonitoring(Boolean value) {
        this.selfMonitoring = value;
    }

    /**
     * Gets the value of the contractBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractBalance() {
        return contractBalance;
    }

    /**
     * Sets the value of the contractBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractBalance(Boolean value) {
        this.contractBalance = value;
    }

    /**
     * Gets the value of the umcode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUmcode() {
        return umcode;
    }

    /**
     * Sets the value of the umcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUmcode(Long value) {
        this.umcode = value;
    }

    /**
     * Gets the value of the umcodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmcodePub() {
        return umcodePub;
    }

    /**
     * Sets the value of the umcodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmcodePub(String value) {
        this.umcodePub = value;
    }

    /**
     * Gets the value of the creditable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditable() {
        return creditable;
    }

    /**
     * Sets the value of the creditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditable(Boolean value) {
        this.creditable = value;
    }

    /**
     * Gets the value of the individualSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndividualSubscription() {
        return individualSubscription;
    }

    /**
     * Sets the value of the individualSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndividualSubscription(Boolean value) {
        this.individualSubscription = value;
    }

    /**
     * Gets the value of the serviceParamerterInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceParamerterInd() {
        return serviceParamerterInd;
    }

    /**
     * Sets the value of the serviceParamerterInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceParamerterInd(Boolean value) {
        this.serviceParamerterInd = value;
    }

    /**
     * Gets the value of the cpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpName() {
        return cpName;
    }

    /**
     * Sets the value of the cpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpName(String value) {
        this.cpName = value;
    }

    /**
     * Gets the value of the cpExtKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpExtKey() {
        return cpExtKey;
    }

    /**
     * Sets the value of the cpExtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpExtKey(String value) {
        this.cpExtKey = value;
    }

    /**
     * Gets the value of the rscode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRscode() {
        return rscode;
    }

    /**
     * Sets the value of the rscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRscode(Long value) {
        this.rscode = value;
    }

    /**
     * Gets the value of the rscodePub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRscodePub() {
        return rscodePub;
    }

    /**
     * Sets the value of the rscodePub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRscodePub(String value) {
        this.rscodePub = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountTypeId() {
        return accountTypeId;
    }

    /**
     * Sets the value of the accountTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountTypeId(Long value) {
        this.accountTypeId = value;
    }

    /**
     * Gets the value of the accountTypeIdPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeIdPub() {
        return accountTypeIdPub;
    }

    /**
     * Sets the value of the accountTypeIdPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeIdPub(String value) {
        this.accountTypeIdPub = value;
    }

    /**
     * Gets the value of the serviceOfferingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceOfferingId() {
        return serviceOfferingId;
    }

    /**
     * Sets the value of the serviceOfferingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceOfferingId(Long value) {
        this.serviceOfferingId = value;
    }

    /**
     * Gets the value of the serviceParameterChargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceParameterChargeInd() {
        return serviceParameterChargeInd;
    }

    /**
     * Sets the value of the serviceParameterChargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceParameterChargeInd(Boolean value) {
        this.serviceParameterChargeInd = value;
    }

    /**
     * Gets the value of the pamRecChargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPamRecChargeInd() {
        return pamRecChargeInd;
    }

    /**
     * Sets the value of the pamRecChargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPamRecChargeInd(Boolean value) {
        this.pamRecChargeInd = value;
    }

}
