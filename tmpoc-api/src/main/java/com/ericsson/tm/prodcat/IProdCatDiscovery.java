package com.ericsson.tm.prodcat;

import java.util.ArrayList;

import com.ericsson.tm.prodcat.simple.entities.Product;

public interface IProdCatDiscovery {
	
	public void init();
	
	public ArrayList<Product> getAllProducts();
	
	public Product getProduct(String id);
	
	public ArrayList<Product> getProductsForChild(String productId);

	public ArrayList<Product> getProductsForResource(String resourceId);
	

}
