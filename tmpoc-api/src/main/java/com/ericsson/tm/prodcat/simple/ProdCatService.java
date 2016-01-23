package com.ericsson.tm.prodcat.simple;

import java.util.ArrayList;

import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class ProdCatService implements IProdCatDiscovery {
	
	private final static String prodcatFile = "prodcat.xml";

	@Override
	public void init() {
		SpringHelper.
		
	}

	@Override
	public ArrayList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> getProducts(String resourceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
