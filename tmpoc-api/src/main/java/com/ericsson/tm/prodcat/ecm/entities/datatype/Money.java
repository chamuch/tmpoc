/*
 * $HeadURL: $
 * $Id: $
 * Copyright (c) 2014 by Ericsson, all rights reserved.
 */

package com.ericsson.tm.prodcat.ecm.entities.datatype;

/**
 * 
 * ecm.CommonBusinessEntitiesDomain.DataTypes.Money
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class Money {

    private String amount;
    private CurrencyCode units;

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUnits(CurrencyCode units) {
        this.units = units;
    }

    public String getAmount() {
        return amount;
    }

    public CurrencyCode getUnits() {
        return units;
    }
}
