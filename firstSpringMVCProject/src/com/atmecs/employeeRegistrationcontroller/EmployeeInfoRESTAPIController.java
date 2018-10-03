package com.atmecs.employeeRegistrationcontroller;

//import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.atmecs.employeeRegistrationService.RegistrationService;
//import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
@ComponentScan(basePackages="com.atmecs")
public class EmployeeInfoRESTAPIController {
	
	@Autowired
	private RegistrationService registrationService;
	//***********************Retrieving List of Employees***********************
	//@ResponseBody{We use this annotations only when we have to mention explicitly that the particular method is for REST API
	@RequestMapping(value="/employeeList",method=RequestMethod.POST,produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	/*
	 * produces=org.springframework.http.MediaType.APPLICATION_XML_VALUE
	 * The above syntax will restrict REST API to produce only XML format object in response
	 */
	
	public List<Employee> getEmployeeList(){
		Employee emp1=new Employee();
		emp1.setEmployeeName("Nilendra Mishra");
		Employee emp2=new Employee();
		emp2.setEmployeeName("Shivani");
		
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		registrationService.simpleService();
		return employeeList;
		
	}

	//**********************Retrieving Single Employee Details********************
	//@ResponseBody
	@RequestMapping(value="/employee/{name}",method=RequestMethod.GET)
	public Employee getDetail(@PathVariable("name") String employeeName) {
		Employee emp=new Employee();
		emp.setEmployeeName(employeeName);
		return emp;
		
	}
	
	//**********************Update Single Employee Details********************
	@RequestMapping(value="/employee_update/{name}",method=RequestMethod.PUT,consumes=org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public boolean updateDetails(@PathVariable("name")String employeeName,@RequestBody Employee emp) {
		System.out.println("Employee Name "+employeeName);
		System.out.println("Employee Name "+emp.getEmployeeName());
		/*
		 * find the matching employeeName from the database
		 * update the matching employee details
		 */
		
		return true;
	}
	
	//**********************Response using @ResponseEntity********************
	@RequestMapping(value="/employeeResponse/{name}",method=RequestMethod.PUT)
	public ResponseEntity<Boolean> empResponse(@PathVariable("name") String employeeName,@RequestBody Employee emp){
		System.out.println("Employee Name "+employeeName);
		System.out.println("Employee Name "+emp.getEmployeeName());
		//putting Customize headers in response
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("Key1", "Value1");
		httpHeaders.add("Key2", "Value2");
		
		return new ResponseEntity<Boolean>(false,httpHeaders,HttpStatus.NOT_FOUND);
		}
		
		/*
		 * Here we are directly specifying the return value as NOT Found but in the real scenario
		 * this should be in some if-else condition
		 */
	
	//**********************Insert new Record********************
		@RequestMapping(value="/employeeNew",method=RequestMethod.POST)
		public ResponseEntity<Void> insertNewRecord(@RequestBody Employee emp){
			System.out.println(emp.getEmployeeName());
		/*
			HttpHeaders httpHeaders=new HttpHeaders();
			httpHeaders.add(
				"Location",
				ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{name}")
				.buildAndExpand(emp.getEmployeeName().toUri().toString())
			*/
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
	//**********************Delete Record********************
		@RequestMapping(value="/employeeDel/{name}",method=RequestMethod.DELETE)
		public ResponseEntity<Boolean> deleteRecord(@PathVariable("name") String employeeName){
			System.out.println(employeeName);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
		
		//**********************Delete ALL Record********************
				@RequestMapping(value="/employeeDel",method=RequestMethod.DELETE)
				public ResponseEntity<Boolean> deleteRecord(){
					return new ResponseEntity<Boolean>(true,HttpStatus.OK);
				}
				
		
		
	}

