package com.ravi.springprograms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean(name ="g")
	public GreetingsImpl greet() {
		
		return new GreetingsImpl();
	}
}
