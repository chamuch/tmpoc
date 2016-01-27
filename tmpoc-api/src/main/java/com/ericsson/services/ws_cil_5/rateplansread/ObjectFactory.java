
package com.ericsson.services.ws_cil_5.rateplansread;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.services.ws_cil_5.rateplansread package. 
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

    private final static QName _RateplansReadResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/rateplansread", "rateplansReadResponse");
    private final static QName _RateplansReadRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/rateplansread", "rateplansReadRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.services.ws_cil_5.rateplansread
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InputAttributes }
     * 
     */
    public InputAttributes createInputAttributes() {
        return new InputAttributes();
    }

    /**
     * Create an instance of {@link SharedAccountPackagesListpartResponse }
     * 
     */
    public SharedAccountPackagesListpartResponse createSharedAccountPackagesListpartResponse() {
        return new SharedAccountPackagesListpartResponse();
    }

    /**
     * Create an instance of {@link RateplansReadResponse }
     * 
     */
    public RateplansReadResponse createRateplansReadResponse() {
        return new RateplansReadResponse();
    }

    /**
     * Create an instance of {@link NumRpResponse }
     * 
     */
    public NumRpResponse createNumRpResponse() {
        return new NumRpResponse();
    }

    /**
     * Create an instance of {@link RateplansReadRequest }
     * 
     */
    public RateplansReadRequest createRateplansReadRequest() {
        return new RateplansReadRequest();
    }

    /**
     * Create an instance of {@link CreditLimitsResponse }
     * 
     */
    public CreditLimitsResponse createCreditLimitsResponse() {
        return new CreditLimitsResponse();
    }

    /**
     * Create an instance of {@link NumRpListpartResponse }
     * 
     */
    public NumRpListpartResponse createNumRpListpartResponse() {
        return new NumRpListpartResponse();
    }

    /**
     * Create an instance of {@link SharedAccountPackagesResponse }
     * 
     */
    public SharedAccountPackagesResponse createSharedAccountPackagesResponse() {
        return new SharedAccountPackagesResponse();
    }

    /**
     * Create an instance of {@link CreditLimitsListpartResponse }
     * 
     */
    public CreditLimitsListpartResponse createCreditLimitsListpartResponse() {
        return new CreditLimitsListpartResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateplansReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/rateplansread", name = "rateplansReadResponse")
    public JAXBElement<RateplansReadResponse> createRateplansReadResponse(RateplansReadResponse value) {
        return new JAXBElement<RateplansReadResponse>(_RateplansReadResponse_QNAME, RateplansReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateplansReadRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/rateplansread", name = "rateplansReadRequest")
    public JAXBElement<RateplansReadRequest> createRateplansReadRequest(RateplansReadRequest value) {
        return new JAXBElement<RateplansReadRequest>(_RateplansReadRequest_QNAME, RateplansReadRequest.class, null, value);
    }

}
