package day38_arraylist03;
import java.util.ArrayList;
public class ContainsMethod {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> months = new ArrayList<>(list1); //copy all values from list1
		System.out.println(months);
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months);
		System.out.println(months.contains("Jan")); // true
		System.out.println(months.contains("Dec")); // false
		System.out.println(months.contains("Jun")); // true
		
		//how would you check if Feb is in second position
		System.out.println(months.indexOf("Feb") == 1);//true
		System.out.println(months.get(1).equals("Feb"));//true
		
		
		ArrayList<String> month2 = new ArrayList<>(list1);
		
		System.out.println("Month: " + months.toString());
		System.out.println("Month2: "+ month2.toString());
		
		//check if month has all the values of Month2
		
		
	}

}
