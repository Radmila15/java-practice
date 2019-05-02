package day34_method_06;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		printWords("red", "blue", "yellow"); // 3 values
		printWords("grey"); // one value
		printWords(); // empty. so array will be empty array.
		
		System.out.println(sum(3,5,10));
		System.out.println(sum(78787, 87658909,987699,7,7678,87,45,765));
		int budget = 200;
		if(sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		int total = sum(234,43,567,12,34,5);
		System.out.println("total: " + total);
	}

	public static void printWords(String... words) {
		// handle it like an ARRAY
		for (String w : words) {
			System.out.println(w);

		}

	}
	/*
	 * sum(10,30,40); ==> 80
	 * sum(30,40); ==> 70
	 */
	
	public static int sum(int...nums) {
		int sum = 0;
		for(int n : nums) {
			sum+= n; //sum=sum+n
		}
		return sum;
		
	}

	
	public static void cook(String name, String...strings ings)  {
		System.out.println("Food: " + name);
		System.out.println(Arrays.toString(ings));
	}
}
}