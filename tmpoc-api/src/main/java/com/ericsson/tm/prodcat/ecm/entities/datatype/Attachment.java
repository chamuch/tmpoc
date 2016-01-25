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
public class Attachment {

    /** Revision of the class */
    public static final String _REV_ID_ = "$Revision: $";
    private String name;
    private String value;
    private String type;
    private String mimeType;
    private String attachmentName;
    private String attachmentCode;
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
    public String getMimeType() {
        return mimeType;
    }
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    public String getAttachmentName() {
        return attachmentName;
    }
    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }
    public String getAttachmentCode() {
        return attachmentCode;
    }
    public void setAttachmentCode(String attachmentCode) {
        this.attachmentCode = attachmentCode;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
}
