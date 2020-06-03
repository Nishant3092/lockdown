package lambda;

interface inter {

	public void add(int a, int b);
	
}

public class Myclass {
	public static void main(String[] args) {

		inter i = (int a, int b) -> System.out.println("The Sum is:" + (a + b));
		i.add(10, 20);
		i.add(20, 30);
		i.add(50, 40);
	}

}
