package com.ericsson.tm.services.entity;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ericsson.tm.adaptors.DiceHttpAdaptor;
import com.ericsson.tm.utility.GenericUtilities;
//import com.vekomy.PortalMessageNew;
import com.ericsson.tm.proxy.service.response.PortalMessage;
import com.ericsson.tm.proxy.service.response.PortalMessageNew;

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
		com.ericsson.tm.proxy.service.request.PortalMessage profileReq = new com.ericsson.tm.proxy.service.request.PortalMessage();
		
		// Set Header
		com.ericsson.tm.proxy.service.request.PortalMessage.Header header = new com.ericsson.tm.proxy.service.request.PortalMessage.Header();
		header.setBusinessEvent("ServiceDetailsRetrieve");
		
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
		com.ericsson.tm.proxy.service.response.PortalMessage profileResp = convertXMLToPojo(responseXML);
		   
		return profileResp.getResponse();
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
		}catch(Exception genE){
			System.err.println("Exception in Pojo2XmlReq");
			genE.printStackTrace();
		}
		return xmlStringWriter.toString();
	}
	
	public com.ericsson.tm.proxy.service.response.PortalMessage convertXMLToPojo(String respXML){
		com.ericsson.tm.proxy.service.response.PortalMessage respObj = null;
		com.ericsson.tm.proxy.service.response.PortalMessageNew response = null ;
		try{
			// Create XML unmarshaller
			Unmarshaller unmarshaller = jaxbCtxResp.createUnmarshaller();
			
			// Convert XML string into input stream
			InputStream xmlInpStream = new ByteArrayInputStream(respXML.getBytes());
		
			// Convert to object
			//respObj = (PortalMessage) unmarshaller.unmarshal(xmlInpStream);
			//com.ericsson.tm.proxy.service.response.PortalMessageNew response = null ;
			response = (com.ericsson.tm.proxy.service.response.PortalMessageNew) unmarshaller.unmarshal(xmlInpStream);
            System.out.println("RESPONSE OBJECT ======="+response);
			/*File file = new File("Test.xml");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(respXML);
			fileWriter.flush();
			fileWriter.close();
			JAXBContext jaxbContext = JAXBContext.newInstance(PortalMessageNew.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			PortalMessageNew customer = (PortalMessageNew) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);*/
			
		}catch(Exception genE){
			System.err.println("Exception in responseXml2Pojo");
			genE.printStackTrace();
		}
		return respObj;
	}
	
}
