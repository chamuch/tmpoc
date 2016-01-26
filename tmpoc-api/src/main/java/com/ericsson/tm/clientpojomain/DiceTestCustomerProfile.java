package com.ericsson.tm.clientpojomain;

import com.ericsson.tm.proxy.customer.request.PortalMessage.Request;
import com.ericsson.tm.proxy.customer.response.PortalMessage.Response;
import com.ericsson.tm.services.entity.CustomerProfileRetrieveEntityService;

public class DiceTestCustomerProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String accountNo = "1-1LTUM7F";
		
		try {
			
			CustomerProfileRetrieveEntityService srvc = new CustomerProfileRetrieveEntityService();
			
			com.ericsson.tm.proxy.customer.request.PortalMessage.Request reqObj = new Request();
			
			reqObj.setAccountNo(accountNo);
			
			Response x = srvc.operation(reqObj);
			
			System.out.println(x.getCustomerAccount().getAccountNo());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Error in API invocation for CustomerProfileRetrieveEntityService \n"+e.getStackTrace());
			e.printStackTrace();
		}
		
	}

}
