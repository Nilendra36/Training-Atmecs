package com.atmecs.springbootstarter.course;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*
 * Business Services are Singleton in Nature..at the time of loading the project an instance
 * of this class is created by the Spring and that instance is get saved in the memory area
 * of the Spring and whenever a controller required these services it get injected by the
 * Spring to those controllers.  
 */

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	/*
	 private List<course> courses=new ArrayList<>(Arrays.asList(
	 
			
			 * By adding new ArrayList we have just made our List to be mutable
			 * because Arrays.asList is immutable, so that when we make any change to our 
			 * list it can reflect to the List
			 
			new course("SpringMVC","JAVA","Completed"),
			new course("SpringBoot","JAVA","Started"),
			new course("Cassandra","Database","Yet to Start")
			));
			*/
	public List<Course> getAllCourses(String topicId){
		//return courses;
		List <Course> course=new ArrayList<>();
		courseRepo.findByTopicId(topicId).forEach(course::add);
		return course;
		
	}
	
	public Optional<Course> getcourse(String id){
		/*
		  Iterator<course> itr=courses.iterator();
		 
			while(itr.hasNext()) {
			course course=itr.next();
			if(course.getId().equals(id)) {
				return course;
				}
			}
			return null;
		*/
		return courseRepo.findById(id);
	}
	
	public void addcourse(Course course) {
		//courses.add(course);
		courseRepo.save(course);
	}
	
	public void updatecourse(String id,Course course) {
		/*
		for(int i=0;i<courses.size();i++) {
			course t=courses.get(i);
			if(t.getId().equals(id)) {
				courses.set(i, course);
				return;
			}
			
		}
		*/
		courseRepo.save(course);
	}
	
	public void deletecourse(String id) {
		/*
		for(int i=0;i<courses.size();i++) {
			course t=courses.get(i);
			if(t.getId().equals(id)) {
				courses.remove(i);
				return;
			}
		}
	}
	*/
		courseRepo.deleteById(id);
	}
			

}
