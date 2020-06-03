package lambda;

interface Square{
public int squarRoot(int n);	
}

public class Examplelambda {

	public static void main(String[] args) {
		 Square s = n -> n*n;
       
         System.out.println("Square Root :" +s.squarRoot(12));
         
}

}
