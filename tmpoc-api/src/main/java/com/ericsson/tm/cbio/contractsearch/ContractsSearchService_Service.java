
/*
 * 
 */

package com.ericsson.tm.cbio.contractsearch;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.12-soa-02
 * Tue Jan 26 11:09:45 CST 2016
 * Generated source version: 2.2.12-soa-02
 * 
 */


@WebServiceClient(name = "ContractsSearchService", 
                  wsdlLocation = "file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_ContractsSearchService.wsdl",
                  targetNamespace = "http://ericsson.com/services/ws_CIL_5") 
public class ContractsSearchService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://ericsson.com/services/ws_CIL_5", "ContractsSearchService");
    public final static QName ContractsSearchServiceSoap11 = new QName("http://ericsson.com/services/ws_CIL_5", "ContractsSearchServiceSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_ContractsSearchService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/Env/TestWeb1/WebContent/WEB-INF/ws_CIL_5_ContractsSearchService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public ContractsSearchService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ContractsSearchService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContractsSearchService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns ContractsSearchService
     */
    @WebEndpoint(name = "ContractsSearchServiceSoap11")
    public ContractsSearchService getContractsSearchServiceSoap11() {
        return super.getPort(ContractsSearchServiceSoap11, ContractsSearchService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContractsSearchService
     */
    @WebEndpoint(name = "ContractsSearchServiceSoap11")
    public ContractsSearchService getContractsSearchServiceSoap11(WebServiceFeature... features) {
        return super.getPort(ContractsSearchServiceSoap11, ContractsSearchService.class, features);
    }

}
