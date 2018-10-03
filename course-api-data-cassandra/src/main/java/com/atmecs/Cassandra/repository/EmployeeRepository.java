package com.atmecs.Cassandra.repository;


import org.springframework.data.repository.CrudRepository;
import com.atmecs.Cassandra.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
	

}
