package com.atmecs;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		/*
		 *Thread thread=new Thread(()->printmessage());
		 *thread.start();
		 */
		Thread thread=new Thread(MethodReferenceExample1::printmessage);
		thread.start();
	}

	private static void printmessage() {
		System.out.println("Hello");
	}

}
