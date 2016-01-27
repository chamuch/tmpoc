package com.ericsson.tm.processor;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.services.ws_cil_5.addressesread.ListOfAllAddressesListpartResponse;
import com.ericsson.services.ws_cil_5.addressesread.ListOfAllAddressesResponse;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsListpartResponse;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsResponse;
import com.ericsson.services.ws_cil_5.customerread.CustomerReadRequest;
import com.ericsson.services.ws_cil_5.customerread.CustomerReadResponse;
import com.ericsson.services.ws_cil_5.customerread.ListOfAssignmentsResponse;
import com.ericsson.tm.proxy.service.response.PortalMessage.Response.LineItems;
import com.ericsson.tm.services.entity.CustomerProfileRetrieveEntityService;
import com.ericsson.tm.services.entity.ServiceDetailsRetrieveEntityService;

public class CustomerReadProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered CustomerReadProcessor..");
		try{
			CustomerReadRequest request = exchange.getIn().getBody(CustomerReadRequest.class);
			
			String csIdPub = request.getInputAttributes().getCsIdPub();
			String customerAccountNo = "";
			
			String csIdPubConstantResp = "";
			
			// Mappings
			if(csIdPub == "CUST_86"){
				customerAccountNo = "1-1LTUM7F";
				csIdPubConstantResp = "1";
			} else if (csIdPub == "CUST_88"){
				customerAccountNo = "1-10E2Y4D";
				csIdPubConstantResp = "2";
			} else if (csIdPub == "CUST_101"){
				customerAccountNo = "1-4HQDJHY";
				csIdPubConstantResp = "3";
			} else if (csIdPub == "CUST_102"){
				customerAccountNo = "1-12YASD";
				csIdPubConstantResp = "4";
			}
			
			// Invoke Customer Profile Retrieve
			CustomerProfileRetrieveEntityService srvc1 = new CustomerProfileRetrieveEntityService();
			com.ericsson.tm.proxy.customer.request.PortalMessage.Request reqObj1 = new com.ericsson.tm.proxy.customer.request.PortalMessage.Request();
			reqObj1.setAccountNo(customerAccountNo);
			com.ericsson.tm.proxy.customer.response.PortalMessage.Response respObj1 = srvc1.operation(reqObj1);
			
			// Invoke Service Profile Retrieve
			ServiceDetailsRetrieveEntityService srvc2 = new ServiceDetailsRetrieveEntityService();			
			com.ericsson.tm.proxy.service.request.PortalMessage.Request reqObj2 = new com.ericsson.tm.proxy.service.request.PortalMessage.Request();			
			reqObj2.setCustomerAccountNo(customerAccountNo);
			reqObj2.setStatus("ACTIVE");			
			com.ericsson.tm.proxy.service.response.PortalMessage.Response respObj2 = srvc2.operation(reqObj2);
			
			CustomerReadResponse response = new CustomerReadResponse();
			
			//<createdByUser>ADMX</createdByUser>
			response.setCreatedByUser("ADMX");
			//<isIndividualOverdiscDisabled>false</isIndividualOverdiscDisabled>
			response.setIsIndividualOverdiscDisabled(false);
			//ListOfAssignments
			//ListOfAssignmentsResponse listOfAssignments = response.getListOfAssignments();
			/*
			//<listOfAssignments>
			<item>
			<familyId>3</familyId>
			<completionStatus>0</completionStatus>
			<validFrom>2015-05-25</validFrom>
			</item>
			</listOfAssignments>
			<csId>84</csId>
			<!-- <csIdPub>CUST0000041900</csIdPub> -->
			<csIdPub>CUST_84</csIdPub>
			<csCode>1.36004</csCode>
			<csStatus>a</csStatus>
			<csStatusDate>2015-05-25T14:59:01+02:00</csStatusDate>
			<csActivationDate>2015-05-25T14:59:01+02:00</csActivationDate>
			<csLevelCode>0</csLevelCode>
			<paymentResp>true</paymentResp>
			<prgCode>7</prgCode>
			<rpcode>10</rpcode>
			<rpcodePub>BPOCC</rpcodePub>
			<tradeCode>TELCO</tradeCode>
			<costId>1</costId>
			<costCodePub>ECOCS</costCodePub>
			<csPassword>12345</csPassword>
			<rsCode>1</rsCode>
			<wpCode>1</wpCode>
			<csBillInformation>false</csBillInformation>
			<expectPayCurrencyId>43</expectPayCurrencyId>
			<expectPayCurrencyIdPub>EUR</expectPayCurrencyIdPub>
			<csConvratetypePayment>1</csConvratetypePayment>
			<csConvratetypePaymentPub>UDCRT</csConvratetypePaymentPub>
			<refundCurrencyId>43</refundCurrencyId>
			<refundCurrencyIdPub>EUR</refundCurrencyIdPub>
			<csConvratetypeRefund>1</csConvratetypeRefund>
			<csConvratetypeRefundPub>UDCRT</csConvratetypeRefundPub>
			<csCrcheckAgreed>true</csCrcheckAgreed>
			<csIncorporatedInd>false</csIncorporatedInd>
			<csBillcycle>04</csBillcycle>
			<csBillcycleDesc>PAMSCH CBiO Postpaid 1</csBillcycleDesc>
			<csLimitTr1>1</csLimitTr1>
			<csLimitTr1Pub>75% </csLimitTr1Pub>
			<csLimitTr2>1</csLimitTr2>
			<csLimitTr2Pub>75% </csLimitTr2Pub>
			<csLimitTr3>1</csLimitTr3>
			<csLimitTr3Pub>75% </csLimitTr3Pub>
			<csClimit>
			<amount xmlns="http://lhsgroup.com/lhsws/money">0.0</amount>
			<currency xmlns="http://lhsgroup.com/lhsws/money">EUR</currency>
			</csClimit>
			<csContresp>true</csContresp>
			<csLastBcDate>2015-06-12</csLastBcDate>
			<csDeposit>
			<amount xmlns="http://lhsgroup.com/lhsws/money">0.0</amount>
			<currency xmlns="http://lhsgroup.com/lhsws/money">EUR</currency>
			</csDeposit>
			<csDunning>true</csDunning>
			<csPrepayment>false</csPrepayment>
			<csFcId>43</csFcId>
			<csFcIdPub>EUR</csFcIdPub>
			<csCscurbalance>
			<amount xmlns="http://lhsgroup.com/lhsws/money">0.0</amount>
			<currency xmlns="http://lhsgroup.com/lhsws/money">EUR</currency>
			</csCscurbalance>
			<csPrevbalance>
			<amount xmlns="http://lhsgroup.com/lhsws/money">6.2</amount>
			<currency xmlns="http://lhsgroup.com/lhsws/money">EUR</currency>
			</csPrevbalance>
			<csUnbilledAmount>
			<amount xmlns="http://lhsgroup.com/lhsws/money">2.25</amount>
			<currency xmlns="http://lhsgroup.com/lhsws/money">EUR</currency>
			</csUnbilledAmount>
			<csPaybehaviour>000000000000</csPaybehaviour>
			<csInitPrepaidContrOwner>false</csInitPrepaidContrOwner>
			<csCreationDate>2015-05-25T14:59:01+02:00</csCreationDate>
			<lastModificationUser>ADMX</lastModificationUser>
			<paymentRespId>84</paymentRespId>
			<csPaymntRespCode>1.36004</csPaymntRespCode>
			<partyRoleAssignments>
			<item>
			<partyRoleId>1</partyRoleId>
			<partyRoleShname>Subscriber</partyRoleShname>
			<partyRoleName>Subscriber</partyRoleName>
			<partyRoleDescription>A Party that uses a network, services or
			content provided by other Party</partyRoleDescription>
			</item>
			</partyRoleAssignments>
			<partyType>C</partyType>
			<collInd>false</collInd>
			<markedForRerating>false</markedForRerating>
			<performCreditScoring>false</performCreditScoring>*/

			
			
			exchange.getOut().setBody(response);
			System.out.println("Returned");
			
		}catch(Exception genE){
			System.out.println("Encountered exception:"+genE);
		}
	}
}
