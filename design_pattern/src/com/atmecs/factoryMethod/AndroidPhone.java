package com.atmecs.factoryMethod;

public class AndroidPhone extends Phone {

	@Override
	protected void createPhone() {
		specs.add(new AndroidCamera());
		specs.add(new AndroidProcessor());
		
	}

}
