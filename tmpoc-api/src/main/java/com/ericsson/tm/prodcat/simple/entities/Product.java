package com.ericsson.tm.prodcat.simple.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Product {
	
	private String id = null;
	private boolean discoverable = false;
	private String name = null;
	private String description = null;
	private ArrayList<Composition> composition = new ArrayList<Composition>();
	
	@XmlAttribute (name="id")
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute (name="discoverable")
	public boolean isDiscoverable() {
		return discoverable;
	}

	public void setDiscoverable(boolean discoverable) {
		this.discoverable = discoverable;
	}

	@XmlElement (name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement (name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement (name="composition")
	public ArrayList<Composition> getCompositions() {
		return composition;
	}

	public void setCompositions(ArrayList<Composition> composition) {
		this.composition = composition;
	}

	public boolean hasResourceAccess(String resourceId) {
		for (Composition composition: this.getCompositions()) {
			if (composition.hasResourceAccess(resourceId))
				return true;
		}
		
		return false;
	}
	
	public boolean hasProductAccess(String productId) {
		for (Composition composition: this.getCompositions()) {
			if (composition.hasProductAccess(productId))
				return true;
		}
		
		return false;
	}
	

}