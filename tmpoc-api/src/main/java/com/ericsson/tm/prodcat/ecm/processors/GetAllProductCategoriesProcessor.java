package com.ericsson.tm.prodcat.ecm.processors;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.ecm.entities.ProductCategory;

public class GetAllProductCategoriesProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		List<ProductCategory> prodCategories = SpringHelper.getEcmProductCatalog().getAllProductCategoies();
		exchange.getOut().setBody(prodCategories);
		
	}

}
