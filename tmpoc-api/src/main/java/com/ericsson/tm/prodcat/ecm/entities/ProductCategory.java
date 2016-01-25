/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities;

import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.datatype.TimePeriod;


/**
 * com.ericsson.ecm.CommonBusinessEntitiesDomain.ProductCategoryABE
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class ProductCategory {

    private String id;
    private String name;
    private String description;
    private String parentCategoryId;
    private String state;
    private TimePeriod validFor;
    private List<ProductCategory> productCategoryList;

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

    public String getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public List<ProductCategory> getProductCategoryList() {
        return productCategoryList;
    }

    public void setProductCategoryList(List<ProductCategory> productCategoryList) {
        this.productCategoryList = productCategoryList;
    }
}
