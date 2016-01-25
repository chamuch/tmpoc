/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */
 
package com.ericsson.tm.prodcat.ecm.entities;

import java.util.List;
 
/**
 *
 * @author elouzou
 * @version $Revision: $
 */
public class Result <T>{

    private String id;
    private List<T> versions;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<T> getVersions() {
        return versions;
    }
    public void setVersions(List<T> versions) {
        this.versions = versions;
    }
    
}
