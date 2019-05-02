package day09_stringequals_conditionals;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = "java";
	    String str2 = "java";
	    //using ==
	    System.out.println(str1 == str2); //true
	    System.out.println(str1 == "java"); //true
	    System.out.println(str2 == "Java");//false - capital J
	    
	    //equal method. PREFERED WAY
	    System.out.println(str1.equals(str2));//true
	    System.out.println(str1.equals("java")); //true
	    System.out.println(str2.equals("Java")); // false
	    
	   // String month = "March";
	    String month = new String("March");//new way
	    String month2 = new String("March"); //same
	    
	    System.out.println(month == month2);
	    
	    System.out.println();
	    
	    
	    
	    
	    
	}  

}
