package inheritance_assignment;

public class SalarySlip extends Calculate {
	 double total;
	 public void total_salary() {
		 this.total = basicPay+hra-pf-deduction+bonus;
	 }
	 
	    public void generateSalarySlip() {
	        System.out.println("\n----- Salary Slip -----");
	        System.out.println("Basic Pay: \t\t" + basicPay);
	        System.out.println("HRA (5% of Basic Pay): \t" + hra);
	        System.out.println("PF (20% of Basic Pay): \t" + pf);
	        System.out.println("Deduction: \t\t" + deduction);
	        System.out.println("Bonus: \t\t\t" + bonus);
	        System.out.println("-------------------------");
	        System.out.println("Total Salary: \t\t" + total);
	        System.out.println("-------------------------");
	    }


	public static void main(String[] args) {
		SalarySlip obj = new SalarySlip();
		obj.getSalary();
		obj.generateSalarySlip();
	}

}
