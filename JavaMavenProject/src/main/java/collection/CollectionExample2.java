package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample2 {
	
	//Generic type 

	public static void main(String[] args) {
		List<String>obj = new ArrayList<String>();
		obj.add("Dimiya");
		obj.add("Athira");
		obj.add("Swathy");
		obj.add("Dimiya");
		obj.add("kerala");
		
	System.out.println(obj);
	
	obj.set(1,"Anitha");
	
	System.out.println(obj);
	
	System.out.println(obj.indexOf("Dimiya"));
	System.out.println(obj.lastIndexOf("Dimiya"));
	obj.remove(3);
	System.out.println(obj);
	System.out.println(obj.get(2));
	System.out.println(obj.contains("kerala"));

	}

}
