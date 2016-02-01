package com.ericsson.tm.prodcat.simple.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="composition")
public class Composition {
	
	private CompositionType type = null;
	private ArrayList<AtomicProduct> atomicProducts = new ArrayList<>();
	private ArrayList<Resource> resources = new ArrayList<>();
	private ArrayList<Composition> childCompositions = new ArrayList<>();
	
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
	public ArrayList<AtomicProduct> getAtomicProducts() {
		return atomicProducts;
	}
	
	public void setAtomicProducts(ArrayList<AtomicProduct> atomicProducts) {
		this.atomicProducts = atomicProducts;
	}
	
	@XmlElement (name="resource")
	public ArrayList<Resource> getResources() {
		return resources;
	}
	
	public void setResources(ArrayList<Resource> resources) {
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
		
		for (Resource resource: this.getResources()) {
			if (resource.getId().equals(resourceId))
				return true;
		}
		
		return false;
	}
	
	public boolean hasProductAccess(String productId) {
		for (Composition composition: this.getChildCompositions()) {
			if (composition.hasProductAccess(productId))
				return true;
		}
		
		for (AtomicProduct product: this.getAtomicProducts()) {
			if (product.getId().equals(productId))
				return true;
		}
		
		return false;
	}
	
	

}
