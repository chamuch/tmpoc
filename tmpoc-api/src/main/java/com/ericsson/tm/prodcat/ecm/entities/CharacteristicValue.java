/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities;

/**
 * com.ericsson.ecm.CommonBusinessEntitiesDomain.RootBusinessEntitiesABE.
 * CharacteristicABE
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class CharacteristicValue {

    private String id;
    private String value;
    private String displayValue;
    private String valueType;
    private boolean isDefault;
    private String unitOfMeasure;
    private String valueFrom;
    private String valueTo;
    private String rangeInterval;
    private int rangeStep;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom;
    }

    public String getValueTo() {
        return valueTo;
    }

    public void setValueTo(String valueTo) {
        this.valueTo = valueTo;
    }

    public String getRangeInterval() {
        return rangeInterval;
    }

    public void setRangeInterval(String rangeInterval) {
        this.rangeInterval = rangeInterval;
    }

    public int getRangeStep() {
        return rangeStep;
    }

    public void setRangeStep(int rangeStep) {
        this.rangeStep = rangeStep;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }
}
