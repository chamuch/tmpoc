package com.ericsson.tm.prodcat.ecm.processors;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriInfo;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ExtensionType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingResultList;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingType;
import com.ericsson.tm.web.EcmProdcatEndpoint;

public class EcmProdcatProcessor implements EcmProdcatEndpoint {

	@Override
	public ProductCategoryType getAllProductCategories() {
		System.out.println("GetAllProductCategoriesProcessor start");
		return SpringHelper.getEcmProductCatalog().getAllProductCategories();
		
	}

	@Override
	public ProductCategoryType getProductCategory(String productCategoryId) {
		System.out.println("GetProductCategoryProcessor start");
		return SpringHelper.getEcmProductCatalog().getProductCategory(productCategoryId);
		
	}

    @Override
    public ProductOfferingType getProductOffering(String productOfferingId) {
        System.out.println("GetProductOfferingProcessor start");
        return SpringHelper.getEcmProductCatalog().getProductOffering(productOfferingId);

    }

    @Override
    public ProductOfferingResultList browseProductOfferings(UriInfo queryParams) {
        System.out.println("BrowseProductOfferingProcessor start");
        
        String categoryId = queryParams.getQueryParameters().getFirst("categoryId");
        if (categoryId == null || categoryId.equals(""))
            throw new IllegalArgumentException("CategoryId parameter is missing or empty!!");
        
        String value = null;
        int fromItem = 0;
        try {
            value = queryParams.getQueryParameters().getFirst("fromItem");
            fromItem = Integer.parseInt(value);
        } catch (NullPointerException e) {
            fromItem = 0;
        } catch (Exception e) {
            throw new IllegalArgumentException("fromItem parameter was bad. Found: " + value);
        }
        
        int maxItems = 10;
        try {
            value = queryParams.getQueryParameters().getFirst("maxItems");
            maxItems = Integer.parseInt(value);
        } catch (NullPointerException e) {
            maxItems = 10;
        } catch (Exception e) {
            throw new IllegalArgumentException("maxItems parameter was bad. Found: " + value);
        }
        
        List<ExtensionType> searchCriteria = new ArrayList<ExtensionType>();
        for (String param: queryParams.getQueryParameters().keySet()) {
            if (param.equals("categoryId") || 
                    param.equals("fromItem") ||
                    param.equals("maxItems"))
                continue;
            searchCriteria.add(new ExtensionType(param, queryParams.getQueryParameters().getFirst(param)));
        }
        
        
        return SpringHelper.getEcmProductCatalog().browseProductOffering(categoryId, fromItem, maxItems, searchCriteria);

    }

	
}
