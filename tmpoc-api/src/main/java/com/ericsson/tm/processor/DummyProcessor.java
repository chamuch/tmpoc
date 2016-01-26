package com.ericsson.tm.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DummyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered DummyProcessor..");
	}

}
