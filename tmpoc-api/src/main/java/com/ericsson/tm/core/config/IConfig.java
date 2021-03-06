package com.ericsson.tm.core.config;

import java.util.List;
import java.util.Properties;

public interface IConfig {

	public void init();

	public Section getSection(String sectionId);

	public String getValue(String sectionId, String propKey);

	public Properties getProperties(String sectionName);
	
	public List<Property> getProperties(Section section);

    Value getRoute(String sectionId, long locate);
}
