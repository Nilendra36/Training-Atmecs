package com.atmecs.employeeRegistrationcontroller;

import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"employeeSkills","employeeAddress"})
@JsonPropertyOrder({"Employee Name","projectName","employeeDOB","employeeSkills","employeeAddress","hobby"})
public class Employee {
	@JsonProperty("Employee_Name")
	private String employeeName;
	/*
	 * @Size(min=2,max=20,message="Please enter a valid value for Project field between {min} and {max} characters")
	 * We are putting all these customize messages into employemessages.properties file
	 */
	@Size(min=2,max=20)
	private String projectName;
	private Long employeeMobile;
	@Past
	private Date employeeDOB;
	private ArrayList<String> employeeSkills;
	private Address employeeAddress;
	@IsValidHobby(listOfValidHobbies="Music|Football|Cricket|Hockey|Dancing")
	private String hobby;
	
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName=projectName;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setEmployeeMobile(Long employeeMobile) {
		this.employeeMobile=employeeMobile;
	}
	
	public Long getEmployeeMobile() {
		return employeeMobile;
	}
	
	public void setEmployeeDOB(Date employeeDOB) {
		this.employeeDOB=employeeDOB;
	}
	
	public Date getEmployeeDOB() {
		return employeeDOB;
	}
	
	public void setEmployeeSkills(ArrayList<String> employeeSkills) {
		this.employeeSkills=employeeSkills;
	}
	
	public ArrayList<String> getEmployeeSkills(){
		return employeeSkills;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
