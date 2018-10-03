package com.atmecs.builder;

public class Phone {
	
	private String os;
	private String processor;
	private int battery;
	private int screen_size;
	private int ram;
	
	public Phone(String os, String processor, int battery, int screen_size,int ram) {
		super();
		this.os = os;
		this.processor = processor;
		this.battery = battery;
		this.screen_size = screen_size;
		this.ram=ram;
	}
	
	@Override
	public String toString() {
		return "OS "+os+" Processor "+processor+" Battery Capacity "+battery+" Screen Resolution "+screen_size
				+" RAM Size "+ram;
		
	}
	
}
