package com.ericsson.tm.processor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.services.ws_cil_5.customerread.CustomerReadRequest;
import com.ericsson.services.ws_cil_5.customerread.CustomerReadResponse;
import com.ericsson.services.ws_cil_5.customerread.ListOfAssignmentsListpartResponse;
import com.ericsson.services.ws_cil_5.customerread.ListOfAssignmentsResponse;
import com.ericsson.tm.services.entity.CustomerProfileRetrieveEntityService;
import com.ericsson.tm.services.entity.ServiceDetailsRetrieveEntityService;
import com.lhsgroup.lhsws.money.Money;

public class CustomerReadProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered CustomerReadProcessor..");
		try{
			CustomerReadRequest request = exchange.getIn().getBody(CustomerReadRequest.class);
			String csIdPub = "";
			String customerAccountNo = "";			
			Long csIdResp = new Long(1);
			
			if(request.getInputAttributes() != null && request.getInputAttributes().getCsIdPub() != null){
				csIdPub = request.getInputAttributes().getCsIdPub();
				System.out.println("Incoming CsIDPub:"+csIdPub);
				// Mappings
				if(csIdPub.equalsIgnoreCase("CUST_86")){
					customerAccountNo = "1-1LTUM7F";
					csIdResp = new Long(1);
				} else if (csIdPub.equalsIgnoreCase("CUST_88")){
					customerAccountNo = "1-10E2Y4D";
					csIdResp =  new Long(2);
				} else if (csIdPub.equalsIgnoreCase("CUST_101")){
					customerAccountNo = "1-4HQDJHY";
					csIdResp =  new Long(3);
				} else if (csIdPub.equalsIgnoreCase("CUST_102")){
					customerAccountNo = "1-12YASD";
					csIdResp =  new Long(4);
				} else{
					customerAccountNo = "1-UNKNOWN";
					csIdResp =  new Long(4);
				}
			}else{
				customerAccountNo = "1-UNKNOWN";
				csIdResp =  new Long(4);
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
			ListOfAssignmentsResponse listOfAssignments = new ListOfAssignmentsResponse();
			List<ListOfAssignmentsListpartResponse> listOfPartAssignments = listOfAssignments.getItem();
			ListOfAssignmentsListpartResponse item = new ListOfAssignmentsListpartResponse();
			item.setFamilyId(new Long(3));
			item.setCompletionStatus(new Long(0));
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		    Date dobConst = df.parse("25/05/2015");
		    GregorianCalendar constCal = new GregorianCalendar();
		    constCal.setTimeInMillis(dobConst.getTime());
		    XMLGregorianCalendar dateConst = DatatypeFactory.newInstance().newXMLGregorianCalendar(constCal);	
			item.setValidFrom(dateConst);
			
			listOfPartAssignments.add(item);
			response.setListOfAssignments(listOfAssignments);
			
			response.setCsId(csIdResp);
			response.setCsIdPub(request.getInputAttributes().getCsIdPub());
			response.setCsCode("1.36004");
			response.setCsStatus("a");
			
			response.setCsActivationDate(dateConst);
			response.setCsStatusDate(dateConst);
			response.setCsLevelCode("0");
			response.setPaymentResp(true);
			response.setPrgCode("7");
			response.setRsCode(new Long(10));
			response.setRpcodePub("BPOCC");
			response.setTradeCode("TELCO");
			response.setCostId(new Long(1));
			response.setCostCodePub("ECOS");
			response.setCsPassword("12345");
			response.setRsCode(new Long(1));
			response.setWpCode(new Long(1));
			response.setCsBillInformation(false);
			response.setExpectPayCurrencyId(new Long(43));
			response.setExpectPayCurrencyIdPub("MYR");
			response.setCsConvratetypePayment(new Long(1));
			response.setCsConvratetypePaymentPub("UDCRT");
			response.setRefundCurrencyId(new Long(1));
			response.setRefundCurrencyIdPub("MYR");
			response.setCsCrcheckAgreed(true);
			response.setCsIncorporatedInd(false);
			response.setCsIncorporatedInd(false);
			response.setCsBillcycle("04");
			response.setCsBillcycleDesc("PAMSCH CBiO Postpaid 1");
			response.setCsLimitTr1(new Long(1));
			response.setCsLimitTr1Pub("75%");
			response.setCsLimitTr2(new Long(1));
			response.setCsLimitTr2Pub("75%");
			response.setCsLimitTr3(new Long(1));
			response.setCsLimitTr3Pub("75%");
			//response.setCsClimit(value);
			Money money = new Money();
			money.setAmount(new Double("0.0"));
			money.setCurrency("EUR");
			response.setCsClimit(money);
			response.setCsContresp(true);
			
			 Date dobConst1 = df.parse("02/06/2015");
			    GregorianCalendar constCal1 = new GregorianCalendar();
			    constCal.setTimeInMillis(dobConst1.getTime());
			    XMLGregorianCalendar dateConst1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(constCal);	
				item.setValidFrom(dateConst1);
			response.setCsLastBcDate(dateConst1);
			
			response.setCsDeposit(money);
			response.setCsDunning(true);
			response.setCsPrepayment(false);
			response.setCsFcId(new Long(43));
			response.setCsFcIdPub("EUR");
			Money money1 = new Money();
			money1.setAmount(new Double("0.0"));
			money1.setCurrency("EUR");
			response.setCsCscurbalance(money1);
			
			Money money2 = new Money();
			money2.setAmount(new Double("6.0"));
			money2.setCurrency("EUR");
			response.setCsPrevbalance(money2);
			
			Money money3 = new Money();
			money3.setAmount(new Double("2.25"));
			money3.setCurrency("EUR");
			response.setCsUnbilledAmount(money3);
			
			response.setCsPaybehaviour("000000000000");
			response.setCsInitPrepaidContrOwner(false);
			response.setCsCreationDate(dateConst);
			
			response.setLastModificationUser("ADMX");
			response.setPaymentRespId(new Long(84));
			response.setCsPaymntRespCode("1.36004");
			
			/*
			//<listOfAssignments>
			
			</>
			
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
			throw genE;
		}
	}
}
