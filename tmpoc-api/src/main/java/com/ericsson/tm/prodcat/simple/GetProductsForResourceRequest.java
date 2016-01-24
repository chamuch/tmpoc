package com.ericsson.tm.prodcat.simple;

public class GetProductsForResourceRequest {

	private String customerId = null;
	private String contractId = null;
	private String msisdn = null;
	private String resourceId = null;
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getContractId() {
		return contractId;
	}
	
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	
	public String getMsisdn() {
		return msisdn;
	}
	
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	
	
	
	
}
