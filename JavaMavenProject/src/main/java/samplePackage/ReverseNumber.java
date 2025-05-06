package samplePackage;

public class ReverseNumber {

	int rev;
	
	public ReverseNumber(int rev) {
	
		int rem=0;
	
		  while (rev> 0) {
	            rem = rev % 10;
	            this.rev= (this.rev * 10) + rem;
	            rev= rev / 10;
	        }
		  
	}
		  
		  public ReverseNumber() {
			  
			  this(123);
			  
			  System.out.println(" Reverse of the number is "+rev);
		  }
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber r = new ReverseNumber();
     
	}

}
