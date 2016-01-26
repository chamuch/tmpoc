package com.ericsson.tm.web;


import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ericsson.tm.prodcat.ecm.entities.ProductCategory;

@Path("/ecmRT/v2/")
@WebService
public interface EcmProdcatEndpoint {	
	
	@GET
	@Path("/productCategory/")
	@Produces("application/json")
	public List<ProductCategory> getAllProductCategories();
	
	@GET
	@Path("/productCategory/{productCategoryId}")
	@Produces("application/json")
	public ProductCategory getProductCategory(@PathParam ("productCategoryId") String productCategoryId);

}
