package com.ericsson.tm.prodcat.simple.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="prodMeta")
public class Meta {
	
	private String name = null;
	private String value = null;
	
	@XmlAttribute(name="name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Meta attribute 'name' set to : " + name);
		this.name = name;
	}
	
	@XmlAttribute(name="value")
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		System.out.println("Meta attribute 'value' set to : " + value);
		this.value = value;
	}

	@Override
	public String toString() {
		return "Meta [name=" + name + ", value=" + value + "]";
	}
	
	
	

}
