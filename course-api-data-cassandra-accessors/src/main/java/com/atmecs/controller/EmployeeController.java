package com.atmecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.models.Employee;
import com.atmecs.service.empService;

@RestController
public class EmployeeController {
	
	@Autowired
	private empService service;
	
	@RequestMapping("/accessEmployee")
	public List<Employee> getAllEmployee(){
		return service.getAll();
	}

}
