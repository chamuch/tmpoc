package com.ericsson.tm.prodcat.simple;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.entities.ProdCat;
import com.ericsson.tm.prodcat.simple.entities.Product;

public class ProdCatService implements IProdCatDiscovery {
	
	private final static String prodcatFile = "prodcat.xml";
	private final static String prodcatSection = "prodcat";
	private final static String prodcatLocation = "prodcatLocation";
	
	private ProdCat prodcat = null;

	@Override
	public void init() {
		try {
			String prodcatUrl = SpringHelper.getConfig().getValue(prodcatSection, prodcatLocation) + "/" + prodcatFile;
			JAXBContext jaxbContext = JAXBContext.newInstance(ProdCat.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			prodcat = (ProdCat) unmarshaller.unmarshal(new File(prodcatUrl));
					
			
		} catch (JAXBException e) {
			throw new RuntimeException("prodcat config failed to load!!", e);
		} catch (Exception e) {
			throw new RuntimeException("prodcat config failed to load!!", e);
		}  catch (Error e) {
			throw new RuntimeException("prodcat config failed to load!!", e);
		}
		
	}

	@Override
	public ArrayList<Product> getAllProducts() {
		ArrayList<Product> discovery = new ArrayList<>();
		
		for (Product product: this.prodcat.getProducts()) {
			if (product.isDiscoverable())
				discovery.add(product);
		}
		return discovery;
	}

	@Override
	public Product getProduct(String id) {
		for (Product product: this.prodcat.getProducts()) {
			if (product.getId().equals(id))
				return product;
		}
		return null;
	}

	@Override
	public ArrayList<Product> getProductsForResource(String resourceId) {
		ArrayList<Product> discovery = new ArrayList<>();
		
		for (Product product: this.prodcat.getProducts()) {
			if (product.isDiscoverable() && product.hasResourceAccess(resourceId))
				discovery.add(product);
		}
		return discovery;
	}
	
	@Override
	public ArrayList<Product> getProductsForChild(String productId) {
		ArrayList<Product> discovery = new ArrayList<>();
		
		for (Product product: this.prodcat.getProducts()) {
			if (product.isDiscoverable() && product.hasProductAccess(productId))
				discovery.add(product);
		}
		return discovery;
	}

}
