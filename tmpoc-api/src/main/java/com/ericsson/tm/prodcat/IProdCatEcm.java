package com.ericsson.tm.prodcat;

import java.util.List;

import javax.ws.rs.core.UriInfo;

import com.ericsson.tm.prodcat.ecm.entities.msdp.ExtensionType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingResultList;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingType;

public interface IProdCatEcm {

	public ProductCategoryType getAllProductCategories();

	public ProductCategoryType getProductCategory(String categoryId);

    public ProductOfferingType getProductOffering(String productOfferingId);

    public ProductOfferingResultList browseProductOffering(String categoryId, int fromItem, int maxItems, List<ExtensionType> searchCriteria);

}
