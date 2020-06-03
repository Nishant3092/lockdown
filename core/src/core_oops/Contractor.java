package core_oops;

public class Contractor extends Employee{
	
	private int workingHours ;
	

	public Contractor(int paymentPerHour, String name , int workingHours) {
		super(paymentPerHour, name);
		this.workingHours = workingHours ; 
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * workingHours ;
	}

}
