package com.ericsson.tm.prodcat.simple.processors;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.GetProductsForChildRequest;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class GetAllProductsForChildProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		GetProductsForChildRequest request = exchange.getIn().getBody(GetProductsForChildRequest.class);
		
		IProdCatDiscovery discovery = SpringHelper.getProductCatalogForDiscovery();
		ArrayList<Product> response =  discovery.getProductsForChild(request.getProductId());
		
		exchange.getOut().setBody(response);
		
	}

}
