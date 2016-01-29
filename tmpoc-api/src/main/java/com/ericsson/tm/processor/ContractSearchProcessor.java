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

import com.ericsson.services.ws_cil_5.contractssearch.ContractsListpartResponse;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsResponse;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchRequest;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchResponse;
import com.ericsson.tm.proxy.service.response.PortalMessage.Response.LineItems;
import com.ericsson.tm.services.entity.CustomerProfileRetrieveEntityService;
import com.ericsson.tm.services.entity.ServiceDetailsRetrieveEntityService;

public class ContractSearchProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered ContractSearchProcessor..");
		try{
			ContractsSearchRequest request = exchange.getIn().getBody(ContractsSearchRequest.class);
			
			String csIdPub = "";
			String customerAccountNo = "";			
			String csIdPubConstantResp = "";
			
			if(request.getInputAttributes() != null && request.getInputAttributes().getCsIdPub() != null){
				csIdPub = request.getInputAttributes().getCsIdPub();
				System.out.println("Incoming CsIDPub:"+csIdPub);
				// Mappings
				if(csIdPub.equalsIgnoreCase("CUST_86")){
					customerAccountNo = "1-1LTUM7F";
					csIdPubConstantResp = "1";
				} else if (csIdPub.equalsIgnoreCase("CUST_88")){
					customerAccountNo = "1-10E2Y4D";
					csIdPubConstantResp = "2";
				} else if (csIdPub.equalsIgnoreCase("CUST_101")){
					customerAccountNo = "1-4HQDJHY";
					csIdPubConstantResp = "3";
				} else if (csIdPub.equalsIgnoreCase("CUST_102")){
					customerAccountNo = "1-12YASD";
					csIdPubConstantResp = "4";
				} else{
					customerAccountNo = "1-UNKNOWN";
					csIdPubConstantResp = "5";
				}
			}else{
				customerAccountNo = "1-UNKNOWN";
				csIdPubConstantResp = "5";
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
			
			ContractsSearchResponse response = new ContractsSearchResponse();
			
			
			ContractsResponse contractResponse = new ContractsResponse();
			
			
//			if(contractResponse != null
//					&& contractResponse.getItem() != null
//					&& contractResponse.getItem().size() > 0){
				
			List<ContractsListpartResponse> itemList = contractResponse.getItem();
				
			
				if(respObj2 != null && respObj2.getLineItems() != null){
					for(LineItems lineItem: respObj2.getLineItems()){
						ContractsListpartResponse item = new ContractsListpartResponse();
						
						//if (lineItem.getProductName() != null && lineItem.getProductName().equalsIgnoreCase("Residential Voice")){
						if (lineItem.getProductName() != null){
							item.setContractTypeId(new Long(1));
							item.setBuId(new Long(2));
							item.setCoStatus(BigInteger.valueOf(2));
							item.setCsCode(csIdPub);
							item.setDirnum(lineItem.getServiceID());
						}
						
						
						if(respObj1.getCustomerAccount() != null){
							item.setAdrFname(respObj1.getCustomerAccount().getCustomerName().split(" ")[0]);
							item.setAdrLname(respObj1.getCustomerAccount().getCustomerName().split(" ")[1]);
							if(respObj1.getCustomerAccount().getCustomerAddress() != null){
								item.setAdrZip(respObj1.getCustomerAccount().getCustomerAddress().getPostcode());
								item.setAdrCity(respObj1.getCustomerAccount().getCustomerAddress().getCity());
								item.setAdrStreet(respObj1.getCustomerAccount().getCustomerAddress().getStreetType()+" "+respObj1.getCustomerAccount().getCustomerAddress().getStreetName());
								item.setAdrStreetno(respObj1.getCustomerAccount().getCustomerAddress().getHouseUnitLot());

							}
						}
				
						item.setSubmId(new Long(1));
						item.setPlcode(new Long(1001));
						item.setExternalind(false);
						item.setRpcode(new Long(14));

						DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					    Date dobConst = df.parse("01/01/2016");
					    GregorianCalendar constCal = new GregorianCalendar();
					    constCal.setTimeInMillis(dobConst.getTime());
					    XMLGregorianCalendar dateConst = DatatypeFactory.newInstance().newXMLGregorianCalendar(constCal);			
						item.setCoActivated(dateConst);
						
						item.setCoId(new Long(1));
						item.setCoIdPub("CONTR0000000010");
						item.setCsId(new Long(csIdPubConstantResp));
						
						item.setCsIdPub(csIdPub);

						item.setCurrentDn(true);
						item.setPaymentResp("X");
						item.setCsContrResp("X");
						item.setPaymentMethodInd("H");
						
						itemList.add(item);
					}
				}
				
				
								
				
//			}
			response.setContracts(contractResponse);
			
			exchange.getOut().setBody(response);
			System.out.println("Returned");
			
		}catch(Exception genE){
			System.out.println("Contract Search Encountered exception:"+genE);
			genE.printStackTrace();
			throw genE;
		} catch (Throwable e) {
			System.out.println("Contract Search Processor threw up!! - " + e);
			e.printStackTrace();
			throw e;
		}
	}
}
