package com.atmecs.singleton;

public class Singleton {
	
	/*
	 * static Singleton obj=new Singleton();
	 * In this case It will always be in the memory even if we don't required it
	 * this is called eager;
	 */
	
	static Singleton obj;
	
	private Singleton() {
		System.out.println("Object has been created");
	}
	
	//In order to avoid Thread related problem if we put synchronized keyword with
	//getInstance method it will reduce the performance
	//Instead we can used Double Checked 
	static Singleton getInstance() {
		if(obj==null) /*
		*We are checking this condition so that one can create only one instance of a class
		*/{
			synchronized (Singleton.class) {
				if(obj==null)
				obj=new Singleton();
				
			}
			
		//Lazy--Instance will get created at the time of calling the getInstance method only.
	}
		return obj;
	}

}

class Test{
public static void main(String args[]) {
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			Singleton obj1=Singleton.getInstance();
			
		}
	});
	
	Thread t2=new Thread(new Runnable() {
		public void run() {
			Singleton obj2=Singleton.getInstance();
		}
	});
	
	//Singleton obj=Singleton.getInstance();
	//Here we can create only one instance of a Class.
	
	t1.start();
	t2.start();
	}

}
