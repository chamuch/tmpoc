package com.ericsson.tm.core;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.ericsson.tm.core.config.ConfigService;
import com.ericsson.tm.core.config.IConfig;
import com.ericsson.tm.prodcat.IProdCatDiscovery;
import com.ericsson.tm.prodcat.simple.ProdCatService;

public class SpringHelper implements ApplicationContextAware {
	
	private static ApplicationContext context = null;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		SpringHelper.context = context;
	}
	
	public static IConfig getConfig() {
        return context.getBean(ConfigService.class);
    }
	
	public static IProdCatDiscovery getProductCatalogForDiscovery() {
		return context.getBean(ProdCatService.class);
	}
}
