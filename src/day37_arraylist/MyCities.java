package day37_arraylist;
import java.util.*;
public class MyCities {

	public static void main(String[] args) {
		ArrayList<String> cities= new ArrayList<>();
		cities.add("Vladikavkaz");
		cities.add("Alagir");
		cities.add("Ardon");
		cities.add("Beslan");
		cities.add("Mozdok");
		cities.add("Digora");
		
		// print each city using for loop separated by space
		
		for (String city : cities) {
			System.out.print(city + " ");
		}
		System.out.println();
		//print each city using for loop, separated by space
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " ");
		}
			//remove Beslan
		System.out.println();
			System.out.println("Removing Beslan");
			cities.remove("Beslan");
			cities.remove("New York"); // it will not remove and do not show error
			System.out.println(cities.toString());
			
			//isEmpty?
			System.out.println("Is list empty?" + cities.isEmpty());
			cities.add(4, "Washington D.C.");
			
			System.out.println(cities.toString());
			cities.add(5, "New York");
			System.out.println(cities.toString());
			
			cities.set(2,  "Seoul");
			System.out.println(cities.toString());
			
			//find Digora in the list and give the index
			int idx = cities.indexOf("Digora");
			System.out.println("Digora index: " + idx);
			cities.set(idx, "Los Angeles");
			
			System.out.println(cities.toString());
			
			cities.clear();
			boolean empty = cities.isEmpty();
			System.out.println("Empty " + empty);
			
			
	}

}
