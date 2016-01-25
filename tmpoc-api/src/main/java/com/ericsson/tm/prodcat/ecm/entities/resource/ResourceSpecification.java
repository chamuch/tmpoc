/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities.resource;

import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.AbstractECMModel;
import com.ericsson.tm.prodcat.ecm.entities.datatype.Attachment;
import com.ericsson.tm.prodcat.ecm.entities.datatype.Image;


/**
 * com.ericsson.ecm.ResourceDomain.ResourceSpecificationABE
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class ResourceSpecification extends AbstractECMModel {

    private List<String> rules;
    private List<String> resourceRole;
    private List<String> groups;
    private List<String> actions;
    private List<String> domains;    
    private List<Attachment> documents;
    private List<Image> media;

    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public List<String> getResourceRole() {
        return resourceRole;
    }

    public void setResourceRole(List<String> resourceRole) {
        this.resourceRole = resourceRole;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public List<Attachment> getDocuments() {
        return documents;
    }

    public List<Image> getMedia() {
        return media;
    }

    public void setDocuments(List<Attachment> documents) {
        this.documents = documents;
    }

    public void setMedia(List<Image> media) {
        this.media = media;
    }
}
