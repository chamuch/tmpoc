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

import com.ericsson.services.ws_cil_5.addressesread.AddressesReadResponse;

public class AddressReadProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered DummyProcessor..");
		try{
			ContractsSearchRequest request = exchange.getIn().getBody(ContractsSearchRequest.class);
			
			if(request.getInputAttributes() != null){
				System.out.println("getInputAttributes..");
			}
			
			AddressesReadResponse response = new AddressesReadResponse();
			response.setCsId(new Long(84));
						
			exchange.getOut().setBody(response);
			System.out.println("Returned");
		}catch(Exception genE){
			System.out.println("Encountered exception:"+genE);
		}
	}

}
