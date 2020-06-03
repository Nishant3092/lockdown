package core_oops;

public abstract class Employee {

	
	private int paymentPerHour ;
	private String name ;
	
	
	public Employee(int paymentPerHour , String name) {
		
		this.paymentPerHour = paymentPerHour ;
		this.name = name ;
	}
	
		public abstract int calculateSalary();

		public int getPaymentPerHour() {
			return paymentPerHour;
		}

		public void setPaymentPerHour(int paymentPerHour) {
			this.paymentPerHour = paymentPerHour;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	
}
