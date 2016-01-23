package com.ericsson.tm.core;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.ericsson.tm.core.config.ConfigService;
import com.ericsson.tm.core.config.IConfig;

public class SpringHelper implements ApplicationContextAware {
	
	private static ApplicationContext context = null;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		SpringHelper.context = context;
	}
	
	public static IConfig getConfig() {
        return context.getBean(ConfigService.class);
    }
}
