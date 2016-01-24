package com.ericsson.tm.prodcat.simple.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.GetProductRequest;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class GetProductProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		GetProductRequest request = exchange.getIn().getBody(GetProductRequest.class);
		
		IProdCatDiscovery discovery = SpringHelper.getProductCatalogForDiscovery();
		Product response =  discovery.getProduct(request.getProductId());
		
		exchange.getOut().setBody(response);
		
	
	}

}
