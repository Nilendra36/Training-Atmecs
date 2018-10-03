package com.atmecs.composite;

public class CompositeTest {
	public static void main(String args[]) {
		Component hdd=new Leaf(2000,"HDD");
		Component mouse=new Leaf(500,"Mouse");
		Component keyboard=new Leaf(800,"Keyboard");
		Component ram=new Leaf(4000,"RAM");
		Component cpu=new Leaf(8000,"CPU");
		
		Composite computer=new Composite("Computer");
		Composite peripheral=new Composite("Peripheral Devices");
		Composite motherboard=new Composite("Motherboard");
		Composite cabinet=new Composite("Cabinet");
		
		computer.addComponent(cabinet);
		computer.addComponent(peripheral);
		
		cabinet.addComponent(hdd);
		cabinet.addComponent(motherboard);
		
		peripheral.addComponent(mouse);
		peripheral.addComponent(keyboard);
		
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		
		mouse.showPrice();
		
		computer.showPrice();
		
	}

}
