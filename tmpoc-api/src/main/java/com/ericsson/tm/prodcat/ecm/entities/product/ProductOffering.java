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
import com.ericsson.tm.prodcat.ecm.entities.ProductCategory;
import com.ericsson.tm.prodcat.ecm.entities.datatype.Attachment;
import com.ericsson.tm.prodcat.ecm.entities.datatype.Image;


/**
 * com.ericsson.ecm.ProductDomain.ProductOfferingABE
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class ProductOffering extends AbstractECMModel {

    private String family;
    private String category;
    private Boolean sellIndicator;
    private Boolean sharedIndicator;

    private List<ProductCategory> productCategories;
    private List<ProductOfferingPrice> productOfferingPrices;

    private List<Attachment> documents;
    private List<Image> media;
    private List<String> rules;
    private List<String> groups;
    private List<String> marketSegmetRules;
    private List<String> actions;
    private List<String> businessDates;
    private List<String> domains;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getSellIndicator() {
        return sellIndicator;
    }

    public void setSellIndicator(Boolean sellIndicator) {
        this.sellIndicator = sellIndicator;
    }

    public Boolean getSharedIndicator() {
        return sharedIndicator;
    }

    public void setSharedIndicator(Boolean sharedIndicator) {
        this.sharedIndicator = sharedIndicator;
    }

    public List<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    public void setProductOfferingPrices(List<ProductOfferingPrice> productOfferingPrices) {
        this.productOfferingPrices = productOfferingPrices;
    }

    public List<ProductOfferingPrice> getProductOfferingPrices() {
        return productOfferingPrices;
    }

    public List<Attachment> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Attachment> documents) {
        this.documents = documents;
    }

    public List<Image> getMedia() {
        return media;
    }

    public void setMedia(List<Image> media) {
        this.media = media;
    }

    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public List<String> getMarketSegmetRules() {
        return marketSegmetRules;
    }

    public void setMarketSegmetRules(List<String> marketSegmetRules) {
        this.marketSegmetRules = marketSegmetRules;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public List<String> getBusinessDates() {
        return businessDates;
    }

    public void setBusinessDates(List<String> businessDates) {
        this.businessDates = businessDates;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
}
