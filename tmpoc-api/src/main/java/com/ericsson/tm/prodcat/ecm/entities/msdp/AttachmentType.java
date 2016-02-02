package com.ericsson.tm.prodcat.ecm.entities.msdp;

public class AttachmentType {

    private String name     = null; // O
    private String url      = null; // O
    private String type     = null; // O
    private String mimeType = null; // O

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

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

}
