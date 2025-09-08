package com.college.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] conigFiles = { MyAppConfig.class };
		return conigFiles;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mappings = { "/" };
		return mappings;
	}

}
