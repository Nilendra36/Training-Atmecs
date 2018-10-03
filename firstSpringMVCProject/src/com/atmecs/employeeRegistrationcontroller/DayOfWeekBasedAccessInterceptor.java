package com.atmecs.employeeRegistrationcontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

//import org.springframework.web.portlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends org.springframework.web.servlet.handler.HandlerInterceptorAdapter {
@Override
public boolean preHandle(HttpServletRequest request,HttpServletResponse response,
		Object handler)throws Exception{
			Calendar cal=Calendar.getInstance();
			@SuppressWarnings("static-access")
			int dayOfWeek=cal.get(cal.DAY_OF_WEEK);
			if (dayOfWeek==1) {
				response.getWriter().write("Under Maintenance");
			return false;
			}
	return true;
	
}
@Override
public void postHandle(HttpServletRequest req,HttpServletResponse res,
			Object handler,ModelAndView mvc)throws Exception{
	System.out.println("HandlerInterceptorAdapter: Spring MVC called postHandle method for "+
				req.getRequestURI().toString());
}

@Override
public void afterCompletion(HttpServletRequest req,HttpServletResponse res,
		Object handler,Exception ex)throws Exception{
System.out.println("HandlerInterceptorAdapter: Spring MVC called afterCompletion method for "+
			req.getRequestURI().toString());
}


	

}
