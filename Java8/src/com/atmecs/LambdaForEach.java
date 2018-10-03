package com.atmecs;

import java.util.Arrays;
import java.util.List;

public class LambdaForEach {

	public static void main(String[] args) {
		List<Person> peopleList=Arrays.asList(new Person("Nilendra","Mishra",23),
				new Person("Akhand","Prakash",18));
		
		//Method 1 for iterating over a List
		for(int i=0;i<peopleList.size();i++) {
			System.out.println(peopleList.get(i));
		}
		
		//Method 2 for iterating over a List
		for(Person p : peopleList) {
			System.out.println(p);
		}
		
		//Java8 has introduced new way to iterate over a List using forEach method
		//	peopleList.forEach(p->System.out.println(p));
		peopleList.forEach(System.out::println);
		
	}

}
