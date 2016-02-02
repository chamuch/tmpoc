package com.ericsson.tm.prodcat.ecm.entities.msdp;

public class CommentaryType {

    private String description         = null;
    private String type                = null;
    private String classificationTypes = null;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassificationTypes() {
        return classificationTypes;
    }

    public void setClassificationTypes(String classificationTypes) {
        this.classificationTypes = classificationTypes;
    }

}
