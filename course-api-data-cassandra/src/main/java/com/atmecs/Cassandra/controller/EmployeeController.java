package com.atmecs.Cassandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.Cassandra.services.EmployeeServices;
import com.atmecs.Cassandra.models.*;
import java.util.*;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServices empService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}
	
	@RequestMapping("/employees/{id}")
	public Optional<Employee> getEmployeeByID(@PathVariable Integer id) {
		return empService.getEmpbyID(id);
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee emp) {
		empService.addEmployee(emp);
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.PUT)
	public void updateEmployeeById(@PathVariable Integer id,@RequestBody Employee emp){
		empService.updateEmployee(id, emp);
	}
	
	@RequestMapping(value="/employee",method=RequestMethod.DELETE)
	public void deleteEmployeeById(@PathVariable Integer id) {
		empService.deleteByID(id);
	}
	
	@RequestMapping(value="/employeeSkills/{id}",method=RequestMethod.GET)
	public List<String> getSkillsById(@PathVariable Integer id) {
		Employee e=(empService.getEmpbyID(id)).get();
		return e.getSkills();
	}

}
