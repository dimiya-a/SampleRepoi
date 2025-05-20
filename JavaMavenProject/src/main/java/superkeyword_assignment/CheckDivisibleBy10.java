package superkeyword_assignment;

public class CheckDivisibleBy10 extends AddNum{
     
	public CheckDivisibleBy10(int num1,int num2) {
		
		super(num1,num2);
	}
	
	public void checkDivisibility() {
		int result = super.sum(); 
        if (result % 10 == 0) {
            System.out.println("The result " + result + " is divisible by 10.");
        } else {
            System.out.println("The result " + result + " is NOT divisible by 10.");
        }
	}
	public static void main(String[] args) {
	 CheckDivisibleBy10 obj = new CheckDivisibleBy10(20,30);
	 obj.checkDivisibility();

	}

}
