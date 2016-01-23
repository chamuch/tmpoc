package com.ericsson.tm.http.client;

import java.util.Properties;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.HttpPost;

public class TmProxyHttpClientImpl implements TmProxyHttpClient{
	
	private Properties tmProxyConfig = null;	
	private static final String TM_PROXY_END_POINT = "proxyUrl";
	private HttpClient httpClient;
	private HttpPost httpPostRequest;
	
	public TmProxyHttpClientImpl(Properties config){
		this.tmProxyConfig = config;
	}
	
	public void init(){
		this.httpClient = new DefaultHttpClient();
		this.httpPostRequest = new HttpPost(tmProxyConfig.getProperty(TM_PROXY_END_POINT));
	}
	
	//Implementation for execute method interface
}
