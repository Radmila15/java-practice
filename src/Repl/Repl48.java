package Repl;
import java.util.*;
public class Repl48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//int n1 = s.nextInt();
		//int n2 = s.nextInt();
		//int n3 = s.nextInt();
		int n1 = 1000;
		int n2 = 1000;
		int n3 = 1000;
		
		if (n1 >= n2 && n1 >= n3) {
			   System.out.println("n1 is bigger");
		   } else if (n2>= n1 && n2>= n3) {
			   System.out.println("n2 is bigger");
		   } else {
			   System.out.println("n3 is bigger");
		   }

	}

}
