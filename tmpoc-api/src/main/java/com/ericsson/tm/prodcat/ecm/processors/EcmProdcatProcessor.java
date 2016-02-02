package com.ericsson.tm.prodcat.ecm.processors;



import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;
import com.ericsson.tm.web.EcmProdcatEndpoint;

public class EcmProdcatProcessor implements EcmProdcatEndpoint {

	@Override
	public ProductCategoryType getAllProductCategories() {
		System.out.println("GetAllProductCategoriesProcessor start");
		return SpringHelper.getEcmProductCatalog().getAllProductCategories();
		
	}

	@Override
	public ProductCategoryType getProductCategory(String productCategoryId) {
		System.out.println("GetAllProductCategoryProcessor start");
		return SpringHelper.getEcmProductCatalog().getProductCategory(productCategoryId);
		
	}

	
}
