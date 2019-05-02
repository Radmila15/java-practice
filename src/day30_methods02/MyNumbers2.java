package day30_methods02;

import java.util.Random;

public class MyNumbers2 {
	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
//		while(true) {
//			showMe5Numbers();
//		}
		
		do10PushUps(); 
		do10PushUps();	
	}
	/**
	 method name: showMe5Numbers
     return type: void
     params: no
     prints 5 random numbers 0, 1000
     in same line separated by comma
     Ex:
     showMe5Numbers(); 345 233 566 2 23
	 */
	public static void showMe5Numbers() {
		Random r = new Random();
		for(int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001)+" ");//print random num 0-1000
		}
		System.out.println();//take it to new line
	}
	
	/*
	 * name: do10PushUps
	   return type: void
	   params: no
	   print:
	   Pushup - 1
	   Pushup - 2
	   Pushup - 3
	   ..
	   Pushup - 10
	   Time to rest
	 */
	public static void do10PushUps() {
		for(int j = 1; j <= 10; j++) {
			System.out.println("Pushup - " + j);
		}
		System.out.println("Time to rest");
	}
	
	
	
	
	
	
}