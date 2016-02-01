package com.ericsson.tm.prodcat.ecm;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.IProdCatEcm;
import com.ericsson.tm.prodcat.ecm.entities.ProductCategory;
import com.ericsson.tm.prodcat.ecm.entities.product.ProductOffering;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class ProdCatService implements IProdCatEcm {
	
	public ProdCatService() {
		System.out.println("Prodcat ecm bean initialized!!");
	}

	@Override
	public List<ProductCategory> getAllProductCategoies() {
		ArrayList<ProductCategory> response = new ArrayList<>();
		ArrayList<String> categories = new ArrayList<>();
		
		IProdCatDiscovery localDiscovery = SpringHelper.getProductCatalogForDiscovery();
		System.out.println("localDiscovery instance initialized: " + (localDiscovery!=null));
		
		for (Product product: localDiscovery.getAllProducts()) {
			System.out.println("product (" + product.getName() + ") metas: " + product.getMetas());
			if (product.getMetas().size() > 0) {
				if (product.getMeta("Category") != null) {
					String cat = product.getMeta("Category");
					System.out.println("product (" + product.getName() + ") meta:Category found is: " + cat);
					if (categories.indexOf(cat) != -1) {
						categories.add(cat);
						
						ProductCategory pc = new ProductCategory();
						pc.setId(cat);
						pc.setName(cat);
						pc.setDescription(cat);
						response.add(pc);
					}
				} else {
					System.out.println("product (" + product.getName() + ") meta:Category not found");
				}
			}
		}
		
		return response;
		
	}
	
	@Override
	public ProductCategory getProductCategory(String categoryId) {
		return null;
		
	}
	
	@Override
	public ProductOffering getProductOffering(String id) {
		return null;
	}
	
	@Override
	public List<ProductOffering> getProductsFor(String resourceId, String serviceId) {
		return null;
	}
	
}
