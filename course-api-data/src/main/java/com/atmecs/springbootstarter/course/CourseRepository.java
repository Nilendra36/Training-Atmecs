package com.atmecs.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String description);
	/*
	 * These abstract method will get their definition by Spring itself.
	 */
	
	public List<Course> findByTopicId(String topicId);
	
	/*
	 * we want to map Topic table whose id is topicId, that's why we have written like 
	 * findByTopicId {Topic->Class name & Id->primary key}
	 */

}
