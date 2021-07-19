package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.TopicService;

@RestController
public class HelloController {


	
	@RequestMapping("/hello")
	public String hello() {
		return "hi";
	}
}
