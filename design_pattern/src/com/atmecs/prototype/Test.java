package com.atmecs.prototype;

public class Test {
	public static void main(String args[]) throws CloneNotSupportedException {
		Bookshop shop=new Bookshop();
		shop.setName("Novelty");
		shop.loadData();
		
		
		
		Bookshop newshop=shop.clone();
		shop.getBooks().remove(2);
		System.out.println(shop);
		newshop.setName("Classmate");
		
		
		System.out.println(newshop);
		
	}

}
