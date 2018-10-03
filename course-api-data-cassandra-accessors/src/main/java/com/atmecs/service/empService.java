package com.atmecs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmecs.accessors.EmployeeAccessors;
import com.atmecs.models.Employee;
import com.atmecs.repository.EmployeeRepo;

@Service
public class empService {

	@Autowired
	private EmployeeAccessors easc;
	
	@Autowired
	private EmployeeRepo erp;
	
	public List<Employee> getAll(){
		List<Employee> list=new ArrayList<>();
		easc.findAll().forEach(list::add);
		return list;
	}
	
	public Optional<Employee> getById(Integer id) {
		return erp.findById(id);
	}
}
