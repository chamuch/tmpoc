
/*
 * 
 */

package com.ericsson.tm.cbio.paymentarrangementsread;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.12-soa-02
 * Tue Jan 26 11:28:42 CST 2016
 * Generated source version: 2.2.12-soa-02
 * 
 */


@WebServiceClient(name = "PaymentArrangementsReadService", 
                  wsdlLocation = "file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_PaymentArrangementsReadService.wsdl",
                  targetNamespace = "http://ericsson.com/services/ws_CIL_5") 
public class PaymentArrangementsReadService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://ericsson.com/services/ws_CIL_5", "PaymentArrangementsReadService");
    public final static QName PaymentArrangementsReadServiceSoap11 = new QName("http://ericsson.com/services/ws_CIL_5", "PaymentArrangementsReadServiceSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_PaymentArrangementsReadService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_PaymentArrangementsReadService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public PaymentArrangementsReadService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PaymentArrangementsReadService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentArrangementsReadService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns PaymentArrangementsReadService
     */
    @WebEndpoint(name = "PaymentArrangementsReadServiceSoap11")
    public PaymentArrangementsReadService getPaymentArrangementsReadServiceSoap11() {
        return super.getPort(PaymentArrangementsReadServiceSoap11, PaymentArrangementsReadService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PaymentArrangementsReadService
     */
    @WebEndpoint(name = "PaymentArrangementsReadServiceSoap11")
    public PaymentArrangementsReadService getPaymentArrangementsReadServiceSoap11(WebServiceFeature... features) {
        return super.getPort(PaymentArrangementsReadServiceSoap11, PaymentArrangementsReadService.class, features);
    }

}