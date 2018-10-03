package com.atmecs.factoryMethod;

public class Windows extends Phone {

	@Override
	protected void createPhone() {
		specs.add(new WindowsCamera());
		specs.add(new WindowsProcessor());
		
	}

}
