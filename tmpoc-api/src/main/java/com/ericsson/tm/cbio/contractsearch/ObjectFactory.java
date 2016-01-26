
package com.ericsson.tm.cbio.contractsearch;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.tm.cbio package. 
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

    private final static QName _ContractsSearchResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/contractssearch", "contractsSearchResponse");
    private final static QName _ContractsSearchRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/contractssearch", "contractsSearchRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.tm.cbio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesChannelsResponse }
     * 
     */
    public SalesChannelsResponse createSalesChannelsResponse() {
        return new SalesChannelsResponse();
    }

    /**
     * Create an instance of {@link TypesRequest }
     * 
     */
    public TypesRequest createTypesRequest() {
        return new TypesRequest();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link SessionChangeRequest }
     * 
     */
    public SessionChangeRequest createSessionChangeRequest() {
        return new SessionChangeRequest();
    }

    /**
     * Create an instance of {@link InputAttributes }
     * 
     */
    public InputAttributes createInputAttributes() {
        return new InputAttributes();
    }

    /**
     * Create an instance of {@link ValuesListpartRequest }
     * 
     */
    public ValuesListpartRequest createValuesListpartRequest() {
        return new ValuesListpartRequest();
    }

    /**
     * Create an instance of {@link ContractsListpartResponse }
     * 
     */
    public ContractsListpartResponse createContractsListpartResponse() {
        return new ContractsListpartResponse();
    }

    /**
     * Create an instance of {@link ContractsSearchRequest }
     * 
     */
    public ContractsSearchRequest createContractsSearchRequest() {
        return new ContractsSearchRequest();
    }

    /**
     * Create an instance of {@link DirnumBlocksResponse }
     * 
     */
    public DirnumBlocksResponse createDirnumBlocksResponse() {
        return new DirnumBlocksResponse();
    }

    /**
     * Create an instance of {@link DirnumBlocksListpartResponse }
     * 
     */
    public DirnumBlocksListpartResponse createDirnumBlocksListpartResponse() {
        return new DirnumBlocksListpartResponse();
    }

    /**
     * Create an instance of {@link ContractsSearchResponse }
     * 
     */
    public ContractsSearchResponse createContractsSearchResponse() {
        return new ContractsSearchResponse();
    }

    /**
     * Create an instance of {@link Svlany }
     * 
     */
    public Svlany createSvlany() {
        return new Svlany();
    }

    /**
     * Create an instance of {@link ValuesRequest }
     * 
     */
    public ValuesRequest createValuesRequest() {
        return new ValuesRequest();
    }

    /**
     * Create an instance of {@link ContractsResponse }
     * 
     */
    public ContractsResponse createContractsResponse() {
        return new ContractsResponse();
    }

    /**
     * Create an instance of {@link ParameterValuesRequest }
     * 
     */
    public ParameterValuesRequest createParameterValuesRequest() {
        return new ParameterValuesRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractsSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/contractssearch", name = "contractsSearchResponse")
    public JAXBElement<ContractsSearchResponse> createContractsSearchResponse(ContractsSearchResponse value) {
        return new JAXBElement<ContractsSearchResponse>(_ContractsSearchResponse_QNAME, ContractsSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractsSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/contractssearch", name = "contractsSearchRequest")
    public JAXBElement<ContractsSearchRequest> createContractsSearchRequest(ContractsSearchRequest value) {
        return new JAXBElement<ContractsSearchRequest>(_ContractsSearchRequest_QNAME, ContractsSearchRequest.class, null, value);
    }

}
