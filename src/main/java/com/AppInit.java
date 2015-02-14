package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.config.SpringMvcConfig;
import com.config.SpringRootConfig;
import com.config.SpringRootConfig2;

public class AppInit implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {

		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		/*
		 * we could replace following two applicationContext.register() with
		 * applicationContext.setNamespace("com.config");
		 */
		applicationContext.register(SpringRootConfig.class);
		applicationContext.register(SpringRootConfig2.class);

		/*
		 * we could also use XmlWebApplicationContext instead of
		 * AnnotationConfigWebApplicationContext as shown below
		 */
		/*
		 * XmlWebApplicationContext applicationContext = new
		 * XmlWebApplicationContext();
		 * applicationContext.setConfigLocation("/WEB-INF/spring-servlet.xml");
		 * servletContext .addListener(new
		 * ContextLoaderListener(applicationContext));
		 */

		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(SpringMvcConfig.class);

		Dynamic servlet = servletContext.addServlet("spring",
				new DispatcherServlet(webApplicationContext));
		servlet.addMapping("*.htm");

	}
}
