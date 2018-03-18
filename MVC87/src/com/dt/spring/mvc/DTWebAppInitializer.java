package com.dt.spring.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DTWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		System.out.println("get rootConfig");
		return new Class[] { DTConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		System.out.println("getServlet");
		return new Class[] { DTConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		System.out.println("getServletMapping");
		return new String[] { "*.dt" };
	}

}
