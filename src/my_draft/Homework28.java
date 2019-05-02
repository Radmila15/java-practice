package my_draft;
import java.util.*;
public class Homework28 {

	public static void main(String[] args) {
		
		String item1, item2, item3, report;
	    double price1, price2, price3, totalPrice;
	    int count1, count2, count3;
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Item1, count and its price:");
	    item1 = scan.next(); 
	    price1 = scan.nextDouble();
	    count1 = scan.nextInt();
	    
	    System.out.println("Enter Item2, count and its price:");
	    item2 = scan.next(); 
	    price2 = scan.nextDouble();
	    count2 = scan.nextInt();
	    
	    System.out.println("Enter Item3, count and its price:");
	    item3 = scan.next(); 
	    price3 = scan.nextDouble();
	    count3 = scan.nextInt();
	    
	    totalPrice = price1 + price3;
	    
	    
	    report = ("Item1: " + item1 + " Price: " + price1 + ", " + "Item3: " + item3 + " Price: " + price3);
	   
	  System.out.println(report);
	  System.out.println("Total price is: "+ totalPrice);
	}

}
