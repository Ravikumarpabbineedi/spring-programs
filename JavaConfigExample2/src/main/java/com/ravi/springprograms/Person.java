package com.ravi.springprograms;

public class Person {
	private String name;
	private String mail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void personInfo() {
		System.out.println("Your name..."+name);
		System.out.println("Your mail..."+mail);
	}
}
