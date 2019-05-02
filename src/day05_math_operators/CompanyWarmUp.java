package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		String companyName = "Facebook";
		String address =  "Silicon Valley, CA";
		int numberOfEmployees = 10234;
	    long revenue = 7888433899L;
	    boolean isTechCompany = true;
	    
	    System.out.println("Company name is " + companyName);
	    System.out.println("address is " + address);
	    System.out.println("number of employees is " + numberOfEmployees);
	    System.out.println("annual reveneu is " + revenue);
	    System.out.println("is it tech company? " + isTechCompany);
    
	    
	    //System.out.println(revenue + isTechCompany); will not work
	    
	    String aboutCompany = "Company "+companyName+" is lokated in "+address+
	    		" and "+ numberOfEmployees+" work for it.";
	   
	    System.out.println(aboutCompany);
				
		
	}

}
