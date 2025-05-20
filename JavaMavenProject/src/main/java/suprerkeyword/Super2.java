package suprerkeyword;

public class Super2 extends Super1{
      
	String name = "Athira";
	public void display() {
		
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
       Super2 obj = new Super2();
       obj.display();
	}

}
