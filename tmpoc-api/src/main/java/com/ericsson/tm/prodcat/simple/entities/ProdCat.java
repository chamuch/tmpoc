package com.ericsson.tm.prodcat.simple.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="prodcat")
public class ProdCat {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	
	@XmlElement(name="product")
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void setProducts(ArrayList<Product> products) {
		System.out.println("Check all products parsed: " + products);
		this.products = products;
	}

}
