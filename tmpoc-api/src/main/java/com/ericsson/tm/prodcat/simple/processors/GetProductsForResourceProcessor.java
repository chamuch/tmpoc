package com.ericsson.tm.prodcat.simple.processors;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.GetProductsForResourceRequest;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class GetProductsForResourceProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		GetProductsForResourceRequest request = exchange.getIn().getBody(GetProductsForResourceRequest.class);
		
		IProdCatDiscovery discovery = SpringHelper.getProductCatalogForDiscovery();
		ArrayList<Product> response =  discovery.getProductsForResource(request.getResourceId());
		
		exchange.getOut().setBody(response);
		
	}

}
