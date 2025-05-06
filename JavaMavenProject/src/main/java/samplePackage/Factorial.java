package samplePackage;

public class Factorial {

    public int  factfind(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
	
    public void factdisplay() {
    	
    	int res = this.factfind(5);
    	System.out.println("Factorial of number is "+res);
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Factorial f = new Factorial();
     f.factdisplay();
	}

}
