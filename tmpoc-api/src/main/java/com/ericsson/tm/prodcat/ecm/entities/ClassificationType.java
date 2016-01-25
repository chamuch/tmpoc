/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2015 by Ericsson, all rights reserved.
 */
 
package com.ericsson.tm.prodcat.ecm.entities;
 
/**
 *
 * @author ejiamei
 * @version $Revision: $
 */
public class ClassificationType {

    /** Revision of the class */
    public static final String _REV_ID_ = "$Revision: $";
    private String value;
    private boolean isSelected;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public boolean getIsSelected() {
        return isSelected;
    }
    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}
