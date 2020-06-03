package Exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=5,b=0;
         try{
        	int c = a/b;
        	 
         }catch(ArithmeticException e ){
        	 e.printStackTrace();
         }
	}

}
