package com.learn.java8.features.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.learn.java8.features.optional.bean.Car;

public class TestOptional {
	
	
	public static List<Car> getCarList() {
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Benz", 2016, "Germany"));
		carList.add(new Car("Rolls Royce", 2015, "Russia"));
		carList.add(new Car("BMW", 2017, null));
		carList.add(new Car("Maruti", 2014, ""));
		return carList;
	}
	
	public static void main(String args[]) {
		
		
		List<Car> carList1=getCarList();
		/*for(Car c:carList1) {
			if(c.getCountry().equalsIgnoreCase("Germany")) {
				System.out.println(c.getCarName()+" car is from Germany");
			}
		}*/
		
		carList1.forEach(e -> e.getCountry()
								.filter(country -> country.equalsIgnoreCase("Germany"))
								.ifPresent(country -> System.out.println(e.getCarName()+" car is from Germany"))
				
				);
		
	/*	Optional<Car> carOptional = getCarList()
                .stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getCountry() != null && c.getCountry().equalsIgnoreCase("Germany"))
                .findFirst();
		*/
	
	}


}
