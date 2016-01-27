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

	public com.ericsson.services.ws_cil_5.customerread.CustomerReadResponse customerRead(
			com.ericsson.services.ws_cil_5.customerread.CustomerReadRequest customerReadRequest) {
		return null;
	}

	public com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchResponse contractsSearch(
			com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchRequest contractsSearchRequest) {
		return null;
	}

	public com.ericsson.services.ws_cil_5.paymentarrangementsread.PaymentArrangementsReadResponse paymentArrangementsRead(
			com.ericsson.services.ws_cil_5.paymentarrangementsread.PaymentArrangementsReadRequest paymentArrangementsReadRequest) {
		return null;
	}

	public com.ericsson.services.ws_cil_5.contractread.ContractReadResponse contractRead(
			com.ericsson.services.ws_cil_5.contractread.ContractReadRequest contractReadRequest) {
		return null;
	}

	public com.ericsson.services.ws_cil_5.servicesread.ServicesReadResponse servicesRead(
			com.ericsson.services.ws_cil_5.servicesread.ServicesReadRequest servicesReadRequest) {
		return null;
	}

	public com.ericsson.services.ws_cil_5.servicepackagesread.ServicePackagesReadResponse servicePackagesRead(
			com.ericsson.services.ws_cil_5.servicepackagesread.ServicePackagesReadRequest servicePackagesReadRequest) {
		return null;
	}

	public com.ericsson.services.ws_cil_5.rateplansread.RateplansReadResponse rateplansRead(
			com.ericsson.services.ws_cil_5.rateplansread.RateplansReadRequest rateplansReadRequest) {
		return null;
	}
}