package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.List;

public class CharacteristicsType {

    private String                    name                 = null; // M
    private String                    valueType            = null; // M
    private List<Description>         descriptions         = null; // O
    private List<CharacteristicValue> characteristicValues = null; // O

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<CharacteristicValue> getCharacteristicValues() {
        return characteristicValues;
    }

    public void setCharacteristicValues(List<CharacteristicValue> characteristicValues) {
        this.characteristicValues = characteristicValues;
    }

}
