package com.learn.java8.features.optional.bean;

import java.time.LocalDate;
import java.util.Optional;

public class Car {
	
	private String carName;
	private int year;
	private String country;
	
	public Car(String carName, int year, String country) {
		this.carName = carName;
		this.year = year;
		this.country = country;
	}

	public String getCarName() {
		return carName;
	}

	public int getYear() {
		return year;
	}

	/*public String getCountry() {
		return country;
	}*/
	
	public Optional<String> getCountry() {
		  return Optional.ofNullable(country);
		}
	

}
