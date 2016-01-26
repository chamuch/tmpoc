package com.ericsson.tm.cbio.contractread.clientsample;

import com.ericsson.tm.cbio.contractread.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ContractReadService_Service service1 = new ContractReadService_Service();
	        System.out.println("Create Web Service...");
	        ContractReadService port1 = service1.getContractReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.contractRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        ContractReadService port2 = service1.getContractReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.contractRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
