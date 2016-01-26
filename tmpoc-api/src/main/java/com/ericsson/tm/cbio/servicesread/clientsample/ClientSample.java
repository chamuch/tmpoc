package com.ericsson.tm.cbio.servicesread.clientsample;

import com.ericsson.tm.cbio.servicesread.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ServicesReadService_Service service1 = new ServicesReadService_Service();
	        System.out.println("Create Web Service...");
	        ServicesReadService port1 = service1.getServicesReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.servicesRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        ServicesReadService port2 = service1.getServicesReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.servicesRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
