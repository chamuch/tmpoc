package com.ericsson.tm.adaptors;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;




public class DiceHttp43Adaptor {

	private final static String diceUrl = "https://dice.tm.com.my/prj_HsbbEai_Sync_War/httpMessageReceiver.do";


	private DiceHttp43Adaptor() {}


	public static HttpClient getInstance() throws Exception {
		CloseableHttpClient httpclient = null;

		try{
			SSLContextBuilder builder = new SSLContextBuilder();
			builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());

			// Allow TLSv1 protocol only, use NoopHostnameVerifier to trust
			// self-singed cert
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(builder.build());

			// do not set connection manager
			httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		} catch(Exception genE){
			System.out.println("Exception in client adaptor:"+genE);
			throw genE;
		} catch (Throwable e) {
			System.out.println("Unhandlable Error in client adaptor:"+ e);
			throw e;
		}
		return httpclient;
	}

	public static String executeHttpPost(HttpClient httpclient, String requestXml) {

		String responseXML = "NO DICE";

		try {
			System.out.println("executeHttpPost start");
			HttpPost post = new HttpPost(diceUrl);
//			RequestConfig defaultRequestConfig = RequestConfig
//					.custom()
//					.setCookieSpec(CookieSpecs.DEFAULT)
//					.setExpectContinueEnabled(true)
//					.setTargetPreferredAuthSchemes(
//							Arrays.asList(AuthSchemes.NTLM, AuthSchemes.DIGEST))
//					.setProxyPreferredAuthSchemes(
//							Arrays.asList(AuthSchemes.BASIC)).build();
//
//			post.setConfig(defaultRequestConfig);

			post.setHeader("Content-Type", "application/json");
			post.setHeader("Accept", "application/json");

			// post.setHeader("fe", "auth_acc");
			StringEntity body = new StringEntity(requestXml);

			post.setEntity(body);
			HttpResponse response = httpclient.execute(post);
			//((CloseableHttpClient)httpclient).close();

			HttpEntity entity = response.getEntity();
			responseXML = org.sns.utils.Http.EntityUtils.toString(entity, "UTF-8");

			//System.out.println(responseXML);
		} catch (Exception genE) {
			responseXML = "ERROR - " + genE.getMessage();
			genE.printStackTrace();
		}

		return responseXML;

	}
}