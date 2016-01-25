package com.ericsson.tm.prodcat.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.ericsson.tm.prodcat.simple.GetProductsForResourceRequest;
import com.google.gson.Gson;

public class GetProductsForResourceTest {
	public static void main(String[] args){
		System.out.println("Arguments:"+args[0]+","+"args[1]");
		getProductsForResource(args[0],args[1]);//URL & Resource Id
		System.out.println("GetProductsForResourceTest end..");
	}
	
	private static void getProductsForResource(String url,String resourceId){
		GetProductsForResourceRequest request = new GetProductsForResourceRequest();
		request.setResourceId(resourceId);
		
		// now post the rest api
        try {
        	System.out.println("Generating Http Client..");
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(url);
            post.setHeader("Content-Type", "application/json");
            post.setHeader("Accept", "application/json");
            post.setHeader("CamelHttpPath", "getProductsForResource");
            System.out.println("Header Added..");
            StringEntity body = new StringEntity(new Gson().toJson(request));
            
            post.setEntity(body);
            System.out.println("Invoking API");
            HttpResponse response = client.execute(post);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = "";
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }

        } catch (UnsupportedEncodingException e) {
            System.out.println("Failed to serialize JSON Body for the REST call... Error: UnsupportedEncoding-" + e.getMessage());
        } catch (ClientProtocolException e) {
            System.out.println("Failed to connect to REST URL... Error: ClientProtocol-" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Failed to send/receive the REST call... Error: IOException-" + e.getMessage());
        } catch(Exception genE){
        	genE.printStackTrace();
        }
	}
}
