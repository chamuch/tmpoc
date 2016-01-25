/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.datatype.TimePeriod;


/**
 * 
 * @author ewwixxg
 * @version $Revision: $
 */
public class CharacteristicVersion {

    /** Revision of the class */
    public static final String _REV_ID_ = "$Revision: $";

    private String id;
    private String name;
    private List<String> description;
    private String state;
    private TimePeriod validFor;
    private String type;
    private String valueType;
    private String value;
    private String displayValue;
    private boolean extensible;
    private String minCardinality;
    private String maxCardinality;
    private List<ClassificationType> properties;

    private List<CharacteristicValue> characteristicValues;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public boolean getExtensible() {
        return extensible;
    }

    public void setExtensible(boolean extensible) {
        this.extensible = extensible;
    }

    public String getMinCardinality() {
        return minCardinality;
    }

    public void setMinCardinality(String minCardinality) {
        this.minCardinality = minCardinality;
    }

    public String getMaxCardinality() {
        return maxCardinality;
    }

    public void setMaxCardinality(String maxCardinality) {
        this.maxCardinality = maxCardinality;
    }

    public List<CharacteristicValue> getCharacteristicValues() {
        if (characteristicValues == null) {
            characteristicValues = new ArrayList<CharacteristicValue>();
        }
        return characteristicValues;
    }

    public void setCharacteristicValues(List<CharacteristicValue> characteristicValues) {
        this.characteristicValues = characteristicValues;
    }

    public List<ClassificationType> getProperties() {
        return properties;
    }

    public void setProperties(List<ClassificationType> properties) {
        this.properties = properties;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
