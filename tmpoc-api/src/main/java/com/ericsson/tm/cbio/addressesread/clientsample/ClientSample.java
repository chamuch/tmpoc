package com.ericsson.tm.cbio.addressesread.clientsample;

import com.ericsson.tm.cbio.addressesread.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        AddressesReadService_Service service1 = new AddressesReadService_Service();
	        System.out.println("Create Web Service...");
	        AddressesReadService port1 = service1.getAddressesReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.addressesRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        AddressesReadService port2 = service1.getAddressesReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.addressesRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}