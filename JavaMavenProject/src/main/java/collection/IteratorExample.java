package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("India");
		obj.add("France");
		obj.add("China");
		obj.add("London");
		obj.add("Dubai");
		
		Iterator<String> it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		}
	}


