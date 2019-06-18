package Repl;

import java.util.Scanner;

public class Repl76_route {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();
		String a = "";
		int indexStart = 0;
		int indexEnd = 0;

		String route = " > right > down > left > up";
		switch (start) {
		case "A":
			indexStart = 3;
			break;
		case "B":
			indexStart = 11;
			break;
		case "C":
			indexStart = 18;
			break;
		case "D":
			indexStart = 25;
			break;
		}

		switch (end) {
		case "A":
			indexEnd = 3;
			break;
		case "B":
			indexEnd = 11;
			break;
		case "C":
			indexEnd = 18;
			break;
		case "D":
			indexEnd = 25;
			break;
		}

		if (indexStart != indexEnd) {
			if (indexStart > indexEnd) {
				a = route.substring(indexStart);
				a+= route.substring(0,indexEnd -3) + ": ";
			} else {
				a = route.substring(indexStart, indexEnd - 3) + ": ";
			}
		}
		if (indexEnd == indexStart) {

		}
		a += end + " found";
		System.out.println(a);

//		if (indexStart > indexEnd) 
//			a = route.substring(indexStart);
//			if (indexEnd != 3) {
//				a = a + route.substring(0, indexEnd - 3) + ": ";
//			}
//		} else if (indexEnd != indexStart) {
//			a = route.substring(indexStart, indexEnd - 3) + ": ";
//		} else if (indexEnd == indexStart) {
//			a = "";
//		}
//		a += end + " found";
//		System.out.println(route);

	}

}
