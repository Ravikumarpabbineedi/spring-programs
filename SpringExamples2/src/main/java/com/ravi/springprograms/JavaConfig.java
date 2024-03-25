package com.ravi.springprograms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean(name = "b")
	public Bus bus() {
		Bus bus=new Bus();
		
		bus.setBusType("Volvo");
		bus.setMaxSpeed(189);
		
		return bus;
	}
	
	@Bean(name = "c")
	public Car car() {
		Car car=new Car();
		
		car.setFuelType("Diesel");
		car.setMaxSpeed(150);
		
		return car;
	}
	
	@Bean(name = "t")
	public Traveller traveller() {
		Traveller traveller=new Traveller();
		traveller.setName("madhu");
		traveller.setEmail("madhu@kam.com");
		traveller.setNumber(9354841548l);
		traveller.setVehicle(car());
		
		return traveller;
	}
}
