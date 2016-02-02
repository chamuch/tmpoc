package com.ericsson.tm.prodcat.ecm.entities.msdp;

import java.util.List;

public class PriceType {

    private String              name                  = null; // M
    private String              description           = null; // M
    private String              priceType             = null; // M
    private String              unitOfMeasure         = null; // M
    private String              recurringChargePeriod = null; // M
    private float               amount                = 0;    // M
    private String              currency              = null; // M
    
    private List<ExtensionType> extensions            = null; // O
    private CharacteristicsType characteristics       = null; // O

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

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    public void setRecurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<ExtensionType> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<ExtensionType> extensions) {
        this.extensions = extensions;
    }

    public CharacteristicsType getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(CharacteristicsType characteristics) {
        this.characteristics = characteristics;
    }

}
