package com.ericsson.tm.web;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ecmRT/v2/")
public class EcmProdcatEndpoint {	
	
	@GET
	@Path("/productCategory/")
	public void getAllProducts(byte[] object) {

	}
	
	

}
