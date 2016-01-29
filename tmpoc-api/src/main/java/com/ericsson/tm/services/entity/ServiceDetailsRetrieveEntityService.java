package com.ericsson.tm.services.entity;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;

import com.ericsson.tm.adaptors.DiceHttp43Adaptor;
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
			HttpClient client = DiceHttp43Adaptor.getInstance();
			
			responseXml = "NO DICE CLIENT HTTP EXECUTE";
			responseXml = DiceHttp43Adaptor.executeHttpPost(client, requestXML);
			((CloseableHttpClient)client).close();
			client = null;
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
		//com.ericsson.tm.proxy.service.response.PortalMessageNew response = null ;
		
		respXML = respXML.trim().replaceFirst("^([\\W\\t]+)<","<");
		respXML = respXML.replaceAll("[^\\x20-\\x7e\\x0A]", "");
		System.out.println("Validate Service RespXML: <<<<||||" + respXML + "||||>>>>");
		
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(PortalMessage.class);
			Unmarshaller unmarshaller = jaxbCtxResp.createUnmarshaller();
			
			InputStream xmlInpStream = new ByteArrayInputStream(respXML.getBytes(Charset.forName("UTF-8")));
			respObj = (PortalMessage) unmarshaller.unmarshal(xmlInpStream);
						
		}catch(Exception genE){
			System.err.println("Exception in responseXml2Pojo");
			genE.printStackTrace();
		}
		return respObj;
	}
	
}
