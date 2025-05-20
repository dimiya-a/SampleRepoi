package interfaceexample;

public class MultipleInhertance3 implements MultipleInheritance1,MultipleInheritance2{
    
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInhertance3 m = new MultipleInhertance3();
		System.out.println(m.add(5,4));
		System.out.println(m.sub(5,4));

	}

}
