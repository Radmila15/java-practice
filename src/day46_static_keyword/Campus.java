package day46_static_keyword;

public class Campus {
	
	String city;
	
	
	static {
		System.out.println("static block");
	}

	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
}
