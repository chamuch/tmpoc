package com.ericsson.tm.prodcat.simple.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="atomicProduct")
public class AtomicProduct {
	
	private String id = null;
	
	@XmlAttribute(name="id")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		System.out.println("AtomicProduct attribute 'id' set to : " + id);
		this.id = id;
	}
	
	
	
	

}
