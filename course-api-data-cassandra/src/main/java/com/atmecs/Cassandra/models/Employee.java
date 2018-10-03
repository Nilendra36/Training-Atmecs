package com.atmecs.Cassandra.models;

import java.util.List;
import java.util.Map;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Employee {
	
	
	@PrimaryKey
	private int id;
	private String name;
	private int age;
	private float salary;
	private String dept;
	private List<String> skills;
	private List<String> projects;
	private Map<String,String> phone;
	
	
	public Employee(){}
	
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

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
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
