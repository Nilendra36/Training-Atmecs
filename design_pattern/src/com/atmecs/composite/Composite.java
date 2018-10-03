package com.atmecs.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private String name;
	private List<Component> components=new ArrayList<>();
	
	public Composite(String name) {
		this.name=name;
	}

	public void addComponent(Component cmp) {
		components.add(cmp);
	}
	
	@Override
	public void showPrice() {
		
		System.out.println(name);
		for(Component cmp:components) {
			cmp.showPrice();
		}
		
	}
	
	
	
}
