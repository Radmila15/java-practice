package day29_multid_arrays02;

import java.util.Arrays;

public class WarmUpTaskCapitals {

	public static void main(String[] args) {
                                      //0
		String [][]countriesArray = { {"USA","Washington DC"},//0
                {"Canada", "Ottawa"},//1
                {"Mexico", "Mexico City"},//2
                {"Brasil","Brasilia"},//3
                {"Peru","Lima"},//4
                {"Argentina","Buenos Aires"},//5
                {"Bolivia","La Paz"},//6
                {"Macedonia","Skopje"},//7
                {"Kazakhstan","Nursultan"}//8
            };
		//or another way
		//String [][] c = new String[9][2];
		//c[0][0] = "USA"; c[0][1] = "Washington DC";
		System.out.println(countriesArray[0][0] + " | " +countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + " | " +countriesArray[0][1]);
		System.out.println(countriesArray[5][0] + " | " +countriesArray[0][1]);
		System.out.println(Arrays.deepToString(countriesArray));
		
		//print all the countries in same line separated by |
		// we can use 2 different ways
		
		for (int i=0;  i<=countriesArray.length-1; i++) { 
			System.out.print(countriesArray[i][0] + " | ");
		}
		System.out.println();
		
		for (String[] country : countriesArray) {
			System.out.print(country[0] + " | ");
		}
		
		//get all the Cities and add to cities[] array
		String[] cities = new String[countriesArray.length];
		
		System.out.println(Arrays.deepToString(cities));
		
		for(int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.deepToString(cities));
		
		//Look for Bolivia the countriesArr and test if capital city is "La Paz"
		
		for (int row = 0; row < countriesArray.length; row++) {
			if(countriesArray[row][0].equals("Bolivia")) {
				//System.out.println(countriesArray[row][1]);
				if(countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Bolivia test failed");
				}
				break; //exit the loop
				}
			}
		}
		
 	}


