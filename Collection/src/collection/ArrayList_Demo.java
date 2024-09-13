package collection;

import java.util.ArrayList;

public class ArrayList_Demo {
	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add("Hussain");
		al1.add("Hi");
		
		ArrayList al2 = new ArrayList();
		al2.add(13);
		al2.addAll(al1);
		
		System.out.println(al2);
		
		System.out.println(al2.size());
		
		
		
	}
}
