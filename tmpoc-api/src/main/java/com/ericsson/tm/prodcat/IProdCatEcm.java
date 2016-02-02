package com.ericsson.tm.prodcat;

import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingType;

public interface IProdCatEcm {

	public ProductCategoryType getAllProductCategories();

	public ProductCategoryType getProductCategory(String categoryId);

    public ProductOfferingType getProductOffering(String productOfferingId);

//	public ProductOffering getProductOffering(String id);
//
//	public List<ProductOffering> getProductsFor(String resourceId, String serviceId);

}
