package com.ericsson.tm.prodcat.simple.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="composition")
public class Composition {
	
	private CompositionType type = null;
	private ArrayList<AtomicProduct> atomicProducts = new ArrayList<AtomicProduct>();
	private ArrayList<Resource> resources = new ArrayList<Resource>();
	private ArrayList<Composition> childCompositions = new ArrayList<Composition>();
	
	@XmlAttribute (name="type")
	public String getType() {
		return type.name();
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
	
	public void setAtomicProducts(ArrayList<AtomicProduct> atomicProduct) {
		System.out.println("AtomicProducts set for Composition with size: " + atomicProduct.size());
		this.atomicProducts = atomicProduct;
	}
	
	@XmlElement (name="resource")
	public ArrayList<Resource> getResources() {
		return resources;
	}
	
	public void setResources(ArrayList<Resource> resource) {
		System.out.println("Resources set for Composition with size: " + resource.size());
		this.resources = resource;
	}

	@XmlElement (name="composition")
	public ArrayList<Composition> getChildCompositions() {
		return childCompositions;
	}

	public void setChildCompositions(ArrayList<Composition> childComposition) {
		System.out.println("Sub Composition set for Composition with size: " + childComposition.size());
		this.childCompositions = childComposition;
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

	@Override
	public String toString() {
		return "Composition [type=" + type + ", atomicProducts=" + atomicProducts + ", resources=" + resources
				+ ", childCompositions=" + childCompositions + "]";
	}
	
	

}
