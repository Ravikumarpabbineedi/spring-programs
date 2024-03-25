package com.ravi.springprograms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private JavaCourseService courseService;
	@Autowired
	private MessageService messageService;


	public void details() {
		messageService.message();
		courseService.courseInfo();
	}
}
