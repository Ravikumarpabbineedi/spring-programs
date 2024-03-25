package com.ravi.springprograms;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

	@Override
	public void message() {
		System.out.println("Mail sent to your mail please check once");
	}

}
