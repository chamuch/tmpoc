package com.ericsson.tm.prodcat.simple.entities;

public enum CompositionType {
	
	INCLUDE ("include"),
	MUTEX ("mutex");
	
	private String type = null;
	
	private CompositionType(String type) {
		this.type = type;
	}
	
	public static CompositionType get(String type) {
		for (CompositionType value: CompositionType.values()) {
			if (type.equals(value.type))
				return value;
		}
		return null;
	}

}
