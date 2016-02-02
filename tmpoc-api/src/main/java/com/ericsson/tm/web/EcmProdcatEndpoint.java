package com.ericsson.tm.web;



import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ericsson.tm.prodcat.ecm.entities.msdp.ExtensionType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductCategoryType;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingResultList;
import com.ericsson.tm.prodcat.ecm.entities.msdp.ProductOfferingType;


@Path("/ecmRT/v2/")
@WebService
public interface EcmProdcatEndpoint {	
	
	@GET
	@Path("/productCategory/")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductCategoryType getAllProductCategories();
	
	@GET
	@Path("/productCategory/{productCategoryId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductCategoryType getProductCategory(@PathParam ("productCategoryId") String productCategoryId);
	
	@GET
    @Path("/productOffering/{productOfferingId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductOfferingType getProductOffering(@PathParam ("productOfferingId") String productOfferingId);
	
	@GET
	@Path("/browseProductOffering/?")
	@Produces(MediaType.APPLICATION_JSON)
//	public ProductOfferingResultList browseProductOfferings(@Context UriInfo queryParams);
    public ProductOfferingResultList browseProductOfferings(@QueryParam ("categoryId") String categoryId,
                                                            @DefaultValue ("0") @QueryParam ("fromItem") int fromItem,
                                                            @DefaultValue ("10") @QueryParam ("maxItems") int maxItems,  
                                                            List<ExtensionType> searchCriteria); 

}
