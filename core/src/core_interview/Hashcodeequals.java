package core_interview;

public class Hashcodeequals {

	public static void main(String[] args) {
		
		Student s1= new Student(1, "Nishant");
		Student s2= new Student(1, "Nishant");
		
		System.out.println("Hash Code " + s1.hashCode());
		System.out.println("Hash Code "+ s2.hashCode());
		
		System.out.println("Equals " + s1.equals(s2));
	}

}
