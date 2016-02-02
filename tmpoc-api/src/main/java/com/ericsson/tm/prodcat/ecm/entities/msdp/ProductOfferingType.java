package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.ArrayList;
import java.util.List;

public class ProductOfferingType {

    private String                  id                = null;  // M
    private String                  name              = null;  // M
    private String                  description       = null;  // M
    private boolean                 isBundle          = false; // M
    private SpecificationType       specification     = null;  // M
    private List<PriceType>         prices            = null;  // M
    private List<ProductCategoryId> productCategories = null;  // M
    
    private List<BundeOfferingId>   bundleOfferings   = null;  // O
    private CharacteristicsType     characteristics   = null;  // O
    private List<ExtensionType>     extensions        = null;  // O
    private List<CommentaryType>    commentaries      = null;  // O
    private List<AttachmentType>    attachments       = null;  // O
    private List<ImageType>         images            = null;  // O

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

    public boolean isBundle() {
        return isBundle;
    }

    public void setBundle(boolean isBundle) {
        this.isBundle = isBundle;
    }

    public SpecificationType getSpecification() {
        return specification;
    }

    public void setSpecification(SpecificationType specification) {
        this.specification = specification;
    }

    public List<PriceType> getPrices() {
        return prices;
    }

    public void setPrices(List<PriceType> prices) {
        this.prices = prices;
    }
    
    public void addPrice(PriceType price) {
        if (this.prices == null)
            this.prices = new ArrayList<PriceType>();
        
        this.prices.add(price);
    }

    public List<ProductCategoryId> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<ProductCategoryId> productCategories) {
        this.productCategories = productCategories;
    }
    
    public void addProductCategory(ProductCategoryId category) {
        if (this.productCategories ==  null)
            this.productCategories = new ArrayList<ProductCategoryId>();
        
        this.productCategories.add(category);
    }

    public List<BundeOfferingId> getBundleOfferings() {
        return bundleOfferings;
    }

    public void setBundleOfferings(List<BundeOfferingId> bundleOfferings) {
        this.bundleOfferings = bundleOfferings;
    }

    public CharacteristicsType getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(CharacteristicsType characteristics) {
        this.characteristics = characteristics;
    }

    public List<ExtensionType> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<ExtensionType> extensions) {
        this.extensions = extensions;
    }

    public List<CommentaryType> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<CommentaryType> commentaries) {
        this.commentaries = commentaries;
    }

    public List<AttachmentType> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentType> attachments) {
        this.attachments = attachments;
    }

    public List<ImageType> getImages() {
        return images;
    }

    public void setImages(List<ImageType> images) {
        this.images = images;
    }

}
