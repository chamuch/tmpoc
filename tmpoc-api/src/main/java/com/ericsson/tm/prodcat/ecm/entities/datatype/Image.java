/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */
 
package com.ericsson.tm.prodcat.ecm.entities.datatype;
 
/**
 *
 * @author ejiamei
 * @version $Revision: $
 */
public class Image {

    /** Revision of the class */
    public static final String _REV_ID_ = "$Revision: $";
    private String name;
    private String value;
    private String type;
    private String imageCode;
    private String imageType;
    private String imageSize;
    private boolean cancel;
    private String classificationTypes;
    private String category;
    private String URL;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getImageCode() {
        return imageCode;
    }
    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }
    public String getImageType() {
        return imageType;
    }
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
    public String getImageSize() {
        return imageSize;
    }
    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }
    public boolean isCancel() {
        return cancel;
    }
    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }
    public String getClassificationTypes() {
        return classificationTypes;
    }
    public void setClassificationTypes(String classificationTypes) {
        this.classificationTypes = classificationTypes;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
}
