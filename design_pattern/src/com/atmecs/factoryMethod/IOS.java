package com.atmecs.factoryMethod;

public class IOS extends Phone {

	@Override
	protected void createPhone() {
		specs.add(new IOScamera());
		specs.add(new IOSprocessor());
		
		
	}

}
