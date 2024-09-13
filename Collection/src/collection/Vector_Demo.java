package collection;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement(100);
		v.addElement("Hussain");
		
		System.out.println(v);
		System.out.println(v.capacity());
		
		
	}
	
}
