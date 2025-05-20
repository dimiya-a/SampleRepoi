package abstarction;

public class AbstractChild extends AbstractParent {
	
	public void show() {
		System.out.println("abstract method");
	}
	
	public void random() {
		System.out.println("random method");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractChild obj = new AbstractChild();
     obj.display();
     obj.show();
     obj.random();
	}

}
