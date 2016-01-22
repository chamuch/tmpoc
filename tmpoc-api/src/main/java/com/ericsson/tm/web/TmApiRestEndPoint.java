package com.ericsson.tm.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/TmWeb/")
public class TmApiRestEndPoint {	
	@POST
	@Path("/process/")
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes("application/json")
	public void process(byte[] object) {

	}
}
