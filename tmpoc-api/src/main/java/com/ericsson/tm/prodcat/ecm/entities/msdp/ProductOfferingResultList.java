package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.ArrayList;
import java.util.List;

public class ProductOfferingResultList {

    private PaginationResult          page            = null;
    private List<ProductOfferingType> productOffering = null;
    
    public void addProductOffering(ProductOfferingType productOffering) {
        if (this.productOffering == null)
            this.productOffering = new ArrayList<ProductOfferingType>();
        
        this.productOffering.add(productOffering);
    }

    public PaginationResult getPage() {
        return page;
    }

    public void setPage(PaginationResult page) {
        this.page = page;
    }

    public List<ProductOfferingType> getProductOffering() {
        return productOffering;
    }

    public void setProductOffering(List<ProductOfferingType> productOffering) {
        this.productOffering = productOffering;
    }

}
