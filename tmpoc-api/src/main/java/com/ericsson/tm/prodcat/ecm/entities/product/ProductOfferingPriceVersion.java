/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.ericsson.tm.prodcat.ecm.entities.product;


import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.AbstractECMModel;
import com.ericsson.tm.prodcat.ecm.entities.datatype.Money;


/**
 * pscm.ProductDomain.ProductOfferingABE.ProductOfferingPriceVersion
 * 
 * @author ezhaboy
 * @version $Revision: $
 */

public class ProductOfferingPriceVersion extends AbstractECMModel {

    private String plaId;
    private String popType;
    private String chargeableQuantity;
    private String unitOfMeasure;
    private Money price;
    private String frequency;
    private List<DiscountInformation> discountInformations;

    public String getPlaId() {
        return plaId;
    }

    public void setPlaId(String plaId) {
        this.plaId = plaId;
    }

    public void setPopType(String popType) {
        this.popType = popType;
    }

    public String getPopType() {
        return popType;
    }

    public String getChargeableQuantity() {
        return chargeableQuantity;
    }

    public void setChargeableQuantity(String chargeableQuantity) {
        this.chargeableQuantity = chargeableQuantity;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public List<DiscountInformation> getDiscountInformations() {
        return discountInformations;
    }

    public void setDiscountInformations(List<DiscountInformation> discountInformations) {
        this.discountInformations = discountInformations;
    }

}
