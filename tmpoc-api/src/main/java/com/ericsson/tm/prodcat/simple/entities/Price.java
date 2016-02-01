package com.ericsson.tm.prodcat.simple.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="price")
public class Price {

	private String isoCurrencyCode = null;
	private long amount = -1;
	
	@XmlElement (name="isoCurrencyCode")
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		System.out.println("Price attribute 'isoCurrencyCode' set to : " + isoCurrencyCode);
		this.isoCurrencyCode = isoCurrencyCode;
	}
	
	@XmlElement (name="amount")
	public String getAmount() {
		return "" + amount;
	}
	
	public long getNumericAmount() {
		return this.amount;
	}
	
	public void setAmount(String amount) {
		System.out.println("Price attribute 'amount' set to : " + amount);
		this.amount = Long.parseLong(amount);
	}

	@Override
	public String toString() {
		return "Price [isoCurrencyCode=" + isoCurrencyCode + ", amount=" + amount + "]";
	}
	
	
	
	
}
