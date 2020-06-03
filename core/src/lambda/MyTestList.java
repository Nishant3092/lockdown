package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyTestList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
ai.add(10);
ai.add(90);
ai.add(3);
ai.add(57);
ai.add(32);

Collections.sort(ai,Comparator c);
	}

}
