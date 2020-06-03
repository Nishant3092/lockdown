package core_oops;

public class FullTimeEmployee extends Employee{

	 public FullTimeEmployee(String name , int paymentPerHour) {
		 
		super(paymentPerHour, name);
	}
	
	@Override
	public int calculateSalary() {
		return getPaymentPerHour()* 8 ;
	}

}
