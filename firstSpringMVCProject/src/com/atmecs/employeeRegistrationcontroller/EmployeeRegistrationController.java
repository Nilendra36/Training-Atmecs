package com.atmecs.employeeRegistrationcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeRegistrationController {
	@RequestMapping(value="/registrationForm.html",method=RequestMethod.GET)
	public ModelAndView getRegistrationForm() {
		ModelAndView model=new ModelAndView("RegistrationForm");
		return model;
	}
	
	@RequestMapping(value="/submitRegistrationForm.html",method=RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam(value="employeeName",defaultValue="XYZ")String name,@RequestParam("projectName")String project) {
		public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqP)
		{
		String name=reqP.get("employeeName");
		String project=reqP.get("projectName");
		ModelAndView model=new ModelAndView("RegistrationSuccess");
		model.addObject("welcomeMessage","Mr. "+name+" working for project "+project+" has been successfully Registered");
		return model;
	}
	

}
