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
public class Commentary {

    /** Revision of the class */
    public static final String _REV_ID_ = "$Revision: $";
    private String itemDescriptionCode;
    private String description;
    private String category;
    private boolean cancel;
    private String type;
    private String classificationTypes;
    public String getItemDescriptionCode() {
        return itemDescriptionCode;
    }
    public void setItemDescriptionCode(String itemDescriptionCode) {
        this.itemDescriptionCode = itemDescriptionCode;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isCancel() {
        return cancel;
    }
    public void setCancel(boolean cancel) {
        this.cancel = cancel;
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
