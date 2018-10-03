package com.atmecs;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> peopleList=Arrays.asList(new Person("Nilendra","Mishra",23),
				new Person("Akhand","Prakash",18));
		
		//Stream is used for the parallel execution of processes
		
		peopleList.stream()
		.filter(p->p.getFirstName().endsWith("a"))
		.forEachOrdered(p->System.out.println(p.getFirstName()));

		long count=peopleList.stream().filter(p->p.getFirstName().endsWith("a")).count();
		System.out.println(count);
		
	
	}
	
	

}
