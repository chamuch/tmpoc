package com.ericsson.services.ws_cil_5.impl;


import javax.xml.bind.annotation.XmlSeeAlso;
import com.ericsson.services.ws_cil_5.*;
import javax.jws.WebService;

@WebService(serviceName = "ContractsSearchService", endpointInterface = "com.ericsson.services.ws_cil_5.ContractsSearchService", targetNamespace = "http://ericsson.com/services/ws_CIL_5")
public class ContractsSearchServiceImpl implements ContractsSearchService {
	public com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchResponse contractsSearch(
			com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchRequest contractsSearchRequest) {
		return null;
	}
}