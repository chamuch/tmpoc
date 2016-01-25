/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.ericsson.tm.prodcat.ecm.entities.product;


import java.util.List;

import com.ericsson.tm.prodcat.ecm.entities.AbstractECMModel;
import com.ericsson.tm.prodcat.ecm.entities.datatype.Attachment;
import com.ericsson.tm.prodcat.ecm.entities.datatype.Image;


/**
 * com.ericsson.ecm.ProductDomain.ProductSpecificationABE
 * 
 * @author ezhaboy
 * @version $Revision: $
 */
public class ProductSpecification extends AbstractECMModel {

    private String productNumber;

    private String family;
    private String category;
    private Boolean shared;
    private String tariffTimeTimeZoneType;

    private List<Attachment> documents;
    private List<Image> media;

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public String getTariffTimeTimeZoneType() {
        return tariffTimeTimeZoneType;
    }

    public void setTariffTimeTimeZoneType(String tariffTimeTimeZoneType) {
        this.tariffTimeTimeZoneType = tariffTimeTimeZoneType;
    }

    @Override
    public String getIdPropertyName() {
        return "productNumber";
    }

    @Override
    public String getIdPropertyValue() {
        return getProductNumber();
    }

    public List<Attachment> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Attachment> documents) {
        this.documents = documents;
    }

    public List<Image> getMedia() {
        return media;
    }

    public void setMedia(List<Image> media) {
        this.media = media;
    }
}
