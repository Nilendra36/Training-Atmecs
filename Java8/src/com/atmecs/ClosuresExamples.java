package com.atmecs;

public class ClosuresExamples {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		doProcess(a,i->System.out.println(i+b));
		/*
		 * When we use any variable with lambda, compiler automatically makes that variable as
		 * the final.
		 * here b is a final variable even though we haven't used final key. 
		 */
		

	}

	private static void doProcess(int a, Process object) {
		object.process(a);
		
	}

}
interface Process{
	void process(int i);
}
