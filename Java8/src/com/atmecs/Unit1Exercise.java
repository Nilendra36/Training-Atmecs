package com.atmecs;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people=Arrays.asList(new Person("Nilendra", "Mishra", 23),
				new Person("Akhand", "Mishra", 18));
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		printAll(people);
		firstNameStartingWithA(people);
		System.out.println("............Name started with N..............");
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("N");
			}
		});
		
		System.out.println("............Last started with M..............");
		printConditionally(people,new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("M");
			}
		});
	
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p:people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void firstNameStartingWithA(List<Person> people) {
		System.out.println("............Name started with A..............");
		for(Person p:people) {
			if(p.getFirstName().startsWith("A")) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		System.out.println("............List of Persons sorted by Age..............");
		for(Person p:people) {
			System.out.println(p);
		}
		
	}

}

interface Condition{
	boolean test(Person p);
}
