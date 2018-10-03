package com.atmecs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(new Person("Nilendra", "Mishra", 23),
				new Person("Akhand", "Mishra", 18));
		
		Collections.sort(people, (p1,p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		 
		printConditionally(people, p->true,p->System.out.println(p));
		
		
		printConditionally(people,p->p.getFirstName().startsWith("N"),p->System.out.println(p.getFirstName()));
		
		printConditionally(people,p->p.getLastName().startsWith("M"),p->System.out.println(p.getLastName()));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> condition,Consumer<Person> consume) {
		for(Person p:people) {
			if(condition.test(p)) {
				consume.accept(p);;
			}
		}
		
	}

}
