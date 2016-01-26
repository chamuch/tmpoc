package com.ericsson.services.ws_cil_5.impl;


import javax.xml.bind.annotation.XmlSeeAlso;
import com.ericsson.services.ws_cil_5.*;
import javax.jws.WebService;

@WebService(serviceName = "SoaService", endpointInterface = "com.ericsson.services.ws_cil_5.SoaService", targetNamespace = "http://ericsson.com/services/ws_CIL_5")
public class SoaServiceImpl implements SoaService {
	public com.ericsson.services.ws_cil_5.addressesread.AddressesReadResponse addressesRead(
			com.ericsson.services.ws_cil_5.addressesread.AddressesReadRequest addressesReadRequest) {
		return null;
	}

	public com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchResponse contractsSearch(
			com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchRequest contractsSearchRequest) {
		return null;
	}
}