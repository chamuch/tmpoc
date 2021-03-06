package com.ericsson.tm.adaptors;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

public class DiceHttpAdaptor {

	private CloseableHttpClient httpclient = null;
	private String diceUrl = null;

	public DiceHttpAdaptor() throws KeyManagementException,
			NoSuchAlgorithmException, KeyStoreException {

		SSLContext sslcontext = SSLContexts.custom()
				.loadTrustMaterial(null, new TrustSelfSignedStrategy()).build();

		// Allow TLSv1 protocol only, use NoopHostnameVerifier to trust
		// self-singed cert
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
				sslcontext, new String[] { "TLSv1" }, null,
				new NoopHostnameVerifier());

		// do not set connection manager
		httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		diceUrl = "https://dice.tm.com.my/prj_HsbbEai_Sync_War/httpMessageReceiver.do";
	}

	public String executeHttpPost(String requestXml) {

		String responseXML = "NO DICE";

		try {

			HttpPost post = new HttpPost(diceUrl);
			RequestConfig defaultRequestConfig = RequestConfig
					.custom()
					.setCookieSpec(CookieSpecs.DEFAULT)
					.setExpectContinueEnabled(true)
					.setTargetPreferredAuthSchemes(
							Arrays.asList(AuthSchemes.NTLM, AuthSchemes.DIGEST))
					.setProxyPreferredAuthSchemes(
							Arrays.asList(AuthSchemes.BASIC)).build();

			post.setConfig(defaultRequestConfig);

			post.setHeader("Content-Type", "application/json");
			post.setHeader("Accept", "application/json");

			// post.setHeader("fe", "auth_acc");
			StringEntity body = new StringEntity(requestXml);

			post.setEntity(body);
			HttpResponse response = httpclient.execute(post);

			HttpEntity entity = response.getEntity();
			responseXML = EntityUtils.toString(entity, "UTF-8");
		} catch (Exception genE) {
			responseXML = "ERROR - " + genE.getMessage();
		}

		return responseXML;
		
	}
}