package com.ericsson.tm.processor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.services.ws_cil_5.contractssearch.ContractsResponse;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchRequest;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchResponse;
import com.ericsson.services.ws_cil_5.contractssearch.ContractsListpartResponse;

public class DummyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered DummyProcessor..");
		try{
			ContractsSearchRequest request = exchange.getIn().getBody(ContractsSearchRequest.class);
			
			if(request.getInputAttributes() != null){
				System.out.println("getInputAttributes..");
			}
			
			ContractsSearchResponse response = new ContractsSearchResponse();
			ContractsResponse contractResponse = new ContractsResponse();
			//contractResponse.
			List<ContractsListpartResponse> itemList = contractResponse.getItem();
			
			ContractsListpartResponse item = new ContractsListpartResponse();
			item.setContractTypeId(new Long(1));
			item.setBuId(new Long(2));
			item.setCoStatus(BigInteger.valueOf(2));
			item.setAdrFname("TEOH CHEE WEI");
			item.setAdrLname("TEOH CHEE WEI");
			item.setAdrZip("14100");
			item.setAdrCity("SIMPANG AMPAT");
			item.setAdrStreet("LORONG-BUKIT JURU 11");
			item.setAdrStreetno("6");
			item.setSubmId(new Long(1));
			item.setPlcode(new Long(1001));
			item.setExternalind(false);
			item.setRpcode(new Long(14));
			//item.setCoActivated(value);
			item.setCoId(new Long(1));
			item.setCoIdPub("CONTR0000000010");
			item.setCsId(new Long(1));
			item.setCsIdPub("CUST_88");
			item.setCurrentDn(true);
			item.setPaymentResp("X");
			item.setCsContrResp("X");
			item.setPaymentMethodInd("H");
			
			itemList.add(item);
			System.out.println("Added item1");
			
			response.setContracts(contractResponse);
			
			exchange.getOut().setBody(response);
			System.out.println("Returned");
		}catch(Exception genE){
			System.out.println("Encountered exception:"+genE);
		}
	}

}
