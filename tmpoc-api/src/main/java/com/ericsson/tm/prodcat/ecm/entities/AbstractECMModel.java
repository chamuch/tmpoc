/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities;


import java.util.List;
import java.util.Map;

import com.ericsson.tm.prodcat.ecm.entities.datatype.Commentary;
import com.ericsson.tm.prodcat.ecm.entities.datatype.TimePeriod;
import com.google.gson.annotations.Expose;



/**
 * Abstract ECM model
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public abstract class AbstractECMModel {

	//@Expose(serialize=false, deserialize=false)
    private String id;
    private List<String> externalIdentifiers;

    private String name;
    private String description;
    private String state;

    private String version;
    private TimePeriod validFor;

    private String specificationType;
    private String specificationSubtype;

    private List<Characteristic> characteristics;

    private List<Map<String, Object>> associationReference;
    private List<Association> associationDefinition;
    
    private List<Commentary> commentaries;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getExternalIdentifiers() {
        return externalIdentifiers;
    }

    public void setExternalIdentifiers(List<String> externalIdentifiers) {
        this.externalIdentifiers = externalIdentifiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public String getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(String specificationType) {
        this.specificationType = specificationType;
    }

    public String getSpecificationSubtype() {
        return specificationSubtype;
    }

    public void setSpecificationSubtype(String specificationSubtype) {
        this.specificationSubtype = specificationSubtype;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    public void setAssociationDefinition(List<Association> associationDefinition) {
        this.associationDefinition = associationDefinition;
    }

    public List<Association> getAssociationDefinition() {
        return associationDefinition;
    }

    public void setAssociationReference(List<Map<String, Object>> associationReference) {
        this.associationReference = associationReference;
    }

    public List<Map<String, Object>> getAssociationReference() {
        return associationReference;
    }

    public String getIdPropertyName() {
        return "id";
    }

    public String getIdPropertyValue() {
        return getId();
    }

    public List<Commentary> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<Commentary> commentaries) {
        this.commentaries = commentaries;
    }
}
