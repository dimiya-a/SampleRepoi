package inheritance_assignment;

public class Calculate extends GetSalaryDetails{
	
	double hra;
	double pf;
	
	public void cal_hra() {
		
		this.hra = 0.05*basicPay;
	}
	
public void cal_pf() {
		
		this.pf= 0.2*basicPay;
	}
	

}
