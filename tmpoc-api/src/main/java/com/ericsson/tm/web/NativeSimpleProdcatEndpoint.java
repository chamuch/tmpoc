package com.ericsson.tm.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/prodcat/")
public class NativeSimpleProdcatEndpoint {	
	
	@POST
	@Path("/getAllProducts/")
	@Consumes("application/json")
	public void getAllProducts(byte[] object) {

	}
	
	@POST
	@Path("/getProduct/")
	@Consumes("application/json")
	public void getProduct(byte[] object) {

	}
	
	@POST
	@Path("/getProductsForResource/")
	@Consumes("application/json")
	public void getProductsForResource(byte[] object) {

	}

	@POST
	@Path("/getProductsForChild/")
	@Consumes("application/json")
	public void getProductsForChild(byte[] object) {

	}

}
