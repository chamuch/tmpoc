/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */
 
package com.ericsson.tm.prodcat.ecm.entities.product;

import java.util.List;
 
/**
 *
 * @author eehklln
 * @version $Revision: $
 */
public class DiscountInformation {

    /** Revision of the class */
    public static final String _REV_ID_ = "$Revision: $";
    
    private String discountType;
    private List<String> discountTargetType;
    
    private String targetItemCode;
    private String targetItemCharge;
    
    public String getDiscountType() {
        return discountType;
    }
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }
    public List<String> getDiscountTargetType() {
        return discountTargetType;
    }
    public void setDiscountTargetType(List<String> discountTargetType) {
        this.discountTargetType = discountTargetType;
    }
    public String getTargetItemCode() {
        return targetItemCode;
    }
    public void setTargetItemCode(String targetItemCode) {
        this.targetItemCode = targetItemCode;
    }
    public String getTargetItemCharge() {
        return targetItemCharge;
    }
    public void setTargetItemCharge(String targetItemCharge) {
        this.targetItemCharge = targetItemCharge;
    }
}
