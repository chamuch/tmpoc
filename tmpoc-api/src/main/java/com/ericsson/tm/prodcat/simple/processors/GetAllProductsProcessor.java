package com.ericsson.tm.prodcat.simple.processors;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.GetAllProductsRequest;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class GetAllProductsProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		GetAllProductsRequest request = exchange.getIn().getBody(GetAllProductsRequest.class);
		
		IProdCatDiscovery discovery = SpringHelper.getProductCatalogForDiscovery();
		ArrayList<Product> response =  discovery.getAllProducts();
		
		exchange.getOut().setBody(response);
		
	}

}
