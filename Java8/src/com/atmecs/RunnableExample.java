package com.atmecs;

public class RunnableExample {
	public static void main(String args[]) {
	Thread thread= new Thread(new Runnable() {
		
		@Override
		public void run() {
		System.out.println("Thread is Runnnig Successfully");
			
		}
	}); 
	
	Thread myLambdaThread=new Thread(()->System.out.println("Lambda Thread is also Running Successfull"));
	thread.run();
	myLambdaThread.run();
	
	}
	
}
