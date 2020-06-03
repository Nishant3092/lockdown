package lambda;

@FunctionalInterface
interface MyFunctionalInterface{
	
	/*//A method with no parameter
	public String sayHelloNishant();*/
	
	//A method with single parameter
    public int incrementByFive(int a);
}





public class Example {

	public static void main(String[] args) {
	
	/*	MyFunctionalInterface msg = () -> {
			return "Hello Nishant";

		};
		System.out.println(msg.sayHelloNishant());*/
		
		// lambda expression with single parameter num
		
		
    	MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
        
        
        
  }
}
