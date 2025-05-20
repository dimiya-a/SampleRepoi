package interfaceexample;

public class TestClass implements TestInterface{
	
	public void display() {
		
		System.out.println("I have implemented interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t = new TestClass();
		t.display();

	}

}
