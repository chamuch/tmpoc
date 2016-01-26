package com.ericsson.tm.cbio.rateplansread.clientsample;

import com.ericsson.tm.cbio.rateplansread.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        RateplansReadService_Service service1 = new RateplansReadService_Service();
	        System.out.println("Create Web Service...");
	        RateplansReadService port1 = service1.getRateplansReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.rateplansRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        RateplansReadService port2 = service1.getRateplansReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.rateplansRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
