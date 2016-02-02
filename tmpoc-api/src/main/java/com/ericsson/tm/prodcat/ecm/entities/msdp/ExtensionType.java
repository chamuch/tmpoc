package com.ericsson.tm.prodcat.ecm.entities.msdp;

public class ExtensionType {

    private String key   = null;
    private String value = null;

    public ExtensionType(String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
