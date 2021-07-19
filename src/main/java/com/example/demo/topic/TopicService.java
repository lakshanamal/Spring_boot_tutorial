package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topic =  Arrays.asList(
			new Topic("1","Lakshan","16 years old"),
			new Topic("2","Lakshani","17 years old"),
			new Topic("3","Lakshanika","15 years old")
			);
	public List<Topic> getAllTopic(){
		return topic;
	}
}
