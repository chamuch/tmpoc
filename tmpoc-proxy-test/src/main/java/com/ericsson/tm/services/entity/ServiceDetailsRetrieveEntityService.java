package com.ericsson.tm.services.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ericsson.tm.adaptors.DiceHttpAdaptor;
import com.ericsson.tm.utility.GenericUtilities;

import com.ericsson.tm.proxy.service.response.PortalMessage;

public class ServiceDetailsRetrieveEntityService {
	
	private static String jaxbPkgReq = "com.ericsson.tm.proxy.service.request";
	private static String jaxbPkgResp = "com.ericsson.tm.proxy.service.response";
	
	private static JAXBContext jaxbCtxReq = null;
	private static JAXBContext jaxbCtxResp = null;
	
	private GenericUtilities utilityfun = new GenericUtilities(); 
	
	public ServiceDetailsRetrieveEntityService() throws JAXBException{
		this.initJaxbContexts();
	}
	
	public com.ericsson.tm.proxy.service.response.PortalMessage.Response operation(com.ericsson.tm.proxy.service.request.PortalMessage.Request requestObj){
		
		//Generate Request
		com.ericsson.tm.proxy.service.request.PortalMessage customerProfileReq = new com.ericsson.tm.proxy.service.request.PortalMessage();
		
		// Set Header
		com.ericsson.tm.proxy.service.request.PortalMessage.Header header = new com.ericsson.tm.proxy.service.request.PortalMessage.Header();
		header.setBusinessEvent("ServiceDetailsRetrieve");
		
		// Set current date time	
		header.setTimestamp(utilityfun.generateCurrentTimestamp());
		
		header.setReqRespType("Request");
		
		// Set transaction ID
		header.setMessageId(utilityfun.generateTransactionId());
		
		customerProfileReq.setHeader(header);
		
		customerProfileReq.setRequest(requestObj);
		
		String requestXml = convertPojoToXML(customerProfileReq);		
		System.out.println("Request XML:"+requestXml);
		//Execute 
		
		String responseXML = execute(requestXml);
		System.out.println("Response XML:"+responseXML);
		
		//Retrieve Response
		com.ericsson.tm.proxy.service.response.PortalMessage customerProfileResp = convertXMLToPojo(responseXML);
		   
		return customerProfileResp.getResponse();
	}
	
	public String execute(String requestXML){
		
		String responseXml = "NO DICE";
		
		try {
			responseXml = "NO DICE CLIENT";
			DiceHttpAdaptor clientAdaptor = new DiceHttpAdaptor();
			
			responseXml = "NO DICE CLIENT HTTP EXECUTE";
			responseXml = clientAdaptor.executeHttpPost(requestXML);
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		return responseXml;
		
	}
	
	public void initJaxbContexts() throws JAXBException{
		if(jaxbCtxReq == null){
			jaxbCtxReq = JAXBContext.newInstance(jaxbPkgReq);
		}
		if(jaxbCtxResp == null){
			jaxbCtxResp = JAXBContext.newInstance(jaxbPkgResp);
		}
	}
	
	public String convertPojoToXML(com.ericsson.tm.proxy.service.request.PortalMessage reqObj){
		StringWriter xmlStringWriter = new StringWriter();
		
		try{
						
			Marshaller marshaller = jaxbCtxReq.createMarshaller();
									
			marshaller.marshal(reqObj, xmlStringWriter);
						
			System.out.println("TransformPojoToXML is successful..");
		}catch(JAXBException genE){
			genE.printStackTrace();
		}
		return xmlStringWriter.toString();
	}
	
	public com.ericsson.tm.proxy.service.response.PortalMessage convertXMLToPojo(String respXML){
		com.ericsson.tm.proxy.service.response.PortalMessage respObj = null;
		try{
			// Create XML unmarshaller
			Unmarshaller unmarshaller = jaxbCtxResp.createUnmarshaller();
			
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
