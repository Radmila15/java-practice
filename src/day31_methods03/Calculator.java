package day31_methods03;

import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		//cals methods
		add(2,5);
		substract(1987667889,3987777);
		multiply(236888,390900);
		divide(708787977,0);
		remainder(10,5);
		
		//using scanner pass 2 numbers and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		double n1= scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '*', '/', '%' ");
		String operator = scan.next();
		
		//using switch statement, call the matching method to perform calculation
		
		switch(operator) {
		case "+":
				add(n1, n2);
		break;
		case "-":
			substract(n1, n2);
		break;
		case "*":
			multiply(n1, n2);
        break;
	    case "/":
		divide(n1, n2);
	    break;
	    case "%":
		remainder(n1, n2);
	    break;
	    default:
	    	System.out.println("Invalid operator");
	
		}
	}

	// add, substract, multiply, divide, remainder
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " + result);
	}

	public static void substract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result: " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result: " + result);
	}

	public static void divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Cannot / by zero");
			return; // means - exit the method here, do not run the rest;
		}
		double result = num1 / num2;
		System.out.println("Result: " + result);
	}

	public static void remainder(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("Result: " + result);
	}
}
