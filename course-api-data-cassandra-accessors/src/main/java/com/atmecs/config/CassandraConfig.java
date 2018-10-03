package com.atmecs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atmecs.accessors.EmployeeAccessors;
import com.atmecs.models.Employee;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;

@Configuration
public class CassandraConfig {
	
	/*@Value("${cassandra.port")
	private String host;
	
	@Value("${cassandra.keyspace-name}")
	private String keyspace;
	*/
	@Bean
	public Session session() {
		Cluster cluster=Cluster.builder().addContactPoint("localhost").build();
		return cluster.connect("nilendra");
	}
	
	@Bean
	public MappingManager mappingManager() {
		return new MappingManager(session());
	}
	
	@Bean
	public EmployeeAccessors employeeAccessors() {
		return mappingManager().createAccessor(EmployeeAccessors.class);
	}
	
	@Bean
	public Mapper<Employee> mapperEmployee(){
		return  mappingManager().mapper(Employee.class);
	}
	
	

}
