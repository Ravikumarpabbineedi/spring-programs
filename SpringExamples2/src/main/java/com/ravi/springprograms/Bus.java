package com.ravi.springprograms;

public class Bus implements Vehicle{

	private String busType;
	private int maxSpeed;

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("Bus type..."+busType);
		System.out.println("Bus max speed..."+maxSpeed);
	}
}
