package com.atmecs;


public class Greeter{ 
		
	public void greet() {
		System.out.println("Hello");
	}
	/*
	greetingFunction=()->System.out.println("Hello");
	doubleNumberFunction=(int a)->a*2;
	addNumberFunction=(int a,int b)->a+b;
	safeDivisionFunction=(int a,int b)->{
		if(b==0) return 0;
		else return a/b;
	};
	stringLengthCountFunction=(String str)->str.lenght();
	*/
	
	
	
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String args[]) {
		Greeter greet=new Greeter();
		greet.greet();
		Greeting helloGreeting=new HelloGreeting();
		greet.greet(helloGreeting);
		
		Greeting lambdaGreeting=()->System.out.println("Hello");
		Add addNumberFunction=(int a,int b)->a+b;
		System.out.println(addNumberFunction.add(5, 3));
		
		//Anonymous Class
		Greeting innerClassGreeting=new Greeting() {
			
			@Override
			public void perform() {
				// TODO Auto-generated method stub
				System.out.println("hello");
				
			}
		};
		
		helloGreeting.perform();
		lambdaGreeting.perform();
		innerClassGreeting.perform();
		greet.greet(lambdaGreeting);
		greet.greet(innerClassGreeting);
		
	}
	
	
	
	public interface Add{
		int add(int a,int b);
	}
	

}
