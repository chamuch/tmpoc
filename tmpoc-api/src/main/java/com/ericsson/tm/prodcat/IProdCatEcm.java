package com.ericsson.tm.prodcat;

import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;

public interface IProdCatEcm {

	public ProductCategoryType getAllProductCategories();

	public ProductCategoryType getProductCategory(String categoryId);

//	public ProductOffering getProductOffering(String id);
//
//	public List<ProductOffering> getProductsFor(String resourceId, String serviceId);

}
