package com.ericsson.services.ws_cil_5;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.12-patch-04
 * Tue Jan 26 19:58:01 SGT 2016
 * Generated source version: 2.2.12-patch-04
 * 
 */
 
@WebService(targetNamespace = "http://ericsson.com/services/ws_CIL_5", name = "ContractsSearchService")
@XmlSeeAlso({com.lhsgroup.lhsws.money.ObjectFactory.class, com.lhsgroup.lhsws.svlany.ObjectFactory.class, com.ericsson.services.ws_cil_5.contractssearch.ObjectFactory.class, com.ericsson.services.ws_cil_5.sessionchange.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ContractsSearchService {

    @WebResult(name = "contractsSearchResponse", targetNamespace = "http://ericsson.com/services/ws_CIL_5/contractssearch", partName = "contractsSearchResponse")
    @WebMethod
    public com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchResponse contractsSearch(
        @WebParam(partName = "contractsSearchRequest", name = "contractsSearchRequest", targetNamespace = "http://ericsson.com/services/ws_CIL_5/contractssearch")
        com.ericsson.services.ws_cil_5.contractssearch.ContractsSearchRequest contractsSearchRequest
    );
}