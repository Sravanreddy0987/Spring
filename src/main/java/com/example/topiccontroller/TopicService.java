package com.example.topiccontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	@Autowired
	private TopicRepository topicrepository;
	/*public List<Topic> topics=new ArrayList<> (Arrays.asList(
				
				new Topic("java","corejava","core java description"),
				
				
				new Topic("javascript","javafrontend","java script description"),
				new Topic("springjava","springcore","core java description")

				));*/

	public List<Topic>getalltopics(){
		//return topics;
		List<Topic>topics=new ArrayList<>();
	topicrepository.findAll().
	forEach(topics::add);
		return topics;
	}
	
	public Topic gettopic(String id){
	// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicrepository.findOne(id);
	}

	public void addtopic(Topic topic) {
	 topicrepository.save(topic);
		
	}


	public void updatetopic(String id, Topic topic) {
		/*for(int i=0;i<topics.size();i++){
			Topic t=topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i,topic);//updated topic
				return ;
			}
			
		}*/
		topicrepository.save(topic);
		
		
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
	//	topics.removeIf(t-> t.getId().equals(id));
		topicrepository.delete(id);
		
		
	}

	
	
	
	
	
}
