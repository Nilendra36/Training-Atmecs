package com.atmecs.springbootstarter.topic;

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
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	/*
	 private List<Topic> topics=new ArrayList<>(Arrays.asList(
	 
			
			 * By adding new ArrayList we have just made our List to be mutable
			 * because Arrays.asList is immutable, so that when we make any change to our 
			 * list it can reflect to the List
			 
			new Topic("SpringMVC","JAVA","Completed"),
			new Topic("SpringBoot","JAVA","Started"),
			new Topic("Cassandra","Database","Yet to Start")
			));
			*/
	public List<Topic> getAllTopics(){
		//return topics;
		List <Topic> topic=new ArrayList<>();
		topicRepo.findAll().forEach(topic::add);
		return topic;
		
	}
	
	public Optional<Topic> getTopic(String id){
		/*
		  Iterator<Topic> itr=topics.iterator();
		 
			while(itr.hasNext()) {
			Topic topic=itr.next();
			if(topic.getId().equals(id)) {
				return topic;
				}
			}
			return null;
		*/
		return topicRepo.findById(id);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepo.save(topic);
	}
	
	public void updateTopic(String id,Topic topic) {
		/*
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
			
		}
		*/
		topicRepo.save(topic);
	}
	
	public void deleteTopic(String id) {
		/*
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}
	}
	*/
		topicRepo.deleteById(id);
	}
			

}
