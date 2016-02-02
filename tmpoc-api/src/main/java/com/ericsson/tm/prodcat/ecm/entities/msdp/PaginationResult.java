package com.ericsson.tm.prodcat.ecm.entities.msdp;

public class PaginationResult {

    private int lastItem = 0;
    private int nbrItems = 0;

    public int getLastItem() {
        return lastItem;
    }

    public void setLastItem(int lastItem) {
        this.lastItem = lastItem;
    }

    public int getNbrItems() {
        return nbrItems;
    }

    public void setNbrItems(int nbrItems) {
        this.nbrItems = nbrItems;
    }

}
