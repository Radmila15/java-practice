package day42_customclasses_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCoffees {
	
	public static ArrayList appendPosSum(ArrayList<Integer> nums) {
		ArrayList<Integer> val = new ArrayList<>();
		Integer sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			if(nums.get(i)>0) {
				val.add(nums.get(i));
				sum = sum + nums.get(i);
			}
		}
		val.add(sum);
		return val;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(4,-6,3,-8,0,4,3));

		ArrayList<Integer> values2 = new ArrayList<>();
		String str = "gfjhgfhjgfjh";
		values2 = appendPosSum(values);
		
		
//		for (Integer integer : values2) {
			System.out.println(values2);
//			
//		}
		
//		Coffee.count = 12;
//		Coffee coffee1 = new Coffee();
//		
//		//Coffee coffee2 = new Coffee();
//		
//		coffee1.name = "ICED CARAMEL MACCHIATO";
//		coffee1.size = "GRANDE";
//		coffee1.price = 4.75;
//		coffee1.calories = 250;
//
//		coffee1.getCoffeeInfo();
//		
//
//		Coffee coffee2 = new Coffee();
//		coffee2.setName("JAVA CHIP");
//		coffee2.size = "VENTI";
//		coffee2.price = 5.95;
//		coffee2.calories = 600;
//		
//		coffee2.getCoffeeInfo();
//		
//		Coffee coffee3 = new Coffee();
//		coffee3.setName("ICED COFFEE");
//		coffee3.setSize("TALL");
//		coffee3.setPrice(2.45);
//		coffee3.setCalories(60);
//		System.out.println("------------");
//		System.out.println(coffee3.count);
//		System.out.println("------------");
//		System.out.println(coffee1.count);
//		System.out.println("------------");
//		coffee1.count = 999;
//		System.out.println("------------");
//		System.out.println(coffee2.count);
//		
//		System.out.println("coffee3 name: " + coffee3.name);
//		coffee3.getCoffeeInfo();
//		
//		Coffee coffee4 = new Coffee();
//		coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
//		coffee4.getCoffeeInfo();

	}

}
