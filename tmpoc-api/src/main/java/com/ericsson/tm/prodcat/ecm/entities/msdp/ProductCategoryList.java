package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryList {
	private List<ProductCategoryType> productCategoryList = null;
	
	public void addProductCategory(ProductCategoryType prodCategory) {
		if (productCategoryList == null)
			productCategoryList = new ArrayList<ProductCategoryType>();
		
		productCategoryList.add(prodCategory);
	}

	public List<ProductCategoryType> getProductCategoryList() {
		return productCategoryList;
	}

	public void setProductCategoryList(List<ProductCategoryType> productCategoryList) {
		this.productCategoryList = productCategoryList;
	}

	@Override
	public String toString() {
		return "ProductCategoryList [productCategoryList=" + productCategoryList + "]";
	}
	
	
}
