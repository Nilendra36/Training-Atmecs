package com.atmecs;

public class TypeInferenceExample {

	public static void main(String[] args) {
		Length stringLengthFunction=s->s.length();
		System.out.println(stringLengthFunction.stringLength("Hello Nilendra"));
		printLambda(s->s.length());
	}
	
	
	public static void printLambda(Length l) {
		System.out.println(l.stringLength("Hello Shubham"));
	}
	
	public interface Length {
		int stringLength(String str);
	}

}
