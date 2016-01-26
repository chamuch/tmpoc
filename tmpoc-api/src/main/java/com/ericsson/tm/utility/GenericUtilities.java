package com.ericsson.tm.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class GenericUtilities {

	public String generateTransactionId(){
		String randomNo = "CUST"+new Random().nextInt(Integer.MAX_VALUE);
		return randomNo;
	}
	
	public String generateCurrentTimestamp(){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");		
		return df.format(Calendar.getInstance().getTime());
	}
	
}
