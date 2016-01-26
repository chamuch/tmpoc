package com.ericsson.tm.cbio.paymentarrangementsread.clientsample;

import com.ericsson.tm.cbio.paymentarrangementsread.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        PaymentArrangementsReadService_Service service1 = new PaymentArrangementsReadService_Service();
	        System.out.println("Create Web Service...");
	        PaymentArrangementsReadService port1 = service1.getPaymentArrangementsReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.paymentArrangementsRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        PaymentArrangementsReadService port2 = service1.getPaymentArrangementsReadServiceSoap11();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.paymentArrangementsRead(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
