package com.ericsson.tm.prodcat.simple.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Composition {
	
	private CompositionType type = null;
	private String atomicProduct = null;
	private String resource = null;
	
	@XmlAttribute (name="type")
	public CompositionType getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = CompositionType.get(type);
	}
	
	public void setType(CompositionType type) {
		this.type = type;
	}
	
	@XmlElement (name="atomicProduct")
	public String getAtomicProduct() {
		return atomicProduct;
	}
	
	public void setAtomicProduct(String atomicProduct) {
		this.atomicProduct = atomicProduct;
	}
	
	@XmlElement (name="resource")
	public String getResource() {
		return resource;
	}
	
	public void setResource(String resource) {
		this.resource = resource;
	}
	
	

}
