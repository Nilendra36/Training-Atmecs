package com.atmecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.atmecs")
public class CourseApiDataCassandraAccessorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataCassandraAccessorsApplication.class, args);
	}
}
