package com.ravi.springprograms;

public class GreetingsImpl implements Greetings{

	public GreetingsImpl() {
		System.out.println("object created");
	}

	@Override
	public void greet() {
		System.out.println("First Spring project");
	}

}
