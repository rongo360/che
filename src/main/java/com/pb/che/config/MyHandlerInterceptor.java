package com.pb.che.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pb.che.context.CurrentUserContext;
import com.pb.che.context.UserDomain;

@Component
public class MyHandlerInterceptor implements HandlerInterceptor 
{

	@SuppressWarnings("unused")
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		
		UserDomain user=new UserDomain();
		if(user==null){
			return false;
		}
		
		CurrentUserContext.save(user);

		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception
	{
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	
	
	
}
