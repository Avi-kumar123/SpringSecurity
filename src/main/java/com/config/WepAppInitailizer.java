package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WepAppInitailizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] webConfig = {WebConfig.class};
		return webConfig;
	}

	@Override
	protected String[] getServletMappings() {
		
		String [] mapping = {"/"};
		return mapping;
	}

}
