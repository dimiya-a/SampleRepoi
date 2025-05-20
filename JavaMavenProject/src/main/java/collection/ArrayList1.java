package collection;

import java.util.ArrayList;

public class ArrayList1{
	public static void main(String[] args) {
		
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("India");
		obj.add("France");
		obj.add("China");
		obj.add("London");
		obj.add("Dubai");
		
		System.out.println(obj);
		
		ArrayList<String> obj1 =new ArrayList<String>();
		
		obj1.add("Trivandrum");
		obj1.add("Kollam");
		obj.addAll(obj1);
		System.out.println(obj);
	System.out.println(obj.contains("Kollam"));	
	System.out.println(obj.get(6));
	System.out.println(obj.isEmpty());
	obj.remove(6);
	System.out.println(obj);
	System.out.println(obj.size());
		
		

	}

	
}
