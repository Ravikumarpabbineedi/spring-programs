package com.ravi.springprograms;

public class Doctor {

	private String doctorId;
	private String doctorName;
	public Doctor(String doctorId, String doctorName) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}
	
	public void doctorInfo() {
		System.out.println("Your Consulting Doctor name is..."+doctorName);
		System.out.println("Your Consulting Doctor id is..."+doctorId);
	}
}
