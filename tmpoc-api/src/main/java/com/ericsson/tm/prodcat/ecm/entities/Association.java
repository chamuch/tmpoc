/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities;

import java.util.List;

/**
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class Association {

    private String targetSpecificationId;
    private String targetSpecificationType;
    private String associationType;

    private List<CharacteristicValue> characteristics;

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public void setCharacteristics(List<CharacteristicValue> characteristics) {
        this.characteristics = characteristics;
    }

    public void setTargetSpecificationId(String targetSpecificationId) {
        this.targetSpecificationId = targetSpecificationId;
    }

    public void setTargetSpecificationType(String targetSpecificationType) {
        this.targetSpecificationType = targetSpecificationType;
    }

    public String getAssociationType() {
        return associationType;
    }

    public List<CharacteristicValue> getCharacteristics() {
        return characteristics;
    }

    public String getTargetSpecificationId() {
        return targetSpecificationId;
    }

    public String getTargetSpecificationType() {
        return targetSpecificationType;
    }
}
