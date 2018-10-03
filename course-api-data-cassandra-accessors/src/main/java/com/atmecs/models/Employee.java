package com.atmecs.models;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;



@Table(name="employee")
public class Employee {
	
	@PartitionKey
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="salary")
	private float salary;
	@Column(name="dept")
	private String dept;
	@Column(name="skills")
	private Set<String> skills;
	@Column(name="projects")
	private List<String> projects;
	@Column(name="phone")
	private Map<String,String> phone;
	
	
	/*
	public Employee(int id, String name, int age, float salary, String dept, List<String> skills, List<String> projects,
			Map<String, String> phone) {
		
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.skills = skills;
		this.projects = projects;
		this.phone = phone;
	}
	*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getPhone() {
		return phone;
	}
	public void setPhone(Map<String, String> phone) {
		this.phone = phone;
	}
	

}
