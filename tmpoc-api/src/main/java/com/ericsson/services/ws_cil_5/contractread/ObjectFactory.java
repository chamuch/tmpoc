
package com.ericsson.services.ws_cil_5.contractread;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.services.ws_cil_5.contractread package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContractReadRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/contractread", "contractReadRequest");
    private final static QName _ContractReadResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/contractread", "contractReadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.services.ws_cil_5.contractread
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicesResponse }
     * 
     */
    public ServicesResponse createServicesResponse() {
        return new ServicesResponse();
    }

    /**
     * Create an instance of {@link RelatedContractsListpartResponse }
     * 
     */
    public RelatedContractsListpartResponse createRelatedContractsListpartResponse() {
        return new RelatedContractsListpartResponse();
    }

    /**
     * Create an instance of {@link ServicesListpartResponse }
     * 
     */
    public ServicesListpartResponse createServicesListpartResponse() {
        return new ServicesListpartResponse();
    }

    /**
     * Create an instance of {@link ContractReadResponse }
     * 
     */
    public ContractReadResponse createContractReadResponse() {
        return new ContractReadResponse();
    }

    /**
     * Create an instance of {@link RelatedContractsResponse }
     * 
     */
    public RelatedContractsResponse createRelatedContractsResponse() {
        return new RelatedContractsResponse();
    }

    /**
     * Create an instance of {@link ContractReadRequest }
     * 
     */
    public ContractReadRequest createContractReadRequest() {
        return new ContractReadRequest();
    }

    /**
     * Create an instance of {@link InputAttributes }
     * 
     */
    public InputAttributes createInputAttributes() {
        return new InputAttributes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractReadRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/contractread", name = "contractReadRequest")
    public JAXBElement<ContractReadRequest> createContractReadRequest(ContractReadRequest value) {
        return new JAXBElement<ContractReadRequest>(_ContractReadRequest_QNAME, ContractReadRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/contractread", name = "contractReadResponse")
    public JAXBElement<ContractReadResponse> createContractReadResponse(ContractReadResponse value) {
        return new JAXBElement<ContractReadResponse>(_ContractReadResponse_QNAME, ContractReadResponse.class, null, value);
    }

}
