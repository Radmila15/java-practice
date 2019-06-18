package day39_arrayList04;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York"); 
		cities.add(0, "Paris");
		cities.add("Pittsburgh"); //
		cities.add(1, "Berlin"); //
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul"); 
		cities.add("Zurich"); //
		cities.add("Singapore"); //
		cities.add("Milan");
		cities.add("Toronto"); //
		cities.add("London");//
		cities.add("Lima"); //
		cities.add("Vladikavkaz");

		// 1) FOR EACH LOOP: Print each city in same line separated by |
		for (String city : cities) {
			System.out.print(city + " | ");
		}
		System.out.println(); // empty line

		// 2) FOR LOOP : Print each city in same line separated by |
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");
		}
		System.out.println();

		// 3) ToString. Print eah City all uppercase
		System.out.println(cities.toString().toUpperCase());
		System.out.println(cities);

		// 4) Make each city all uppercase
		String paris = cities.get(0).toUpperCase();
		System.out.println(paris);

		cities.set(0, paris); // we updating it here
		System.out.println(cities.get(0));

		cities.set(1, cities.get(1).toUpperCase());

		for (int j = 0; j < cities.size(); j++) {
			String city = cities.get(j).toUpperCase();
			cities.set(j, city);
		}
		System.out.println(cities.toString());

		// 5) Find the longest and shortest cities.
		String longestCity = "";
		String shortestCity = "";

		for (String city : cities) {
			if (city.length() > longestCity.length()) {
				longestCity = city;
			}

		}
		shortestCity = cities.get(0);
		for (String city : cities) {
			if(city.length() < shortestCity.length()) {
				shortestCity = city;
			}

		}
		System.out.println("The longest city is: " + longestCity);
		System.out.println("The shortest city is: " + shortestCity);
		
		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		//assign all cities that have more than 6 chars to this arrayList
		
		for (String ct : cities) {
			if (ct.length() > 6) {
				citiesMoreThan6.add(ct);
			}
		}
		System.out.println(citiesMoreThan6);
	}

}
