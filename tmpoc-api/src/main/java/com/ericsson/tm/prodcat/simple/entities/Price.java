package com.ericsson.tm.prodcat.simple.entities;

import javax.xml.bind.annotation.XmlAttribute;

public class Price {

	private String isoCurrencyCode = null;
	private long amount = -1;
	
	@XmlAttribute (name="isoCurrencyCode")
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		System.out.println("Price attribute 'isoCurrencyCode' set to : " + isoCurrencyCode);
		this.isoCurrencyCode = isoCurrencyCode;
	}
	
	@XmlAttribute (name="amount")
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		System.out.println("Price attribute 'amount' set to : " + amount);
		this.amount = amount;
	}
	
	
}
