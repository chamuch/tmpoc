package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.List;

public class CustomerFacingServiceSpecsType {

    private String                       id                  = null; // M
    private String                       name                = null; // M
    private String                       description         = null; // M
    private CharacteristicsType          characteristics     = null; // O
    private ResourceFacingSpecifications resourceFacingSpecs = null; // O
    private List<ExtensionType>          extensions          = null; // O
    private List<CommentaryType>         commentaries        = null; // O

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

    public ResourceFacingSpecifications getResourceFacingSpecs() {
        return resourceFacingSpecs;
    }

    public void setResourceFacingSpecs(ResourceFacingSpecifications resourceFacingSpecs) {
        this.resourceFacingSpecs = resourceFacingSpecs;
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

}
