package com.ericsson.tm.prodcat.ecm.entities.msdp;

public class ProductCategoryType {
	
	private String id = null;
	private String name = null;
	private String description = null;
	private String parentId = null;
	private boolean isRoot = false;
	private ProductCategoryList productCategoryList = null;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getParentId() {
		return parentId;
	}
	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	public boolean isRoot() {
		return isRoot;
	}
	
	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}
	
	public ProductCategoryList getProductCategoryList() {
		return productCategoryList;
	}
	
	public void setProductCategoryList(ProductCategoryList productCategoryList) {
		this.productCategoryList = productCategoryList;
	}
	
	

}
