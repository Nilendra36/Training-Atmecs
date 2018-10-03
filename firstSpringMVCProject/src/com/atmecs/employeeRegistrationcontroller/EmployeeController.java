package com.atmecs.employeeRegistrationcontroller;

import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

@InitBinder
public void initBinder(WebDataBinder binder) {
	//binder.setDisallowedFields(new String[] {"employeeMobile"});
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
	binder.registerCustomEditor(Date.class, "employeeDOB", new CustomDateEditor(dateFormat, false));
	//CustomDataEditor is a PropertyEditor provided by MVC in order provide type conversion at the time of data binding
	binder.registerCustomEditor(String.class, "employeeName",new EmployeeNameEditor());
}

@RequestMapping(value="/atmecsRegistrationForm.html",method=RequestMethod.GET)
public ModelAndView getRegistration() throws Exception{
	/*
	 String exceptionOccured="NULL_POINTER";
	 if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
	 throw new NullPointerException("Null Pointer Exception");
	 }
	 */
	ModelAndView model=new ModelAndView("atmecsRegistration");
	return model;
}

/*
 * @ExceptionHandler(value=NullPointerException.class)
 * public String handleNullPointerException(Exception ex) {
 * System.out.println("Null Pointer Exception Occured" + ex);
 * return "NullPointerException";
 * }
 * 
 * @ExceptionHandler(value=Exception.class)
 * public String handleException(Exception ex) {
 * System.out.println("Exception arrised "+ex);
 * return "NullPointerException";
 * }
 */



@RequestMapping(value="submitRegistrationForm1.html",method=RequestMethod.POST)
/*public ModelAndView submitRegistrationForm(@RequestParam(value="employeeName")String name,@RequestParam(value="projectName")String project){
	*Employee employee=new Employee();
	*employee.setName(name);
	*employee.setProject(project);
	*/
/*
 * public ModelAndView submitRegistrationForm(@RequestParam("employeeMobile") String mobile,
 * @RequestParam("employeeDOB") String DOB,
 * @RequestParam("employeeSkills") String [] skills
 * {
 * Employee employee=new Employee();
 * try{
 * employee.setEmployeeMobile(Long.parseLong(mobile));
 * SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
 * employee.setEmployeeDOB(date.parse(DOB));
 * ArrayList<String> skillsSetList=new ArrayList<String>();
 * for(int i=0;i<sills.length;i++){
 * 	skillsSetList.add(skills[i]);
 * }
 * employee.setEmployeeSkills(skillSetList);
 * }catch(Exception ex){}
 * }
 *  These Number of lines we have to add in our code in the absence of ModelAttribute; 
 
 */
public ModelAndView submitRegistrationForm(@Valid @ModelAttribute("employee")Employee employee,BeanPropertyBindingResult result) {
	if(result.hasErrors()) {
		ModelAndView model=new ModelAndView("atmecsRegistration");
		return model;
	}
	ModelAndView model=new ModelAndView("atmecsSuccess");
	//model.addObject("employee",employee);
	return model;
	
}




}
