package com.ravi.springprograms;

public class Traveller {
	private String name;
	private String email;
	private long number;
	Vehicle vehicle;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public void startJourney() {
		System.out.println("Your Name..."+name);
		System.out.println("Your Email..."+email+" and number..."+number+" check once...");
		vehicle.move();
	}
}
