package com.ericsson.tm.prodcat.simple.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
public class Product {
	
	private String id = null;
	private boolean discoverable = false;
	private String name = null;
	private String description = null;
	private ArrayList<Composition> compositions = new ArrayList<Composition>();
	private Price price = null;
	private ArrayList<Meta> metas = new ArrayList<Meta>();
	
	@XmlAttribute (name="id")
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		System.out.println("Product attribute 'id' set to : " + id);
		this.id = id;
	}

	@XmlAttribute (name="discoverable")
	public boolean isDiscoverable() {
		return discoverable;
	}

	public void setDiscoverable(boolean discoverable) {
		System.out.println("Product attribute 'discoverable' set to : " + discoverable);
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
		System.out.println("Description set for product with value: " + description);
		this.description = description;
	}

	@XmlElement (name="composition")
	public ArrayList<Composition> getCompositions() {
		return compositions;
	}

	public void setCompositions(ArrayList<Composition> composition) {
		System.out.println("Composition set for product with size: " + composition.size());
		this.compositions = composition;
	}

	@XmlElement (name="price")
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		System.out.println("Price set for product, with values: " + price);
		this.price = price;
	}

	@XmlElement (name="meta")
	public ArrayList<Meta> getMetas() {
		return metas;
	}

	public void setMetas(ArrayList<Meta> metas) {
		System.out.println("Metas set for product with size: " + metas.size());
		this.metas = metas;
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
	
	public String getMeta(String metaName) {
		if (this.metas != null && this.metas.size() > 0) {
			for (Meta meta: this.metas) {
				if (meta.getName().equals(metaName))
					return meta.getValue();
			}
		}
		return null;
	}
	

}
