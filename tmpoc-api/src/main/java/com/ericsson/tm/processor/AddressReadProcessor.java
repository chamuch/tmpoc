package com.ericsson.tm.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.services.ws_cil_5.addressesread.AddressesReadRequest;
import com.ericsson.services.ws_cil_5.addressesread.AddressesReadResponse;
import com.ericsson.services.ws_cil_5.addressesread.ListOfAllAddressesListpartResponse;
import com.ericsson.services.ws_cil_5.addressesread.ListOfAllAddressesResponse;
import com.ericsson.tm.services.entity.CustomerProfileRetrieveEntityService;
import com.ericsson.tm.services.entity.ServiceDetailsRetrieveEntityService;

public class AddressReadProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered DummyProcessor..");
		try{
			AddressesReadRequest request = exchange.getIn().getBody(AddressesReadRequest.class);
			
			String csIdPub = "";
			String customerAccountNo = "";			
			String csIdPubConstantResp = "";
			
			if(request.getInputAttributes() != null && request.getInputAttributes().getCsIdPub() != null){
				csIdPub = request.getInputAttributes().getCsIdPub();
				
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
						
			AddressesReadResponse response = new AddressesReadResponse();
			if(request.getInputAttributes() != null && request.getInputAttributes().getCsId() !=null){
				response.setCsId(request.getInputAttributes().getCsId());
			}
			ListOfAllAddressesResponse listOfAllAddresses =  new ListOfAllAddressesResponse();
			List<ListOfAllAddressesListpartResponse> listOfAllAddressesResponse = listOfAllAddresses.getItem();
			ListOfAllAddressesListpartResponse item = new ListOfAllAddressesListpartResponse();
			item.setAdrSeq(new Long(1));
			item.setAdrRoles("B");
			item.setAdrJurTaxOverridden(false);
			item.setAdrTempbillOverridden(false);
			if(respObj1.getCustomerAccount() != null){
				item.setAdrFname(respObj1.getCustomerAccount().getCustomerName());
				item.setAdrLname(respObj1.getCustomerAccount().getCustomerName());
				if(respObj1.getCustomerAccount().getCustomerAddress() != null){
					item.setAdrZip(respObj1.getCustomerAccount().getCustomerAddress().getPostcode());
					item.setAdrCity(respObj1.getCustomerAccount().getCustomerAddress().getCity());
					item.setAdrStreet(respObj1.getCustomerAccount().getCustomerAddress().getStreetType()+" "+respObj1.getCustomerAccount().getCustomerAddress().getStreetName());
					item.setAdrStreetno(respObj1.getCustomerAccount().getCustomerAddress().getHouseUnitLot());
					item.setAdrCounty(respObj1.getCustomerAccount().getCustomerAddress().getCountry());
				}
			}
			item.setCountryId(new Long(129));
			item.setCountryIdPub("MYS");
			item.setAdrPhn1Area("80");
			if(respObj1.getCustomerAccount().getMobilePhone() != null){
				item.setAdrPhn1(respObj1.getCustomerAccount().getMobilePhone());
			}
			item.setLngCode(new Long(2));
			item.setLngCodePub("EN");
			item.setAdrUrgent(false);
			item.setAdrForward(false);
			item.setIdtypeCode(new Long(1));
			item.setAdrCusttype("C");
			item.setMasCode(new Long(1));
			item.setMasCodePub("SING");
			item.setAdrNationality(new Long(129));
			item.setAdrNationalityPub("MYS");
			item.setAdrEmployee(false);
			
			listOfAllAddressesResponse.add(item);
			response.setListOfAllAddresses(listOfAllAddresses);
			
			exchange.getOut().setBody(response);
			System.out.println("Returned");
		}catch(Exception genE){
			System.out.println("Encountered exception:"+genE);
		}
	}

}
