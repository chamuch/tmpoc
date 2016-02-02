package com.ericsson.tm.prodcat.ecm;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.IProdCatEcm;

import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryList;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;

import com.ericsson.tm.prodcat.simple.entities.Product;

public class ProdCatService implements IProdCatEcm {
	
	public ProdCatService() {
		System.out.println("Prodcat ecm bean initialized!!");
	}

	@Override
	public ProductCategoryType getAllProductCategories() {
		ProductCategoryType response = new ProductCategoryType();
		ProductCategoryList prodCategoryList = new ProductCategoryList();
		ArrayList<String> categories = new ArrayList<>();
		
		IProdCatDiscovery localDiscovery = SpringHelper.getProductCatalogForDiscovery();
		System.out.println("localDiscovery instance initialized: " + (localDiscovery!=null));
		
		for (Product product: localDiscovery.getAllProducts()) {
			System.out.println("product (" + product.getName() + ") metas: " + product.getMetas());
			if (product.getMetas().size() > 0) {
				if (product.getMeta("Category") != null) {
					String cat = product.getMeta("Category");
					System.out.println("product (" + product.getName() + ") meta:Category found is: " + cat);
					if (categories.indexOf(cat) == -1) {
						categories.add(cat);
						
						ProductCategoryType pc = new ProductCategoryType();
						pc.setId(cat);
						pc.setName(cat);
						pc.setDescription(cat);
						pc.setRoot((product.getCompositions().size() > 0) && (product.isDiscoverable()));
						prodCategoryList.addProductCategory(pc);
					}
				} else {
					System.out.println("product (" + product.getName() + ") meta:Category not found");
				}
			}
		}
		
		response.setProductCategoryList(prodCategoryList);
		return response;
		
	}

	@Override
	public ProductCategoryType getProductCategory(String categoryId) {
		ProductCategoryType response = new ProductCategoryType();
		
		IProdCatDiscovery localDiscovery = SpringHelper.getProductCatalogForDiscovery();
		System.out.println("localDiscovery instance initialized: " + (localDiscovery!=null));
		
		for (Product product: localDiscovery.getAllProducts()) {
			System.out.println("product (" + product.getName() + ") metas: " + product.getMetas());
			if (product.getMetas().size() > 0) {
				if (product.getMeta("Category") != null && categoryId.equalsIgnoreCase(product.getMeta("Category"))) {
					response.setId(categoryId);
					response.setName(categoryId);
					response.setDescription(product.getDescription());
					response.setRoot((product.getCompositions().size() > 0) && (product.isDiscoverable()));
					return response;
				}
			}
		}
		
		return response;
	}
	
	
	
}
