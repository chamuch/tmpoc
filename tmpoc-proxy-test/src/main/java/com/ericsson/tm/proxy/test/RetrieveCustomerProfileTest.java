package com.ericsson.tm.proxy.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ericsson.tm.proxy.customer.response.PortalMessage;
import com.ericsson.tm.proxy.customer.response.PortalMessage.Response.ContactList.Contact;


public class RetrieveCustomerProfileTest {
	
	private static String customerJaxbPkgReq = "com.ericsson.tm.proxy.customer.request";
	private static String customerJaxbPkgResp = "com.ericsson.tm.proxy.customer.response";
	
	private static JAXBContext customerJaxbCtxReq = null;
	private static JAXBContext customerJaxbCtxResp = null;
	
	
	public static void main(String[] args){
		System.out.println("Hello..");
		try{
			RetrieveCustomerProfileTest test = new RetrieveCustomerProfileTest();
			test.initJaxbContexts();
			
			test.retrieveCustomerProfile("L-12345");
			
		}catch(Exception genE){
			genE.printStackTrace();
		}
		
	}
	
	public void retrieveCustomerProfile(String accountNo){
		
		//Generate Request
		com.ericsson.tm.proxy.customer.request.PortalMessage customerProfileReq = new com.ericsson.tm.proxy.customer.request.PortalMessage();
		com.ericsson.tm.proxy.customer.request.PortalMessage.Header header = new com.ericsson.tm.proxy.customer.request.PortalMessage.Header();
		header.setBusinessEvent("CustomerProfileRetrieve");
		header.setTimestamp("01/05/2016 12:03:30");
		header.setReqRespType("Request");
		header.setMessageId("1300027207837");		
		customerProfileReq.setHeader(header);
		
		com.ericsson.tm.proxy.customer.request.PortalMessage.Request requestBody = new com.ericsson.tm.proxy.customer.request.PortalMessage.Request();
		requestBody.setAccountNo("1-1LTUM7F");
		customerProfileReq.setRequest(requestBody);
		
		String requestXml = convertPojoToXML(customerProfileReq);		
		System.out.println("Request XML:"+requestXml);
		
		//Execute 
		
		//Retrieve Response
		com.ericsson.tm.proxy.customer.response.PortalMessage customerProfileResp = convertXMLToPojo(TestXml.TEST_RESP);
		if(customerProfileResp != null){
			System.out.println("Respone:");
			if(customerProfileResp.getResponse() != null
					&& customerProfileResp.getResponse().getContactList() != null
					&& customerProfileResp.getResponse().getContactList().getContact().size() > 0){
				for(Contact contactItem:customerProfileResp.getResponse().getContactList().getContact()){
					System.out.println(contactItem.getContactID());
				}
			}
		}
		   
	}
	
	public void execute(String requestXML){
		
		/*try{
			//System.setProperty("java.protocol.handler.pkgs","com.sun.net.ssl.internal.www.protocol");
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			//Security.addProvider( new HttpsProvider() );
	        //Security.setProperty("ssl.TrustManagerFactory.algorithm",   "TrustAllCertificates");
			KeyStore trustStore  = KeyStore.getInstance(KeyStore.getDefaultType());
			trustStore.load(null);
	        SSLSocketFactory socketFactory = new SSLSocketFactory(trustStore);	        
	        Scheme sch = new Scheme("https", socketFactory, 443);
	        HttpClient client = new DefaultHttpClient();
	        client.getConnectionManager().getSchemeRegistry().register(sch);
	        HttpPost post = new HttpPost("https://dice.tm.com.my/prj_HsbbEai_Sync_War/httpMessageReceiver.do");
	        
	        HttpResponse response = client.execute(post);
	        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	        String line = "";
	        while ((line = rd.readLine()) != null) {
	            System.out.println(line);
	        }
		}catch(Exception genE){
			genE.printStackTrace();
		}*/
	}
	
	public void initJaxbContexts() throws JAXBException{
		if(customerJaxbCtxReq == null){
			customerJaxbCtxReq = JAXBContext.newInstance(customerJaxbPkgReq);
		}
		if(customerJaxbCtxResp == null){
			customerJaxbCtxResp = JAXBContext.newInstance(customerJaxbPkgResp);
		}
	}
	
	public String convertPojoToXML(com.ericsson.tm.proxy.customer.request.PortalMessage reqObj){
		StringWriter xmlStringWriter = new StringWriter();
		
		try{
						
			Marshaller marshaller = customerJaxbCtxReq.createMarshaller();
									
			marshaller.marshal(reqObj, xmlStringWriter);
						
			System.out.println("TransformPojoToXML is successful..");
		}catch(JAXBException genE){
			genE.printStackTrace();
		}
		return xmlStringWriter.toString();
	}
	
	public com.ericsson.tm.proxy.customer.response.PortalMessage convertXMLToPojo(String respXML){
		com.ericsson.tm.proxy.customer.response.PortalMessage respObj = null;
		try{
			// Create XML unmarshaller
			Unmarshaller unmarshaller = customerJaxbCtxResp.createUnmarshaller();
			
			// Convert XML string into input stream
			InputStream xmlInpStream = new ByteArrayInputStream(respXML.getBytes());
			
			// Convert to object
			respObj = (PortalMessage) unmarshaller.unmarshal(xmlInpStream);
			
		}catch(JAXBException genE){
			genE.printStackTrace();
		} catch(Exception genE){
			genE.printStackTrace();
		}
		return respObj;
		
	}
}
