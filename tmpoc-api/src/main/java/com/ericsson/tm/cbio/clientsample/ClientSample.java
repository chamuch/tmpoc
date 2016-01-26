package com.ericsson.tm.cbio.clientsample;

import com.ericsson.tm.cbio.contractsearch.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ContractsSearchService_Service service1 = new ContractsSearchService_Service();
	        System.out.println("Create Web Service...");
	        ContractsSearchService port1 = service1.getContractsSearchServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.contractsSearch(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        ContractsSearchService port2 = service1.getContractsSearchServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.contractsSearch(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
