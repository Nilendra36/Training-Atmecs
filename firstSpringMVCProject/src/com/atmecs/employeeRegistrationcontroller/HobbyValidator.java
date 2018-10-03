package com.atmecs.employeeRegistrationcontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby,String>{

	private String listOfValidHobbies;
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies=isValidHobby.listOfValidHobbies();
		
	}
	
	@Override
	public boolean isValid(String employeeHobby, ConstraintValidatorContext ctx) {
		if(employeeHobby==null) {
			return false;
		}
		
		/*
		 * if(studentHobby.matches("Music|Football|Cricket|Hockey|Dancing")){
		 */
		if(employeeHobby.matches(listOfValidHobbies)) {	
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
