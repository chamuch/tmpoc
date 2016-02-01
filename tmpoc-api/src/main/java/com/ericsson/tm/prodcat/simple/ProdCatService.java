package com.ericsson.tm.prodcat.simple;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ericsson.tm.core.SpringHelper;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.entities.Composition;
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
			System.out.println("JaxbException in prodcat load...");
			e.printStackTrace();
			throw new RuntimeException("prodcat config failed to load!!", e);
		} catch (Exception e) {
			System.out.println("Exception in prodcat load...");
			e.printStackTrace();
			throw new RuntimeException("prodcat config failed to load!!", e);
		}  catch (Error e) {
			System.out.println("Error in prodcat load...");
			e.printStackTrace();
			throw new RuntimeException("prodcat config failed to load!!", e);
		}
		
	}

	@Override
	public ArrayList<Product> getAllProducts() {
		if (this.prodcat == null)
			throw new RuntimeException("Prodcat is not initialized yet!!");
		
		ArrayList<Product> discovery = new ArrayList<>();
		
		for (Product product: this.prodcat.getProducts()) {
			if (product.isDiscoverable())
				discovery.add(product);
		}
		
		System.out.println("Products list length: " + discovery.size());
		return discovery;
	}

	@Override
	public Product getProduct(String id) {
		if (this.prodcat == null)
			throw new RuntimeException("Prodcat is not initialized yet!!");
		
		for (Product product: this.prodcat.getProducts()) {
			if (product.getId().equals(id)){
				if(product.getCompositions() != null){
					System.out.println("Coming inside Compositions..:"+product.getCompositions().size());
					
					for(Composition compositionItem: product.getCompositions()){
						System.out.println("compositionItemType:"+compositionItem.getType());
						if(compositionItem.getAtomicProducts() != null){
							for(int i=0; i < compositionItem.getAtomicProducts().size(); i++){
								System.out.println(compositionItem.getAtomicProducts().get(i));
							}						
						}
					}
				}
				return product;
			}	
		}
		return null;
	}

	@Override
	public ArrayList<Product> getProductsForResource(String resourceId) {
		if (this.prodcat == null)
			throw new RuntimeException("Prodcat is not initialized yet!!");
		
		ArrayList<Product> discovery = new ArrayList<>();
		
		for (Product product: this.prodcat.getProducts()) {
			if (product.isDiscoverable() && product.hasResourceAccess(resourceId))
				discovery.add(product);
		}
		return discovery;
	}
	
	@Override
	public ArrayList<Product> getProductsForChild(String productId) {
		if (this.prodcat == null)
			throw new RuntimeException("Prodcat is not initialized yet!!");
		
		ArrayList<Product> discovery = new ArrayList<>();
		
		for (Product product: this.prodcat.getProducts()) {
			if (product.isDiscoverable() && product.hasProductAccess(productId))
				discovery.add(product);
		}
		return discovery;
	}

}
