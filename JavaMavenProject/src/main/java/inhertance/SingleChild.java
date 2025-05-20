package inhertance;

public class SingleChild extends Single1{
	
	public void display2() {
		
		System.out.println("child class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild obj = new SingleChild();
		obj.display();
		obj.display2();

	}

}
