package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Demo {
	
	public static void main(String[] args) {
		
		Set hashset = new HashSet();
		
		hashset.add(100);
		hashset.add("Hussain");
		hashset.add("c");
		
		Iterator itr = hashset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());		
		}
		
		
	}
	
}
