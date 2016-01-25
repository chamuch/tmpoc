/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities.product;

import java.util.List;

/**
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class ProductOfferingPrice {
    private String id;
    private List<ProductOfferingPriceVersion> versions;

    public void setId(String id) {
        this.id = id;
    }

    public void setVersions(List<ProductOfferingPriceVersion> versions) {
        this.versions = versions;
    }

    public String getId() {
        return id;
    }

    public List<ProductOfferingPriceVersion> getVersions() {
        return versions;
    }
}
