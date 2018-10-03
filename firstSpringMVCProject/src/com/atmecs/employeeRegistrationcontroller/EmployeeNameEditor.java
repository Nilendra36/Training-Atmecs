package com.atmecs.employeeRegistrationcontroller;

import java.beans.PropertyEditorSupport;

public class EmployeeNameEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String employeeName)throws IllegalArgumentException{
		if(employeeName.contains("Mr.") || employeeName.contains("Ms.")) {
			setValue(employeeName);
		}
		else {
			employeeName="Mr."+employeeName;
			setValue(employeeName);
		}
	}

}
