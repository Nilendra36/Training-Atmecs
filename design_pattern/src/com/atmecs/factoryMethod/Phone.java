package com.atmecs.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
	protected List<OS> specs=new ArrayList<>();
	
	public Phone() {
		createPhone();
	}

	protected abstract void createPhone();

	@Override
	public String toString() {
		return "Phone [specs=" + specs + "]";
	}
	
	

}
