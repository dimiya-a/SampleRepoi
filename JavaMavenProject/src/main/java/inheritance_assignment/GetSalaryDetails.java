package inheritance_assignment;

import java.util.Scanner;

public class GetSalaryDetails {

	int basicPay;
    int deduction;
    int bonus;

	public void  getSalary() {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic pay: ");
        this.basicPay = scanner.nextInt();
        System.out.print("Enter deduction: ");
        this.deduction = scanner.nextInt();
        System.out.print("Enter bonus: ");
        this.bonus = scanner.nextInt();

		
	}

}
