package com.atmecs.factoryMethod;

public class FactoryMain {

	public static void main(String[] args) {
		
		Phone ios=Factory_of_OS.getPhone(PhoneType.IOS);
		Phone android=Factory_of_OS.getPhone(PhoneType.Android);
		Phone windows=Factory_of_OS.getPhone(PhoneType.Windows);
		
		System.out.println(ios);

	}

}
