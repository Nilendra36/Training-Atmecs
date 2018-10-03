package com.atmecs.adapter;

public class School {
	
	public static void main(String args[]) {
		Pen p=new PenAdapter();
		Assignment assignment=new Assignment();
		assignment.setP(p);
		assignment.writeAssignment("Adapter Design pattern");
		
	}

}
