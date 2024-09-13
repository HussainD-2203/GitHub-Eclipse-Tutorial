package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Demo {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(10);
		v.add("Hussain");
		v.add(12.2);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	
}
