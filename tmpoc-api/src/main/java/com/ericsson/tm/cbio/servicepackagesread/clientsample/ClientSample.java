package com.ericsson.tm.cbio.servicepackagesread.clientsample;

import com.ericsson.tm.cbio.servicepackagesread.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ServicePackagesReadService_Service service1 = new ServicePackagesReadService_Service();
	        System.out.println("Create Web Service...");
	        ServicePackagesReadService port1 = service1.getServicePackagesReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.servicePackagesRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        ServicePackagesReadService port2 = service1.getServicePackagesReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.servicePackagesRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
