
package com.ericsson.tm.cbio.servicesread;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.tm.cbio.servicesread package. 
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

    private final static QName _ServicesReadResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/servicesread", "servicesReadResponse");
    private final static QName _ServicesReadRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/servicesread", "servicesReadRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.tm.cbio.servicesread
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicesReadResponse }
     * 
     */
    public ServicesReadResponse createServicesReadResponse() {
        return new ServicesReadResponse();
    }

    /**
     * Create an instance of {@link NumSvListpartResponse }
     * 
     */
    public NumSvListpartResponse createNumSvListpartResponse() {
        return new NumSvListpartResponse();
    }

    /**
     * Create an instance of {@link ChargesListpartResponse }
     * 
     */
    public ChargesListpartResponse createChargesListpartResponse() {
        return new ChargesListpartResponse();
    }

    /**
     * Create an instance of {@link SvMappingListpartResponse }
     * 
     */
    public SvMappingListpartResponse createSvMappingListpartResponse() {
        return new SvMappingListpartResponse();
    }

    /**
     * Create an instance of {@link IntSvListpartResponse }
     * 
     */
    public IntSvListpartResponse createIntSvListpartResponse() {
        return new IntSvListpartResponse();
    }

    /**
     * Create an instance of {@link ChargesResponse }
     * 
     */
    public ChargesResponse createChargesResponse() {
        return new ChargesResponse();
    }

    /**
     * Create an instance of {@link NumSvResponse }
     * 
     */
    public NumSvResponse createNumSvResponse() {
        return new NumSvResponse();
    }

    /**
     * Create an instance of {@link ServicesReadRequest }
     * 
     */
    public ServicesReadRequest createServicesReadRequest() {
        return new ServicesReadRequest();
    }

    /**
     * Create an instance of {@link ValuesRequest }
     * 
     */
    public ValuesRequest createValuesRequest() {
        return new ValuesRequest();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link ResourcesResponse }
     * 
     */
    public ResourcesResponse createResourcesResponse() {
        return new ResourcesResponse();
    }

    /**
     * Create an instance of {@link InputAttributes }
     * 
     */
    public InputAttributes createInputAttributes() {
        return new InputAttributes();
    }

    /**
     * Create an instance of {@link NumActionResponse }
     * 
     */
    public NumActionResponse createNumActionResponse() {
        return new NumActionResponse();
    }

    /**
     * Create an instance of {@link SessionChangeRequest }
     * 
     */
    public SessionChangeRequest createSessionChangeRequest() {
        return new SessionChangeRequest();
    }

    /**
     * Create an instance of {@link IntSvResponse }
     * 
     */
    public IntSvResponse createIntSvResponse() {
        return new IntSvResponse();
    }

    /**
     * Create an instance of {@link ValuesListpartRequest }
     * 
     */
    public ValuesListpartRequest createValuesListpartRequest() {
        return new ValuesListpartRequest();
    }

    /**
     * Create an instance of {@link ResourcesListpartResponse }
     * 
     */
    public ResourcesListpartResponse createResourcesListpartResponse() {
        return new ResourcesListpartResponse();
    }

    /**
     * Create an instance of {@link SvMappingResponse }
     * 
     */
    public SvMappingResponse createSvMappingResponse() {
        return new SvMappingResponse();
    }

    /**
     * Create an instance of {@link Svlany }
     * 
     */
    public Svlany createSvlany() {
        return new Svlany();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicesReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/servicesread", name = "servicesReadResponse")
    public JAXBElement<ServicesReadResponse> createServicesReadResponse(ServicesReadResponse value) {
        return new JAXBElement<ServicesReadResponse>(_ServicesReadResponse_QNAME, ServicesReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicesReadRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/servicesread", name = "servicesReadRequest")
    public JAXBElement<ServicesReadRequest> createServicesReadRequest(ServicesReadRequest value) {
        return new JAXBElement<ServicesReadRequest>(_ServicesReadRequest_QNAME, ServicesReadRequest.class, null, value);
    }

}
