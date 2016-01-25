package com.ericsson.tm.prodcat;

import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.ProductCategory;
import com.ericsson.tm.prodcat.ecm.entities.product.ProductOffering;

public interface IProdCatEcm {

	public List<ProductCategory> getAllProductCategoies();

	public ProductCategory getProductCategory(String categoryId);

	public ProductOffering getProductOffering(String id);

	public List<ProductOffering> getProductsFor(String resourceId, String serviceId);

}
