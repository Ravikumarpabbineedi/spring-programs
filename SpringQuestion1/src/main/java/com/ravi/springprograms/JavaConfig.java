package com.ravi.springprograms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Doctor doctor() {
		Doctor doctor = new Doctor("M150","Dr.Ratan Garu");
		return doctor;
	}
	
	@Bean
	public Pharmacy pharmacy() {
		Pharmacy pharmacy = new Pharmacy("Appollo Pharmacy", "Kakinda");
		return pharmacy;
	}
	
	@Bean
	public Patient patient() {
		Patient patient = new Patient("Student1",22,doctor(), pharmacy());
		return patient;
	}
}
