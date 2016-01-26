package com.ericsson.tm.prodcat.ecm.processors;

import java.util.List;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.ecm.entities.ProductCategory;
import com.ericsson.tm.web.EcmProdcatEndpoint;

public class EcmProdcatProcessor implements EcmProdcatEndpoint {

	@Override
	public List<ProductCategory> getAllProductCategories() {
		System.out.println("GetAllProductCategoriesProcessor start");
		return SpringHelper.getEcmProductCatalog().getAllProductCategoies();
		
	}

	@Override
	public ProductCategory getProductCategory(String productCategoryId) {
		return null;
		
	}

	
}
