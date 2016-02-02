package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.List;

public class SpecificationType {

    private String                         id                         = null; // M
    private String                         name                       = null; // M
    private String                         description                = null; // M
    private CharacteristicsType            characteristics            = null; // O
    private CustomerFacingServiceSpecsType customerFacingServiceSpecs = null; // O
    private ResourceSpecificationsType     resourceSpecifications     = null; // O
    private List<ExtensionType>            extensions                 = null; // O
    private List<CommentaryType>           commentaries               = null; // O
    private List<AttachmentType>           attachments                = null; // O
    private List<ImageType>                images                     = null; // O

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

    public CharacteristicsType getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(CharacteristicsType characteristics) {
        this.characteristics = characteristics;
    }

    public CustomerFacingServiceSpecsType getCustomerFacingServiceSpecs() {
        return customerFacingServiceSpecs;
    }

    public void setCustomerFacingServiceSpecs(CustomerFacingServiceSpecsType customerFacingServiceSpecs) {
        this.customerFacingServiceSpecs = customerFacingServiceSpecs;
    }

    public ResourceSpecificationsType getResourceSpecifications() {
        return resourceSpecifications;
    }

    public void setResourceSpecifications(ResourceSpecificationsType resourceSpecifications) {
        this.resourceSpecifications = resourceSpecifications;
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
