
/*
 * 
 */

package com.ericsson.tm.cbio.addressesread;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.12-soa-02
 * Tue Jan 26 11:26:16 CST 2016
 * Generated source version: 2.2.12-soa-02
 * 
 */


@WebServiceClient(name = "AddressesReadService", 
                  wsdlLocation = "file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_AddressesReadService.wsdl",
                  targetNamespace = "http://ericsson.com/services/ws_CIL_5") 
public class AddressesReadService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://ericsson.com/services/ws_CIL_5", "AddressesReadService");
    public final static QName AddressesReadServiceSoap11 = new QName("http://ericsson.com/services/ws_CIL_5", "AddressesReadServiceSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_AddressesReadService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_AddressesReadService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public AddressesReadService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AddressesReadService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddressesReadService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns AddressesReadService
     */
    @WebEndpoint(name = "AddressesReadServiceSoap11")
    public AddressesReadService getAddressesReadServiceSoap11() {
        return super.getPort(AddressesReadServiceSoap11, AddressesReadService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddressesReadService
     */
    @WebEndpoint(name = "AddressesReadServiceSoap11")
    public AddressesReadService getAddressesReadServiceSoap11(WebServiceFeature... features) {
        return super.getPort(AddressesReadServiceSoap11, AddressesReadService.class, features);
    }

}