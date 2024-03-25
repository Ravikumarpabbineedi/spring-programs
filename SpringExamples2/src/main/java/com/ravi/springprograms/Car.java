package com.ravi.springprograms;

public class Car implements Vehicle{

	private String fuelType;
	private int maxSpeed;
	
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("Your car type..."+fuelType);
		System.out.println("Your car speed..."+maxSpeed);
	}

}
