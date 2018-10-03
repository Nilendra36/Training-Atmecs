package com.atmecs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(new Person("Nilendra", "Mishra", 23),
				new Person("Akhand", "Mishra", 18));
		printComparison(people,p->true,System.out::println);//p->method(p)

	}

	private static void printComparison(List<Person> people, Predicate<Person> condition, Consumer<Person> consume) {
		for(Person p:people) {
			if(condition.test(p))
			consume.accept(p);
		}
		
	}

}
