package com.ericsson.tm.cbio.customerread;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.12-soa-02
 * Tue Jan 26 11:27:27 CST 2016
 * Generated source version: 2.2.12-soa-02
 * 
 */
 
@WebService(targetNamespace = "http://ericsson.com/services/ws_CIL_5", name = "CustomerReadService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerReadService {

    @WebResult(name = "customerReadResponse", targetNamespace = "http://ericsson.com/services/ws_CIL_5/customerread", partName = "customerReadResponse")
    @WebMethod
    public CustomerReadResponse customerRead(
        @WebParam(partName = "customerReadRequest", name = "customerReadRequest", targetNamespace = "http://ericsson.com/services/ws_CIL_5/customerread")
        CustomerReadRequest customerReadRequest
    );
}