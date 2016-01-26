package com.ericsson.tm.clientpojomain;

import com.ericsson.tm.proxy.service.request.PortalMessage.Request;
import com.ericsson.tm.proxy.service.response.PortalMessage.Response;
import com.ericsson.tm.services.entity.ServiceDetailsRetrieveEntityService;

public class DiceTestServiceProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String custAccountNo = "1-1LTUM7F";
		String billingAccountNo = "1011403092";
		String status = "Active";
		
		try {
			
			ServiceDetailsRetrieveEntityService srvc = new ServiceDetailsRetrieveEntityService();
			
			com.ericsson.tm.proxy.service.request.PortalMessage.Request reqObj = new Request();
			
			reqObj.setCustomerAccountNo(custAccountNo);
			//reqObj.setBillingAccountNo(billingAccountNo);
			//reqObj.setStatus(status);
			
			Response x = srvc.operation(reqObj);
			
			System.out.println(x.getLineItems().size());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Error in API invocation for ServiceDetailsRetrieveEntityService \n"+e.getStackTrace());
			e.printStackTrace();
		}
		
	}

}
