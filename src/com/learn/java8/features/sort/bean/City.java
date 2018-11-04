package com.learn.java8.features.sort.bean;

import java.util.List;

public class City {
	
	private String cityName;
	private int population;
	private int squareArea;
	private String rainfall;
	
	public City(String cityName, int population, int squareArea, String rainfall) {
		this.cityName = cityName;
		this.population = population;
		this.squareArea = squareArea;
		this.rainfall = rainfall;
	}

	public String getCityName() {
		return cityName;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public int getSquareArea() {
		return squareArea;
	}
	
	public String getRainfall() {
		return rainfall;
	}
	
	public String toString(City obj) {
		return "City Name : "+obj.getCityName()+" Population : "+obj.getPopulation()+" Rainfall : "+obj.getRainfall();
	
	}
	
	

}
