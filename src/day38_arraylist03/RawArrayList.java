package day38_arraylist03;

import java.util.ArrayList;

public class RawArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		System.out.println(list);//automatically call toString()
		String allValues = list.toString();
		System.out.println(allValues);
		
		String str = list.get(0).toString();//downcasting
		System.out.println(str);
		//all values are stored as a raw type. We can also call it as a General Object type
	}

}
