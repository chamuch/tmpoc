package com.ericsson.tm.web;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ecmRT/v2/")
public class EcmProdcatEndpoint {	
	
	@GET
	@Path("/productCategory/")
	@Produces(MediaType.TEXT_PLAIN)
	public void getAllProducts() {
		System.out.println("GetAllProducts Hit");
	}
	
	@GET
	@Path("/productCategory/{productCategoryId}")
	@Consumes("application/json")
	public void getProductCategory(byte[] object) {
		System.out.println("Product Category");
	}
}
