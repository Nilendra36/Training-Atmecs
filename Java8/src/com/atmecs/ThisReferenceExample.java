package com.atmecs;

public class ThisReferenceExample {

	public void doProcess(int i,Process p) {
		p.process(i);
	}
	
	public void doExecute() {
		doProcess(10, i->{
			System.out.println("value of i is : "+i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample rex=new ThisReferenceExample();
		/*
		 * rex.doProcess(10, new Process() {
		 
			
			
			 * In static method we can't access this keyword but here we are able to use it
			 * because we are using "this" under instance of Anonymous inner class. 
			 * @see com.atmecs.Process#process(int)
			 
			@Override
			public void process(int i) {
				System.out.println("value of i is : "+i);
				System.out.println(this);
				
			}
			
			
			
		});
		 	*/
		rex.doProcess(10,i->{
			System.out.println("value of i is : "+i);
			//System.out.println(this);
			
			});
		
		rex.doExecute();
		
		
		
		

	}
	
	public String toString(){
		return "This is an Anonymous inner Class";
	}

}
