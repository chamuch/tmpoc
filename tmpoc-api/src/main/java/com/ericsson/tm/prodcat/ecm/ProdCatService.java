package com.ericsson.tm.prodcat.ecm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.UriInfo;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.IProdCatEcm;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ExtensionType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.PaginationResult;
import com.ericsson.tm.prodcat.ecm.entities.msdp.PriceType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryId;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryList;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingResultList;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.SpecificationType;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class ProdCatService implements IProdCatEcm {
    
    private HashMap<String,ArrayList<Product>> categories = new HashMap<String, ArrayList<Product>>();
    
	
	public ProdCatService() {
		System.out.println("Prodcat ecm bean initialized!!");
	}

	@Override
	public ProductCategoryType getAllProductCategories() {
		ProductCategoryType response = new ProductCategoryType();
		ProductCategoryList prodCategoryList = new ProductCategoryList();
		
		IProdCatDiscovery localDiscovery = SpringHelper.getProductCatalogForDiscovery();
		System.out.println("localDiscovery instance initialized: " + (localDiscovery!=null));
		
		for (Product product: localDiscovery.getAllProducts()) {
			System.out.println("product (" + product.getName() + ") metas: " + product.getMetas());
			if (product.getMetas().size() > 0) {
				if (product.getMeta("Category") != null) {
					String cat = product.getMeta("Category");
					System.out.println("product (" + product.getName() + ") meta:Category found is: " + cat);
					if (!categories.containsKey(cat)) {
					    ArrayList<Product> catProds = new ArrayList<Product>();
					    catProds.add(product);
						categories.put(cat, catProds);
						
						ProductCategoryType pc = new ProductCategoryType();
						pc.setId(cat);
						pc.setName(cat);
						pc.setDescription(cat);
						pc.setRoot((product.getCompositions().size() > 0) && (product.isDiscoverable()));
						prodCategoryList.addProductCategory(pc);
					} else {
					    ArrayList<Product> catProds = categories.get(cat);
					    if (!catProds.contains(product))
					        catProds.add(product);
					}
				} else {
					System.out.println("product (" + product.getName() + ") meta:Category not found");
				}
			}
		}
		
		response.setProductCategoryList(prodCategoryList);
		return response;
		
	}

	@Override
	public ProductCategoryType getProductCategory(String categoryId) {
		ProductCategoryType response = new ProductCategoryType();
		
		// just to ensure the hashtable is initialized;
		getAllProductCategories();
		
		ProductCategoryList prodCategoryList = new ProductCategoryList();
        ArrayList<Product> catProds = categories.get(categoryId);
		for (Product product: catProds) {
		    ProductCategoryType pc = new ProductCategoryType();
		    pc.setId(product.getId());
		    pc.setName(product.getName());
		    pc.setDescription(product.getDescription());
		    pc.setRoot((product.getCompositions().size() > 0) && (product.isDiscoverable()));
            prodCategoryList.addProductCategory(pc);
		}
		
		response.setProductCategoryList(prodCategoryList);
        return response;
	}

    @Override
    public ProductOfferingType getProductOffering(String productOfferingId) {
        ProductOfferingType response = new ProductOfferingType();
        
        IProdCatDiscovery localDiscovery = SpringHelper.getProductCatalogForDiscovery();
        System.out.println("localDiscovery instance initialized: " + (localDiscovery!=null));
        
        for (Product product: localDiscovery.getAllProducts()) {
            if (productOfferingId.equals(product.getId())) {
                response.setId(productOfferingId);
                response.setName(product.getName());
                response.setDescription(product.getDescription());
                response.setBundle((product.getCompositions().size() > 0));
                
                SpecificationType specs = new SpecificationType();
                specs.setId(productOfferingId);
                specs.setName(product.getName());
                specs.setDescription(product.getDescription());
                response.setSpecification(specs);
                
                PriceType price = new PriceType();
                price.setName("Simple");
                price.setDescription("One-Time Charge for entire period");
                price.setPriceType("Subscription Charge");
                price.setRecurringChargePeriod("Refer Product Characteristics");
                price.setAmount(product.getPrice().getNumericAmount());
                price.setCurrency(product.getPrice().getIsoCurrencyCode());
                response.addPrice(price);
                
                ProductCategoryId categoryId = new ProductCategoryId();
                categoryId.setProductCategoryId(product.getMeta("Category"));
                response.addProductCategory(categoryId);

                return response;

            }
        }
        
        return response;
    }

    @Override
    public ProductOfferingResultList browseProductOffering(String categoryId, int fromItem, int maxItems, List<ExtensionType> searchCriteria) {
        ProductOfferingResultList response = new ProductOfferingResultList();
        
        // just to ensure the hashtable is initialized;
        getAllProductCategories();
        
        // 1. filter products belonging to the category...
        ArrayList<Product> catProds = categories.get(categoryId);
        
        // 1.a. clone the master filter to apply sub-filters
        ArrayList<Product> filter = new ArrayList<Product>();
        for (Product product: catProds)
            filter.add(product);
        
        // 2. check for other criteria
        //--- right now nothing
        
        
        // 3. check and make pagination
        PaginationResult page = new PaginationResult();
        if (filter.size() > fromItem) {
            for (int i=fromItem, j=1; i < (fromItem + maxItems); i++, j++) {
                if (i < filter.size()) {
                    page.setLastItem(i);
                    page.setNbrItems(j);
                    
                    Product product = filter.get(i);
                    
                    ProductOfferingType item = new ProductOfferingType();
                    item.setId(product.getId());
                    item.setName(product.getName());
                    item.setDescription(product.getDescription());
                    item.setBundle((product.getCompositions().size() > 0));
                    
                    SpecificationType specs = new SpecificationType();
                    specs.setId(product.getId());
                    specs.setName(product.getName());
                    specs.setDescription(product.getDescription());
                    item.setSpecification(specs);
                    
                    PriceType price = new PriceType();
                    price.setName("Simple");
                    price.setDescription("One-Time Charge for entire period");
                    price.setPriceType("Subscription Charge");
                    price.setRecurringChargePeriod("Refer Product Characteristics");
                    price.setAmount(product.getPrice().getNumericAmount());
                    price.setCurrency(product.getPrice().getIsoCurrencyCode());
                    item.addPrice(price);
                    
                    ProductCategoryId prodCategoryId = new ProductCategoryId();
                    prodCategoryId.setProductCategoryId(product.getMeta("Category"));
                    item.addProductCategory(prodCategoryId);
                    
                    response.addProductOffering(item);
                } else {
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("fromItem was more than the filtered results for product search criteria");
        }
        
        response.setPage(page);
        return response;
    }
	
	
	
}
