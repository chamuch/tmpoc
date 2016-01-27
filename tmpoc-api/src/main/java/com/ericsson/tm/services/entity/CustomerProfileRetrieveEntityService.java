package com.ericsson.tm.services.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ericsson.tm.adaptors.DiceHttpAdaptor;
import com.ericsson.tm.proxy.customer.response.PortalMessage;
import com.ericsson.tm.utility.GenericUtilities;

public class CustomerProfileRetrieveEntityService {
	
	private static String customerJaxbPkgReq = "com.ericsson.tm.proxy.customer.request";
	private static String customerJaxbPkgResp = "com.ericsson.tm.proxy.customer.response";
	
	private static JAXBContext customerJaxbCtxReq = null;
	private static JAXBContext customerJaxbCtxResp = null;
	
	private GenericUtilities utilityfun = new GenericUtilities(); 
	
	public CustomerProfileRetrieveEntityService() throws JAXBException{
		this.initJaxbContexts();
	}
	
	public com.ericsson.tm.proxy.customer.response.PortalMessage.Response operation(com.ericsson.tm.proxy.customer.request.PortalMessage.Request requestObj) throws Exception{
		
		//Generate Request
		com.ericsson.tm.proxy.customer.request.PortalMessage profileReq = new com.ericsson.tm.proxy.customer.request.PortalMessage();
		
		// Set Header
		com.ericsson.tm.proxy.customer.request.PortalMessage.Header header = new com.ericsson.tm.proxy.customer.request.PortalMessage.Header();
		header.setBusinessEvent("CustomerProfileRetrieve");
		
		// Set current date time	
		header.setTimestamp(utilityfun.generateCurrentTimestamp());
		
		header.setReqRespType("Request");
		
		// Set transaction ID
		header.setMessageId(utilityfun.generateTransactionId());
		
		profileReq.setHeader(header);
		
		profileReq.setRequest(requestObj);
		
		String requestXml = convertPojoToXML(profileReq);		
		System.out.println("Request XML:"+requestXml);
		//Execute 
		
		//execute(requestXml);
		
		String responseXML = execute(requestXml);
		System.out.println("Response XML:"+responseXML);
		
		//Retrieve Response
		com.ericsson.tm.proxy.customer.response.PortalMessage profileResp = convertXMLToPojo(responseXML);
		   
		return profileResp.getResponse();
	}
	
	public String execute(String requestXML) throws Exception{
		
		String responseXml = "NO DICE";
		
		try {
			System.out.println("Get Client adaptor");
			responseXml = "NO DICE CLIENT";
			DiceHttpAdaptor clientAdaptor = new DiceHttpAdaptor();
			
			responseXml = "NO DICE CLIENT HTTP EXECUTE";
			System.out.println("Start invoking TM API");
			responseXml = clientAdaptor.executeHttpPost(requestXML);
		} catch (Exception e) {	
			System.out.println("Execute failed!! - " + e);
			throw e;
		} catch (Throwable e) {	
			System.out.println("Execute threw up!! - " + e);
			throw e;
		}
		
		return responseXml;
		
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
		}catch(Exception genE){
			System.err.println("Exception in Pojo2XmlReq");
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
			
		}catch(Exception genE){
			System.err.println("Exception in responseXml2Pojo");
			genE.printStackTrace();
		}
		return respObj;
	}
	
}
