package com.atmecs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atmecs.models.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
