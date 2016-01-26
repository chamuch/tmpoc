
package com.ericsson.services.ws_cil_5.addressesread;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.services.ws_cil_5.addressesread package. 
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

    private final static QName _AddressesReadRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/addressesread", "addressesReadRequest");
    private final static QName _AddressesReadResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/addressesread", "addressesReadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.services.ws_cil_5.addressesread
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressesReadRequest }
     * 
     */
    public AddressesReadRequest createAddressesReadRequest() {
        return new AddressesReadRequest();
    }

    /**
     * Create an instance of {@link AddressesReadResponse }
     * 
     */
    public AddressesReadResponse createAddressesReadResponse() {
        return new AddressesReadResponse();
    }

    /**
     * Create an instance of {@link ListOfAllAddressesListpartResponse }
     * 
     */
    public ListOfAllAddressesListpartResponse createListOfAllAddressesListpartResponse() {
        return new ListOfAllAddressesListpartResponse();
    }

    /**
     * Create an instance of {@link InputAttributes }
     * 
     */
    public InputAttributes createInputAttributes() {
        return new InputAttributes();
    }

    /**
     * Create an instance of {@link ListOfAllAddressesResponse }
     * 
     */
    public ListOfAllAddressesResponse createListOfAllAddressesResponse() {
        return new ListOfAllAddressesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressesReadRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/addressesread", name = "addressesReadRequest")
    public JAXBElement<AddressesReadRequest> createAddressesReadRequest(AddressesReadRequest value) {
        return new JAXBElement<AddressesReadRequest>(_AddressesReadRequest_QNAME, AddressesReadRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressesReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/addressesread", name = "addressesReadResponse")
    public JAXBElement<AddressesReadResponse> createAddressesReadResponse(AddressesReadResponse value) {
        return new JAXBElement<AddressesReadResponse>(_AddressesReadResponse_QNAME, AddressesReadResponse.class, null, value);
    }

}
