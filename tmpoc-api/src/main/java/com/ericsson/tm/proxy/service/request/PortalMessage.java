//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-08/23/2011 11:04 AM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.27 at 02:15:54 AM CST 
//


package com.ericsson.tm.proxy.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessEvent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ReqRespType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BillingAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "request"
})
@XmlRootElement(name = "PortalMessage")
public class PortalMessage {

    @XmlElement(name = "Header", required = true)
    protected PortalMessage.Header header;
    @XmlElement(name = "Request", required = true)
    protected PortalMessage.Request request;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link PortalMessage.Header }
     *     
     */
    public PortalMessage.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalMessage.Header }
     *     
     */
    public void setHeader(PortalMessage.Header value) {
        this.header = value;
    }

    public boolean isSetHeader() {
        return (this.header!= null);
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link PortalMessage.Request }
     *     
     */
    public PortalMessage.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalMessage.Request }
     *     
     */
    public void setRequest(PortalMessage.Request value) {
        this.request = value;
    }

    public boolean isSetRequest() {
        return (this.request!= null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BusinessEvent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ReqRespType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "businessEvent",
        "timestamp",
        "reqRespType",
        "messageId",
        "errorCode",
        "errorMessage"
    })
    public static class Header {

        @XmlElement(name = "BusinessEvent", required = true)
        protected String businessEvent;
        @XmlElement(name = "Timestamp", required = true)
        protected String timestamp;
        @XmlElement(name = "ReqRespType", required = true)
        protected String reqRespType;
        @XmlElement(name = "MessageId")
        protected String messageId;
        @XmlElement(name = "ErrorCode")
        protected String errorCode;
        @XmlElement(name = "ErrorMessage")
        protected String errorMessage;

        /**
         * Gets the value of the businessEvent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessEvent() {
            return businessEvent;
        }

        /**
         * Sets the value of the businessEvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessEvent(String value) {
            this.businessEvent = value;
        }

        public boolean isSetBusinessEvent() {
            return (this.businessEvent!= null);
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimestamp(String value) {
            this.timestamp = value;
        }

        public boolean isSetTimestamp() {
            return (this.timestamp!= null);
        }

        /**
         * Gets the value of the reqRespType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReqRespType() {
            return reqRespType;
        }

        /**
         * Sets the value of the reqRespType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReqRespType(String value) {
            this.reqRespType = value;
        }

        public boolean isSetReqRespType() {
            return (this.reqRespType!= null);
        }

        /**
         * Gets the value of the messageId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageId() {
            return messageId;
        }

        /**
         * Sets the value of the messageId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageId(String value) {
            this.messageId = value;
        }

        public boolean isSetMessageId() {
            return (this.messageId!= null);
        }

        /**
         * Gets the value of the errorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorCode() {
            return errorCode;
        }

        /**
         * Sets the value of the errorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorCode(String value) {
            this.errorCode = value;
        }

        public boolean isSetErrorCode() {
            return (this.errorCode!= null);
        }

        /**
         * Gets the value of the errorMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorMessage() {
            return errorMessage;
        }

        /**
         * Sets the value of the errorMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorMessage(String value) {
            this.errorMessage = value;
        }

        public boolean isSetErrorMessage() {
            return (this.errorMessage!= null);
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustomerAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BillingAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerAccountNo",
        "billingAccountNo",
        "status"
    })
    public static class Request {

        @XmlElement(name = "CustomerAccountNo", required = true)
        protected String customerAccountNo;
        @XmlElement(name = "BillingAccountNo")
        protected String billingAccountNo;
        @XmlElement(name = "Status")
        protected String status;

        /**
         * Gets the value of the customerAccountNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerAccountNo() {
            return customerAccountNo;
        }

        /**
         * Sets the value of the customerAccountNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerAccountNo(String value) {
            this.customerAccountNo = value;
        }

        public boolean isSetCustomerAccountNo() {
            return (this.customerAccountNo!= null);
        }

        /**
         * Gets the value of the billingAccountNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingAccountNo() {
            return billingAccountNo;
        }

        /**
         * Sets the value of the billingAccountNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingAccountNo(String value) {
            this.billingAccountNo = value;
        }

        public boolean isSetBillingAccountNo() {
            return (this.billingAccountNo!= null);
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        public boolean isSetStatus() {
            return (this.status!= null);
        }

    }

}
