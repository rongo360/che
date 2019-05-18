package com.pb.che.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author Administrator
 *
 */
@Component
public class MyWebConfigurer implements WebMvcConfigurer
{

	@Autowired
	private MyHandlerInterceptor myHandlerInterceptor;
	
	public void addInterceptors(InterceptorRegistry registry)
	{
		
		
		registry.addInterceptor(myHandlerInterceptor).
		addPathPatterns("/**").excludePathPatterns("/login", "/register");

	}

	
	
}
