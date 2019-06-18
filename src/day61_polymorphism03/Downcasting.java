package day61_polymorphism03;

import day60_polymorphism02.AppleDevice;
import day60_polymorphism02.Mac;

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppleDevice dev2 = new Mac();
		dev2.use();
		
		//1)using another reference variable
		Mac mac = (Mac)dev2;
		mac.code();
		
		//2) cast and call in single statement
		((Mac)dev2).code();
		System.out.println( ((Mac)dev2).model);
		
		//String str = (String) dev2; not related with inheritance
		
		double d  = 123.45;
		int j = (int)d; //123
		

	}

}
