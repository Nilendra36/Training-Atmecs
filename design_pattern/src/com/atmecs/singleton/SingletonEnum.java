package com.atmecs.singleton;

public class SingletonEnum {
	public static void main(String args[]) {
		TestEnum obj=TestEnum.INSTANCE;
		obj.i=5;
		obj.check();
		
		TestEnum obj2=TestEnum.INSTANCE;
		obj2.i=6;
		obj2.check();
		

	}

}

enum TestEnum{
	INSTANCE;
	int i;
	public void check() {
		System.out.println(i);
	}
}