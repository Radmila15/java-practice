package day19_loops_continie;
import java.util.*;
public class Transactions {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
        double balance = scan.nextDouble();
     // it needs to keep track of transactions track count
        int count = 0;
        
		while (balance > 0) {
			count++; //increase transaction by 1
			System.out.println("What is your transaction #"+count+" ammount?");
		double transaction = scan.nextDouble();
		
		// if any transaction is about to make balance negative or 0, it needs to print a warning
		if (transaction > balance) {
			System.out.println("Your balance is about to be negative due to this transaction");
		}
		//balance = balance - transaction
		balance -= transaction;
		System.out.println("Current balance: " + balance);
		}
		System.out.println("You have insufficient funds for any mote transactions, your balance is: " + balance);
		System.out.println("Transactions total count: " + count);
		
		// after every time, we make a transaction, program should display remaining balance
		// "Successful transactions count: " + 3;
		
		
		
		
		
	}

}
