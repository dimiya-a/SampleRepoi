package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample1 {
    //Non Generic
	public static void main(String[] args) {
		List obj = new ArrayList();
		obj.add("Dimiya");
		obj.add(34);
		obj.add(24f);
		obj.add('c');
		
		System.out.println(obj);

	}

}
