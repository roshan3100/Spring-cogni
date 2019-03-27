package com.hcl.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ExecuteTimeInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("Inside afterCompletion of TimeExecutionInteceptor");
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView modelAndView)
			throws Exception {
		System.out.println("Inside postHandle of TimeExecutionInteceptor");
		long endTime = System.currentTimeMillis();
		
		long startTime = (long) request.getAttribute("startTime");
		
		long executeTime= endTime-startTime;
		
		modelAndView.addObject("executeTime", executeTime);
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("Inside perHandle of TimeExecutionInteceptor");
		long startTime= System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		return true;
	}

	
}
