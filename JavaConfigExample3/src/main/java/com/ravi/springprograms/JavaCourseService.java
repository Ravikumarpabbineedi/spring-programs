package com.ravi.springprograms;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService{

	@Override
	public void courseInfo() {
		System.out.println("Core java,SpringBoot,Adv.java and Hibernate");
	}

}
