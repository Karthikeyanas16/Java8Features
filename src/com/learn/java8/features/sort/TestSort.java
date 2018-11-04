package com.learn.java8.features.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.learn.java8.features.sort.bean.City;

public class TestSort {

	public static List<City> getCityList() {

		List<City> cityList = new ArrayList<City>();
		cityList.add(new City("London", 1230002, 98990, "true"));
		cityList.add(new City("Paris", 1100000, 73828, "true"));
		cityList.add(new City("NY", 3420000, 75773, "false"));
		cityList.add(new City("LA", 4625881, 78967, "false"));
		cityList.add(new City("SFO", 7896393, 90898, "false"));
		cityList.add(new City("Atlanda", 7896393, 90898, "true"));
		return cityList;	

	}


	public static void main(String args[]) {
		List<City> cityList = getCityList();
		System.out.println("*********Before sorting*************");

		for (City cityName : cityList) {
			System.out.println("cityName 	--->" + cityName.getCityName() + "	 --->" + cityName.getPopulation()+ " 	--->" + cityName.getSquareArea());
		}

		System.out.println("*********After sorting*************");
		cityList.sort(Comparator.comparing(City::getRainfall).reversed().thenComparing(City::getCityName));

		cityList.forEach(e -> System.out.println(e.getCityName() + " 			: " + e.getPopulation() + " 	: " + e.getSquareArea() + " 	: "+e.getRainfall()));

	}

}
