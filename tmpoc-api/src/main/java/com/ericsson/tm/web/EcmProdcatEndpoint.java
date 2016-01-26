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
	@Produces(MediaType.TEXT_PLAIN)
	public List<ProductCategory> getAllProductCategories();
//	{
//		System.out.println("All Product Category");
//	}
	
	@GET
	@Path("/productCategory/{productCategoryId}")
	@Produces("application/json")
	public ProductCategory getProductCategory(@PathParam ("productCategoryId") String productCategoryId);
//	{
//		System.out.println("Product Category");
//	}
}
