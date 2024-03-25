package com.ravi.springprograms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConifg {
	
	@Bean(name = "s")
	public Person info1() {
		Person person1=new Person();
		
		person1.setName("ravi");
		person1.setMail("ravi@mail.com");
		
		return person1;
	}
	
	@Bean(name="s1")
	public Person info2() {
		Person person2=new Person();
		
		person2.setName("madhu");
		person2.setMail("madhu@mail.com");
		
		return person2;
	}
}
