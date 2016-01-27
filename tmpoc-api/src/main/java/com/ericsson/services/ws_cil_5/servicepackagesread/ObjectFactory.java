
package com.ericsson.services.ws_cil_5.servicepackagesread;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.services.ws_cil_5.servicepackagesread package. 
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

    private final static QName _ServicePackagesReadRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/servicepackagesread", "servicePackagesReadRequest");
    private final static QName _ServicePackagesReadResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/servicepackagesread", "servicePackagesReadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.services.ws_cil_5.servicepackagesread
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumSpListpartResponse }
     * 
     */
    public NumSpListpartResponse createNumSpListpartResponse() {
        return new NumSpListpartResponse();
    }

    /**
     * Create an instance of {@link InputAttributes }
     * 
     */
    public InputAttributes createInputAttributes() {
        return new InputAttributes();
    }

    /**
     * Create an instance of {@link NumSpResponse }
     * 
     */
    public NumSpResponse createNumSpResponse() {
        return new NumSpResponse();
    }

    /**
     * Create an instance of {@link ServicePackagesReadRequest }
     * 
     */
    public ServicePackagesReadRequest createServicePackagesReadRequest() {
        return new ServicePackagesReadRequest();
    }

    /**
     * Create an instance of {@link ServicePackagesReadResponse }
     * 
     */
    public ServicePackagesReadResponse createServicePackagesReadResponse() {
        return new ServicePackagesReadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePackagesReadRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/servicepackagesread", name = "servicePackagesReadRequest")
    public JAXBElement<ServicePackagesReadRequest> createServicePackagesReadRequest(ServicePackagesReadRequest value) {
        return new JAXBElement<ServicePackagesReadRequest>(_ServicePackagesReadRequest_QNAME, ServicePackagesReadRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePackagesReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/servicepackagesread", name = "servicePackagesReadResponse")
    public JAXBElement<ServicePackagesReadResponse> createServicePackagesReadResponse(ServicePackagesReadResponse value) {
        return new JAXBElement<ServicePackagesReadResponse>(_ServicePackagesReadResponse_QNAME, ServicePackagesReadResponse.class, null, value);
    }

}
