package com.ravi.springprograms;

public class Pharmacy {

	private String pharmacyName;
	private String pharmacyLocation;
	public Pharmacy(String pharmacyName, String pharmacyLocation) {
		super();
		this.pharmacyName = pharmacyName;
		this.pharmacyLocation = pharmacyLocation;
	}
	
	public void pharmacyInfo() {
		System.out.println("Pharmacy name is..."+pharmacyName);
		System.out.println("Pharmacy location is..."+pharmacyLocation);
	}
}
