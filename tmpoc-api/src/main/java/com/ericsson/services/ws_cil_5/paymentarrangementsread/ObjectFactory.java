
package com.ericsson.services.ws_cil_5.paymentarrangementsread;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ericsson.services.ws_cil_5.paymentarrangementsread package. 
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

    private final static QName _PaymentArrangementsReadResponse_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/paymentarrangementsread", "paymentArrangementsReadResponse");
    private final static QName _PaymentArrangementsReadRequest_QNAME = new QName("http://ericsson.com/services/ws_CIL_5/paymentarrangementsread", "paymentArrangementsReadRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ericsson.services.ws_cil_5.paymentarrangementsread
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
     * Create an instance of {@link ListOfPaymentArrangementsResponse }
     * 
     */
    public ListOfPaymentArrangementsResponse createListOfPaymentArrangementsResponse() {
        return new ListOfPaymentArrangementsResponse();
    }

    /**
     * Create an instance of {@link PaymentArrangementsReadRequest }
     * 
     */
    public PaymentArrangementsReadRequest createPaymentArrangementsReadRequest() {
        return new PaymentArrangementsReadRequest();
    }

    /**
     * Create an instance of {@link ListOfPaymentArrangementsListpartResponse }
     * 
     */
    public ListOfPaymentArrangementsListpartResponse createListOfPaymentArrangementsListpartResponse() {
        return new ListOfPaymentArrangementsListpartResponse();
    }

    /**
     * Create an instance of {@link PaymentArrangementsReadResponse }
     * 
     */
    public PaymentArrangementsReadResponse createPaymentArrangementsReadResponse() {
        return new PaymentArrangementsReadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentArrangementsReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/paymentarrangementsread", name = "paymentArrangementsReadResponse")
    public JAXBElement<PaymentArrangementsReadResponse> createPaymentArrangementsReadResponse(PaymentArrangementsReadResponse value) {
        return new JAXBElement<PaymentArrangementsReadResponse>(_PaymentArrangementsReadResponse_QNAME, PaymentArrangementsReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentArrangementsReadRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ericsson.com/services/ws_CIL_5/paymentarrangementsread", name = "paymentArrangementsReadRequest")
    public JAXBElement<PaymentArrangementsReadRequest> createPaymentArrangementsReadRequest(PaymentArrangementsReadRequest value) {
        return new JAXBElement<PaymentArrangementsReadRequest>(_PaymentArrangementsReadRequest_QNAME, PaymentArrangementsReadRequest.class, null, value);
    }

}
