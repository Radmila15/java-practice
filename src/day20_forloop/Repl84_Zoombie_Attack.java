package day20_forloop;
import java.util.*;
public class Repl84_Zoombie_Attack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inhabitants = 10; //scan.nextInt();
		
		int day = 0;
		while(inhabitants > 0) {
			System.out.println("Day " +day+ " [" + inhabitants + "]");
			day++; // add 1 to day
			inhabitants = inhabitants / 2; // decrease by half
		}
		
		System.out.println("---- EXTINCT ----");
		
		
		
		
		
		

	}

}
