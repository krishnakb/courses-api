package com.example.courses.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> topics() {
		return Arrays.asList(
				new Topic("1", "java", "Basic Java"),
				new Topic("2", "spring", "Java with Spring"),
				new Topic("3", "spring MVC", "MVC Deep Dive")
				);
				
	}
	
}
