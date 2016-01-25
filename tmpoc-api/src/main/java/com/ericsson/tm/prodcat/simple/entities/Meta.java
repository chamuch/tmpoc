package com.ericsson.tm.prodcat.simple.entities;

import javax.xml.bind.annotation.XmlAttribute;

public class Meta {
	
	private String name = null;
	private String value = null;
	
	@XmlAttribute(name="name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute(name="value")
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
