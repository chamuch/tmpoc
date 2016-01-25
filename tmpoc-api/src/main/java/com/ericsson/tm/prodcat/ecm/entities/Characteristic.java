/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities;

import java.util.List;

/**
 * 
 * @author ewwixxg
 * @version $Revision: $
 */
public class Characteristic {

    /** Revision of the class */
    public static final String _REV_ID_ = "$Revision: $";

    private String id;
    private List<CharacteristicVersion> versions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CharacteristicVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<CharacteristicVersion> versions) {
        this.versions = versions;
    }

}
