package com.atmecs.builder;

public class PhoneMain {
	/*
	 * We can set the number of parameter by ourselves to and the sequence also doesn't matter
	 */
	
	public static void main(String args[]) {
		Phone p=new PhoneBuilder().setOs("Android").setBattery(4000).buildPhone();
		System.out.println(p);
	}

}
