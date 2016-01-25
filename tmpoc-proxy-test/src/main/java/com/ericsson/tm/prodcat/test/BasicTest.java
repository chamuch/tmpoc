package com.ericsson.tm.prodcat.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.ericsson.tm.prodcat.simple.entities.Meta;
import com.ericsson.tm.prodcat.simple.entities.ProdCat;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class BasicTest {
	public static void main(String[] args){
		System.out.println("Hello..");
		
		try{
			System.out.println("Step1");
			//String prodcatUrl = SpringHelper.getConfig().getValue("prodcat", prodcatLocation) + "/" + prodcatFile;
			JAXBContext jaxbContext = JAXBContext.newInstance(ProdCat.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ProdCat prodcat = (ProdCat) unmarshaller.unmarshal(new File("prodcat.xml"));
			if(prodcat != null){
				if(prodcat.getProducts() != null && prodcat.getProducts().size() >0){
					Product product = prodcat.getProducts().get(0);
					System.out.println("id:"+product.getId());
					System.out.println("Name:"+product.getName());
					if(product.getMetas() != null){
						for(Meta meta:product.getMetas()){
							System.out.println("Name:"+meta.getName());
							System.out.println("Value:"+meta.getValue());
						}
					}					
				}
			}
			System.out.println("Done..");
		}catch(Exception genE){
			genE.printStackTrace();
		}
	}
}
