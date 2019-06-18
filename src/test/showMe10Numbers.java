package test;

import java.util.Random;

public class showMe10Numbers {

	public static void main(String[] args) {

		//showMe10Numbers1();
		
		while(true) {
			showMe10Numbers1();
		}

	}

	public static void showMe10Numbers1() {

		Random r = new Random();

		for (int i = 1; i <= 20; i++) {

			System.out.print(r.nextInt(10001) + " ");

		}
		System.out.println();

	}
}
