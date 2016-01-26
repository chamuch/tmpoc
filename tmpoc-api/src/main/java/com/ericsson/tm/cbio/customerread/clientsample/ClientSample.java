package com.ericsson.tm.cbio.customerread.clientsample;

import com.ericsson.tm.cbio.customerread.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        CustomerReadService_Service service1 = new CustomerReadService_Service();
	        System.out.println("Create Web Service...");
	        CustomerReadService port1 = service1.getCustomerReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.customerRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        CustomerReadService port2 = service1.getCustomerReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.customerRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
