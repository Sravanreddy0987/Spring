package com.example.topiccourses.copy;

import java.util.Arrays;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Coursecontroler {
	@Autowired
	

	public TopicService topicservice;
@RequestMapping("/topic")
public List<Course>getalltopic(){
	return topicservice.getalltopics();}

		
@RequestMapping("/topic/{id}")
public Course gettopic(@PathVariable String id){
	return topicservice.gettopic(id);}

@RequestMapping(method=RequestMethod.POST ,value="/topic")
public void addtopic(@RequestBody Course topic)
{	
topicservice.addtopic(topic);
}

@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
public void updatetopic(@RequestBody Course topic ,@PathVariable String id)
{	
topicservice.updatetopic(id,topic);
}

@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
public void delete(@PathVariable String id)
{	
topicservice.delete(id);
}

}







