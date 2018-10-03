package com.atmecs.accessors;

import com.atmecs.models.Employee;
import com.datastax.driver.mapping.Result;
import com.datastax.driver.mapping.annotations.Accessor;
import com.datastax.driver.mapping.annotations.Query;


@Accessor
public interface EmployeeAccessors {
	@Query("select * from employee")
	Result<Employee> findAll();
	
	
}
