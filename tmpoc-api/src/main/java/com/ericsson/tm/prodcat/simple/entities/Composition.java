package com.ericsson.tm.prodcat.simple.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Composition {
	
	private CompositionType type = null;
	private ArrayList<String> atomicProducts = new ArrayList<String>();
	private ArrayList<String> resources = new ArrayList<String>();
	private ArrayList<Composition> childCompositions = new ArrayList<Composition>();
	
	@XmlAttribute (name="type")
	public CompositionType getType() {
		return type;
	}
	
	public void setType(String type) {
		System.out.println("Composition attribute 'type' set to : " + type);
		this.type = CompositionType.get(type);
	}
	
	public void setType(CompositionType type) {
		this.type = type;
	}
	
	@XmlElement (name="atomicProduct")
	public ArrayList<String> getAtomicProducts() {
		return atomicProducts;
	}
	
	public void setAtomicProducts(ArrayList<String> atomicProducts) {
		this.atomicProducts = atomicProducts;
	}
	
	@XmlElement (name="resource")
	public ArrayList<String> getResources() {
		return resources;
	}
	
	public void setResources(ArrayList<String> resources) {
		this.resources = resources;
	}

	@XmlElement (name="composition")
	public ArrayList<Composition> getChildCompositions() {
		return childCompositions;
	}

	public void setChildCompositions(ArrayList<Composition> childCompositions) {
		this.childCompositions = childCompositions;
	}

	public boolean hasResourceAccess(String resourceId) {
		for (Composition composition: this.getChildCompositions()) {
			if (composition.hasResourceAccess(resourceId))
				return true;
		}
		
		for (String resource: this.getResources()) {
			if (resource.equals(resourceId))
				return true;
		}
		
		return false;
	}
	
	public boolean hasProductAccess(String productId) {
		for (Composition composition: this.getChildCompositions()) {
			if (composition.hasProductAccess(productId))
				return true;
		}
		
		for (String product: this.getAtomicProducts()) {
			if (product.equals(productId))
				return true;
		}
		
		return false;
	}
	
	

}
