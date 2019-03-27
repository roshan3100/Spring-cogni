package com.hcl.interceptors;

import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MaintenanceInterceptor extends HandlerInterceptorAdapter{
	
	
	private int maintenanceStartTime;
	private int maintenanceEndTime;
	
	@Autowired
	@Value("11")
	public void setMaintenanceStartTime(int maintenanceStartTime) {
		this.maintenanceStartTime = maintenanceStartTime;
	}

	@Autowired
	@Value("13")
	public void setMaintenanceEndTime(int maintenanceEndTime) {
		this.maintenanceEndTime = maintenanceEndTime;
	}

	//before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
	    throws Exception {
		System.out.println("Inside preHandle  MaintanenceInterceptor");
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(cal.HOUR_OF_DAY);
		System.out.println("Hour "+hour);
		System.out.println("maintenanceStartTime "+maintenanceStartTime);
		System.out.println("maintenanceEndTime "+maintenanceEndTime);
		
		if (hour >= maintenanceStartTime && hour <= maintenanceEndTime) {
			
                    PrintWriter out = response.getWriter();
                    out.println("<h1>Site under maintenance</h1>");
		      return false;
		} else {
			return true;
		}
		
	}

}