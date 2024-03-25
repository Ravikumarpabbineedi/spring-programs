package com.ravi.springprograms;

public class Patient {

	private String name;
	private int age;
	private Doctor doctor;
	private Pharmacy pharmacy;
	
	
	public Patient(String name, int age, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}


	public void details() {
		doctor.doctorInfo();
		pharmacy.pharmacyInfo();
		System.out.println("Patient name is..."+name);
		System.out.println("Patient age is..."+age);
	}
}
