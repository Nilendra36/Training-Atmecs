package com.atmecs.employeeRegistrationcontroller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)




public @interface IsValidHobby {
	String listOfValidHobbies();
	
	String message()default "Please enter a valid hobby; "+
			"Accepted hobbies are - Music,Football,Cricket and Hockey(Select anyone)";
	Class<?>[] groups()default{};
	Class<? extends Payload>[] payload() default{};

}
