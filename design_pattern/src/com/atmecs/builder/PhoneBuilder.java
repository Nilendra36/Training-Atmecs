package com.atmecs.builder;

public class PhoneBuilder {
	private String os;
	private String processor;
	private int battery;
	private int screen_size;
	private int ram;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public PhoneBuilder setScreen_size(int screen_size) {
		this.screen_size = screen_size;
		return this;
	}
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public Phone buildPhone() {
		return new Phone(os,processor,battery,screen_size,ram);
	}

	
	
	
	

}
