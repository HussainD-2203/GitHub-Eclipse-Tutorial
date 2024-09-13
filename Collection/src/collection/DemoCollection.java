package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoCollection {
	
	public static void main(String[] args) {
		
		List arraylist = new ArrayList();
		
		arraylist.add(100);
		arraylist.add("Hussian");
		arraylist.add("c");
		
//		Iterator itr = arraylist.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		ListIterator listitr = arraylist.listIterator();
		
		while(listitr.hasNext()) {
		System.out.println(listitr.next());
	    }
		
		
		
	}
	
}
