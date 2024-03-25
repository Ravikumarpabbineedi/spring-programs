package com.ravi.springprograms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JavaConfig {
//	@Bean
//	public EmailService emailService() {
//		return new EmailService();
//	}
//	@Bean
//	public JavaCourseService javaCourseService() {
//		return new JavaCourseService();
//	}
//	@Bean
//	public Student student() {
//		Student student = new Student();
//		
//		student.setCourseService(javaCourseService());
//		student.setMessageService(emailService());
//		return student;
//	}
}
