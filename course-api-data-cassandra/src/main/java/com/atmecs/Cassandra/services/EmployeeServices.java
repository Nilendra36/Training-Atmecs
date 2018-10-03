package com.atmecs.Cassandra.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmecs.Cassandra.models.Employee;
import com.atmecs.Cassandra.repository.EmployeeRepository;
@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployee(){
		List<Employee> list=new ArrayList<Employee>();
		empRepo.findAll().forEach(list::add);
		return list;
	}
	
	public Optional<Employee> getEmpbyID(Integer id) {
		return empRepo.findById(id);
	}
	
	public void addEmployee(Employee emp) {
		empRepo.save(emp);
	}
	
	public void updateEmployee(Integer id,Employee emp) {
		empRepo.save(emp);
	}
	
	public void deleteByID(Integer id) {
		empRepo.deleteById(id);
	}
	
	
	
	

}
