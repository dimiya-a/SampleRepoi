package stringex;

public class StringMethods {
	

	public static void main(String[] args) {
		String s = "Malayalam";
	  //  char ch = s.charAt(3);
	   // System.out.println(ch);
	    
      //  System.out.println(s.concat("subject"));
        System.out.println(s.contains("lam"));
        String a= "Hello";
        System.out.println(s.compareTo(a));
        System.out.println(s.length());
        System.out.println(s.equals(a)); 
        String b= "hello";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
	}

}

