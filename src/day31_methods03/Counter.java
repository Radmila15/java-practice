package day31_methods03;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		countUp(5);
		countUp(10);
		countUp(0);
		countDown(10);
		countDown(-5);
		countDown(0);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to CountUp");
		//get number from keyboard
		int inputNum = scan.nextInt();
		//call countUp method and set it as input
		countUp(inputNum);
		
		drive("Audi",60);
		drive("Mazda", 80);
		
	}

	/*
	 * name: countUp 
	 * return type: void 
	 * param: int 
	 * it prints from 1 to the value of
	 * the param 
	 * countUp(5); 1 2 3 4 5
	 */

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid input");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
		/*
		 * name countDown 
		 * return type: void 
		 * param: int 
		 * it prints from param value till 1
		 * countDown(5); 5 4 3 2 1
		 */

	}

	public static void countDown(int num1) {
		if (num1 < 1) {
			System.out.println("Invalid input " + num1);
		} else {
			for (int i = num1; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	//method name: drive
	public static void drive(String car, int speed) {
		System.out.println(car + " is driving " + speed + " mph");
		
	}

}
