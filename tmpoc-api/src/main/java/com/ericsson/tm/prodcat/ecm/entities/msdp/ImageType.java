package com.ericsson.tm.prodcat.ecm.entities.msdp;

public class ImageType {

    private String name                = null;
    private String url                 = null;
    private String type                = null;
    private String imageSize           = null;
    private String imageType           = null;
    private String classificationTypes = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getClassificationTypes() {
        return classificationTypes;
    }

    public void setClassificationTypes(String classificationTypes) {
        this.classificationTypes = classificationTypes;
    }

}
