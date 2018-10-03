
package com.atmecs.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CourseApi {

	public static void main(String[] args) {
		
		SpringApplication.run(CourseApi.class, args);
		
	}

}
