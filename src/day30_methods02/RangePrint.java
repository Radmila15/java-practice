package day30_methods02;

import java.util.Scanner;

public class RangePrint {
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 nums:");
		int num1 = scan.nextInt(); //6
		int num2 = scan.nextInt(); //3 
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i +" ");
			}
		}else if(num1 > num2) {
			for(int k = num1; k >= num2; k--) {
				System.out.print(k+" ");
			}
		}else {
			System.out.println(num1);
		}
		System.out.println();
	}





}
