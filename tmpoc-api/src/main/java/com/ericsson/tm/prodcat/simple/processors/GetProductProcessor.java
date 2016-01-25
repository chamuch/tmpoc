package com.ericsson.tm.prodcat.simple.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.GetProductRequest;
import com.ericsson.tm.prodcat.simple.entities.Composition;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class GetProductProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Request Triggered..");
		GetProductRequest request = exchange.getIn().getBody(GetProductRequest.class);
		
		IProdCatDiscovery discovery = SpringHelper.getProductCatalogForDiscovery();
		Product response =  discovery.getProduct(request.getProductId());
		
		if(response.getCompositions() != null){
			for(Composition compositionItem: response.getCompositions()){
				if(compositionItem.getAtomicProducts() != null){
					for (String atomicProduct: compositionItem.getAtomicProducts()){
						System.out.println("Atomic Product:"+atomicProduct);
					}
				}
			}
		}
		
		System.out.println("Returned Response..");
		exchange.getOut().setBody(response);
		
	
	}

}
